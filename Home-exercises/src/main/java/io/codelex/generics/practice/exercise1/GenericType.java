package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericType<T> {
    private List<T> list = new ArrayList<>();

    public void add(int i, T el) {
        list.add(i, el);
    }

    public T get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index can't be smaller than 0!");
        }
        return list.get(i);
    }
}
