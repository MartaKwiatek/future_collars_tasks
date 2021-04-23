package org.Marta;

import java.io.*;

public class FileUtil {
    static BufferedReader reader = null;

    public FileUtil (String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        reader = new BufferedReader(inputStreamReader);
    }

    public int countCharacters() throws IOException {
        int numOfCharacters = 0;
        String data;
        while ((data = reader.readLine()) != null) {
            numOfCharacters += data.length();
        }
        return numOfCharacters;
    }
}
