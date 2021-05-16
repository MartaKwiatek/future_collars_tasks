package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PasswordValidatorTest {

    @ParameterizedTest
    @MethodSource("validPasswordProvider")
    void shouldVerifyPasswordIsValid(String password) {
        //given, when
        boolean isValid = PasswordValidator.isValid(password);
        //then
        Assertions.assertTrue(isValid);
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordProvider")
    void shouldVerifyPasswordIsNOTValid(String password) {
        //given, when
        boolean isValid = PasswordValidator.isValid(password);
        //then
        Assertions.assertFalse(isValid);
    }

    static Stream<String> validPasswordProvider() {
        return Stream.of(
                "gyyufuyF666TDRDTDju",
                "123AaAa",
                "000000M",
                "1abcDef",
                "675765R674"
        );
    }

    static Stream<String> invalidPasswordProvider() {
        return Stream.of(
                "gyyufuy666ju",
                "123AAA",
                "te  st",
                "Qwerty21",
                "2021test"
        );
    }
}