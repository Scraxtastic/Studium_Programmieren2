package Aufgabe1;

public class Boxer extends Person{
    private int gewicht;

    @Override
    public String toString() {
        return super.toString() + " " + gewicht;
    }

    public boolean equals(Boxer b){
        return super.toString().equals(b.toString()) && gewicht == b.gewicht;
    }
}
