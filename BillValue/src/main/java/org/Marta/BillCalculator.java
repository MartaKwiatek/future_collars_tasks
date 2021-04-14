package org.Marta;

public class BillCalculator {
    public static double calculate(double billValue, double serviceCharge) {
        return billValue + serviceCharge;
    }

    public static double calculate(double billValue, double serviceCharge, int discount) {
        return calculate(billValue, serviceCharge) - discount;
    }

    public static double calculate(double billValue, double serviceCharge, double takeOutPackagingFee) {
        return calculate(billValue, serviceCharge) + takeOutPackagingFee;
    }
}
