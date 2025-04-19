package org.yakunin;

public class Calculator implements CalculatorInterface {

    @Override
    public float sum(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float sub(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public float mult(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float div(float num1, float num2) {
        return num1 / num2;
    }

    public String doSomething(){
        return "Something";
    }
}
