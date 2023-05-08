package com.learn.collections;
import java.util.*;
import java.util.stream.Collectors;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("Germany", "Austria", "Norway", "Sweden", "Denmark", "Australia", "Argentina", "Armenia", "Australia", "Australia"));
        // addFirst
        myList.addFirst("Canada");
        // addLast
        myList.addLast("Scotland");

        //Usual list interface methods are available as well-> get, size, isEmpty, clear,....

        LinkedList<String> aCountries = myList.stream().filter(country -> country.charAt(0) == 'A').collect(Collectors.toCollection(LinkedList::new));
        // Here using method reference no argument constructor of LinkedList class is called collect get the stream as a linked-list
        System.out.println(aCountries);





    }



}
