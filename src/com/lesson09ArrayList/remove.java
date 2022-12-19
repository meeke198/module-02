package com.lesson09ArrayList;
import java.util.ArrayList;
//import java.util.AbstractArrayList;

import java.util.List;
import java.util.Iterator;

public class remove {


        // Main driver method
        public static void main(String[] args)
        {
            // Creating an object of List interface with
            // reference to ArrayList class
            List<Integer> al = new ArrayList<>();

            // Adding elements to our ArrayList
            // using add() method
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(25);
            al.add(11);
            al.add(45);
            al.add(17);
            al.add(29);
            al.add(55);
            al.add(60);


            // Printing the current ArrayList
            System.out.println(al);

            // This makes a call to remove(int) and
            // removes element 20
            al.remove(1);

            // Now element 30 is moved one position back
            // So element 30 is removed this time
            al.remove(1);

            // Printing the updated ArrayList
            System.out.println(al);
            // This makes a call to remove(Object) and
            // removes element 1
            al.remove(Integer.valueOf(10));

            // This makes a call to remove(Object) and
            // removes element 2
            al.remove(Integer.valueOf(60));

            // Printing the updated ArrayList
            System.out.println(al);
            // Creating iterator object
            Iterator itr = al.iterator();

            // Holds true till there is single element
            // remaining in the object
            while (itr.hasNext()) {

                // Remove elements smaller than 10 using
                // Iterator.remove()
                int x = (Integer)itr.next();
                if (x < 20)
                    itr.remove();
            }

            // Printing the updated ArrayList
            System.out.print(al);
        }
    }

