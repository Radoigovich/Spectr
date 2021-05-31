package com.simbirsoft.spectr;

import com.simbirsoft.spectr.entity.Message;
import com.simbirsoft.spectr.entity.Role;
import com.simbirsoft.spectr.entity.Room;
import com.simbirsoft.spectr.entity.User;
import com.simbirsoft.spectr.service.MessageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageTest {
    @Autowired
    MessageService messageService;

    @Test
    public void getMessageTest() {
        Role role = new Role(3, "ADMIN");
        User user = new User(1, "changed name", role);
        Room room = new Room (1, "General");
        Message message = new Message(1, "Hi", user, room);

        Message fromDB = messageService.getMessageById(1);

        Assert.assertEquals(message, fromDB);
    }

}
