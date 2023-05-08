package com.learn.staticAndFinal;
// Static members are shared by all the objects of a class (One per class)
// If one obj modifies a static member then that static member value for all other objects get modified as well.
// No need t crate objects, can be directly accessed using the class
// Static members will be created in method area in the memory (not in heap nor stack)
// Static methods can access static members only, non statics can access anything
class Bmwi4{
    private long buildNumber;
    static int count = 0;
    static double price = 10000;
    public Bmwi4(long buildNumber){
        count++;
        this.buildNumber = buildNumber;
    }

    public long getBuildNumber() {
        return buildNumber;
    }

    public static void getCount(){
        System.out.println(count + " cars have been created.");
    }

    public static void getPrice(String city){
        switch (city){
            case "Munich" -> System.out.println("The price of i8 in " + city + " is "+ (price + price * 0.5));
            case "Berlin" -> System.out.println("The price of i8 in " + city + " is "+ (price + price * 0.3));
            case "Hamburg" -> System.out.println("The price of i8 in " + city + " is "+ (price + price * 0.2));
            default -> {
                System.out.println("Invalid State");
                return;
            }
        }
        }
    }
    public class Main {
        public static void main(String[] args) {
            Bmwi4.getPrice("Munich");
            Bmwi4.getPrice("Berlin");
            Bmwi4.getPrice("Hamburg");
            Bmwi4.getPrice("Vienna");
            Bmwi4.getCount();
            Bmwi4 c1 = new Bmwi4(1001001);
            Bmwi4 c2 = new Bmwi4(1001002);
            Bmwi4 c3 = new Bmwi4(1001003);
            Bmwi4.getCount();


        }


}
