/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author liyj
 * @date 2017年7月7日 下午6:26:54
 * @since V1.0.0
 */
package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dubbo.test.inter.service.TestService;

/**
 * TODO
 *
 * @author liyj
 * @date 2017年7月7日 下午6:26:54
 *
 */
public class DubboTest {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        TestService testService = context.getBean(TestService.class);
        System.out.println(testService.getName("xxx"));
        System.out.println("dubbo success!!!!!");
    }
}
