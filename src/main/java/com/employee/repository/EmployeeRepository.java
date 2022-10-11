package com.employee.repository;


import com.employee.entity.Employee;
import org.springframework.data.repository.Repository;


import java.util.Optional;

public interface EmployeeRepository extends Repository<Employee, Integer>{
    Optional<Employee> findByEmpId(Integer empId);

    Optional<Employee> findByEmpIdAndPassword(Integer empId, String password);

    Optional<Employee> findByEmail(String email);

//    Collection<Employee> findAll();

    Employee save(Employee employee);
}
