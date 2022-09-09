package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int a = (int) Math.round(Math.random() * 100 + 1);
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();

        if (a == b) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (a < b) {
            System.out.println("Sorry, you are too high.  I was thinking of " + a + ".");
        } else {
            System.out.println("Sorry, you are too low.  I was thinking of " + a + ".");
        }

    }
}
