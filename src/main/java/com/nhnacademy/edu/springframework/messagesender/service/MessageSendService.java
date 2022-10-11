package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService() {

    }

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("set MessageSender");
        this.messageSender = messageSender;
    }

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        System.out.println(messageSender.sendMessage(new User("123@naver.com","010-1234-5678"),"안녕하세요"));
    }
}
