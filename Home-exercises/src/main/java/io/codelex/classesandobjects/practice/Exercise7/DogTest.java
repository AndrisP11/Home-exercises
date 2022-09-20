package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male", "Lady", "Rocky");
        Dog dog2 = new Dog("Rocky", "male", "Molly", "Sam");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male", "Lady", "Sparky");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female", "Molly", "Buster");

        System.out.println(dog8.fathersName());
        System.out.println(dog3.fathersName());
        System.out.println(dog8.hasSameMotherAs(dog2.getMother()));
        System.out.println(dog1.hasSameMotherAs(dog4.getMother()));
        System.out.println(dog4.hasSameMotherAs(dog6.getMother()));
        System.out.println(dog5.hasSameMotherAs(dog7.getMother()));
    }
}
