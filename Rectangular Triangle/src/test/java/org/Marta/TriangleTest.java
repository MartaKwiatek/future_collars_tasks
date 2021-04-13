package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldReturnItIsNotRectangular() {
        int sideA = 12;
        int sideB = 8;
        int sideC = 10;
        boolean isRectangular = Triangle.isRectangular(sideA, sideB, sideC);

        Assertions.assertFalse(isRectangular);
    }

    @Test
    void shouldReturnItIsRectangular() {
        int sideA = 5;
        int sideB = 4;
        int sideC = 3;
        boolean isRectangular = Triangle.isRectangular(sideA, sideB, sideC);

        Assertions.assertTrue(isRectangular);
    }
}