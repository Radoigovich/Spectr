package com.simbirsoft.spectr.service;

import com.simbirsoft.spectr.entity.Message;
import com.simbirsoft.spectr.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message getMessageById(int id) {
        return messageRepository.findById(id).get();
    }

    @Override
    public void saveOrUpdateMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void deleteMessageById(int id) {
        messageRepository.deleteById(id);
    }
}
