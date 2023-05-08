package com.learn.ExceptionHandling;

/*
Syntax Errors + Logical Errors are faced by -> Users
If there are syntax errors compiler won't be able to convert the code into byte code
To solve a logical error we need to use a debugger tool / need to trace the code , so quite troublesome to solve such errors
Runtime Errors (Exceptions) -> are faced  by Users
Runtime errors usually occur because of bad inputs / unavailability of resources

There are 2 types of exceptions , checked and unchecked.
We must handle checked exceptions whereas handling unchecked exceptions are not mandatory.
Checked Exceptions --> ClassNotFoundException, IOException, InterruptedException, NumberFormatException
Unchecked Exceptions --> These are the Runtime Exceptions such as IndexOutOfBoundsException, ArithmeticException,...

TODO: All of these subclass Exceptions are derived from a parent class called Exceptions. So if we are handling multiple exceptions subclasses should be at the top.

methods of Exception class -> toString(), getMessage() , printStackTrace()


*/


import java.util.ArrayList;
import java.util.Arrays;

public class Errors1 {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> myArr = new ArrayList<>(Arrays.asList(5, 0, 3, 9, 12));
            int answer = myArr.get(0) / myArr.get(1000);
            System.out.println(answer);
        }
        catch (ArithmeticException e){
            System.out.println("Division by  0 ! ->  " + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Bounds  reached! ->  " + e);
        }
        catch (Exception e){
            System.out.println("An unknown error ! -> " + e.getMessage());
        }
        finally {
            System.out.println("Finished");
        }
    }






}
