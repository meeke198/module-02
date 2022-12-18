package com.apiShape;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle(){

    }

    public Rectangle(double newWidth, double newLength){
        this.width = newWidth;
        this.length = newLength;
    }

    public Rectangle(double newWidth, double newLength, String newColor, boolean newFilled){
        super(newColor, newFilled);
        this.width = newWidth;
        this.length = newLength;

    }


    public double getWidth(){
        return this.width;
    }

    public void setWidth(double newWidth){
        this.width = newWidth;
    }
    public double getLength(){
        return this.length;
    }

    public void setLength(double newLength){
        this.length = newLength;
    }
    public double getArea() {
       return Math.round(width * length);
    }

    public double getPerimeter(){
        return Math.round((width + length) * 2);
    }

    @Override
    public void resize(double percent) {
        System.out.println(percent * this.getArea());
    }

    @Override
    public String toString() {
        return "This rectangle has the length of " + getLength() + " and width of " + getWidth() +
        super.toString() + " and area of "+ getArea();
    }
}
