package com.employee.controller;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.security.util.SecurityUtil;
import com.employee.entity.Detail;

import com.employee.form.DetailForm;
import com.employee.repository.DetailRepository;
import com.employee.service.DetailService;
import com.employee.view.DetailDetailView;
import com.employee.view.DetailListView;

@RestController
@RequestMapping("/details")
public class DetailsController {
    @Autowired
    private DetailService detailService;

    @GetMapping
    public Collection<DetailListView> list() {
        return detailService.list();
    }

    @PostMapping
    public DetailDetailView add(@Valid @RequestBody DetailForm form) {
        return detailService.add(form);
    }


//  @PutMapping()
//     public UserView updatec(@Valid @RequestBody UserForm form)
//     {
//         return userService.updatec(SecurityUtil.getCurrentUserId(),form);
//     }

//     @DeleteMapping()
//     public void delete(@PathVariable("employeeId") Integer employeeId) {
//         detailService.delete(employeeId);
//     }


    // @Autowired
    // private DetailRepository detailRepository;
    
    // @GetMapping
    // public List<DetailListView> list() {
    //     return StreamSupport.stream(detailRepository.findAll()
    //     .spliterator(),false)
    //     .map(detail -> new DetailListView(detail))
    //     .collect(Collectors.toList());
        
    // }

    // @Autowired
    // private DetailRepository detailRepository;

    // @GetMapping
    // public List<Detail> list() {
    //     return detailRepository.findAll();
    // }

}
