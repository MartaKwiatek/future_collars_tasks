package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -16, 0})
    void shouldVerifyNumberIsEven(int input) {
        Assertions.assertTrue(MathUtils.isEven(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"432 : 9", "10 : 1", "666: 18"}, delimiter = ':')
    void shouldVerifySumOfDigits(String input, String expected) {
        int actualValue = MathUtils.calcSumOfDigits(Integer.parseInt(input));
        int expectedValue = Integer.parseInt(expected);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}