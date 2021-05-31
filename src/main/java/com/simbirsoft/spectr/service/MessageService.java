package com.simbirsoft.spectr.service;

import com.simbirsoft.spectr.entity.Message;
import com.simbirsoft.spectr.entity.User;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
    Message getMessageById(int id);
    void saveOrUpdateMessage(Message message);
    void deleteMessageById(int id);
}
