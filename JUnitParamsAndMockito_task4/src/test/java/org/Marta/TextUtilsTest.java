package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import java.util.stream.Stream;

class TextUtilsTest {

    @ParameterizedTest
    @MethodSource("provideSampleTexts")
    void shouldVerifyTextLength(String input, int expected) {
        //given, when
        int actual = TextUtils.getTextLength(input);
        //then
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideSampleTexts() {
        return Stream.of(
                Arguments.of("Marta", 5),
                Arguments.of("", 0),
                Arguments.of("MartaMartaMartaMartaMarta", 25)
        );
    }

        @ParameterizedTest
        @NullSource
        void shouldReturnZeroLengthForNull (String input){
            //given, when
            int actual = TextUtils.getTextLength(input);
            int expected = 0;
            //then
            Assertions.assertEquals(expected, actual);
        }
}