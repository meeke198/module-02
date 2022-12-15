package com.lesson07AbstractClass_Interface.animal;

public abstract class Animal{
    public abstract String makeSound();

        public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                System.out.println(animal.makeSound());
            }
        }


}