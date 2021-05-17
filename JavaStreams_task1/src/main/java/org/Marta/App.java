package org.Marta;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(-20, 21);
        List<Integer> filteredNums =  ints
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
        filteredNums.forEach(System.out::println);
    }
}
