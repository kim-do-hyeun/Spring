package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService(){

    }

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setSmsMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
        System.out.println("setSms invoked!");
    }

    public void setEmailMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
        System.out.println("setEmail invoked!");
    }

    public void doSendMessage(){
        messageSender.sendMessage(
            new User("doring98@naver.com","010-8234-5995"),
            "Message"
        );
    }
}
