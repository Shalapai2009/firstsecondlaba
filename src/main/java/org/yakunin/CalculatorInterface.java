package org.yakunin;

public interface CalculatorInterface {
    static float sum(float num1, float num2) {
        return num1 + num2;
    }
    static float dif(float num1, float num2) {
        return num1 - num2;
    }
    static float prod(float num1, float num2) {
        return num1 * num2;
    }
    static float div(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        else {
            return num1 / num2;
        }
    }
}
