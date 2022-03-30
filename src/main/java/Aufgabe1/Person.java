package Aufgabe1;

public abstract class Person {
    private String name, vorname;

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        return name + ", " + vorname;
    }
}
