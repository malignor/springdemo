package com.malignor.example.springdemo;

public class FuzzShape {
    private String fcid;
    private String type;
    private GraphPoint[] pointSet;

    public FuzzShape(String fcid, String type, GraphPoint[] pointSet) {
        this.fcid = fcid;
        this.type = type;
        this.pointSet = pointSet;
    }

    public void setFcid(String fcid) {
        this.fcid = fcid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPointSet(GraphPoint[] pointSet) {
        this.pointSet = pointSet;
    }
}
