### springBoot 整合 ActiveMQ

> - SpringBoot整合ActiveMQ之队列生产者
> - SpringBoot整合ActiveMQ之队列生产者间隔定投
> - SpringBoot整合ActiveMQ之队列消费者
> - SpringBoot整合ActiveMQ之主题生产者
> - SpringBoot整合ActiveMQ之主题消费者



**搭建组织项目：**

1. 创建maven项目
2. POM.xml
3. application.yml
4. 配置Bean 类似 Spring框架的 applicationContent.xml文件
5. Queue_Producer
6. 主启动类
7. 测试单元
8. 新需求-间隔定投：要求每隔3秒钟往 MQ推送消息（定时推送）



**bug如下:NoSuchBeanDefinitionException**

```java
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.atguigu.boot.activemq.producer.Queue_Producer' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@javax.annotation.Resource(shareable=true, lookup=, name=, description=, authenticationType=CONTAINER, type=class java.lang.Object, mappedName=)}
```

[解决方案](https://blog.csdn.net/zh_1191/article/details/78580010)

解决办法也就是在入口启动类处加上组件扫描配置就好了，例如：

```java
@ComponentScan("cn.test.itobc.web")
```

```java
package com.atguigu.boot.activemq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 09:58
 */
@SpringBootApplication
@ComponentScan("com.atguigu.boot.activemq")
public class MainApp_Producer {
    public static void main(String[] args) {
        SpringApplication.run(MainApp_Producer.class,args);
    }
}
```



 **SpringBoot 和 ActiveMQ 整合之后, 队列生产者两种经典用法:**

> **1、触发投递:  点一次发送一次消息**
>
> **2、间隔定投: 要求每隔3秒钟往 MQ推送消息（定时推送）**

