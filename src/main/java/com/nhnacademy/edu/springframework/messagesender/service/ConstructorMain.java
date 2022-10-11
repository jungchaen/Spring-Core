package com.nhnacademy.edu.springframework.messagesender.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        MessageSendService service = context.getBean("messageSenderService", MessageSendService.class);

        service.doSendMessage();
    }
}
