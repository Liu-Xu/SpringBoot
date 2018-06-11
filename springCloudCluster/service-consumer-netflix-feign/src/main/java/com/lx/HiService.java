package com.lx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "service-provider", fallback = HelloServiceFallback.class)
public interface HiService {

    //与服务提供者中的mapping一致
    @GetMapping("/hi/say/{name}")
    String say(@PathVariable("name") String name);

}
