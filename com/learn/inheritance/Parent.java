package com.learn.inheritance;
/*Access Modifiers -->
public -> Available inside the world
protected -> Available inside the same package + subclasses in different packages
default -> Available inside the same package only
private -> Available inside the same class only
*/

/*  Package Naming
// We can group related classes within the same package
say -> www.uni.com/academics  ---> com.uni.academics
www.uni.com/non-academics  --> com.uni.non-academics
www.uni.com/register --> com.uni.register
www.uni.com/library  --> com.uni.library
*/


public class Parent {
    public Parent(){
        System.out.println("Hello from Parent");
    }
}

