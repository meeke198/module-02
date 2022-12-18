package com.apiShape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){

    }

    public Rectangle(double newWidth, double newLength){
        this.width = newWidth;
        this.length = newLength;
    }

    public Rectangle(double newWidth, double newLength, boolean newFilled, String newColor){
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
       return (width + length) * 2;
    }

    public double getPerimeter(){
        return width * length;
    }
    @Override
    public String toString() {
        return "This rectangle has the length of" + getLength() + "and width of" + getWidth() +
        super.toString();
    }
}
