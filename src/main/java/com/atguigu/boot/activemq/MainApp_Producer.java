package com.atguigu.boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 09:58
 */
@SpringBootApplication
@ComponentScan("com.atguigu.boot.activemq")
@EnableScheduling
public class MainApp_Producer { //定时任务直接启动此类：主启动类

    public static void main(String[] args) {
        SpringApplication.run(MainApp_Producer.class,args);
    }

}
