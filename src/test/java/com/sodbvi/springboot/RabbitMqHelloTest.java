package com.sodbvi.springboot;

import com.sodbvi.springboot.domain.User;
import com.sodbvi.springboot.rabbitmq.hello.HelloSender;
import com.sodbvi.springboot.rabbitmq.many.Sender1;
import com.sodbvi.springboot.rabbitmq.many.Sender2;
import com.sodbvi.springboot.rabbitmq.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-09 -18:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private Sender1 sender1;

    @Autowired
    private Sender2 sender2;

    @Autowired
    private ObjectSender objectSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }

    @Test
    public void oneToMany() throws Exception {
        for (int i = 0; i < 100; i++) {
            sender1.send(i);
        }
    }

    @Test
    public void manyToMany() throws Exception {
        for (int i = 0; i < 100; i++) {
            sender1.send(i);
            sender2.send(i);
        }
    }

    @Test
    public void obj() throws Exception {
        User user = new User();
        user.setAge(1);
        user.setId(2l);
        user.setName("objectName");
        objectSender.send(user);
    }

}
