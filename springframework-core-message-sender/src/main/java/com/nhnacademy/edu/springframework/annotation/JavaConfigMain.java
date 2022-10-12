package com.nhnacademy.edu.springframework.annotation;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigMain {
    public static void main(String[] args) {

        String baseline = "com.nhnacademy.edu.springframework.annotation";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(baseline);

//        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
//        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

//        emailMessageSender.sendMessage(new User("doring98@naver.com","010-8234-5995"),
//            "Message");
//
//        smsMessageSender.sendMessage(new User("doring98@naver.com","010-8234-5995"),
//            "Message");

        MessageSendService messageSendService = context.getBean(MessageSendService.class);

        messageSendService.doSendMessage();
        context.close();
    }
}
