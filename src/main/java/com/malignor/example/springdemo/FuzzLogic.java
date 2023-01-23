package com.malignor.example.springdemo;

public class FuzzLogic {
    private String id;
    private String fcid;
    private int size;
    private FuzzShape[] shapes;

    public FuzzLogic(String id, String fcid, int size, FuzzShape[] shapes) {
        this.id = id;
        this.fcid = fcid;
        this.size = size;
        this.shapes = shapes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFcid(String fcid) {
        this.fcid = fcid;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setShapes(FuzzShape[] shapes) {
        this.shapes = shapes;
    }
}
