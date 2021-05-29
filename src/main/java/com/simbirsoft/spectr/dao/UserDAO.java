package com.simbirsoft.spectr.dao;

import com.simbirsoft.spectr.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public User getUser(int id);
}
