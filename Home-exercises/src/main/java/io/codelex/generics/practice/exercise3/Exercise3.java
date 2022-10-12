package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        List<Integer> intNumber = new ArrayList<>();
        intNumber.add(null);
        intNumber.add(7);

        List<Number> numbers = new ArrayList<>();
        numbers.add(6.566);
        numbers.add(678);

        addAllX(intNumber, numbers);
        System.out.println(numbers);
        //addAllY(intNumber, numbers);

        //Method addAllX is less restrictive than addAllY.
        // Provide an example to prove this claim.

        //As seen above intNumber Integer list can be added to numbers
        // Number list using addAllX but can't be done by addAllY.

    }

    public <V> void add(V value, List<? super V> list) {
        list.add(value);
    }
    //Explain why we obtain such an error.

    //Because ? wildcard can represent unknown class which could be
    // different from Object.

    public <V> void add2(V value, List<V> list) {
        list.add(value);
    }
    // Is this solution more restricted than the one obtained
    // using the wildcard?

    //Yes, it is for the methods caller. Wildcards give more flexibility
    // to methode caller.

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }
}
