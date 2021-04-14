package org.Marta;

public class UppercaseText implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
