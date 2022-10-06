package com.innovaturelabs.training.contacts.view;



import com.innovaturelabs.training.contacts.entity.Task;

public class TaskDetailView extends TaskListView{

    public TaskDetailView(Task task)
    {
        super(
            task.getDescription(),
            task.getTaskid(),
            task.getStatus()
            );
    }   
}
