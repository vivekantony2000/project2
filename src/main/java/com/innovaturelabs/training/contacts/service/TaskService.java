package com.innovaturelabs.training.contacts.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.innovaturelabs.training.contacts.exception.NotFoundException;
import com.innovaturelabs.training.contacts.form.TaskForm;
import com.innovaturelabs.training.contacts.view.TaskDetailView;
import com.innovaturelabs.training.contacts.view.TaskListView;


@Service
public interface TaskService {
    Collection<TaskListView> list();
    Collection<TaskListView> listt();
    Collection<TaskListView> listtt();
    TaskDetailView add(TaskForm form );

    // taskDetailView get(Integer id) throws NotFoundException;

    TaskDetailView update(Integer taskId, TaskForm form) throws NotFoundException;

    void delete(Integer taskid) throws NotFoundException;
    
}
