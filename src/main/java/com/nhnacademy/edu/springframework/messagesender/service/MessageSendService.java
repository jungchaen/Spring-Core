package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private final MessageSender messageSender;

//    @Value("${from}")
    private String name;
    @Autowired
    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
//        System.out.println("from: "+name);
        System.out.println(messageSender.sendMessage(new User("123@naver.com","010-1234-5678"),"메시지"));
    }
}
