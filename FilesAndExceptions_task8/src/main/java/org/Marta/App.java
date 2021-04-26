package org.Marta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String pesel = "";
        System.out.println("Enter the pesel number: ");

        try (Scanner scanner = new Scanner(System.in)) {
            pesel = scanner.nextLine();
            if (pesel.length() != 11) {
                throw new IllegalArgumentException();
            }
            System.out.println("Entered: " + pesel);
        } catch (InputMismatchException exception1) {
            System.out.println("Wrong type of data!");
        } catch (IllegalArgumentException exception2) {
            System.out.println("Pesel number contains 11 digits");
        }

    }
}
