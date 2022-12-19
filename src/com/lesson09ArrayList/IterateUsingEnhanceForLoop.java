package com.lesson09ArrayList;



// Java Program to demonstrate iterate
// an iterable using for-each loop

import java.io.*;
import java.util.*;

    public class IterateUsingEnhanceForLoop {
        public static void main (String[] args) {

            // create a list
            List<String> list = new ArrayList<String>();

            // add elements
            list.add("Geeks");
            list.add("for");
            list.add("Geeks");

            // Iterate through the list
            for( String element : list ){
                System.out.println( element );
            }
        }
    }
