package com.sodbvi.springboot.rabbitmq.object;

import com.sodbvi.springboot.domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-23 -10:42
 */
@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(User user) {
        System.out.println("sender object:" + user.toString());
        this.amqpTemplate.convertAndSend("object", user);
    }


}


