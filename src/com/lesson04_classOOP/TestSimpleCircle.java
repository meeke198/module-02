package com.lesson04_classOOP;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.getRadius() + " is " + circle1.getArea());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.getRadius() + " is " + circle3.getArea());
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius " +circle2.getRadius() + " is " + circle2.getArea());
    }
}
