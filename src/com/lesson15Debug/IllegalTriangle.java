package com.lesson15Debug;

import java.util.Scanner;


public class IllegalTriangle {
    private double side1;
    private double side2;
    private double side3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập cạnh 1: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập cạnh 2: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập cạnh 3: ");
        int z = scanner.nextInt();
        IllegalTriangle calc = new IllegalTriangle();
        calc.calculate(x, y, z);
    }

    private void calculate(double x, double y, double z) {
        try {
            double a = x + y;
            double b = x + z;
            double c = y + z;
            if (a > z && b > y && c > x) {
                System.out.println("Tam giác hợp lệ với 3 cạnh x là " + x + ", cạnh y là " + y + ", cạnh z là " + z);
            }
        } catch(Exception e){
        System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
//        } catch (Exception e) {
//            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
//        }

}
