package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenAndOddNumbersTest {

    @Test
    void shouldSay1isOdd() {
        int value = 1;

        Assertions.assertEquals("Odd",EvenAndOddNumbers.evenOrOdd(value));
    }

    @Test
    void shouldSay4isEven() {
        int value = 4;

        Assertions.assertEquals("Even",EvenAndOddNumbers.evenOrOdd(value));
    }
}