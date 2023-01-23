package com.malignor.example.springdemo;

import org.springframework.web.bind.annotation.RestController;

public class Greeting {
    private long txid;
    private String content;
    // together these make a JSON structure like {"id":2,"content":"Hello, Malignor!"}

    public Greeting(long id, String content) {
        this.txid = id;
        this.content = content;
    }

    public long getId() {
        return txid;
    }

    public String getContent() {
        return content;
    }

}
