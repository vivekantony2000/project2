package com.innovaturelabs.training.contacts.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.innovaturelabs.training.contacts.form.TaskForm;

@Entity


public class Task {

    public static enum Status {
        INACTIVE((byte) 0),
        ACTIVE((byte) 1);

        public final byte value;

        private Status(byte value) {
            this.value = value;
        }
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 
    private int taskid;

    private String description;

    
    private byte status;

    @ManyToOne (optional = false, fetch=FetchType.LAZY)
    private User user;
    public Task(){}

    public Task(Integer taskid)
    {
        this.taskid=taskid;
    }

    public Task(TaskForm form,Integer userId)
    {
        this.user=new User(userId);
        this.description=form.getDescription();
        this.status=form.getStatus();
        
    }
    
    public Task update(TaskForm form) {
       this.description=form.getDescription();
        return this;
    }


    

    public String getDescription() {
        return description;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
      
}
