package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean isTruth = true;
        System.out.print("Please input your number: ");
        int num = key.nextInt();
        int num2 = num;

        while (isTruth) {
            String numString = "" + num;
            int rez = 0;
            List<String> formula = new ArrayList<>();

            for (int i = 0; i < numString.length(); i++) {
                char stepOne = numString.charAt(i);
                String stepTwo = "" + stepOne;
                int stepThree = Integer.parseInt(stepTwo);
                String stepFour = "" + stepThree + "^2";
                formula.add(stepFour);
                rez = rez + (stepThree * stepThree);
            }

            for (int i = 0; i < formula.size(); i++) {
                if (i == formula.size() - 1) {
                    System.out.print(formula.get(i) + " = " + rez);
                    System.out.println();
                } else {
                    System.out.print(formula.get(i) + " + ");
                }
            }
            if (rez == 1) {
                System.out.println("Number " + num2 + " is happy number");
                isTruth = false;
            } else if (rez == 4) {
                System.out.println("...");
                System.out.println("Number " + num2 + " is not happy number");
                isTruth = false;
            } else {
                num = rez;
            }
        }
    }
}
