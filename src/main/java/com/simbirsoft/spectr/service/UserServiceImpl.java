package com.simbirsoft.spectr.service;

import com.simbirsoft.spectr.dao.UserDAO;
import com.simbirsoft.spectr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
