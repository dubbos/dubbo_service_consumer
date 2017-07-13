/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author liyj
 * @date 2017年7月10日 下午3:26:44
 * @since V1.0.0
 */
package com.dubbo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dubbo.test.inter.service.TestService;

/**
 * TODO
 *
 * @author liyj
 * @date 2017年7月10日 下午3:26:44
 *
 */
@Controller
@RequestMapping(value = "test")
public class TestController {
    @Autowired
    private TestService testService;
    
    @ResponseBody
    @RequestMapping(value = "/hello/say", method = RequestMethod.GET)
    public String sayHello() {
        System.out.println(testService);
        return testService.getName("xiaoyuer");
    }
    
}
