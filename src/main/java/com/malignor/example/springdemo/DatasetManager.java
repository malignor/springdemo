package com.malignor.example.springdemo;

import java.util.ArrayList;

public class DatasetManager {
    ArrayList<Profile> profileSet;
    public Profile getProfileByName(String name) {
        for (Profile profile : profileSet){
            if (profile.getName() == name){
                return profile;
            }
        }
        return null;
    }
}
