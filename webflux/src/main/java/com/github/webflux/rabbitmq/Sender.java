package com.github.webflux.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liuyuhu
 * @date 2018/5/17 下午12:14
 */

@Component
public class Sender {

    @Resource
    private Queue queue;

    @Resource
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "rabbit send a message！queue-name: " + queue.getName();
        amqpTemplate.convertAndSend("hello", context);
    }

}
