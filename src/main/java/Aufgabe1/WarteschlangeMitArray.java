package Aufgabe1;

import java.util.NoSuchElementException;

public class WarteschlangeMitArray implements Warteschlange<Integer> {
    private int currentSize = 0;
    private int maxSize;
    private Integer[] queue;

    public WarteschlangeMitArray(int maxSize) {
        this.maxSize = maxSize;
        queue = new Integer[maxSize];
    }

    @Override
    public void push(Integer object) throws IllegalStateException {
        if (currentSize == maxSize) {
            throw new IllegalStateException("Queue is full");
        }
        queue[currentSize] = object;
        currentSize++;
    }

    @Override
    public Integer pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Integer result = queue[0];
        for (int i = 0; i < currentSize - 1; i++) {
            queue[i] = queue[i + 1];
        }
        return result;
    }

    @Override
    public Integer front() throws NoSuchElementException {
        return queue[0];
    }


    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public int capacity() {
        return maxSize;
    }
}
