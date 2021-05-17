package org.Marta;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(-20, 21);
        ints
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);
    }
}
