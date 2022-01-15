package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String taj;
    private LocalDateTime reservedTime;

    public Patient(String name, String taj, LocalDateTime reservedTime) {
        this.name = name;
        this.taj = taj;
        this.reservedTime = reservedTime;
    }

    public String getName() {
        return name;
    }

    public String getTaj() {
        return taj;
    }

    public LocalDateTime getReservedTime() {
        return reservedTime;
    }
}
