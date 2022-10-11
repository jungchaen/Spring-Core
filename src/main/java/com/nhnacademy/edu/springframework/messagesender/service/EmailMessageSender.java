package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender {
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("Email Message Sent to "+user.getEmail()+" : "+message);
        return false;
    }
}
