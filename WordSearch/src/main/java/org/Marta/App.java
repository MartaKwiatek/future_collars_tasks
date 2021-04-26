package org.Marta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("Type a word: ");

        try(Scanner scanner = new Scanner(System.in)) {
            String word = scanner.next();
            String content = Files.readString(Paths.get(("..\\CreateTxtFile\\data.txt")));
            System.out.println(content.contains(word) ? "File contains that word" : "File doesn't contain that word");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
