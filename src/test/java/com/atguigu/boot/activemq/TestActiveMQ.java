package com.atguigu.boot.activemq;

import com.atguigu.boot.activemq.producer.Queue_Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 10:30
 */

@SpringBootTest(classes = MainApp_Producer.class)
@RunWith(SpringJUnit4ClassRunner.class) //SpringJUnit4ClassRunner is a custom extension of JUnit's
@WebAppConfiguration //web 服务的方式启动
public class TestActiveMQ { //相当于一个controller

    @Resource
    private Queue_Producer queue_producer;

    @Test
    public void testSend(){
        queue_producer.produceMsg();
    }
}
