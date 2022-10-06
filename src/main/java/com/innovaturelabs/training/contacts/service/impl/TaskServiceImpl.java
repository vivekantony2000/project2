package com.innovaturelabs.training.contacts.service.impl;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovaturelabs.training.contacts.entity.Task;
import com.innovaturelabs.training.contacts.exception.NotFoundException;
import com.innovaturelabs.training.contacts.form.TaskForm;
import com.innovaturelabs.training.contacts.repository.TaskRepository;
import com.innovaturelabs.training.contacts.security.util.SecurityUtil;
import com.innovaturelabs.training.contacts.service.TaskService;
import com.innovaturelabs.training.contacts.view.TaskDetailView;
import com.innovaturelabs.training.contacts.view.TaskListView;


@Service
public class TaskServiceImpl implements TaskService {
    

    @Autowired 
    private TaskRepository taskRepository;

    @Override
    public Collection<TaskListView> list() {
        return taskRepository.findAllByUserUserId(SecurityUtil.getCurrentUserId());
    }

    @Override
    public TaskDetailView add(TaskForm form) {
        return new TaskDetailView(taskRepository.save(new Task(form,SecurityUtil.getCurrentUserId())));
    }


    @Override
    public Collection<TaskListView> listt(){

        return taskRepository.findByStatus(Task.Status.INACTIVE.value);
    }
    @Override
    public Collection<TaskListView> listtt(){

        return taskRepository.findByStatus(Task.Status.ACTIVE.value);
    }

    // @Override
    // public Collection<taskListView> listt() {
    //     this.status=form.getStatus();
    //     if(this.status == 0){
    //     return taskRepository.findAllByUserUserId(SecurityUtil.getCurrentUserId());
    //     }
    //     else{
    //         return taskRepository.findAllByUserUserId(SecurityUtil.getCurrentUserId());
    //     }
    // }

    // @Override
    // public taskDetailView get(Integer id) throws NotFoundException {
    //     return taskRepository.findByid(id)
    //             .map((task) -> {
    //                 return new taskDetailView(task);
    //             }).orElseThrow(NotFoundException::new);
    // }
    // @Override
    // @Transactional
    // public TaskDetailView update(Integer id, TaskForm form) throws NotFoundException {
    //     return taskRepository.findByTaskid(id)
    //             .map((task) -> {
    //                 return new taskDetailView(taskRepository.save(task.update(form)));
    //             }).orElseThrow(NotFoundException::new);
    // }
    @Override
    @Transactional
    public TaskDetailView update(Integer taskId, TaskForm form) throws NotFoundException {
        return taskRepository.findByTaskidAndUserUserId(taskId, SecurityUtil.getCurrentUserId()).map((task) -> {
            return new TaskDetailView(taskRepository.save(task.update(form)));
        }).orElseThrow(NotFoundException::new);
    }
    @Override
    @Transactional
    public void delete(Integer id) throws NotFoundException {
        taskRepository.delete(
                taskRepository.findByTaskid(id)
                        .orElseThrow(NotFoundException::new)
        );
    }

   

   
}
