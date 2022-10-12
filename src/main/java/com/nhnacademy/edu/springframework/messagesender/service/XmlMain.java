package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try {
            //ApplicationContext이름을 보고 아, class path를 보고 (빈 동록을 위해) 메타데이터를 정의한 xml을 찾겠구나
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            //이 라인을 지나면서 ApplicationContext가 객체를 만듬. 이 라인이 끝나면서 생성자가 시작이 되면 스프링빈을 만듦.
            // 이 내부에서 객체를 생성함. 이름(name), 타입(type), 객체(Object)를 묶어서 빈이라는 단위로 관리를 함.
            //빈을 생성하면서 의존관계에 있는 녀석을을 주입을 해준다.

//             getBean 하면서 ApplicationContext에 저장된 빈을 꺼내옴
//            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
//            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
//            System.out.println("---------------------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
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
