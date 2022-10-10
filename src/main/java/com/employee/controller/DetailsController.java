package com.employee.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class DetailsController {
    @Autowired
    private DetailService detailService;

    @GetMapping
    public Collection<DetailListView> list(Principal p) {
        return detailService.list();
    }

    @PostMapping
    public DetailDetailView add(@Valid @RequestBody DetailForm form) {
        return detailService.add(form);
    }

    @GetMapping("/{employeeId}")
    public DetailDetailView get(@PathVariable("employeeId") Integer employeeId) {
        return contactService.get(employeeId);
    }

    @PutMapping("/{employeeId}")
    public DetailDetailView update(
            @PathVariable("employeeId") Integer employeeId,
            @Valid @RequestBody DetailForm form) {
        return detailService.update(employeeId, form);
    }

    @DeleteMapping("/{employeeId}")
    public void delete(@PathVariable("employeeId") Integer employeeId) {
        detailService.delete(employeeId);
    }
}
