package com.apiShape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean newFilled){
        this.filled = newFilled;
    }
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (getFilled() ? "filled" : "not filled");
    }

}
