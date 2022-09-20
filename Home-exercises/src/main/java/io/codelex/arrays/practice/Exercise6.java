package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            Random r = new Random();
            array1[i] = r.nextInt(101 - 1) + 1;
        }

        int[] array2 = new int[10];
        System.arraycopy(array1, 0, array2, 0, array1.length);

        array1[array1.length - 1] = -7;

        System.out.print("Array 1:");
        for (int number : array1) {
            System.out.print(" " + number);
        }
        System.out.println();

        System.out.print("Array 2:");
        for (int number : array2) {
            System.out.print(" " + number);
        }
    }
}
