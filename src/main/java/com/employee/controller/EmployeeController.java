package com.employee.controller;

import com.employee.form.EmployeeForm;
import com.employee.security.util.SecurityUtil;
import com.employee.service.EmployeeService;
import com.employee.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeView add(@Valid @RequestBody EmployeeForm form) {
        return employeeService.add(form);
    }

    // @GetMapping
    // public Collection<EmployeeView> list() {
    //     return employeeService.list();
    // }

    @PutMapping()
    public EmployeeView updatec(@Valid @RequestBody EmployeeForm form)
    {
        return employeeService.updatec(SecurityUtil.getCurrentUserId(),form);
    }
    
}
