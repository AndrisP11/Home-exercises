package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) throws Exception {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.err.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static BigDecimal negativeNumber(BigDecimal h) {
        while (h.compareTo(BigDecimal.ZERO) < 0) {
            System.err.print("Can't be negative! Try again: ");
            Scanner keyboard = new Scanner(System.in);
            h = keyboard.nextBigDecimal();
        }
        return h;
    }

    public static void calculateCircleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
        //todo
        BigDecimal radius = keyboard.nextBigDecimal();
        radius = negativeNumber(radius);

        // Display output
        System.out.println("The circle's area is "
                + Geometry.areaOfCircle(radius));
    }

    public static void calculateRectangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");
        //todo
        BigDecimal length = keyboard.nextBigDecimal();
        ;
        length = negativeNumber(length);
        // Get width
        System.out.print("Enter width? ");
        //todo
        BigDecimal width = keyboard.nextBigDecimal();
        ;
        width = negativeNumber(width);
        // Display output
        System.out.println("The rectangle's area is "
                + Geometry.areaOfRectangle(length, width));
    }

    public static void calculateTriangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");
        //todo
        BigDecimal base = keyboard.nextBigDecimal();
        ;
        base = negativeNumber(base);
        // Get the height
        System.out.print("Enter triangle's height? ");
        //todo
        BigDecimal height = keyboard.nextBigDecimal();
        ;
        height = negativeNumber(height);
        // Display the triangle's area.
        System.out.println("The triangle's area is "
                + Geometry.areaOfTriangle(base, height));
    }
}
