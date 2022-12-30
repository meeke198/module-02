package com.multithreading;

import java.lang.Thread;
public class MultithreadThing2 extends Thread {
    private int threadNumber;
    //    public MultithreadThing(int threadNumber){
//        this.threadNumber = threadNumber;
//    }
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
    }
//        public void run() {
//            for(int i = 0; i <= 5; i++){
//                System.out.println(i);
//                Thread.sleep(1000);
//            }
//        }

}
