package com.kidson.app.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping
    public String sayHello() {
        return "Hello, KidsOn!";
    }
}
