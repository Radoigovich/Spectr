package com.simbirsoft.spectr.dao;

import com.simbirsoft.spectr.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveOrUpdateUser(User user);
}
