package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringList implements InterfaceExer1 {
    List<String> str = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        String string = String.valueOf(el);
        str.add(i, string);
    }

    @Override
    public String get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index can't be smaller than 0!");
        }
        return str.get(i);
    }


}
