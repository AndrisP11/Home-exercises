package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your weight in kg: ");
        double weightKilo = in.nextDouble();
        System.out.print("Please input your height in meters: ");
        double heightMeters = in.nextDouble();
        double weight = weightKilo * 2.205;
        double height = heightMeters * 39.37;
        double bmi = (weight * 703) / (Math.pow(height, 2));
        if (bmi > 18.5 && bmi < 25) {
            System.out.println("BMI: " + String.format("%.2f", bmi) + ".Person has optimal BMI");
        } else if (bmi < 18.5) {
            System.out.println("BMI: " + String.format("%.2f", bmi) + ".Person is considered underweight");
        } else if (bmi > 25) {
            System.out.println("BMI: " + String.format("%.2f", bmi) + ".Person is considered overweight");
        }
    }
}
