package org.Marta;

import java.util.*;

public class ListPrinter {
    public static void printWithoutDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }

    public static void printReversed(List<String> list) {
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);

        System.out.println("List in reversed order: " + reversedList);
    }

    public static void printWithReplacedElements(String toReplace, String replacement, List<String> list) {
        List<String> listWithReplacedElements = new ArrayList<>(list);
        ListIterator<String> iterator = listWithReplacedElements.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals(toReplace)) {
                iterator.set(replacement);
            }
        }

        System.out.println("List with element " + toReplace + " replaced with " + replacement + ": " + listWithReplacedElements);
    }
}
