package org.Marta;

public class Subtraction implements Calculator {

    @Override
    public double calculate(double... values) {

        if (values.length > 0) {
            double sub = values[0];
            for (int i = 1; i < values.length; i++) {
                sub -= values[i];
            }
            return sub;
        }
        return 0;
    }
}
