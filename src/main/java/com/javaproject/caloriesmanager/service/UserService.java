package com.javaproject.caloriesmanager.service;


import com.javaproject.caloriesmanager.model.User;
import com.javaproject.caloriesmanager.util.exception.NotFoundException;

import java.util.List;

public interface UserService {

    User create(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    void update(User user);

    List<User> getAll();
}