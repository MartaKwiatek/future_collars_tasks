package org.Marta;

public class BubbleSort <T extends Comparable<? super T>> {
    T[] array;

    public BubbleSort(T[] array) {
        this.array = array;
    }

    public T[] bubbleSort() {
        int n = array.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            n = n - 1;
        }
        while (n > 1);
        return array;
    }
}
