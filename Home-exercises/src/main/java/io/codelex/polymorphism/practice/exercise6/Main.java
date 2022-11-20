package io.codelex.polymorphism.practice.exercise6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Animal> animalList = new ArrayList<>();


    public static void main(String[] args) {

        controlPanel();
    }

    public static Cat createCat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input: animal type, name, weight, living region, breed");
        String type = in.next();
        String name = in.next();
        double weight = in.nextDouble();
        String region = in.next();
        String breed = in.next();
        return new Cat(type, name, weight, region, breed);
    }

    public static Tiger createTiger() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input: animal type, name, weight, living region");
        String type = in.next();
        String name = in.next();
        double weight = in.nextDouble();
        String region = in.next();
        return new Tiger(type, name, weight, region);
    }

    public static Mouse createMouse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input: animal type, name, weight, living region");
        String type = in.next();
        String name = in.next();
        double weight = in.nextDouble();
        String region = in.next();
        return new Mouse(type, name, weight, region);
    }

    public static Zebra createZebra() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input: animal type, name, weight, living region");
        String type = in.next();
        String name = in.next();
        double weight = in.nextDouble();
        String region = in.next();
        return new Zebra(type, name, weight, region);
    }

    public static Food createFood() {
        Scanner in = new Scanner(System.in);
        System.out.println("Feed animal with \"Meat\" or \"Vegetable\", quantity");
        String type = in.next();
        Integer quantity = in.nextInt();
        if (type.equals("Meat")) {
            return new Meat(quantity);
        } else {
            return new Vegetable(quantity);
        }
    }

    public static void controlPanel() {
        Scanner in = new Scanner(System.in);
        boolean isTruth = true;
        while (isTruth) {
            System.out.println("Welcome!");
            System.out.println("1 input cat information to record");
            System.out.println("2 input tiger information to record");
            System.out.println("3 input mouse information to record");
            System.out.println("4 input zebra information to record");
            System.out.println("5 display list of animals on record");
            System.out.println("Input \"End\" to exit");
            String choice = in.next();
            switch (choice) {
                case "1":
                    Cat cat = createCat();
                    cat.makeSound();
                    cat.eat(createFood());
                    System.out.println(cat);
                    System.out.println();
                    animalList.add(cat);
                    break;
                case "2":
                    Tiger tiger = createTiger();
                    tiger.makeSound();
                    tiger.eat(createFood());
                    System.out.println(tiger);
                    System.out.println();
                    animalList.add(tiger);
                    break;
                case "3":
                    Mouse mouse = createMouse();
                    mouse.makeSound();
                    mouse.eat(createFood());
                    System.out.println(mouse);
                    System.out.println();
                    animalList.add(mouse);
                    break;
                case "4":
                    Zebra zebra = createZebra();
                    zebra.makeSound();
                    zebra.eat(createFood());
                    System.out.println(zebra);
                    System.out.println();
                    animalList.add(zebra);
                    break;
                case "5":
                    for (Animal animal : animalList) {
                        System.out.println(animal);
                    }
                    break;
                case "End":
                    isTruth = false;
                    break;
            }
        }
    }
}
