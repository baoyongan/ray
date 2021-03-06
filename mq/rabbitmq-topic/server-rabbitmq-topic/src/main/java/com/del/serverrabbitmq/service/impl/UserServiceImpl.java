package com.del.serverrabbitmq.service.impl;


import com.arc.model.User;
import com.del.serverrabbitmq.service.UserService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AmqpTemplate template;


    @Override
    public void send(User user) {



        template.convertAndSend("queue_obj", user);
    }

    @Override
    public void send(String str) {
//        template.convertAndSend("queue_string", str);
        //方法的第一个参数是交换机名称,第二个参数是发送的key,第三个参数是内容,RabbitMQ将会根据第二个参数去寻找有没有匹配此规则的队列,如果有,则把消息给它,如果有不止一个,则把消息分发给匹配的队列(每个队列都有消息!),显然在我们的测试中,参数2匹配了两个队列,因此消息将会被发放到这两个队列中,而监听这两个队列的监听器都将收到消息!那么如果把参数2改为topic.messages呢?显然只会匹配到一个队列,那么process2方法对应的监听器收到消息!
        template.convertAndSend("exchange","topic.message","Hello the topic!!!");
        template.convertAndSend("exchange","topic.#",new Date()+". Hello the topic!!!");
    }

    //zhu

}
