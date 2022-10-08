package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {

    String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food name) {
        this.foodEaten += name.quantity;
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName +
                ", " + breed +
                ", " + new DecimalFormat("0.0").format(animalWeight) +
                ", " + livingRegion +
                ", " + foodEaten +
                "]";
    }
}
