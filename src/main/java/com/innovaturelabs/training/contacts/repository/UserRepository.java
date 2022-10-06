/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.repository;

import com.innovaturelabs.training.contacts.entity.User;


import java.util.Collection;

import java.util.Optional;


import org.springframework.data.repository.Repository;

/**
 *
 * @author nirmal
 */
public interface UserRepository extends Repository<User, Integer> {

    Optional<User> findById(Integer userId);

    Optional<User> findByUserIdAndPassword(Integer userId, String password);

    Optional<User> findByEmail(String email);

    Optional<User> findByName(String result);

    User save(User user);

    void delete(User user);
    // @Query(value = "SELECT * FROM user order by create_date DESC", nativeQuery = true)
    Collection<User> findAll();




}
