package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    private List<Object> obj = new ArrayList<>();

    public void add(int i, Object el) {
        obj.add(i, el);
    }

    public Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index can't be smaller than 0!");
        }
        return obj.get(i);
    }
}
//Implement the list and discuss the advantages and the
// limitations of the three different approaches below.
//
//Using Object or generic is almost the same. Notable difference
// is that generic helps you keep track what type is used where.
//Second case with interface is useful only at specific tasks in
// all other cases, I believe it's better to use generic.