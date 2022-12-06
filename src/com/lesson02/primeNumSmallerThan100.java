package com.lesson02;

public class primeNumSmallerThan100 {
    public static void main(String[] args) {
        boolean flag = true;
        int num = 2;
        while(num < 100){
            flag = true;
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(num + " is prime numbers less than 100");
//                System.out.println(num);
            }
            ++num;
        }
    }
}
