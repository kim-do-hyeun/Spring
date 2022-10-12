package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.annotation.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;

    @Value("${from}")
    private String from;

    public MessageSendService(){

    }

    @Autowired
    public MessageSendService(@SMS("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

//    public void setSmsMessageSender(MessageSender messageSender) {
//        this.messageSender = messageSender;
//        System.out.println("setSms invoked!");
//    }
//
//    public void setEmailMessageSender(MessageSender messageSender) {
//        this.messageSender = messageSender;
//        System.out.println("setEmail invoked!");
//    }

    public void doSendMessage(){
//        System.out.println("name: " +this.from);
        messageSender.sendMessage(
            new User("doring98@naver.com","010-8234-5995"),
            "Message"
        );
    }
}
