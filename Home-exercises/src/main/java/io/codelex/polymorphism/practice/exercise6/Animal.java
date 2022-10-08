package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    String animalType;
    String animalName;
    Double animalWeight;
    Integer foodEaten = 0;

    public Animal(String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }

    abstract void makeSound();

    abstract void eat(Food name);
}
