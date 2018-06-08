package com.lx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hi")
public class HellowController {

    @Autowired
    private RestTemplate restTemplate;//用此组件来调用Eureka服务中心注册好的服务

    @GetMapping("say")
    public String say () {
        return restTemplate.getForEntity("http://service-provider/hello/say/Dreamyer",String.class).getBody();
    }

}
