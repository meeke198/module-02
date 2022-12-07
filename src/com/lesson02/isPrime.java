package com.lesson02;

import java.util.Scanner;

public class isPrime {

    private static boolean checkPrime(int n){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao mot so: ");
//        int number = scanner.nextInt();
//        boolean check = true;
//        if(number < 2){
//            System.out.println(number + " is not a prime number");
//        } else {
//            for(int i = 2; i < number; i++){
//                if(number % i == 0) {
//                    check = false;
//                    break;
//                }
//            }
//        }
//        if(check)
//            System.out.println(number + " is a prime number");
//
//        else
//            System.out.println(number + " is not a prime number");

        int count = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return (count == 2) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        if (checkPrime(n)) System.out.printf("%d is prime number", n);
        else System.out.printf("%d is not prime number", n);
    }
}
