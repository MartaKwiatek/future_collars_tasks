package org.Marta;

public class MyList implements OwnList {
    Integer[] data;
    int maxCapacity;
    int currentSize;
    static final int DEFAULT_CAPACITY = 100;

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        data = new Integer[maxCapacity];
        currentSize = 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void add(Integer element) {
        if (currentSize == maxCapacity) {
            throw new CapacityExceeded("list capacity exceeded.");
        }
        data[currentSize] = element;
        currentSize++;
    }

    @Override
    public Integer get(int i) {
        if (i < 0 || i >= currentSize) {
            throw new RuntimeException("Index out of bounds");
        }
        return data[i];
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index >= currentSize) {
            throw new RuntimeException("Index out of bounds");
        }
       currentSize++;
        for(int i = currentSize - 1; i >= index ; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= currentSize) {
            throw new RuntimeException("Index out of bounds");
        }
        for (int i = index; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }
        currentSize--;
    }

    @Override
    public String toString() {
        StringBuilder elements = new StringBuilder();
        for(int i = 0; i < currentSize; i++) {
            elements.append(data[i].toString()).append("\n");
        }
        return elements.toString();
    }
}
