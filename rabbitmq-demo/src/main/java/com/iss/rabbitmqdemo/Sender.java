package com.iss.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        String conetent = "hello " + new Date();
        System.out.println("send:" + conetent);
        rabbitTemplate.convertAndSend("hello", conetent);
    }
}
