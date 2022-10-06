package com.innovaturelabs.training.contacts.repository;

import java.util.Collection;
import java.util.Optional;

import com.innovaturelabs.training.contacts.entity.Task;

import com.innovaturelabs.training.contacts.view.TaskListView;

import org.springframework.data.repository.Repository;

public interface TaskRepository extends Repository<Task, Integer>{
    Collection<TaskListView> findAllByUserUserId(Integer id);

    Collection<TaskListView> findByStatus(byte status);
    
    Optional<Task> findByTaskidAndUserUserId(Integer taskId, Integer userId);
    Optional<Task> findByTaskid(Integer Taskid);
    Task save(Task task);

    void delete(Task task);
}
