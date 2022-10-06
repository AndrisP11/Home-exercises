package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(array));
        for (String car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();
        //todo - replace array with a HashSet and print out the results
        Set<String> cars2 = new HashSet<>();
        cars2.addAll(Arrays.asList(array));
        for (String car : cars2) {
            System.out.print(car + " ");
        }
        System.out.println();
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> cars3 = new HashMap<>();
        cars3.put("Audi", "Germany");
        cars3.put("BMW", "Germany");
        cars3.put("Honda", "Japan");
        cars3.put("Mercedes", "Germany");
        cars3.put("VolksWagen", "Germany");
        cars3.put("Mercedes", "Germany");
        cars3.put("Tesla", "USA");

        for (String car : cars3.keySet()) {
            System.out.println(car + " from " + cars3.get(car));
        }
    }
}
