package org.Marta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher("89100300000");

        boolean matches = matcher.matches();
    }
}
