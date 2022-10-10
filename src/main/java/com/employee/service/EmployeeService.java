package com.employee.service;



import com.employee.exception.BadRequestException;
import com.employee.exception.NotFoundException;
import com.employee.form.EmployeeForm;
import com.employee.form.LoginForm;
import com.employee.view.EmployeeView;
import com.employee.view.LoginView;
import org.springframework.validation.Errors;

public interface EmployeeService {
 

    LoginView login(LoginForm form, Errors errors) throws BadRequestException;

    LoginView refresh(String refreshToken) throws BadRequestException;

    EmployeeView add(EmployeeForm form);

    EmployeeView currentUser();
    EmployeeView updatec(Integer empId, EmployeeForm form) throws NotFoundException;
    
}
