package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Min? ");
        int min = in.nextInt();
        System.out.print("Max? ");
        int max = in.nextInt();
        int count = 0;
        for (int j = min; j <= max; j++) {
            for (int i = min; i <= max; i++) {
                if ((i + count) > max) {
                    System.out.print(min + ((i + count) - max) - 1);
                } else {
                    System.out.print(i + count);
                }
            }
            count++;
            System.out.println("");
        }
    }
}
