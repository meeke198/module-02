package com.lesson06Kethua;

public class Animal {

        public void eat() {
            System.out.println("eating...");
        }



    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal1 = new Animal(); // Chuyển kiểu không tường minh
        Cat cat2 = (Cat) animal1; // Chuyển kiểu tường minh

        cat.eat();
        cat.meow();
        animal1.eat();
        System.out.println(cat.getClass());
//        animal2.eat();
//         animal2.meow(); // Không thể gọi phương thức meow()
    }
}
