package Aufgabe1;

import java.util.NoSuchElementException;

public interface Kellerspeicher<T> extends Speicher<T>{
    public T top() throws NoSuchElementException;
}
