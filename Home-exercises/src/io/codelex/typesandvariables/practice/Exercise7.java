package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your String :");
        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i);
            if (a >= 65 && a <= 90) {
                count++;
            }
        }
        in.close();
        System.out.println("In your String there are " + count + " uppercase letters.");
    }
}
