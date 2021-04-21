package org.Marta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("C:\\Users\\marta\\git\\future_collars_tasks\\CreateTxtFile\\data.txt");
            long countLines = Files.lines(file).count();
            System.out.println("Total lines: " + countLines);

            int n = 0;
            while (n < countLines) {
                String line = Files.readAllLines(Paths.get("C:\\Users\\marta\\git\\future_collars_tasks\\CreateTxtFile\\data.txt")).get(n);
                System.out.println(line);
                n = n + 2;
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
