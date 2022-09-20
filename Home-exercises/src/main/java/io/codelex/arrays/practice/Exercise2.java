package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a min number: ");
        int minNumber = input.nextInt();

        System.out.print("Please enter a max number: ");
        int maxNumber = input.nextInt();

        //Checks if maxNumber is smaller than minNumber
        while (maxNumber < minNumber) {
            System.err.print("Invalid number! Please enter number larger than number " + minNumber + " : ");
            maxNumber = input.nextInt();
        }

        int count = 0;
        for (int i = minNumber; i <= maxNumber; i++) {
            count++;
        }
        int[] myArray = new int[count];
        int sum = 0;
        for (int j = 0; j < count; j++) {
            myArray[j] = minNumber + j;
            sum = sum + myArray[j];
        }
        System.out.println("Original numeric array : " + Arrays.toString(myArray));

        System.out.println("The sum is " + sum);
    }
}
