package com.malignor.example.springdemo;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ProfileSecurity {
    private String id;
    private String password;

    public ProfileSecurity(String id, String password) {
        this.id = id;
        this.password = encryptPassword(password);
    }

    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = encryptPassword(password);
    }

    public static String encryptPassword(String input){
        byte[] hashPass = new byte[0];
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            hashPass = md.digest(input.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        BigInteger number = new BigInteger(1,hashPass);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length()<32){ hexString.insert(0,'0');}
        return hexString.toString();
    }

}
