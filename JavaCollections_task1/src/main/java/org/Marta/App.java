package org.Marta;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        ListPrinter.printWithoutDuplicates(names);
        ListPrinter.printReversed(names);
        ListPrinter.printWithReplacedElements("Anna", "Joanna", names);
    }
}
