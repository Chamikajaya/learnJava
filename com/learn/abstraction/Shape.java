package com.learn.abstraction;

public abstract class Shape {  // Here we could have used an interface as well
    // Since Shape class is abstract we won't be able to create objects of it.
    // An abstract class can contain both abstract and non-abstract  methods
    // If a class has at least one abstract method then that class must be set abstract
    // Since we are using abstract classes for inheritance such abstract classes can not be set as final (Also abstract methods can not be final - coz they are meant to be overridden)
    // Also if we have child classes deriving from a abstract parent class then that child class must override all the abstract methods.
    // If that child class does not override at least one of abstract methods in the parent class then that child class must set as abstract.
    /*  If that child class does is abstract then upcoming child classes in the hierarchy must override all the abstract methods
    ** That means concrete grand child class must override all the abstract methods in its parent and grandparent classes
     */
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract  void display();



}
