package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Feline {

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food name) {
        if (name.getClass().getSimpleName().equals("Meat")) {
            this.foodEaten += name.quantity;
        } else {
            System.out.println(animalType + " are not eating that type of food!");
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
