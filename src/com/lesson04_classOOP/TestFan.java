package com.lesson04_classOOP;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
//        fan1.setRadius(10);
//        fan1.setColor("yellow");
//        fan1.setSpeed(fan1.FAST);
//        fan1.setOn(true);
        Fan fan2 = new Fan(2, false, 10, "blue");
//        fan2.setSpeed(fan2.MEDIUM);
//        fan2.setRadius(5);
//        fan2.setColor("blue");
//        fan2.setOn(false);
        fan1.toString();
        fan2.toString();
//        System.out.println("Fan1 speed is " + fan1.getSpeed());
//        System.out.println("Fan 1 radius " + fan1.getRadius());
//        System.out.println("Fan 1 color " + fan1.getColor());
//        System.out.println(fan1.toString());




    }
}
