package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntegerList implements InterfaceExer1 {

    List<Integer> inter = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        Integer number = (int) el;
        inter.add(i, number);
    }

    @Override
    public Integer get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index can't be smaller than 0!");
        }
        return inter.get(i);
    }
}
