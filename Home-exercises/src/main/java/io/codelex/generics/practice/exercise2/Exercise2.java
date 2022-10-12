package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("word");
        System.out.println(concatenate(str));
        List<Integer> inter = new ArrayList<>();
        inter.add(1);
        System.out.println(concatenate(inter));

        Object obj = new Object();
        List<Object> objects = new ArrayList<>();
        objects.add(obj);
        System.out.println(concatenate(objects));

        Cat billy = new Cat("Billy");
        List<Cat> cats = new ArrayList<>();
        cats.add(billy);
        System.out.println(concatenate(cats));
    }

    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }
    //This program is rejected by the Java compiler. Why?
    //
    //Because the generic type ? is not kept at runtime, so
    //it can't find what instance it was.

    //Is this behaviour consistent with what you would expect
    // from the initial program? If not, how can you fix it?
    //
    //It works how it should, after the fix.

    //What would happen if you tried to implement the different
    // cases using method overloading instead of just one method.
    // Why is this the case?
    //
    //Code will not work because overload methods will have same
    // erasure. Which means methods are too similar in name and parameters.
}
