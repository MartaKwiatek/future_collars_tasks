package org.Marta;

public class ConverterToUpperCase {
    public static String convertToUpperCase(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }
        return text.toUpperCase();
    }
}
