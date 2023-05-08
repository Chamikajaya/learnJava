package com.learn.lambda;
// To use lambdas  we need to define a functional interface first.
// An interface with just 1 abstract method is called a functional interface --> Annotation = @FunctionalInterface
// Special thing about these functional interfaces is we do not have to implement these interfaces in a class in order to use them
@FunctionalInterface
interface MyLambda{
    void display();
}
@FunctionalInterface
interface MyLambda2{
    String greetUser(String name);
}
@FunctionalInterface
interface MyLambda3{
    int getTotal(int x, int y, int z);
}





 


public class Main {
    public static void main(String[] args) {
        // If lambda has just one line no need to add curly braces
        // In lambda expressions using return keyword is optional.
        /*
        Lambda Expressions can have their own variables and are able to modify them, also they are able to modify instance variables (class variables) as well.
        However, they can not modify local variables, even though they can access them.(If our lambda expression is inside a method)
         */
        MyLambda l1 = () -> System.out.println("Hello from lambda. ");
        l1.display();

        MyLambda2 l2 = (name) -> "Hello " + name;
        System.out.println(l2.greetUser("Chamika"));

        MyLambda3 l3 = (x, y, z) -> x + y + z;
        System.out.println("Total is -> " + l3.getTotal(4, 6, 12));



    }

}
