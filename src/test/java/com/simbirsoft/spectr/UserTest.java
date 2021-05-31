package com.simbirsoft.spectr;

import com.simbirsoft.spectr.entity.Role;
import com.simbirsoft.spectr.entity.User;
import com.simbirsoft.spectr.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserTest() {
        Role role = new Role();
        role.setName("ADMIN");
        role.setId(3);

        User user = new User();
        user.setId(1);
        user.setName("changed name");
        user.setRole(role);

        User fromDb = userService.getUserById(1);

        Assert.assertEquals(user, fromDb);
    }
}
