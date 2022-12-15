//package com.lesson07AbstractClass_Interface.edible;
package com.lesson07AbstractClass_Interface.animal;
import com.lesson07AbstractClass_Interface.edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
