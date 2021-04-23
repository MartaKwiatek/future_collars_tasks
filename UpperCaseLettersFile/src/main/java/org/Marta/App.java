package org.Marta;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String content = Files.readString(Paths.get("..\\CreateTxtFile\\data.txt"));
            Files.writeString(Paths.get("..\\UpperCaseLettersFile\\output.txt"), content.toUpperCase());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
