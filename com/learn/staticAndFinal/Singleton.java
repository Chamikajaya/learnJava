package com.learn.staticAndFinal;
// Singleton class -> Only one can be created using this class
class CoffeeMachine{
    // We want only one machine to be created --> We can use singleton design pattern
    private int coffeePowder;
    private int water;
    private int sugar;
    //Static variable  --> Why static -> So that we can create an object using the class itself
    private static CoffeeMachine ourMachine;

    // Private Constructor -> So that we can not create objects as much as we want
    private CoffeeMachine(int coffeePowder, int water, int sugar){
        this.coffeePowder = coffeePowder;
        this.water = water;
        this.sugar = sugar;
    }
    // To create the machine object
    public static CoffeeMachine createMachine(){
        if (ourMachine == null){
            ourMachine = new CoffeeMachine(500, 1000,100);
            System.out.println("Machine Created");
            return ourMachine;
        }
        System.out.println("You already have one machine. ");
        return null;
    }
    public static  void makeCoffee(){
        if (ourMachine != null){
            System.out.println("Making a coffee, please wait...");
        }
        else {
            System.out.println("You do not have a coffee machine :( ");
        }
    }
    public void turnOff(){
        if (ourMachine != null){
            System.out.println("Turning the machine off.");
        }

    }
}


public class Singleton{
    public static void main(String[] args) {
        CoffeeMachine.makeCoffee();
        CoffeeMachine myMachine = CoffeeMachine.createMachine();
        CoffeeMachine.makeCoffee();



    }


}
