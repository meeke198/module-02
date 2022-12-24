package com.lesson09ArrayList;
//import java.util.LinkedList;
public class LinkedList {
    private int numNodes = 0;
    private Node head;
   public LinkedList(Object firstEle){
       this.head = new Node(firstEle);
    }

    public void add(int index, Object newEle){
       Node temp = head;
       Node holder;
       //di toi cai cuong cho de chen
       for(int i = 0; i < index - 1 && temp.next != null; i++){
           temp = temp.next;
       }
       holder = temp.next;
       temp.next = new Node(newEle);
       temp.next.next = holder;
       numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    private class Node{
       private Node next;
       private Object data;
       public Node(Object newData){
           this.data = newData;
       }
       public Object getData(){
           return this.data;
       }
    }
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll = new LinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
