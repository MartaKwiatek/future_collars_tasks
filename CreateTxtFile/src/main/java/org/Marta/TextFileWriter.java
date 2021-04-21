package org.Marta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFileWriter {
    public void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
