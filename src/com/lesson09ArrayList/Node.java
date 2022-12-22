package com.lesson09ArrayList;

public class Node<E> {
//    E element;
//    Node<E> next;
//
//    public Node(E e){
//        element = e;
//    }

    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
