package com.learn.bariabdul;
// Implement student score enter + show system like the atm System project

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private double scores;
    private  ArrayList<Double> marksList;
    private HashMap<String, ArrayList<Double>> marksDict;

    public Student(){
        // Whenever we create a student setNameandID will be called
        setNameandID();
        this.marksDict = new HashMap<>();  // To store studentId : Marks list
        this.marksList = new ArrayList<>();  // To store marks list for particular student
        marksDict.put(this.id, this.marksList);  // When a student obj is created his id + null list will be added to the hashmap
    }

    public void setNameandID(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Id number -> ");
        this.id = scanner.nextLine();
        System.out.println("Your Name -> ");
        this.name = scanner.nextLine();
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList getMarksList(){
        return this.marksList;
    }


    // Get marks for each subject
    public void setMarksList(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many subject do you have ? ");
        int items = input.nextInt();
        System.out.println("Please enter your marks one by one separated by a space: ");
        for (int i = 0; i < items ; i++){
            this.marksList.add(input.nextDouble());
        }
    }

    public double getTotal(){
        double total = 0;
        for (var item : this.marksList){
            total += item;
        }
        return total;
    }

    public double getAvg(){
        double x = getTotal();
        return x / this.marksList.size();
    }

    public void displayResults(){
        System.out.println("Here are your scores, " + this.name );
        for (var score : this.marksList){
            System.out.print(score + " --> ");
        }
        System.out.println("Total = " + getTotal() + "  Average = " + getAvg());
    }







}
