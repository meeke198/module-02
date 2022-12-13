package com.lesson06Kethua;
//import java.util.Shape;
public class Circle extends Shape {
    public double radius;
    public Circle (){

    }
    public Circle (double radius){
    this.radius = 1;
    }
    public Circle (double radius, String color, boolean filled){
    super(color, filled);
    this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " +getRadius()+ " which is a subclass of " + super.toString();
    }

        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(3.5);
            System.out.println(circle);

            circle = new Circle(3.5, "indigo", false);
            System.out.println(circle.toString());

    }
}
