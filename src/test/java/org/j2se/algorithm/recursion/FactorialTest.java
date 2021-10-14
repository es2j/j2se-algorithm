package org.j2se.algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testCompute() {
        Assertions.assertEquals(1, Factorial.compute(0));
        Assertions.assertEquals(1, Factorial.compute(1));
        Assertions.assertEquals(120, Factorial.compute(5));
    }

}
