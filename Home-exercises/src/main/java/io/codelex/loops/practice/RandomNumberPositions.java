package io.codelex.loops.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.apache.commons.lang3.RandomUtils.nextInt;


public class RandomNumberPositions {

    private static final int NR_OF_INTEGERS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] integers = randomIntegers();
        System.out.println("There are few integers given: " + Arrays.toString(integers));
        System.out.println("Which numbers index would you like to find?");

        int searchFor = scanner.nextInt();

        int i;
        boolean foundIt = false;

        for (i = 0; i < integers.length; i++) {
            //todo - search for integer - break when you have found what you searched for
            if (searchFor == integers[i]) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " is not in the array");
        }
    }

    private static Integer[] randomIntegers() {
        List<Integer> list = new ArrayList<>(RandomNumberPositions.NR_OF_INTEGERS);

        for (int i = 0; i < RandomNumberPositions.NR_OF_INTEGERS; i++) {
            list.add(nextInt(0, 99));
        }
        return list.toArray(new Integer[0]);
    }
}
