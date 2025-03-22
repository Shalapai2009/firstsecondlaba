package org.yakunin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockCalculator {
    @Mock
    CalculatorInterface calculatorInterface;
    SUTCalculator sutCalculator;

    @Test
    public void mockTest() {
        when(CalculatorInterface.sum(2,2)).thenReturn(4f);
       try(MockedStatic<CalculatorInterface> util = Mockito.mockStatic(CalculatorInterface.class)) {
           util.when(() -> CalculatorInterface.sum(2,2)).thenReturn(4f);
           assertEquals(4f, sutCalculator.callASum(2,2),0.000001f);
       }

       try(MockedStatic<SUTCalculator> util = Mockito.mockStatic(SUTCalculator.class))  {
           util.when(() -> SUTCalculator.callASum(2,2)).thenReturn(4f);
           assertEquals(4f,CalculatorInterface.sum(2,2), 0.000001f);
       }

    }
}
