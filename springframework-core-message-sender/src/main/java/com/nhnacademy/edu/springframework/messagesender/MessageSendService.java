package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService(){

    }

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
        System.out.println("setMessage invoked!");
    }

    public void doSendMessage(){
        messageSender.sendMessage(
            new User("doring98@naver.com","010-8234-5995"),
            "Message"
        );
    }
}
