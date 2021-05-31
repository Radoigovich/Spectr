package com.simbirsoft.spectr.controller;

import com.simbirsoft.spectr.entity.Message;
import com.simbirsoft.spectr.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/messages/{id}")
    public Message getMessageById(@PathVariable int id) {
        return messageService.getMessageById(id);
    }

    @PostMapping("/messages")
    public String saveMessage(@RequestBody Message message){
        messageService.saveOrUpdateMessage(message);
        return "Message saved";
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessage(@PathVariable int id) {
        messageService.deleteMessageById(id);
        return "Message ID = " + id + " was deleted.";
    }
}
