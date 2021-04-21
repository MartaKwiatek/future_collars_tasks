package org.Marta;

public class Multiplication implements Calculator{

    @Override
    public double calculate(double ...values) {
        double mult = 1;
        for(double value: values) {
            mult *= value;
        }

        return mult;
    }
}
