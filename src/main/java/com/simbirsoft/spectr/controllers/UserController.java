package com.simbirsoft.spectr.controllers;

import com.simbirsoft.spectr.entity.User;
import com.simbirsoft.spectr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/api/users")
    public String getUsers() {
        final StringBuilder result = new StringBuilder();
        List<User> list = userService.getAllUsers();
        list.forEach(result::append);
        return result.toString();
    }
}
