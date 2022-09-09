package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your number of minutes :");
        long a = in.nextInt();
        long days = a / 1440;
        long years = days / 365;
        if (years > 0) {
            days = days - 365 * years;
        }
        in.close();
        System.out.println("Your minutes were converted to " + years + " years and " + days + " days.");
    }
}
