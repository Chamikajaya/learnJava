package com.learn.inheritance;

public class Rectangle {
    private int length;
    private int breadth;
    // Constructor for a square -> One para
    public Rectangle(int length){
        setLength(length);
    }
    // Constructor for a rectangle -> 2 para
    public Rectangle(int length, int breadth){
        setLength(length);
        setBreadth(breadth);
    }


    public void setLength(int length){
        if (length > 0){
            this.length = length;
        }
    }
    public void setBreadth(int breadth){
        if (breadth > 0){
            this.breadth = breadth;
        }
    }
    public int getAreaRect(){
        return this.length * this.breadth;
    }
    public int getAreaSquare(){
        return this.length * this.length;
    }

    public int getBreadth() {
        return breadth;
    }
}
