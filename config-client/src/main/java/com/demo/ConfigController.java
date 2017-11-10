package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDesc: 功能描述:()
 * @author: 张玉琛
 * @createTime: 2017/11/9 14:06
 * @version: v1.0
 * @copyright:善林科技
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${foo}")
    private String foo;


    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

}
