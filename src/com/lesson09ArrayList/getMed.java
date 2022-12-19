package com.lesson09ArrayList;

import java.util.*;

public class getMed {
    public static void main(String[] args)
    {
        // creating an Empty Integer List
        List<Integer> arr = new ArrayList<Integer>(4);

        // using add() to initialize values
        // [10, 20, 30, 40]
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println("List: " + arr);

        // element at index 2
        int element = arr.get(2);

        System.out.println("The element at index 2 is " + element);
    }
}
