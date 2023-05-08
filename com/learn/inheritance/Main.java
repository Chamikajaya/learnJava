package com.learn.inheritance;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("110", "Nokia", 123);
        p1.makeACall();
        p1.recieveCall();
        System.out.println();
        SmartPhone s1 = new SmartPhone("Nord 5", "OnePlus", 124, 50);
        s1.makeACall();  // Overridden Method will be called
        s1.recieveCall();  // Overridden Method will be called
        s1.takePhoto();
        System.out.println();

        // Dynamic dispatch
        Phone p2 = new SmartPhone("pixel 6", "Google", 125, 100);
        p2.recieveCall();  // Since the object type is SmartPhone, SmartPhone class's overridden method will be called
        p2.makeACall();  // Since the object type is SmartPhone, SmartPhone class's overridden method will be called


       /*  p2.takePhoto(); // This will generate an error because reference variable's type, = Phone class does not have takePhoto() method;
        */





    }




}
