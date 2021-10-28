package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double results;

    public Person(String name, LocalDate dateOfBirth, int zipCode, double results) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Név: " + name + " Születési idő: " + dateOfBirth + " Ir. szám: " + zipCode + " Eredmények: " + results;
    }
}
