package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Squek!");
    }

    @Override
    void eat(Food name) {
        if (name.getClass().getSimpleName().equals("Meat")) {
            System.out.println(animalType + " are not eating that type of food!");
        } else {
            this.foodEaten += name.quantity;
        }
    }

    @Override
    public String toString() {

        return animalType + "[" + animalName +
                ", " + new DecimalFormat("0.0").format(animalWeight) +
                ", " + livingRegion +
                ", " + foodEaten +
                "]";
    }
}
