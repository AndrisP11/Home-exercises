package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner key = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        while (isTrue) {
            System.out.print("Enter name: ");
            String name = key.nextLine();
            if (name.equals("")) {
                isTrue = false;
            } else {
                names.add(name);
            }
        }
        String result = "";
        for (String name : names) {
            result += name + " ";
        }
        result = result.trim();
        System.out.println("Unique name list contains: " + result);
    }
}
