package com.lesson04_classOOP;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation (double newA, double newB, double newC){
        this.a = newA;
        this.b = newB;
        this.c = newC;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getDiscriminant(){
        return 2 * b - (4 * a * c);
    }
    public double getRoot1(){
        return (-b + Math.sqrt (2 * Math.pow(b,b) - (4 * a * c)))/(2 * a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt (2 * Math.pow(b,b) - (4 * a * c)))/(2 * a) ;
    }


    public double getC() {
        return c;
    }
}
