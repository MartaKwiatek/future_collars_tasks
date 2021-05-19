package org.Marta;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

        Runnable calculateAvg = () -> System.out.println("Average = " + ints.stream().mapToInt(Integer::intValue).average().orElse(0.0));
        Runnable calculateSum = () -> System.out.println("Sum = " + ints.stream().mapToInt(Integer::intValue).sum());

        Thread avgThread = new Thread(calculateAvg);
        Thread sumThread = new Thread(calculateSum);

        avgThread.start();
        sumThread.start();
    }
}
