package com.example.docker_spring_boot_demo_v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/v2")
    public String hello() {
        return "Hello Docker V2!";
    }

}
