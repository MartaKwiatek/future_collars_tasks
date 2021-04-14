package org.Marta;

import java.util.Locale;

public class LowercaseText implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
