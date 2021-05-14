package org.Marta;

import java.util.Arrays;

public class MyList<E> implements OwnList<E> {
    private Object[] data;
    private int maxCapacity;
    private int currentSize;
    private final int EXTENSION_STEP = 10;

    public MyList() {
        this.maxCapacity = DEFAULT_CAPACITY;
        data = new Object[maxCapacity];
        currentSize = 0;
    }

    private void extendArrayIfNeeded() {
        if (currentSize == maxCapacity) {
            Object[] dataCopy = new Object[currentSize + EXTENSION_STEP];

            System.arraycopy(data, 0, dataCopy, 0, currentSize);
            maxCapacity += EXTENSION_STEP;
            data = dataCopy;
        }
    }

    @Override
    public boolean add(E o) {
        extendArrayIfNeeded();
        data[currentSize] = o;
        currentSize++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new RuntimeException("Index out of bounds");
        }
        @SuppressWarnings("unchecked") final E e = (E) data[index];
        return e;
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < currentSize; i++) {
            if (data[i].equals(o)) {
                System.arraycopy(data, i + 1, data, i, currentSize - i);
                currentSize--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public String toString() {
        return "MyList: " + Arrays.toString(data);
    }
}
