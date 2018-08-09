package com.sodbvi.springboot.rabbitmq.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-09 -18:33
 */
@Component
public class Sender2 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i) {
        String context = "spirng boot neo queue" + " ****** " + i;
        System.out.println("Sender2 : " + context);
        this.amqpTemplate.convertAndSend("sodbvi", context);
    }

}
