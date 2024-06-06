package com.example.docker_spring_boot_demo_v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/v1")
    public String hello() {
        return "Hello Docker V1!";
    }

}
