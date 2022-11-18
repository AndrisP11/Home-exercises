package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> colors = new ArrayList<>();

        //TODO: Add 10 values to list
        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Grey");
        System.out.println(colors);

        //TODO: Add new value at 5th position
        colors.add(4, "Violet");
        System.out.println(colors);

        //TODO: Change value at last position (Calculate last position programmatically)
        colors.remove(colors.size() - 1);
        colors.add("Purple");
        System.out.println(colors);

        //TODO: Sort your list in alphabetical order
        Collections.sort(colors);
        System.out.println(colors);

        //TODO: Check if your list contains "Foobar" element
        if (colors.contains("Foobar")) {
            System.out.println("Contains \"Foobar\" element");
        } else {
            System.out.println("Doesn't contain \"Foobar\" element");
        }

        //TODO: Print each element of list using loop
        for (String element : colors) {
            System.out.println(element);
        }
    }

}
