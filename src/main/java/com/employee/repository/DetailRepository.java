package com.employee.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.Repository;
import com.employee.entity.Detail;
import com.employee.view.DetailListView;

public interface DetailRepository extends Repository<Detail, Integer>{

    Collection<DetailListView> findAllByEmployeeEmpId(Integer empId);

    // List<Detail> findAllByEmployeeEmpId(Integer empId);

    // Optional<Detail> findByEmployeeIdAndEmployeeEmpId(Integer employeeId, Integer empId);

    Detail save(Detail detail);

    // void delete(Detail detail);

    // List<Detail> findAll();
}
