package com.linkedlist;
public class Main {
    MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List !");
        new Main().appendMain();
        new Main().addMain();
        new Main().insertMain();
        new Main().popMain();
        new Main().searchMain();
        new Main().insertAfterGivenElementMain();
        new Main().deleteSpecificElementMain();
    }

    public void deleteSpecificElementMain() {
        System.out.println("\nSearch and delete");
        MyNode<Integer> myFirstNode = new MyNode<>();
        myFirstNode.setKey(70);

        MyNode<Integer> mySecondNode = new MyNode<>();
        mySecondNode.setKey(40);

        MyNode<Integer> myThirdNode = new MyNode<>();
        myThirdNode.setKey(30);

        MyNode<Integer> myFourthNode = new MyNode<>();
        myFourthNode.setKey(56);

        integerMyLinkedList.add(myFirstNode);
        integerMyLinkedList.add(mySecondNode);
        integerMyLinkedList.add(myThirdNode);
        integerMyLinkedList.add(myFourthNode);

        INode<Integer> searchResult = integerMyLinkedList.search(40);
        System.out.println("search result : " + searchResult);
        integerMyLinkedList.remove(searchResult);
        integerMyLinkedList.printMyNodes();
    }

    public void insertAfterGivenElementMain() {
        System.out.println("\nSearch and insert");
        MyNode<Integer> myFirstNode = new MyNode<>();
        myFirstNode.setKey(70);

        MyNode<Integer> mySecondNode = new MyNode<>();
        mySecondNode.setKey(30);

        MyNode<Integer> myThirdNode = new MyNode<>();
        myThirdNode.setKey(56);

        MyNode<Integer> myFourthNode = new MyNode<>();
        myFourthNode.setKey(40);

        integerMyLinkedList.add(myFirstNode);
        integerMyLinkedList.add(mySecondNode);
        integerMyLinkedList.add(myThirdNode);

        INode<Integer> search = integerMyLinkedList.search(mySecondNode.getKey());

        integerMyLinkedList.insert(search, myFourthNode);
        integerMyLinkedList.printMyNodes();
    }


    public INode<Integer> searchMain() {
        System.out.println("\nSearching Node : ");
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

        return integerMyLinkedList.search(30);
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