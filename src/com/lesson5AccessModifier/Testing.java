package com.lesson5AccessModifier;

//public class Testing {
//    public static int swap(int first, int second){
//        int temp = first;
//        first = second;
//        second = temp;
//        return first;
//    }
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        System.out.println(swap(a, b));
//        System.out.println("a = " + a);
//        System.out.println("b = " + b); }
//}

//Trong java, super có 3 cách sử dụng chính:


//        Sử dụng từ khóa super để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất
//        Sử dụng từ khóa super để gọi đến phương thức của lớp cha gần nhất
//        Sử dụng super() để gọi trực tiếp constructor (hàm tạo) của lớp cha gần nhất
//

// Tạo class cha Parent
//class Parent {
//    public String name = "Biến name của lớp cha";
//    public String address = "Hà Nội của lớp cha";
//    public void printInfo() {
//        System.out.println("Đây là printInfo của lớp cha");
//    }
//    public Parent() {} //Hàm tạo hay Constructor
//}

// Tạo class con kế thừa class Parent
//class Child extends Parent{
//    public String name = "Biến lớp con";
//    public void printInfo() {
//        System.out.println("Đây là printInfo của lớp con");
//    }
//    public void displayUseSuper() {
//        // Sử dụng từ khóa super
//        super.printInfo();
//    }
//    public void displayNotUseSuper() {
//        // Không sử dụng từ khóa super
//        printInfo();
//    }
//
//    public Child() {} //Hàm tạo hay Constructor
//
//    public void display1() {
//        // Sử dụng từ khóa super
//        System.out.println("Sử dụng super gọi biến name: " + super.name);
//        // Không sử dụng từ khóa super
//        System.out.println("Không sử dụng super: " + name);
//    }
//
//    public void display2() {
//        System.out.println("Nơi ở: " + address);
//
//    }
//}

public class Testing {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.display1();
//        child.display2();
//        child.displayUseSuper();
//        child.displayNotUseSuper();

    }
}
