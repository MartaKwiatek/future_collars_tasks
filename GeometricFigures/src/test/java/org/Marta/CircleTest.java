package org.Marta;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;

    @BeforeEach
    public void setCircle() {
        circle = new Circle(3);
    }

    @Test
    void getAreaTest() {
        double result = circle.getArea();

        Assertions.assertEquals(28.27, Precision.round(result,2));
    }

    @Test
    void getPerimeterTest() {
        double result = circle.getPerimeter();

        Assertions.assertEquals(18.85, Precision.round(result,2));
    }
}