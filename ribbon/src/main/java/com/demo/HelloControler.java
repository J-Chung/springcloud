package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDesc: 功能描述:()
 * @author: 张玉琛
 * @createTime: 2017/11/10 13:43
 * @version: v1.0
 * @copyright:善林科技
 */
@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
