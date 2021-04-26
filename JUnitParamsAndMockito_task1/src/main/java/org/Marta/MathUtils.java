package org.Marta;

public class MathUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int calcSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
