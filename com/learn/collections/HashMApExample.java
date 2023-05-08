package com.learn.collections;
import java.util.HashMap;
/*
Methods used  collections interface
add
addAll,
remove,
removeAll,..
 // clear ->
// isEmpty ->
//contains ->
//containsAll->
//equals ->
//size ->
// iterator ->.
*/


public class HashMApExample {
    public static void main(String[] args) {
        // Hash Maps allow unique keys only + they are unordered
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("Sri Lanka", "Colombo");
        countries.put("India", "Delhi");
        countries.put("Germany", "Berlin");
        countries.put("UK", "London");
        countries.put("Austria", "Vienna");
        System.out.println(countries);
        for (var i : countries.keySet()){  // keySet -> Keys are stored in a set (coz they are uniques)
            // If we wanna get values use countries.values() --> Returns in a Collection
            System.out.println(i +  " --> " + countries.get(i));
        }
        countries.remove("India");
        System.out.println(countries.get("Sri Lanka"));
        System.out.println(countries);
        countries.replace("Sri Lanka", "Kotte");
        System.out.println(countries.size());
        System.out.println(countries);
        System.out.println(countries.containsKey("Sri Lanka"));
        System.out.println(countries.containsValue("Kotte"));
        countries.clear();
        System.out.println(countries);







    }
}
