package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -16, 0})
    void shouldVerifyNumberIsEven(int input) {
        //given, when
        boolean isEven = MathUtils.isEven(input);
        //then
        Assertions.assertTrue(isEven);
    }

    @ParameterizedTest
    @CsvSource(value = {"432 : 9", "10 : 1", "666 : 18", "-534 : 12"}, delimiter = ':')
    void shouldVerifySumOfDigits(String input, String expected) {
        //given
        int actualValue = Integer.parseInt(input);
        int expectedValue = Integer.parseInt(expected);

        //when
        actualValue = MathUtils.calcSumOfDigits(actualValue);

        //then
        Assertions.assertEquals(expectedValue, actualValue);
    }
}