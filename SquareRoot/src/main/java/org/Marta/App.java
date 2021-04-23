package org.Marta;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        double number;
        double squareRoot;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = scanner.nextDouble();

        try {
            squareRoot = SquareRoot.calculateSqrt(number);
        } catch (IllegalArgumentException exception) {
            squareRoot = SquareRoot.calculateSqrt(number * -1);
        }

        System.out.println(squareRoot);
    }
}
