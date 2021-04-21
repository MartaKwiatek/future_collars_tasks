package org.Marta;

public class Addition implements Calculator {

    @Override
    public double calculate(double ...values) {
        double sum = 0;
        for(double value: values) {
            sum += value;
        }

        return sum;
    }
}
