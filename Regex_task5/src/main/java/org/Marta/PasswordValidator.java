package org.Marta;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static String year = String.valueOf(LocalDateTime.now().getYear());
    private static String year2 = year.substring(2,4);
    private static final Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$).{7,}$");


    public static boolean isValid(String password) {
        if (password.contains(year) || password.contains(year2)) {
            return false;
        } else {
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }
}
