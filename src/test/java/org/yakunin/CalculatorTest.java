package org.yakunin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void sum() {
        Assertions.assertEquals(15, calculator.sum(5,10));
    }
    @Test
    void sub() {
        Assertions.assertEquals(5,calculator.sub(10,5));
    }
    @Test
    void mult() {

        Assertions.assertEquals(50, calculator.mult(5,10));
    }
    @Test
    void div() {
        Assertions.assertEquals(5,calculator.div(50,10));
    }
}
