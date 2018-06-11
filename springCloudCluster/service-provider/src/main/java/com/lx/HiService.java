package com.lx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiService {

    @GetMapping("say/{name}")
    public String say(@PathVariable("name") String name) {
        return "hi, " + name;
    }

}