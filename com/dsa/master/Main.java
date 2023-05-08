package com.dsa.master;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll.isEmpty());
        ll.display();
        ll.insertFirst(12);
        ll.insertFirst(10);
        ll.insertFirst(8);
        ll.insertFirst(5);
        ll.display();
        System.out.println();
        System.out.println(ll.find(200));
        System.out.println(ll.find(5));






    }



}
