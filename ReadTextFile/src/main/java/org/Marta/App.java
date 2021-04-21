package org.Marta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main( String[] args ) {
        try {
            String content = Files.readString(Paths.get("C:\\Users\\marta\\git\\future_collars_tasks\\CreateTxtFile\\data.txt"));
            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
