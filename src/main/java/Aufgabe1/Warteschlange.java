package Aufgabe1;

import java.util.NoSuchElementException;

public interface Warteschlange<T> extends Speicher<T> {
    public T front() throws NoSuchElementException;
}
