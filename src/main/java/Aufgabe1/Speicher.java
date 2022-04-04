package Aufgabe1;

import java.util.NoSuchElementException;

public interface Speicher<T> {
    public boolean isEmpty();
    public int size();
    public int capacity();
    public void push(T object) throws IllegalStateException;
    public T pop() throws NoSuchElementException;
}
