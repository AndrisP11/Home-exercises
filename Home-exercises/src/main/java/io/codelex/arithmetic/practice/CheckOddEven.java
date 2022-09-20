package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}
