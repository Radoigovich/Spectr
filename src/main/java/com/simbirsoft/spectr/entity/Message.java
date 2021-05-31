package com.simbirsoft.spectr.entity;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "message_text")
    private String messageText;

    @OneToOne
    @JoinColumn(name = "chat_user_id")
    private User sender;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Message() {
    }

    public Message(String messageText, User sender, Room room) {
        this.messageText = messageText;
        this.sender = sender;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", messageText='" + messageText + '\'' +
                ", sender=" + sender +
                ", room=" + room +
                '}';
    }
}