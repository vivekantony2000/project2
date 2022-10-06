package com.innovaturelabs.training.contacts.controller;

import java.util.Collection;

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


import com.innovaturelabs.training.contacts.form.TaskForm;
import com.innovaturelabs.training.contacts.service.TaskService;
import com.innovaturelabs.training.contacts.view.TaskDetailView;
import com.innovaturelabs.training.contacts.view.TaskListView;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired 
    private TaskService taskService;

    @PostMapping
    public TaskDetailView add(@Valid @RequestBody TaskForm form){
        return taskService.add(form);
    }
    @GetMapping
    public Collection<TaskListView> list() {
        return taskService.list();
    }

    @GetMapping("/incomplete")
    public Collection<TaskListView> listt(){
        return taskService.listt();  
    }

    @GetMapping("/complete")
    public Collection<TaskListView>listtt(){
        return taskService.listtt();
    }
    // @GetMapping("/{id}")
    // public taskDetailView get(@PathVariable("id") Integer id) {
    //     return taskService.get(id);
    // }

    @PutMapping("/{id}")
    public TaskDetailView update(
            @PathVariable("id") Integer id,
            @Valid @RequestBody TaskForm form) {
        return taskService.update(id, form);
    }
    

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        taskService.delete(id);
    }
}
