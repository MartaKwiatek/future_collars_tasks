package org.Marta;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static List<Integer> filterNums(int from, int to) {
        return IntStream.range(from, to)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterNums(-20, 21).forEach(System.out::println);
    }
}
