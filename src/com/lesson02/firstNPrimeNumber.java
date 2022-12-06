package com.lesson02;

import java.util.Scanner;

public class firstNPrimeNumber {
    public static void main(String[] args) {
        int count = 1;
        int num = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        if(n >= 1) {
            System.out.println("The first " + n + " prime number(s) are: ");
            //2 is a known prime number
            System.out.println(2);
        }
        while(count < n){
            boolean isPrime = true;
            for(int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime )
            {
                System.out.println(num);
                ++count;
            }
            ++num;
        }

    }
}
