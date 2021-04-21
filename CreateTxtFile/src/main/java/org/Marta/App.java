package org.Marta;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IIOException exception) {
            exception.printStackTrace();
        }

        String pathToFile = "C:\\Users\\marta\\git\\future_collars_tasks\\CreateTxtFile\\data.txt";
        String text = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";

        TextFileWriter textFileWriter = new TextFileWriter();
        textFileWriter.writeToFile(pathToFile, text);
    }
}
