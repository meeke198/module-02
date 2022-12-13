package com.lesson04_classOOP;

public class Fan {
   static final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
   private int speed = SLOW;
   private boolean on = false;
   private double radius = 5;
   private String color = "blue";
    public Fan (){

    }
    public Fan( int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public boolean setOn(boolean newAction) {

        return this.on = newAction;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String toString(){
        if (on){
//            System.out.println("Fan speed is " + speed);
//            System.out.println("Fan color is " + color);
//            System.out.println("Fan radius is " + radius);

            return "Fan speed is " + this.speed + "Fan is on" + "Fan radius is " + this.radius ;
        }else {

//            System.out.println("Fan color is " + color);
//            System.out.println("Fan radius is " + radius);

            return "Fan is off" + "Fan color is " + this.color + "Fan radius is " + this.radius;
        }


    }
}
