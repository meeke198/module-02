package com.lesson09ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListVsListIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("New York"); list.add("Atlanta");
        list.add("Dallas"); list.add("Madison");

        //ListIterator is sub-interface of List
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().toUpperCase());
        }

        System.out.print("---------------------\n");

        //ListIterator support methods: next(), nextIndex(),...
        //but List not support these methods
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equalsIgnoreCase("Atlanta"))
                System.out.println("Next of Atlanta is: " + listIterator.next());
        }
    }
}
