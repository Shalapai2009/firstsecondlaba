package org.yakunin;

public class CalculatorThatDoSomethingInteresting implements CalculatorInterface{
  CalculatorInterface calculatorInterface;
    @Override
    public float sum(float num1, float num2) {
        return calculatorInterface.sum(num1,num2);
    }

    @Override
    public float sub(float num1, float num2) {
        return calculatorInterface.sub(num1,num2);
    }

    @Override
    public float mult(float num1, float num2) {
        return calculatorInterface.mult(num1,num2);
    }

    @Override
    public float div(float num1, float num2) {
        return calculatorInterface.div(num1,num2);
    }
}
