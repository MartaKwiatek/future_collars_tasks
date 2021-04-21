package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void shouldAddValues() {
        //given
        Calculator toAdd = new Addition();
        double value1 = 3;
        double value2 = 7;
        double value3 = 10;

        //when
        double result = toAdd.calculate(value1, value2, value3);

        //then
        Assertions.assertEquals(20, result);
    }
}