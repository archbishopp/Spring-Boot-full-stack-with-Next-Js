package com.mikecode.usermgnt.service;

import java.util.List;

import com.mikecode.usermgnt.model.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);

    User updateUser(Long id, User user);
    
}
