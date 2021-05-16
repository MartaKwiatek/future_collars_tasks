package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {"342", "756", "3457", "87", "3", "5"})
    void shouldVerifyIfNumberIsInt(String number) {
        //given, when
        boolean isInt = NumberChecker.isInt(number);
        boolean isDouble = NumberChecker.isDouble(number);
        boolean isInScientificNotation = NumberChecker.isInScientificNotation(number);
        //then
        Assertions.assertTrue(isInt);
        Assertions.assertFalse(isDouble);
        Assertions.assertFalse(isInScientificNotation);
    }

    @ParameterizedTest
    @ValueSource(strings = {"5.34", "1.234e+07", "7.234243E-02", "6.09", "1.0001"})
    void shouldVerifyIfNumberIsNOTInt(String number) {
        //given, when
        boolean isInt = NumberChecker.isInt(number);
        //then
        Assertions.assertFalse(isInt);
    }

    @ParameterizedTest
    @ValueSource(strings = {"5.34", "6.09", "1.0001"})
    void shouldVerifyIfNumberIsDouble(String number) {
        //given, when
        boolean isDouble = NumberChecker.isDouble(number);
        boolean isInt = NumberChecker.isInt(number);
        boolean isInScientificNotation = NumberChecker.isInScientificNotation(number);
        //then
        Assertions.assertTrue(isDouble);
        Assertions.assertFalse(isInt);
        Assertions.assertFalse(isInScientificNotation);
    }

    @ParameterizedTest
    @DisplayName("should verify if number is not a regular double")
    @ValueSource(strings = {"342", "756", "1.234e+07", "7.234243E-02", "3457", "87", "3", "5"})
    void shouldVerifyIfNumberIsNOTDouble(String number) {
        //given, when
        boolean isDouble = NumberChecker.isDouble(number);
        //then
        Assertions.assertFalse(isDouble);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1.234e+07", "7.234243E-02"})
    void shouldVerifyIfNumberIsInScientificNotation(String number) {
        //given, when
        boolean isInScientificNotation = NumberChecker.isInScientificNotation(number);
        boolean isDouble = NumberChecker.isDouble(number);
        boolean isInt = NumberChecker.isInt(number);
        //then
        Assertions.assertTrue(isInScientificNotation);
        Assertions.assertFalse(isInt);
        Assertions.assertFalse(isDouble);
    }

    @ParameterizedTest
    @ValueSource(strings = {"342", "5.34", "756", "6.09", "3457", "87", "1.0001", "3", "5"})
    void shouldVerifyIfNumberIsNOTInScientificNotation(String number) {
        //given, when
        boolean isInScientificNotation = NumberChecker.isInScientificNotation(number);
        //then
        Assertions.assertFalse(isInScientificNotation);
    }
}