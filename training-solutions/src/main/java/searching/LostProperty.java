package searching;

import java.time.LocalDate;

public class LostProperty implements Comparable<LostProperty> {
    private String regNumber;
    private String description;
    private LocalDate dateFound;

    public LostProperty(String description, LocalDate dateFound) {
        this.description = description;
        this.dateFound = dateFound;
    }

    public LostProperty(String id, String description, LocalDate dateFound) {
        this(description, dateFound);
        this.regNumber = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateFound() {
        return dateFound;
    }

    @Override
    public int compareTo(LostProperty other) {
        if (description.equals(other.description)) {
            return dateFound.compareTo(other.dateFound);
        } else {
            return description.compareTo(other.description);
        }
    }
}
