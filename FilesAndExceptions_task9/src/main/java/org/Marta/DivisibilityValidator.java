package org.Marta;

public class DivisibilityValidator {
    public static void validate(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(value + " is indivisible by 3");
                continue;
            }

            int result = value / 3;
            System.out.println(value + "/3 = " + result);
        }
    }
}
