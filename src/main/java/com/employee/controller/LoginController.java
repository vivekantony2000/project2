package com.employee.controller;


import com.employee.form.LoginForm;
import com.employee.service.EmployeeService;
import com.employee.view.EmployeeView;
import com.employee.view.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public EmployeeView currentUser() {
        return employeeService.currentUser();
    }

    @PostMapping
    public LoginView login(@Valid @RequestBody LoginForm form, Errors errors) {
        return employeeService.login(form, errors);
    }

    @PutMapping
    public LoginView refresh(@RequestBody String refreshToken) {
        return employeeService.refresh(refreshToken);
    }
    
}
