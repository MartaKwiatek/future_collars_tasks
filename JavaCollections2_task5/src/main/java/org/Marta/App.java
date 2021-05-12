package org.Marta;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] inputInteger = new Integer[] {4, 2, 5, 1, 7};
        BubbleSort<Integer> bsInteger = new BubbleSort<>(inputInteger);
        Integer[] outputInteger = bsInteger.bubbleSort();

        System.out.println(Arrays.toString(outputInteger));

        String[] inputString = new String[] {"Marta", "Anna", "Roksana", "Piotr", "Justyna"};
        BubbleSort<String> bsString = new BubbleSort<>(inputString);
        String[] outputString = bsString.bubbleSort();

        System.out.println(Arrays.toString(outputString));


    }
}
