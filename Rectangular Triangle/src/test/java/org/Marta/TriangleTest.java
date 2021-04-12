package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldSayItIsNotRectangular() {
        int[] sides = new int[] {12, 8, 10};

        boolean isRectangular = Triangle.isRectangular(sides);

        Assertions.assertFalse(isRectangular);
    }

    @Test
    void shouldSayItIsRectangular() {
        int[] sides = new int[] {5, 4, 3};

        boolean isRectangular = Triangle.isRectangular(sides);

        Assertions.assertTrue(isRectangular);
    }
}