package com.lesson09ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample02 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add("0" + i);
        }
        for (String item : arrayList) {
            System.out.print(item + " ");
        }

        List<String> linkedList = new LinkedList<>(arrayList);//no error
        System.out.println("\n---------");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }

        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list3.add("0" + i);
        }

        System.out.println("\n---------");
        for (int i = list3.size() - 1; i >= 0; i--) {
            System.out.print(list3.get(i) + " ");
        }

//        ArrayList<String> list4 = new LinkedList<>(list3); //error
//        System.out.println("\n---------");
//        for (int i = list4.size() - 1; i >= 0; i--) {
//            System.out.print(list4.get(i) + " ");
//        }
    }
}