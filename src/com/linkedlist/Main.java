package com.linkedlist;

import java.util.Scanner;

public class Main {
    Scanner scnr = new Scanner(System.in);
    MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List !");
        new Main().userChoice();
    }

    public void userChoice() {
        int count = 0;
        while (count == 0) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("""
                    0.Exit
                    1.Add Data
                    2.Append Data
                    3.Insert Data
                    4.Search Data
                    5.Pop Data
                    6.Insert data with position
                    7.Delete data from specific position
                    8.Print Data""");
            System.out.print("Enter your choice : ");
            int usrChoice = scnr.nextInt();

            switch (usrChoice) {
                case MyLinkedListConstants.EXIT -> count += 1;

                case MyLinkedListConstants.ADD_DATA -> addMain();

                case MyLinkedListConstants.APPEND_DATA -> appendMain();

                case MyLinkedListConstants.INSERT_DATA -> insertMain();

                case MyLinkedListConstants.SEARCH_DATA -> {
                    INode<Integer> searchResult = searchMain();
                    System.out.println("Search Result : " + searchResult);
                }

                case MyLinkedListConstants.POP_DATA -> popMain();

                case MyLinkedListConstants.INSERT_DATA_WITH_POSITION -> insertAfterGivenElementMain();

                case MyLinkedListConstants.DELETE_DATA_FROM_SPECIFIC_POSITION -> popElementOfSpecificPosition();

                case MyLinkedListConstants.PRINT_DATA -> printMyNodesMain();

                default -> System.out.println("Invalid Choice, Please try again!");
            }
        }
    }

    public void addMain() {
        System.out.print("\nHow many Node do you want to add in linked list : ");
        int usrNumber = scnr.nextInt();
        for (int i = 0; i < usrNumber; i++) {
            MyNode<Integer> myNode = new MyNode<>();
            System.out.print("Set Key : ");
            myNode.setKey(scnr.nextInt());
            System.out.println("MyNode : " + myNode);
            integerMyLinkedList.add(myNode);
        }
    }

    public void appendMain() {
        System.out.print("\nHow many Node do you want to append in linked list : ");
        int usrNumber = scnr.nextInt();
        for (int i = 0; i < usrNumber; i++) {
            System.out.print("Set Key : ");
            MyNode<Integer> myNode = new MyNode<>();
            myNode.setKey(scnr.nextInt());
            System.out.println("MyNode : " + myNode);
            integerMyLinkedList.append(myNode);
        }
    }

    public void insertMain() {
        INode<Integer> searchResult = searchMain();
        MyNode<Integer> insertNode = new MyNode<>();
        System.out.print("Set key for insert element : ");
        int insertKey = scnr.nextInt();
        insertNode.setKey(insertKey);

        integerMyLinkedList.insert(searchResult, insertNode);
    }

    public INode<Integer> searchMain() {
        System.out.print("\nPlease enter the key to search : ");
        int searchKey = scnr.nextInt();
        INode<Integer> searchResult = integerMyLinkedList.search(searchKey);
        return searchResult;
    }

    public void popMain() {
        System.out.println("\nDeletion by pop method");
        integerMyLinkedList.pop();
    }

    public void insertAfterGivenElementMain() {
        INode<Integer> searchResult = searchMain();
        MyNode<Integer> insertNode = new MyNode<>();
        System.out.print("Set key for insert element : ");
        int insertKey = scnr.nextInt();
        insertNode.setKey(insertKey);
        integerMyLinkedList.insert(searchResult, insertNode);
    }

    public void popElementOfSpecificPosition() {
        INode<Integer> searchResult = searchMain();
        integerMyLinkedList.remove(searchResult);
    }

    public void printMyNodesMain() {
        integerMyLinkedList.printMyNodes();
    }
}