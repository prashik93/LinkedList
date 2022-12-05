package com.linkedlist;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List !");
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        MyNode<Integer> myFirstNode = new MyNode<>();
        myFirstNode.setKey(70);

        integerMyLinkedList.add(myFirstNode);

        integerMyLinkedList.printMyNodes();
    }
}