package com.sodbvi.springboot.rabbitmq.object;

import com.sodbvi.springboot.domain.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-23 -10:46
 */
@Component
public class ObjectReceiver {

    @RabbitListener(queues = "object")
    public void process(User user) {
        System.out.println("Receiver object:" + user.toString());
    }
}
