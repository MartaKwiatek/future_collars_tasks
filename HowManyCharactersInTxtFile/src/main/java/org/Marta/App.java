package org.Marta;

import java.io.IOException;


public class App {
    private static final String filePath = "..\\CreateTxtFile\\data.txt";

    public static void main( String[] args ) throws IOException {
        try(FileUtil fileUtil = new FileUtil(filePath)) {
            System.out.println("This file contains " + fileUtil.countCharacters() + " characters");
        }
    }
}
