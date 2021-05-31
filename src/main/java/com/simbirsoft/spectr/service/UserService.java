package com.simbirsoft.spectr.service;

import com.simbirsoft.spectr.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveOrUpdateUser(User user);
    void deleteUser(int id);
}