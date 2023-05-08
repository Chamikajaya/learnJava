package com.learn.ExceptionHandling;
import java.util.*;

public class Debugger {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of students : ");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.print("Enter marks: ");
            marks.add(scanner.nextInt());
        }
        double  total = 0;
        for (int item : marks){
            // logical error added
            total = item;
        }
        System.out.println("The average is " + total / marks.size() );




    }
}
