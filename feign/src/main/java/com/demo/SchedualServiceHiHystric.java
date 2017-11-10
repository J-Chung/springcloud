package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @classDesc: 功能描述:()
 * @author: 张玉琛
 * @createTime: 2017/11/10 13:53
 * @version: v1.0
 * @copyright:善林科技
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry " + name;
    }
}
