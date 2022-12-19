package com.lesson09ArrayList;

import java.util.*;

// Main class
public class size {

    // Main driver method
    public static void main(String[] arg)
    {
        // Creating object of ArrayList class
        List<Integer> list = new ArrayList<Integer>();

        // Populating List by adding integer elements
        // using add() method
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Printing elements of List
        System.out.println("Before operation: " + list);

        // Getting total size of list
        // using size() method
        int size = list.size();

        // Printing the size of List
        System.out.println("Size of list = " + size);
    }
}