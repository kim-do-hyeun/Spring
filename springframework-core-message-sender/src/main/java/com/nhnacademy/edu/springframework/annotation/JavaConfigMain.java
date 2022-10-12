package com.nhnacademy.edu.springframework.annotation;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

        emailMessageSender.sendMessage(new User("doring98@naver.com","010-8234-5995"),
            "Message");

        smsMessageSender.sendMessage(new User("doring98@naver.com","010-8234-5995"),
            "Message");

        context.close();
    }
}
