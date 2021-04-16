package org.Marta;

import java.util.Locale;

public class TextUtils {
    public static boolean isNotEmpty(String text) {
        return text.length() != 0;
    }

    private static String removeWhiteSpaces(String text) {
        return text.replaceAll("\\s", "");
    }

    private static String removePunctuationMarks(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }

    public static boolean isPalindrome(String text) {
        if (isNotEmpty(text)) {
            String preparedText = removePunctuationMarks(removeWhiteSpaces(text)).toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(preparedText);
            stringBuilder.reverse();
            String reversedText = stringBuilder.toString();
            return preparedText.equals(reversedText);
        }
        else
            return false;
    }

    public static int textLength(String text) {
        return text.length();
    }
}
