package com.malignor.example.springdemo;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;

@RestController
public class FuzzyController {
    private DatasetManager dataset;

    @GetMapping("/getprofile")
    Profile profile(@RequestParam(value="name") String name){
        return dataset.getProfileByName(name);
    };

    @PostMapping("/addprofile")
    Profile createProfile(@RequestParam(value="name") String name, @RequestParam(value="password") String password){
        Profile newProfile = new Profile(name,password);
        return newProfile;
    };
}
