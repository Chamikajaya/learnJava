package com.learn.collections;
import java.util.*;


public class SetExample {
    // ToDo : Sets are unordered collections which do not allow duplicates
    /*
    When you create a new HashSet, a new instance of HashMap is also created, which is used to store the elements of the set as keys
     */
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(Arrays.asList("Python","Python", "Java", "Java", "C++", "C", "Kotlin"));
        System.out.println(names);

    }

    // Other usual methods are applied here as well

}
