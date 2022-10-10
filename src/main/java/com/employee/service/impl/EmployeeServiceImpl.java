package com.employee.service.impl;


import com.employee.entity.Employee;
import com.employee.exception.BadRequestException;
import com.employee.exception.NotFoundException;
import com.employee.form.EmployeeForm;
import com.employee.form.LoginForm;
import com.employee.repository.EmployeeRepository;
import com.employee.security.config.SecurityConfig;
import com.employee.security.util.InvalidTokenException;
import com.employee.security.util.SecurityUtil;
import com.employee.security.util.TokenExpiredException;
import com.employee.security.util.TokenGenerator;
import com.employee.service.EmployeeService;
import com.employee.view.EmployeeView;
import com.employee.view.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import javax.transaction.Transactional;

import static com.employee.security.AccessTokenUserDetailsService.PURPOSE_ACCESS_TOKEN;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final String PURPOSE_REFRESH_TOKEN = "REFRESH_TOKEN";

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TokenGenerator tokenGenerator;

    @Autowired
    private SecurityConfig securityConfig;

    @Override
    public EmployeeView add(EmployeeForm form) {
        // String name=form.getName();
        // Token accessToken = tokenGenerator.create(PURPOSE_ACCESS_TOKEN,name, securityConfig.getAccessTokenExpiry());
        // String hello=accessToken.value.toString();
        // SimpleMailMessage message=new SimpleMailMessage();
        // message.setFrom("vivek.antony@innovaturelabs.com");
        // message.setTo(form.getEmail());
        // message.setText("http://localhost:4200/login?at="+hello);
        // mailSender.send(message);
        // System.out.println("Mail sent successfully");
        return new EmployeeView(employeeRepository.save(new Employee(
                form.getName(),
                form.getEmail(),
                passwordEncoder.encode(form.getPassword())
        )));
    }

    @Override
    @Transactional
    public EmployeeView updatec(Integer empId, EmployeeForm form)
    { Employee employee=employeeRepository.findByEmpId(SecurityUtil.getCurrentUserId()).orElseThrow(NotFoundException::new);
        employee.setName(form.getName());
        employee.setEmail(form.getEmail());
        employee.setPassword(passwordEncoder.encode(form.getPassword()));
        // userRepository.save(user);
        return new EmployeeView(employee);
    }
    @Override
    public LoginView login(LoginForm form, Errors errors) throws BadRequestException {
        if (errors.hasErrors()) {
            throw badRequestException();
            // throw badRequestException();
        }
        Employee employee = employeeRepository.findByEmail(form.getEmail()).orElseThrow(EmployeeServiceImpl::badRequestException);
        if (!passwordEncoder.matches(form.getPassword(), employee.getPassword())) {
            throw badRequestException();
        }

        String id = String.format("%010d", employee.getEmpId());
        TokenGenerator.Token accessToken = tokenGenerator.create(PURPOSE_ACCESS_TOKEN, id, securityConfig.getAccessTokenExpiry());
        TokenGenerator.Token refreshToken = tokenGenerator.create(PURPOSE_REFRESH_TOKEN, id + employee.getPassword(), securityConfig.getRefreshTokenExpiry());
        return new LoginView(employee, accessToken, refreshToken);
    }
    private static BadRequestException badRequestException() {
        return new BadRequestException("Invalid credentials");
    }
    @Override
    public LoginView refresh(String refreshToken) throws BadRequestException {
        TokenGenerator.Status status;
        try {
            status = tokenGenerator.verify(PURPOSE_REFRESH_TOKEN, refreshToken);
        } catch (InvalidTokenException e) {
            throw new BadRequestException("Invalid token", e);
        } catch (TokenExpiredException e) {
            throw new BadRequestException("Token expired", e);
        }

        int userId;
        try {
            userId = Integer.parseInt(status.data.substring(0, 10));
        } catch (NumberFormatException e) {
            throw new BadRequestException("Invalid token", e);
        }

        String password = status.data.substring(10);

        Employee employee = employeeRepository.findByEmpIdAndPassword(userId, password).orElseThrow(EmployeeServiceImpl::badRequestException);

        String id = String.format("%010d", employee.getEmpId());
        TokenGenerator.Token accessToken = tokenGenerator.create(PURPOSE_ACCESS_TOKEN, id, securityConfig.getAccessTokenExpiry());
        return new LoginView(
                employee,
                new LoginView.TokenView(accessToken.value, accessToken.expiry),
                new LoginView.TokenView(refreshToken, status.expiry)
        );
    }
    @Override
    public EmployeeView currentUser() {
        return new EmployeeView(
                employeeRepository.findByEmpId(SecurityUtil.getCurrentUserId()).orElseThrow(NotFoundException::new)
        );
    }

}
