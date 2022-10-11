package com.employee.service;

import java.util.Collection;
import java.util.List;
import com.employee.entity.*;
import com.employee.exception.NotFoundException;
import com.employee.form.DetailForm;
import com.employee.view.DetailDetailView;
import com.employee.view.DetailListView;

public interface DetailService {
    
    Collection<DetailListView> list();

    DetailDetailView add(DetailForm form);

    // DetailDetailView update(Integer employeeId, DetailForm form) throws NotFoundException;

    // void delete(Integer employeeId) throws NotFoundException;
}
