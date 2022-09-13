package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        //todo - check if Long
        if (n > 2147483647 || n < (Math.pow(2, 64) - 1) || n < -2147483648 || n > Math.pow(-2, 63)) {
            //todo - check if n is less than zero
            if (n < 0) {
                n *= -1;
            }
            //fixme
            if (n >= Math.pow(10, 10)) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                int count = String.valueOf(n).length();

                for (int i = digits; i <= 10; i++) {
                    if (count == i) {
                        digits = i;
                    }
                }
                System.out.println("Number of digits in the number is: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }

    }

}
