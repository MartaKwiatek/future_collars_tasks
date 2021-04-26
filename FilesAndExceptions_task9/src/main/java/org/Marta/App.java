package org.Marta;

public class App {
    public static void main( String[] args ) {
        int[] numbers1 = {3, 6, 9, 10, 12, 15};
        int[] numbers2 = {1, 7, 10, 33};

        DivisibilityValidator.validate(numbers1);
        System.out.println();
        DivisibilityValidator.validate(numbers2);
    }
}
