package com.lesson06Kethua;

public class Shape {

    private String color = "green";
    private boolean filled = true;

    public Shape(){
    }
    public Shape(String newColor, boolean newFilled){
        this.color = newColor;
        this.filled = newFilled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setFilled(boolean newFilled){
        this.filled = newFilled;
    }
    @Override
    public String toString(){
        return "A Shape with color of " + this.getColor() + " and " + (this.getFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape.toString());
    }
}
