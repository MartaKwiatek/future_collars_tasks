package org.Marta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Marta", "Agata", "Justyna", "Roksana",
                "Ewelina", "Piotr", "Marcin", "Michał", "Aleksandra", "Renata", "Anna"));

        List<String> namesToUpperCase = names
                .stream()
                .map(String::toUpperCase)
                .map(App::removeDuplicates)
                .collect(Collectors.toList());

        namesToUpperCase.forEach(System.out::println);
    }

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();

        input
                .chars()
                .distinct()
                .forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
