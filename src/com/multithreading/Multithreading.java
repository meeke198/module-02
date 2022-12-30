package com.multithreading;
import com.multithreading.MultithreadThing;
import java.lang.Thread;
public class Multithreading {
    public static void main(String[] args) {
//
//        for(int i = 0; i <= 5; i++){
//            MultithreadThing thread = new MultithreadThing(i);
//            System.out.println("number " + i + " from thread " + i);
//            thread.start();
//        }
        MultithreadThing thread = new MultithreadThing();
        MultithreadThing2 thread2 = new MultithreadThing2();

    thread.start();
    thread2.start();

    }
}
