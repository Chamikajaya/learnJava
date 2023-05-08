package com.dsa.master;

public class LinkedList {
    private Node head;
    // Creating an empty linked list
    public LinkedList(){
        this.head = null;
    }
    public boolean isEmpty(){
        return this.head == null ? true : false;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public Node  deleteFirst(){
        if (! isEmpty()){
            head = head.next;
            return head;
        }
        return null;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("List is empty. ");
            return;
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
    }

    public int find(int value){
        if (isEmpty()){  // List is empty
            return -1;
        }
        Node curr = head;
        int position = 0;
        while (curr != null){
            position++;
            if (curr.data == value){
                return position;
            }
            curr = curr.next;
        }
        return -2; // Value does not exist
    }






}
