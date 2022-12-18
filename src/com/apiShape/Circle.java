package com.apiShape;

public class Circle extends Shape implements Resizeable {

    private double radius = 1.0;
    public Circle(){

    }
    public Circle (double radius){
        this.radius = radius;
    }
    public Circle (double newRadius, String newColor, boolean newFilled){
        super(newColor, newFilled);
        this.radius = newRadius;
    }
   public double getRadius(){
        return this.radius;
   }
   public void setRadius(double newRadius){
        this.radius = newRadius;
   }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        return percent * this.getArea();
    }
}
