package com.lesson06Kethua;

public class Shape {

    String color = "green";
    boolean filled = true;

    public Shape(){
    }
    public Shape(String newColor, boolean newFilled){
        this.color = newColor;
        this.filled = newFilled;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setFilled(boolean newFilled){
        this.filled = newFilled;
    }
    public String toString(String newColor, boolean newFilled){
        return "A Shape with color of" + newColor + "and " + (newFilled ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
