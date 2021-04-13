package org.Marta;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    public void setSquare() {
        square = new Square(2);
    }
    @Test
    void getAreaTest() {
        double result = square.getArea();
        Assertions.assertEquals(4.00, Precision.round(result, 2));
    }

    @Test
    void getPerimeterTest() {
        double result = square.getPerimeter();
        Assertions.assertEquals(8.00, Precision.round(result, 2));
    }
}