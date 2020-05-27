package com.test.springdemo.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @GetMapping
    public String helloGradle() {
        return "Hello Gradle!\nUpdate Success 2!";
    }
}
