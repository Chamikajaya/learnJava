package com.shop.abdul;

public class Main {
    public static void main(String[] args) {
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("001", "Program Construction", 80);
        subs[1] = new Subject("002", "Data Structures", 60);
        subs[2] = new Subject("003", "Algorithms", 100);

        for (var item : subs){
            System.out.println(item);
        }

    }
}
