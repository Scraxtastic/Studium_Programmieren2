package Aufgabe1;

import java.util.NoSuchElementException;

public class KellerspeicherMitArray implements Kellerspeicher<Integer> {
    private int currentSize = 0;
    private int maxSize;
    private Integer[] stack;

    public KellerspeicherMitArray(int maxSize) {
        this.maxSize = maxSize;
        stack = new Integer[maxSize];
    }

    @Override
    public Integer top() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stack[currentSize - 1];
    }

    @Override
    public void push(Integer object) throws IllegalStateException {
        if (currentSize == maxSize) {
            throw new IllegalStateException("Stack is full");
        }
        stack[currentSize] = object;
        currentSize++;
    }

    @Override
    public Integer pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        Integer value = stack[currentSize - 1];
        currentSize--;
        stack[currentSize] = null;
        return value;
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
