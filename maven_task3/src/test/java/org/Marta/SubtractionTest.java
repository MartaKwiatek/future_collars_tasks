package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtractionTest {

    @Test
    void shouldSubtractValues() {
        //given
        Subtraction toSubtract = new Subtraction();
        double value1 = 3;
        double value2 = 7;
        double value3 = -8;

        //when
        double result = toSubtract.calculate(value1, value2, value3);

        //then
        Assertions.assertEquals(4, result);
    }

}