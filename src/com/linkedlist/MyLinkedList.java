package com.linkedlist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {

    }

    public void insertAfterGivenElement(INode<K> myNode, INode<K> newNode) {

    }

    public INode<K> search(INode<K> myNode) {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            while (tempNode.getNext() != null) {
                if ((tempNode.getNext() == myNode) || (this.head == myNode)) {
                    System.out.println("Found : " + tempNode.getNext());
                    return tempNode.getNext();
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Not found");
        return null;
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void insert(INode<K> myNode, INode<K> newNode) {
        INode<K> tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void append(INode<K> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void add(INode<K> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer(("My Nodes : "));
        INode<K> tempNode = head;
        while(tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
