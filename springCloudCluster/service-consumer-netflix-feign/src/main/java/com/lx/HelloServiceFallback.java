package com.lx;

import org.springframework.stereotype.Component;

/*
*   fallback接口需要实现指定的服务
* */
@Component
public class HelloServiceFallback implements HelloService, HiService{


    @Override
    public String say(String name) {
        return "request error!";
    }
}
