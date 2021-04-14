package org.Marta;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    public void setRectangle() {
        rectangle = new Rectangle(3, 5);
    }

    @Test
    void getAreaTest() {
        double result = rectangle.getArea();
        Assertions.assertEquals(15.00, Precision.round(result, 2));
    }

    @Test
    void getPerimeterTest() {
        double result = rectangle.getPerimeter();
        Assertions.assertEquals(16.00, Precision.round(result, 2));
    }
}