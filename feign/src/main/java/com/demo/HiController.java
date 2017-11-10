package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDesc: 功能描述:()
 * @author: 张玉琛
 * @createTime: 2017/11/10 10:49
 * @version: v1.0
 * @copyright:善林科技
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam("name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
