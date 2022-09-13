package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word:");
        String fWord = in.nextLine();
        System.out.println("Enter second word:");
        String sWord = in.nextLine();
        int dotCount = 30 - fWord.length() - sWord.length();
        System.out.print(fWord);
        for (int i = 0; i < dotCount; i++) {
            System.out.print(".");
        }
        System.out.print(sWord);
    }
}
