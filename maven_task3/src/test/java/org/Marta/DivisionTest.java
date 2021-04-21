package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void shouldDivideValues() {
        //given
        Division toDivide = new Division();
        double value1 = 8;
        double value2 = 4;
        double value3 = 2;

        //when
        double result = toDivide.calculate(value1, value2, value3);

        //then
        Assertions.assertEquals(1, result);
    }
}