package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input first number: ");
        int a = in.nextInt();
        System.out.print("Please input second number: ");
        int b = in.nextInt();
        boolean f = false;
        if (a == 15 | b == 15) {
            f = true;
        } else if (a - b == 15 | b - a == 15) {
            f = true;
        } else if (a + b == 15) {
            f = true;
        }
        System.out.println(f);
    }
}
