package org.Marta;

import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.findEntry("Marta Kwiatek");
        System.out.println();

        try {
            phoneBook.findEntry("Elvis Presley");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
