package org.Marta;

public class SquareRoot {
    public static double calculateSqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }
}
