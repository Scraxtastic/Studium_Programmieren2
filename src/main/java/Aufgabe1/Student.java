package Aufgabe1;

public class Student extends Person {
    private int matrikelnummer;

    public int getMatrikel() {
        return matrikelnummer;
    }

    @Override
    public String toString() {
        return super.toString() + " " + matrikelnummer;
    }

    public boolean equals(Student s) {
        return super.toString().equals(s.toString()) && matrikelnummer == s.matrikelnummer;
    }
}
