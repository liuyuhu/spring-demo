package com.github.webflux;

import com.github.webflux.rabbitmq.Sender;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author liuyuhu
 * @date 2018/5/17 下午12:21
 */
public class RabbitMqTest extends BaseTest {

    @Resource
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }

}
