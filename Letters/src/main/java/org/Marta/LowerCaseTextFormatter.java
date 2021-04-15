package org.Marta;

public class LowerCaseTextFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
