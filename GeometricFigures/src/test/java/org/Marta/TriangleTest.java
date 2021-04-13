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
        triangle = new Triangle(4, 5, 6);
    }

    @Test
    void getAreaTest() {
        double result = triangle.getArea();
        Assertions.assertEquals(9.92, Precision.round(result,2));
    }

    @Test
    void getPerimeterTest() {
        double result = triangle.getPerimeter();
        Assertions.assertEquals(15.00, Precision.round(result,2));
    }
}