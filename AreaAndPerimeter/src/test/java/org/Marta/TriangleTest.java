package org.Marta;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void setTriangle() {
        // given
        triangle = new Triangle(4, 5, 6);
    }

    @Test
    void getAreaTest() {
        // when
        double result = Precision.round(triangle.getArea(), 2);
        // then
        Assertions.assertEquals(9.92, result);
    }

    @Test
    void getPerimeterTest() {
        // when
        double result = Precision.round(triangle.getPerimeter(), 2);
        // then
        Assertions.assertEquals(15.00, result);
    }

}