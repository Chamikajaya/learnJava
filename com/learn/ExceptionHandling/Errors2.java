package com.learn.ExceptionHandling;
/*
When we throw exceptions in our methods we should declare it using throws keyword in method signature. Then the method which calls the method which throws an exception
must handle that exception using a try / catch block.
*/

// User defined exception
class NegativeDimensionsException extends Exception {
    public String toString() {
        return "Both length and breadth must be positive";
    }
}

class AreaCalc{
    private double length;
    private double breadth;

    public AreaCalc(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public AreaCalc(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getArea() throws  NegativeDimensionsException{
        if (length < 0 || breadth < 0) {
             throw new  NegativeDimensionsException();  // new NegativeDimensionsException class object is created
        }
        return this.length * this.breadth;
    }
}
public class Errors2 {
    public static void main(String[] args) {
        AreaCalc rec1 = new AreaCalc(12, -10);
        try {
            System.out.println("Area is " + rec1.getArea());
        } catch (NegativeDimensionsException e) {
            System.out.println("Exception occured, please handle -> " + e.toString());
        }
        finally {
            System.out.println("Hello from finally block :)");
        }
    }
}
