package com.learn.inheritance;

public class Cube extends Rectangle {
    private int height;
    // Constructor 1 -> when there is a square;
    public Cube(int x, int y){
        super(x);
        setHeight(y);
    }
    // Constructor 2 -> when there are no equal sides
    public Cube(int x, int y, int z){
        super(x, y);
        setHeight(z);
    }


    public void setHeight(int h){
        if (h > 0){
            this.height = h;
        }
    }

    public int getVol(){
        if (getBreadth() == 0){
            return super.getAreaSquare() * this.height;
        }
        else {
            return super.getAreaRect() * this.height;
        }
    }


}
