package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int res = 1;
        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (i = 1; i <= n; i++) {
            res = i;
            for (int j = 1; j < n; j++) {
                res = res * i;
            }
            System.out.println(res);
        }

    }

}
