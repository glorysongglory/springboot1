package com.sodbvi.springboot.rabbitmq.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-09 -18:36
 */
@Component
@RabbitListener(queues = "sodbvi")
public class Reciever2 {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver 2: " + msg);
    }
}
