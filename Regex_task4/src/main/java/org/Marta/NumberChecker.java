package org.Marta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberChecker {
    private static boolean checkNumber(String regularExpression, String number) {
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public static boolean isInt(String number) {
        return checkNumber("^-?\\d+$", number);
    }

    public static boolean isDouble(String number) {
        return checkNumber("^-?\\d+\\.\\d+$", number);
    }

    public static boolean isInScientificNotation(String number) {
        return checkNumber("^-?\\d+\\.?\\d*(e|E)(-|\\+)\\d+$", number);
    }
}
