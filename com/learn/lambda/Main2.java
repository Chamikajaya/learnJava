package com.learn.lambda;
/*
There are 3 main steps of using a stream.
1) We need to get a stream from our source.
2) Then we need to do 1 or more intermediate operations(map, filter, limit, sorted, ....)
3) Finally we need to do terminal operation (collect, count(reruns the number of elements in the stream), ...)
****************************************************************
*** Instead of having to iterate over the original collection
for each and every intermediate operation, it may be possible to do all the
operations while only going through the data once
// Since intermediate operations are lazy, it’s up to the terminal operation to do everything
 */

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = List.of("Zedd", "Jane", "Anne", "Cam", "Chamika", "Mike");  // This list is immutable :(
        List<String> myList = names.stream().sorted().limit(4).collect(Collectors.toList());  // TODO : This is a stream pipeline
        //System.out.println("New list --> " + myList);  // My list is mutable :)
        //System.out.println(names);  // Stream operations do not change the original collection
        // Collectors. toUnmodifiableList()  --> can be used to create a list which can not be modified
        List<String> fixedList = names.stream().sorted().limit(4).collect(Collectors.toUnmodifiableList());  //TODO : This creates an immutable list
        // fixedList.add("Katharina");  // This gives an error
        /* ******************************************************************/
        /* ******************************************************************/
        // 1)  Write a lambda expression to find only the even numbers from a list
        List<Integer> numberList = List.of(2, 5, 3, 9, 1, 5, 2, 1, 1, 9, 10, 12,12,12, 12, 19);
        List<Integer> evenNumbers = numberList.stream().filter(number -> number % 2 == 0).distinct().collect(Collectors.toList()); // We could have used a set as well since we are  opting out the duplicates
        System.out.println(evenNumbers);
        // 2) Return the sum of oll odd numbers
        // If our stream does not return anything then we may run into an error.So to solve this we will use an Optional object
        Optional<Integer> optional = numberList.stream().filter(number -> number % 2 != 0).reduce((x, y) -> x + y);
        int oddTotal = optional.orElse(0);
        // Get a names list where each name's length is no more than 4
        List<String> studentNames = List.of("Alice", "Bob", "Charlie", "Dan", "Eve", "Frank", "Gina", "Hank");
        List<String> shortNames = studentNames.stream().filter(name -> name.length() <= 4).distinct().collect(Collectors.toList());
        System.out.println(shortNames);
        // First get even number list then get their products (no duplicates) -> finally get their sum as well
        List<Integer> numberList2 = List.of(2, 5, 3, 9, 1, 5, 2, 1, 1, 9, 10, 12,12,12, 12, 19, 4, 8, 8, 8, 8, 8, 10, 25, 16);
        int  sqtotal = numberList2.stream().filter(number -> number % 2 == 0).distinct().map(number -> number * number).reduce(0, (x, y) -> x + y);
        System.out.println(sqtotal);   // Here in reduce we used 0 , just in case we get an empty list after performing filter operations









    }







}
