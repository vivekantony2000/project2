package com.employee.view;

import com.employee.entity.Employee;





public class EmployeeView {
    private final int employeeId;
    private final String name;
    private final String email;

    
    public EmployeeView(Employee employee) {
        this.employeeId=employee.getEmpId();
        this.name=employee.getName();
        this.email=employee.getEmail();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
