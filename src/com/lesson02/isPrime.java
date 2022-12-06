package com.lesson02;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        int number = scanner.nextInt();
        boolean check = true;
        if(number < 2){
            System.out.println(number + " is not a prime number");
        } else {
            for(int i = 2; i < number; i++){
                if(number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if(check)
            System.out.println(number + " is a prime number");

        else
            System.out.println(number + " is not a prime number");

    }
}
