package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        int value1 = 3;
        int value2 = 7;

        int result = Calculator.add(value1, value2);

        Assertions.assertEquals(10, result);
    }

    @Test
    void subtractTest() {
        int value1 = 3;
        int value2 = 7;

        int result = Calculator.subtract(value1, value2);

        Assertions.assertEquals(-4, result);
    }

    @Test
    void multiplyTest() {
        int value1 = 3;
        int value2 = 7;

        int result = Calculator.multiply(value1, value2);

        Assertions.assertEquals(21, result);
    }

    @Test
    void divideTest() {
        double value1 = 8;
        double value2 = 4;

        double result = Calculator.divide(value1, value2);

        Assertions.assertEquals(2, result);
    }
}