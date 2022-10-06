/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.service;


import com.innovaturelabs.training.contacts.exception.BadRequestException;
import com.innovaturelabs.training.contacts.exception.NotFoundException;
import com.innovaturelabs.training.contacts.form.LoginForm;
import com.innovaturelabs.training.contacts.form.UserForm;
import com.innovaturelabs.training.contacts.view.LoginView;
import com.innovaturelabs.training.contacts.view.UserView;
import java.util.Collection;
import org.springframework.validation.Errors;


/**
 *
 * @author nirmal
 */
public interface UserService {

    UserView add(UserForm form);
    
    // UserView get(Integer userId) throws NotFoundException;
    UserView update(Integer userId, UserForm form) throws NotFoundException;

    void delete(Integer userId) throws NotFoundException;

    UserView updatec(Integer userId,UserForm form) throws NotFoundException;

    UserView currentUser();

    LoginView login(LoginForm form, Errors errors) throws BadRequestException;

    LoginView refresh(String refreshToken) throws BadRequestException;

    Collection<UserView> list() throws NotFoundException;

    String checkUser(String at) throws NotFoundException;

}
