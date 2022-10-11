package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            //요 라인을 지나면서 어컨이 객체를 만듬. 이 라인이 끝나면서 생성자가 시작이 되면 스프링빈을 만듦. getBean 하면서 어컨에 저장된 빈을 꺼내옴
            // 이 내부에서 객체를 생성함. 이름, 타입, 객체를 묶어서 빈이라는 단위로 관리를 함.

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

            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
