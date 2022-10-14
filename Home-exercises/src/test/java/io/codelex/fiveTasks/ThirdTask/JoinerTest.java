package io.codelex.fiveTasks.ThirdTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {
    @Test
    void integerTest(){
        Joiner<Integer> inte = new Joiner<>(3);
        String result = inte.join(4);
        Assertions.assertEquals("3-4", result);
    }
}
