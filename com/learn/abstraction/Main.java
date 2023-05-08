package com.learn.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(10, 12);
        s1.display();
        s2.display();
    }

}
