package com.employee.service.impl;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Detail;
import com.employee.repository.DetailRepository;
import com.employee.security.util.SecurityUtil;
import com.employee.service.DetailService;
import com.employee.view.DetailDetailView;
import com.employee.view.DetailListView;
import com.employee.exception.NotFoundException;
import com.employee.form.DetailForm;


@Service
@Transactional
public class DetailServiceImpl implements DetailService{


    @Autowired
    private DetailRepository detailRepository;

    @Override
    public Collection<DetailListView> list() {
        return detailRepository.findAllByEmployeeEmpId(SecurityUtil.getCurrentUserId());
    }

    @Override
    public DetailDetailView add(DetailForm form) {
        return new DetailDetailView(detailRepository.save(new Detail(form,SecurityUtil.getCurrentUserId())));
    }

 

    // @Override
    // @Transactional
    // public DetailDetailView update(Integer employeeId, DetailForm form) throws NotFoundException {
    //     return detailRepository.findByEmployeeIdAndEmployeeEmpId(employeeId, SecurityUtil.getCurrentUserId())
    //             .map((detail) -> {
    //                 return new DetailDetailView(detailRepository.save(detail.update(form)));
    //             }).orElseThrow(NotFoundException::new);
    // }

    // @Override
    // @Transactional
    // public void delete(Integer employeeId) throws NotFoundException {
    //     detailRepository.delete(
    //             detailRepository.findByEmployeeIdAndEmployeeEmpId(employeeId, SecurityUtil.getCurrentUserId())
    //                     .orElseThrow(NotFoundException::new)
    //     );
    // }
    
}
