package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorTest {

    @Test
    void calculate2args() {
        Assertions.assertEquals(15, BillCalculator.calculate(10.0, 5.0));
    }

    @Test
    void calculate3args() {
        Assertions.assertEquals(25, BillCalculator.calculate(20.0, 10.0, 5));
    }

    @Test
    void calculate3otherArgs() {
        Assertions.assertEquals(24, BillCalculator.calculate(15.0, 7.5, 1.5));
    }
}