package com.innovaturelabs.training.contacts.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TaskForm {
    @Size(max=40)
    @NotBlank
    private String description;
    private byte status;

    public String getDescription() {
        return description;
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
