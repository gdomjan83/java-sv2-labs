package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String descripton;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String descripton, LocalDate startTime) {
        this.descripton = descripton;
        this.startTime = startTime;
    }

    public String getDescripton() {
        return descripton;
    }
    public LocalDate getStartTime() {
        return startTime;
    }
    public int getNumberOfPeople() {
        return numberOfPeople;
    }
    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }
}
