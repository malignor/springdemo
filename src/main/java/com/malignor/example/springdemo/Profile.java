package com.malignor.example.springdemo;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.nio.charset.StandardCharsets;
import java.time.Instant;

public class Profile {
    private String id;
    private String name;
    private ProfileSecurity security;
    private FuzzLogic[] fuzzLogicSet;

    public Profile(String id, String name, ProfileSecurity security, FuzzLogic[] fuzzLogicSet) {
        this.id = id;
        this.name = name;
        this.security = security;
        this.fuzzLogicSet = fuzzLogicSet;
    }

    public Profile(String name, String password) {
        this.id = generateId(name);
        this.name = name;
        this.security = new ProfileSecurity(this.id,password);
        this.fuzzLogicSet = null;
    }

    public Profile(String name) {
        this.id = generateId(name);
        this.name = name;
        this.security = null;
        this.fuzzLogicSet = null;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSecurity(ProfileSecurity security) {
        this.security = security;
    }
    public void setFuzzControllerSet(FuzzLogic[] fuzzLogicSet) {
        this.fuzzLogicSet = fuzzLogicSet;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public ProfileSecurity getSecurity() {
        return security;
    }
    public FuzzLogic[] getFuzzLogicSet() {
        return fuzzLogicSet;
    }

    public String generateId(String name){
        Instant instant = Instant.now();
        String idWork = name+instant;
        String encodedIdWork = java.util.Base64.getEncoder().encodeToString(idWork.getBytes(StandardCharsets.UTF_8));
        String finalId = encodedIdWork.substring(0,14) + (instant.getEpochSecond()%999) + encodedIdWork.substring(14);
        return finalId;
    }
}
