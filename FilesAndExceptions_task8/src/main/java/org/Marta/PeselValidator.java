package org.Marta;

public class PeselValidator {
    public static void validatePesel(String peselNumber) {
        if (!(peselNumber.matches("[0-9]+"))) {
            throw new WrongTypeOfDataException("Only digits, please");
        }
        if (peselNumber.length() != 11) {
            throw new IllegalLengthException("Pesel should contain 11 digits");
        }
    }
}
