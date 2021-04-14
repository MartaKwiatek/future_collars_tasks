package org.Marta;

public class UpperCaseTextFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
