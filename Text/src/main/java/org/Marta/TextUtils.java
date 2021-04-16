package org.Marta;

public class TextUtils {
    public static boolean isNotEmpty(String text) {
        return text.length() != 0;
    }

    public static boolean isPalindrome(String text) {
        String preparedText = text.replaceAll("\\s", "").replaceAll("\\p{Punct}", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(preparedText);
        stringBuilder.reverse();
        String reversedText = stringBuilder.toString();
        return preparedText.equals(reversedText);
    }

    public static int textLength(String text) {
        return text.length();
    }
}
