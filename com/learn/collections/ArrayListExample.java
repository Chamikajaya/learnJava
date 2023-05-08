package com.learn.collections;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> first =  new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11));
        ArrayList<Integer> second =  new ArrayList<>(Arrays.asList(13, 17, 19, 23, 29));
        ArrayList<Integer> firstTenPrimes = new ArrayList<>(first);
        System.out.println(firstTenPrimes);
        firstTenPrimes.addAll(second);
        System.out.println(firstTenPrimes);

        System.out.println(firstTenPrimes.size());
        System.out.println(firstTenPrimes.get(1));
        System.out.println(firstTenPrimes.isEmpty());

        ArrayList<String> progLag = new ArrayList<>(Arrays.asList("Python", "Java", "C++", "C", "Kotlin"));
        progLag.set(3, "VHDL");
        System.out.println(progLag);

        progLag.remove("Kotlin");
        progLag.remove(2);  // removes the object at 2nd index --> c++
        System.out.println(progLag);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Gina", "Henry"));
        ArrayList<String> smallList =  new ArrayList<>(Arrays.asList("David", "Chamika", "Frank", "Alice"));
        names.removeAll(smallList);
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 7, 1, 4, 8, -2, 0));
        Collections.sort(numbers);
        System.out.println(numbers);


    }



}
