package com.lesson09ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add("0" + i);
        }

        System.out.print("Original array list is: ");
        for (String item : list) {
            System.out.print(item + " ");
        }

        //Insert new element "034" at position 3 without lost any elements
        System.out.println("\nInserting new element.........");
        list.add(2, "034");

        System.out.print("After inserting, array list is: ");
        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}
