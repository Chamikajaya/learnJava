package com.learn.inheritance;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double r, double h) {
        super(r);
        setHeight(h);
    }

    public void setHeight(double height) {
        if (height > 0){
            this.height = height;
        }
    }

    public double getVol(){
        return super.getArea() * height;
    }



}
