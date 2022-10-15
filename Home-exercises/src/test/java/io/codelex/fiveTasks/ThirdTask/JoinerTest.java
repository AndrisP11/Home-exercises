package io.codelex.fiveTasks.ThirdTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class JoinerTest {
    @Test
    void integerListTest() {
        Joiner joiner = new Joiner("-");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        String result = joiner.join(numbers);
        Assertions.assertEquals("5-3-5-3", result);
    }

    @Test
    void stringListTest() {
        Joiner joiner = new Joiner("-");
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Hello");
        strings.add("World");
        String result = joiner.join(strings);
        Assertions.assertEquals("Hello-World-Hello-World", result);
    }

    @Test
    void BigIntegerListTest() {
        Joiner joiner = new Joiner("-");
        List<BigInteger> bigIntegers = new ArrayList<>();
        bigIntegers.add(new BigInteger("47678"));
        bigIntegers.add(new BigInteger("75437"));
        bigIntegers.add(new BigInteger("678960"));
        bigIntegers.add(new BigInteger("578585"));
        String result = joiner.join(bigIntegers);
        Assertions.assertEquals("47678-75437-678960-578585", result);
    }
}
