package com.innovaturelabs.training.contacts.view;

public class TaskListView {
    private final int taskid;
    private final String description;
    private final Byte status;
    public TaskListView(String description,int taskid, Byte status){
        this.taskid=taskid;
        this.description=description;
        this.status=status;
    }
    public String getDescription() {
        return description;
    }
    public Byte getStatus() {
        return status;
    }
    public int getTaskid() {
        return taskid;
    }
    
}
