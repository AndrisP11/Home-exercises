package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {

        Car car = new Car(inputStartKilometers());
        car.fillUp(inputEndKilometers(), inputLiters());
        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        if (car.isEconomyCar()) {
            System.out.println("This is economy car");
        }
        if (car.isGasHog()) {
            System.out.println("This is gas hog");
        }
        car.fillUp(inputEndKilometers(), inputLiters());
        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        Car car2 = new Car(inputStartKilometers());
        car2.fillUp(inputEndKilometers(), inputLiters());
        System.out.println("Kilometers per liter are " + car2.calculateConsumption());
    }

    public static double inputStartKilometers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start odometer reading: ");
        return scan.nextDouble();
    }

    public static double inputEndKilometers() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mileage reading: ");
        return scan.nextDouble();
    }

    public static double inputLiters() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter liters reading: ");
        return scan.nextDouble();
    }
}
