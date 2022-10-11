package io.codelex.streams.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
    @Override
    public Supplier<StringBuilder> supplier() {
        Supplier<StringBuilder> text = new Supplier<StringBuilder>() {
            @Override
            public StringBuilder get() {
                return new StringBuilder("");
            }
        };
        return text;
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() {
        return new BiConsumer<StringBuilder, Character>() {
            @Override
            public void accept(StringBuilder stringBuilder, Character character) {
                stringBuilder.append(character);
            }
        };
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return new BinaryOperator<StringBuilder>() {
            @Override
            public StringBuilder apply(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
                return null;
            }
        };
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return new Function<StringBuilder, String>() {
            @Override
            public String apply(StringBuilder stringBuilder) {
                return String.valueOf(stringBuilder);
            }
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return new Set<Characteristics>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Characteristics> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Characteristics characteristics) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Characteristics> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
}
