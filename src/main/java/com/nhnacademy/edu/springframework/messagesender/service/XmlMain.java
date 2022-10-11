package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
//            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------");
            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------");
            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
