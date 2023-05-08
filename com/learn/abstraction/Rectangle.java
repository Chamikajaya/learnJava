package com.learn.abstraction;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        setLength(length);
        setBreadth(breadth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        }
    }

    @Override
    public double getArea() {
        return this.breadth * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.breadth + this.length);
    }

    @Override
    public void display() {
        System.out.println("Area is " + getArea() + " Perimeter is " + getPerimeter());
    }
}
