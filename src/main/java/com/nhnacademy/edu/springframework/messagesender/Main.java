package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {
    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()+" : "+message);
    }

    private void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent to "+user.getEmail()+" : "+message);
    }

    public static void main(String[] args) {
//        User user=new User("123@naver.com","010-1234-5687");
//        Main main=new Main();
//        main.sendEmailMessage(user,"안녕하세요.");

        new MessageSendService(new SmsMessageSender()).doSendMessage();
        new MessageSendService(new EmailMessageSender()).doSendMessage();
    }
}
