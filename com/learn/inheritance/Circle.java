package com.learn.inheritance;

public class Circle {
    private double radius;
    public Circle(double r){
        setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0){
            this.radius = radius;
        }
    }

    public  double getArea(){
        return Math.PI * radius * radius;
    }

}

