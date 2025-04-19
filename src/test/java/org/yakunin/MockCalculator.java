package org.yakunin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class MockCalculator {
    String something = "tralalelo tralala";
    //@Mock
   // Calculator calculator = org.mockito.Mockito.mock(Calculator.class);
    @Mock
    CalculatorInterface calculatorInterface;
    @Mock
    Calculator calculator;
    @InjectMocks
    CalculatorThatDoSomethingInteresting calculatorThatDoSomethingInteresting;
    @InjectMocks
    Calculator calculatorThatDoSomethingInteresting2;
    @Test
    public void mockInterfaceTest(){
        Mockito.when(calculatorInterface.sum(5f,5f)).thenReturn(11f);
        assertEquals(11f, calculatorThatDoSomethingInteresting.sum(5f,5f));
    }
    @Test
    public void mockInterfaceTest2(){
        Mockito.when(calculatorInterface.sum(5f,5f)).thenReturn(11f);
        assertEquals(11f, calculatorThatDoSomethingInteresting2.sum(5f,5f));
    }

    @Test
    public void mockTestTest() {
        //Mockito.doReturn(10).when(calculator).sum(5f,5f);
        //assertEquals(10, calculator.sum(5,5));
        Mockito.when(calculator.sum(5f, 5f)).thenReturn(10f);
        assertEquals(10, calculator.sum(5,5));

        Mockito.doReturn(something).when(calculator).doSomething();
        assertEquals(something, calculator.doSomething());

        Mockito.when(calculator.doSomething()).thenReturn(something);
        assertEquals(something,calculator.doSomething());

       // Mockito.when(calculator.doSomething()).thenThrow(Exception.class);
       // calculator.doSomething();
        assertThrows(Exception.class, () -> Mockito.when(calculator.doSomething()).thenThrow(Exception.class));
    }
    @Test
    public void mockTest() {
        Mockito.when(calculator.sum(2f, 3f)).thenReturn(5f);
        float summaryResult = calculator.sum(2f, 3f);
        assertEquals(5, summaryResult);
        Mockito.verify(calculator).sum(2f, 3f);

        Mockito.when(calculator.sub(2f, 3f)).thenReturn(-1f);
        float subtractionResult = calculator.sub(2f, 3f);
        assertEquals(-1, subtractionResult);
        Mockito.verify(calculator).sub(2f, 3f);

        Mockito.when(calculator.mult(2f, 3f)).thenReturn(6f);
        float multiplyResult = calculator.mult(2f, 3f);
        assertEquals(6, multiplyResult);
        Mockito.verify(calculator).mult(2f, 3f);


        Mockito.when(calculator.div(3f, 3f)).thenReturn(1f);
        float divineResult = calculator.div(3f, 3f);
        assertEquals(1, divineResult);
        Mockito.verify(calculator).div(3f, 3f);
    }
}
