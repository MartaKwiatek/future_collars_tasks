package org.Marta;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("https://www.oracle.com/index.html");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()))) {
            try (PrintWriter writer = new PrintWriter("oracle.html")) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    writer.write(inputLine);
                }
            }
        }
    }
}
