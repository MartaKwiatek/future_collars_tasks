package org.Marta;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        double number = 0;
        double squareRoot;

        System.out.println("Type a number: ");

        try(Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextDouble();
            squareRoot = SquareRoot.calculateSqrt(number);
        } catch (IllegalArgumentException exception) {
            squareRoot = SquareRoot.calculateSqrt(number * -1);
        }

        System.out.println(squareRoot);
    }
}
