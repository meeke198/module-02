package com.lesson02;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Draw a triangle");
        System.out.println("2. Draw a square");
        System.out.println("3. Draw a rectangle");
        System.out.println("4. Draw a star");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        while(choice != -1){
            switch (choice){
                case 1:
                    System.out.println("Draw the triangle");
                    for(int i = 7; i >= 1; i--){
                        System.out.println("*".repeat(i));
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for(int i = 4; i >= 1; i--){
                        System.out.println("*".repeat(10));
                    }
                case 3:
                    System.out.println("Draw the rectangle");
                    for(int i = 4; i >= 1; i--){
                        System.out.println("*".repeat(15));
                    }
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
            choice = 0;

        }
    }
}
