package org.Marta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter pesel number: ");

        try(Scanner scanner = new Scanner(System.in)) {
            String pesel = scanner.next();
            PeselValidator.validatePesel(pesel);
        } catch (WrongTypeOfDataException typeOfDataException) {
            System.out.println(typeOfDataException.getMessage());
        } catch (IllegalLengthException lengthException) {
            System.out.println(lengthException.getMessage());
        }
    }
}
