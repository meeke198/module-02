package com.apiShape;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "green", true);
        Rectangle rectangle1 = new Rectangle(15, 20, "orange", true);
        double randomNumber = Math.round(Math.random() * 100 + 1);
        circle1.resize(3.0);
        rectangle1.resize(2.5);
        System.out.println(circle1.toString());
        System.out.println(rectangle1.toString());
    }
}
