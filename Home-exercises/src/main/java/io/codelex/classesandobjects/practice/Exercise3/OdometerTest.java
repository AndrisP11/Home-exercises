package io.codelex.classesandobjects.practice.Exercise3;

import java.util.Scanner;

public class OdometerTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter current fuel: ");
        int fuelCapacity;

        while (true) {
            fuelCapacity = key.nextInt();
            if (fuelCapacity <= 70 && fuelCapacity >= 0) {
                break;
            }
            System.out.print("Invalid input.\nEnter the fuel capacity in range from 0 to 70: ");
        }

        System.out.print("Please enter current mileage: ");
        int odometerLimits;
        while (true) {
            odometerLimits = key.nextInt();
            if (odometerLimits <= 999999 && odometerLimits >= 0) {
                break;
            }
            System.out.print("Invalid input.\nEnter the mileage capacity in range from 0 to 999999: ");
        }
        System.out.println();

        FuelGauge fuelGouge1 = new FuelGauge(fuelCapacity);
        Odometer odometer1 = new Odometer(odometerLimits);
        int mileageNow = odometer1.getMileage();

        while (fuelGouge1.getFuel() != 0) {
            if (mileageNow + 10 == odometer1.getMileage()) {
                fuelGouge1.fuelDown();
                mileageNow = odometer1.getMileage();
                fillUp(fuelGouge1);
            }
            System.out.println("Your fuel: " + fuelGouge1.getFuel());
            System.out.println("Your mileage: " + odometer1.getMileage());
            odometer1.mileageUp();

        }
    }

    private static void fillUp(FuelGauge fuelGouge1) {
        boolean tooMuchFuel = false;
        while (!tooMuchFuel) {
            Scanner key = new Scanner(System.in);
            System.out.print("Enter the capacity to fuel up or 0 to continue: ");
            int fuelUpOrNot = key.nextInt();
            System.out.println();
            final int fuelTankUpperLimit = 70;
            final int fuelTankLowerLimit = 0;
            if (fuelGouge1.getFuel() + fuelUpOrNot > fuelTankUpperLimit) {
                System.out.print("Too much fuel! Current fuel tank limit " + fuelTankUpperLimit + "\n");
            } else if (fuelUpOrNot < fuelTankLowerLimit) {
                System.out.println("Error! Fuel fill up input can only be positive number");
            } else {
                fuelGouge1.fuelUp(fuelUpOrNot);
                tooMuchFuel = true;
            }
        }
    }
}
