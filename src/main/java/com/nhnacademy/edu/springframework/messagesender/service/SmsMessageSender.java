package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.sun.java.accessibility.util.EventID;

public class SmsMessageSender implements MessageSender{

    public SmsMessageSender() {
        System.out.println("SmsMessageSender is created");
    }

    public void init() {
        System.out.println("SmsMessageSender is init");
    }

    public void cleanUp() {
        System.out.println("SmsMessage is cleaned");
    }
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()+" : "+message);
        return false;
    }
}
