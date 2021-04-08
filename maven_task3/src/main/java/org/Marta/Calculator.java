package org.Marta;

public class Calculator {
    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static double divide(double value1, double value2) {
        return value2 != 0 ? value1 / value2 : 0;
    }
}
