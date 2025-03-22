package org.yakunin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void sum() {
        Assertions.assertEquals(15, CalculatorInterface.sum(5,10));
    }
    @Test
    void dif() {
        Assertions.assertEquals(5,CalculatorInterface.dif(10,5));
    }
    @Test
    void prod() {
        Assertions.assertEquals(50, CalculatorInterface.prod(5,10));
    }
    @Test
    void div() {
        Assertions.assertEquals(5,CalculatorInterface.div(50,10));
    }
}
