package org.Marta;

public class Division implements Calculator {
    @Override
    public double calculate(double... values) {
        if (values.length > 0) {
            double div = values[0];
            for (int i = 1; i < values.length; i++) {
                div /= values[i];
            }
            return div;
        }
        return 0;
    }
}
