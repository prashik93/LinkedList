package com.linkedlist;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List !");
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        MyNode<Integer> myFirstNode = new MyNode<>();
        myFirstNode.setKey(70);

        MyNode<Integer> mySecondNode = new MyNode<>();
        mySecondNode.setKey(30);

        MyNode<Integer> myThirdNode = new MyNode<>();
        myThirdNode.setKey(56);

        integerMyLinkedList.add(myFirstNode);
        integerMyLinkedList.add(mySecondNode);
        integerMyLinkedList.add(myThirdNode);

        integerMyLinkedList.printMyNodes();
    }
}