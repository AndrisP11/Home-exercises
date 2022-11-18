package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("Enter the numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                try {
                    int result = numerator / divisor;
                    System.out.println(numerator + " / " + divisor + " is " + result);
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("You can't divide 12 by 0.");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                String quit = scanner.nextLine();
                if (quit.equals("quit") || quit.equals("q") || quit.equals("Q")) {
                    break;
                }
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();
            }
        }
    }
}
