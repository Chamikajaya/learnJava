package com.learn.innerClasses;
// Inner Classes can access the members of the outer class directly
// But the outer class will not be able to access the inner class members directly.
// However it could still access the inner class members indirectly through creating an inner class obj.
class Outer{
    private int outerX = 20;
    class Inner{
        private int innerY = 30;
        void innerDisplay(){
            System.out.println("Hello from inner class. ");
            System.out.println("Total is " + (outerX + innerY));  // Inner can directly access outer
        }
    }
    void displayOut(){
        Inner i = new Inner();
        i.innerDisplay();  // Indirectly accessing inner through objects of inner class
    }
}

public class TestDrive {
    public static void main(String[] args){
        Outer obj1 = new Outer();
        obj1.displayOut();
    }

}
