package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers sum do you want to find?");
        int l = in.nextInt();
        int a;
        int sum = 0;
        for(int i = 1;i<=l;i++){
            System.out.println("Please input your "+i+" number");
            a = in.nextInt();
            sum = sum+a;
        }
        in.close();
        System.out.println("Your numbers sum is: "+sum);
    }
}
