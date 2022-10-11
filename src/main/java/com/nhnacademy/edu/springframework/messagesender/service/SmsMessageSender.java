package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender {

    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()+" : "+message);
        return false;
    }
}
