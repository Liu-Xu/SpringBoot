package com.lx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hi")
public class HelloService {

    @Autowired
    private RestTemplate restTemplate; //用此组件来调用Eureka服务注册中心注册好的服务

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("say")
    public String say () {
        ServiceInstance serviceInstance = discoveryClient.getInstances("service-provider").get(0);
        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());// 输出调用的是哪个主机上的服务
        return restTemplate.getForEntity("http://service-provider/hello/say/zhangsan", String.class).getBody();
    }

}
