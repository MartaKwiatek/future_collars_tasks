package org.Marta;

public class PeselValidator {
    public static void validatePesel(Object peselNumber) throws IllegalLengthException, WrongTypeOfDataException {
        if(peselNumber instanceof String)
        {
            if (((String)peselNumber).length() > 11) {
                throw new IllegalLengthException("To many digits! Pesel contains only 11.");
            }
            else if(((String)peselNumber).length() < 11) {
                throw new IllegalLengthException("Error. Pesel should contain 11 digits.");
            }
        }
        else {
            throw new WrongTypeOfDataException("Wrong type");
        }
    }
}
