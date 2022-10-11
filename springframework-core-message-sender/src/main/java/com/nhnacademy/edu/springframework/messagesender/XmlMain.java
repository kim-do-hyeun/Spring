package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        MessageSender emailMessageSender = context.getBean("emailMessageSender",MessageSender.class);
//        MessageSender smsMessageSender = context.getBean("smsMessageSender",MessageSender.class);

          context.getBean("messageSendService", MessageSendService.class).doSendMessage();

//        context.getBean("emailMessageSender",MessageSender.class).sendMessage(new User("doring98@naver.com","010-8234-5995"),"Message");
//        context.getBean("emailMessageSender",MessageSender.class).sendMessage(new User("doring98@naver.com","010-8234-5995"),"Message");
//        context.getBean("smsMessageSender",MessageSender.class).sendMessage(new User("doring98@naver.com","010-8234-5995"),"Message");
//        context.getBean("smsMessageSender",MessageSender.class).sendMessage(new User("doring98@naver.com","010-8234-5995"),"Message");

          context.close();
//        emailMessageSender.sendMessage( new User("doring98@naver.com","010-8234-5995"),
//            "Message"
//        );
//
//        emailMessageSender.sendMessage( new User("doring98@naver.com","010-8234-5995"),
//            "Message"
//        );
    }
}
