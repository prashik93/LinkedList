package com.linkedlist;
public class Main {
    MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List !");
        new Main().appendMain();
        new Main().addMain();
        new Main().insertMain();
        new Main().popMain();
        boolean search = new Main().searchMain();
        System.out.println("Search result : " + search);
    }

    public boolean searchMain() {
        System.out.println("\nAdding : ");
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

        return integerMyLinkedList.search(mySecondNode);
    }

    public void popMain() {
        System.out.println("\nDeletion by pop method");
        addMain();
        integerMyLinkedList.pop();
        integerMyLinkedList.printMyNodes();
    }

    public void insertMain() {
        System.out.println("\nInsertion in between 56 & 70");
        MyNode<Integer> myFirstNode = new MyNode<>();
        myFirstNode.setKey(56);

        MyNode<Integer> mySecondNode = new MyNode<>();
        mySecondNode.setKey(30);

        MyNode<Integer> myThirdNode = new MyNode<>();
        myThirdNode.setKey(70);

        integerMyLinkedList.append(myFirstNode);
        integerMyLinkedList.append(myThirdNode);
        integerMyLinkedList.insert(myFirstNode, mySecondNode);

        integerMyLinkedList.printMyNodes();
    }
    public void appendMain() {
        System.out.println("\nAppending : ");
        MyNode<Integer> myFirstNode = new MyNode<>();
        myFirstNode.setKey(56);

        MyNode<Integer> mySecondNode = new MyNode<>();
        mySecondNode.setKey(30);

        MyNode<Integer> myThirdNode = new MyNode<>();
        myThirdNode.setKey(70);

        integerMyLinkedList.append(myFirstNode);
        integerMyLinkedList.append(mySecondNode);
        integerMyLinkedList.append(myThirdNode);

        integerMyLinkedList.printMyNodes();
    }

    public void addMain() {
        System.out.println("\nAdding : ");
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