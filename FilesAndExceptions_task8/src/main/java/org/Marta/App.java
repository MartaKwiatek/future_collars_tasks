package org.Marta;

public class App {
    public static void main(String[] args) {
        long peselLong = 89100300000L;
        String peselStringIncorrect = "90032";
        String peselStringCorrect = "89100300000";

        try {
            PeselValidator.validatePesel(peselLong);
        } catch (WrongTypeOfDataException typeOfDataException) {
            System.out.println(typeOfDataException.getMessage());
        }
        catch (IllegalLengthException lengthException) {
            System.out.println(lengthException.getMessage());
        }

        try {
            PeselValidator.validatePesel(peselStringIncorrect);
        } catch (WrongTypeOfDataException typeOfDataException) {
            System.out.println(typeOfDataException.getMessage());
        }
        catch (IllegalLengthException lengthException) {
            System.out.println(lengthException.getMessage());
        }
    }
}
