package com.atguigu.boot.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 09:54
 */

@Component
@EnableJms //开启JMS适配的注解
public class ConfBean {

    @Value("${myqueue}")
    //@Value("boot-activemq-queue")
    private String myQueueName;

    @Bean //相当于 <bean id="" class="" />
    public Queue queue() {
        return new ActiveMQQueue(myQueueName);
    }
}
