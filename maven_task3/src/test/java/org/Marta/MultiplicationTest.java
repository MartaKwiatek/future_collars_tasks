package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    void shouldMultiplyValues() {
        //given
        Calculator toMultiply = new Multiplication();
        double value1 = 3;
        double value2 = 7;
        double value3 = -2;

        //when
        double result = toMultiply.calculate(value1, value2, value3);

        //then
        Assertions.assertEquals(-42, result);

    }

}