package com.learn.interfaces;

 interface MyInterface {
     // Used for multiple inheritance
     // Interfaces are meant to be overridden -> Hence they allow dynamic polymorphism
     // Also method overloading -> gives compile time polymorphism
     // Interfaces can not be instantiated, yet references to objects can be made using them (Just like abstract classes)
     // We can create static methods and variables inside an interface they are common to that specific interface

     static int number = 123;  // Static Variable
     static void message(){  // // Static Message
         System.out.println("Hello from a static method inside an interface");
     }
     public void meth1();
     public void meth2();
}

interface MyInterface2 extends MyInterface{  // Inheritance in interfaces
    public void meth4();

}

class ExampleClass implements MyInterface2{  // Since this class implements the child interface it also gets the abstract methods of parent as well
     // Hence all the abstract methods in child and parent interfaces must be overridden

    @Override
    public void meth1() {
        System.out.println("Meth 1 of interface is implemented inside Example Class");
    }

    @Override
    public void meth2() {
        System.out.println("Meth 2 of interface is implemented inside Example Class");
    }
    @Override
    public void meth4() {
        System.out.println("Hello from method 4 in 2nd interface (child interface)");
    }
    public void meth3() {
        System.out.println("hello from unique method 3");
    }
}
public class Practice{
    public static void main(String[] args) {
        MyInterface2 obj1 = new ExampleClass();
        System.out.println(MyInterface.number);  // Static Variable   ((Parent Interface))
        MyInterface.message();  // Static Method  (Parent Interface)
        obj1.meth1();
        obj1.meth2();
        obj1.meth4();
        //obj1.meth3(); // This can not be done
        ExampleClass obj2 = new ExampleClass();
        obj2.meth3();
    }
}