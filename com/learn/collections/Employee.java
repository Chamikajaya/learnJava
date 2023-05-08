package com.learn.collections;

//TOdo: Sort the Engineers according to their Salary

import java.util.*;
import java.util.function.DoubleUnaryOperator;

class Engineers {
    private int id;
    private String name;
    private String field;
    private double salary;

    public Engineers(int id, String name, String field, double salary) {
        this.id = id;
        this.name = name;
        this.field = field;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Engineers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", field='" + field + '\'' +
                ", salary=" + salary +
                '}';
    }

}
    public class Employee {
        //TOdo: Sort the Engineers according to their Salary

        public static void main(String[] args) {
            ArrayList<Engineers> myEngineers = new ArrayList<>();
            Engineers e1 = new Engineers(10, "Mike", "CSE", 20000);
            Engineers e2 = new Engineers(11, "John", "Electrical", 15000);
            Engineers e3 = new Engineers(12, "Mia", "Civil", 34000);
            Engineers e4 = new Engineers(13, "Ann", "Chemical", 50000);
            myEngineers.addAll(Arrays.asList(e1, e2, e3, e4));

            //Sorting according to salary could be done using a lambda expression
            // Assending Order
            Collections.sort(myEngineers, (eng1, eng2) -> Double.compare(eng1.getSalary(), eng2.getSalary()));
            System.out.println(myEngineers);  // When printing this list overridden toString will be called

            ArrayList<Engineers> myList  = myEngineers;
            //Descending Order
            Collections.sort(myList, (eng1, eng2) -> Double.compare(eng2.getSalary(), eng1.getSalary()));
            System.out.println(myList);

            //Comparing Strings ->Assending
            Collections.sort(myEngineers, (eng1, eng2) ->eng1.getName().compareTo(eng2.getName()));
            System.out.println(myEngineers);



        }


    }


