package com.malignor.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String greetTemplate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    Greeting greeting(@RequestParam(value="name", defaultValue="stranger") String name){
        return new Greeting(counter.incrementAndGet(),String.format(greetTemplate,name));
    }
}
