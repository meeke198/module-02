package com.lesson09ArrayList;
import java.util.ArrayList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for( int i = 0; i <= 5; i++){
            list.add("" + i);
        }
        System.out.println(list);

//        for( String ele: list){
//            list.remove(ele);
//        }
//        for (int i = 0; i < list.size();) {

//            System.out.println("List value: " + list.get(i));

//            if (list.get(i).equals("3")) {

//                list.remove(i);

//                i--;

//               list.add("6");

//            }

//        }
        for (int i = 0;i < list.size();) {
            list.remove(i);
        }
        System.out.println(list.isEmpty());
        System.out.println(list);
    }
}
