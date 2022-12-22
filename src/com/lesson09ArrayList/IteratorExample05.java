package com.lesson09ArrayList;

import java.util.ArrayList;
import java.util.List;

//public class IteratorExample05 {
//    public static void main(String[] args) {
//        // Create list with no parameter
//        List<String> list = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            // Add element to list list.add("0" + i); }
//
//            // traversing the list in the backward direction
//            // for (int i = 4; i >= 0; i--) {
//            list.remove(i);
//        }
//        System.out.println("list.isEmpty() = " + list.isEmpty());
//    }
//}
//loi

public class IteratorExample05 {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 0;i < list.size();) {
            list.remove(i);
        }
        System.out.println("list.isEmpty() = " + list.isEmpty());
    }
}
