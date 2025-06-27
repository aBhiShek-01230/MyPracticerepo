package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.Mockito;

public class CalculatorTest {
    @Test
    public void testComputeSum() {
        ExternalService mockService = Mockito.mock(ExternalService.class);
        Mockito.when(mockService.add(5, 7)).thenReturn(12);

        Calculator calculator = new Calculator(mockService);
        int result = calculator.computeSum(5, 7);

        assertEquals(12, result);
    }
}
