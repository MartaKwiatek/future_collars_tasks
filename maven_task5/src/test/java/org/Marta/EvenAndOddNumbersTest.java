package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddNumbersTest {

    @Test
    void evenOrOddTest() {
        int value1 = -1;
        int value2 = 4;

        Assertions.assertEquals("Odd",EvenAndOddNumbers.evenOrOdd(value1));
        Assertions.assertEquals("Even",EvenAndOddNumbers.evenOrOdd(value2));
    }
}