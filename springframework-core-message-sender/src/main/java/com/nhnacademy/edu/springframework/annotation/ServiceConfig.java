package com.nhnacademy.edu.springframework.annotation;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Autowired
    MessageSender emailMessageSender;

    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(emailMessageSender);
    }
}
