package com.lesson04_classOOP;

import java.util.Scanner;




public class Rectangle {
    double height;
    double width;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "com.apiShape.CircleTest.Rectangle {" + "width= " + width + ",height=" + height + "}";
    }

}
