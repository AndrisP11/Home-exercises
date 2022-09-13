package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public int throwDie() {
        Random rand = new Random();
        return (rand.nextInt(6)) + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int d = in.nextInt();
        if (d < 2 || d > 12) {
            System.out.println("Please input sum from 2 to 12");
        } else {
            int n = 0;
            int m = 0;
            while (n + m != d) {
                RollTwoDice roll = new RollTwoDice();
                n = roll.throwDie();
                m = roll.throwDie();
                int sum = n + m;
                System.out.println(n + " and " + m + " = " + sum);
            }
        }
    }
}
