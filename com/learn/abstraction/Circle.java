package com.learn.abstraction;

public class Circle extends  Shape{
    private double radius;
    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r > 0){
            this.radius = r;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public void display() {
        System.out.println("Area is " + getArea() + "  Circumference is " + getPerimeter());
    }
}
