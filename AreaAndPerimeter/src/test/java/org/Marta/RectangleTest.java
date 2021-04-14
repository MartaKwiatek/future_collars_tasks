package org.Marta;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    public void setRectangle() {
        // given
        rectangle = new Rectangle(3, 5);
    }

    @Test
    void getAreaTest() {
        // when
        double result = Precision.round(rectangle.getArea(), 2);
        // then
        Assertions.assertEquals(15.00, result);
    }

    @Test
    void getPerimeterTest() {
        // when
        double result = Precision.round(rectangle.getPerimeter(), 2);
        // then
        Assertions.assertEquals(16.00, result);
    }
}