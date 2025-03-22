package org.yakunin;

public class SUTCalculator{
    private final CalculatorInterface calculatorInterface;

    public SUTCalculator(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }

    /*public static void main(String[] args )
    {

        callASum(2,2);
        //CalculatorInterface.sum(2,2);
        CalculatorInterface.dif(2,2);
        CalculatorInterface.prod(2,2);
        CalculatorInterface.div(2,2);
    }*/


    public static float callASum(float a, float b){
        return CalculatorInterface.sum(a,b);
    }
    public static String name() {
        return "Baeldung";
    }

}
