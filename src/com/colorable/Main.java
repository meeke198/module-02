package com.colorable;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "orange", true);
        Rectangle rectangle1 = new Rectangle(15, 20, "blue", true);
        Square square1 = new Square(25, 25, "blue", true);
        Shape[] shapes = {circle1, rectangle1, square1};
        System.out.println(circle1.getArea());
        System.out.println(rectangle1.getArea());
        square1.howToColor();
    }
}
