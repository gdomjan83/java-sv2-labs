package immutable;

import java.time.LocalDate;

public class Monument {
    private String name;
    private String address;
    private LocalDate dateOfLogging;
    private String logNumber;

    public Monument(String name, String address, LocalDate dateOfLogging, String logNumber) {
        if ((!isEmpty(name) && !isEmpty(address) && !isEmpty(String.valueOf(dateOfLogging)) && !isEmpty(logNumber))) {
            this.name = name;
            this.address = address;
            this.dateOfLogging = dateOfLogging;
            this.logNumber = logNumber;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfLogging() {
        return dateOfLogging;
    }

    public String getLogNumber() {
        return logNumber;
    }

    private boolean isEmpty(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Input text cannot be empty!");
        }
        return false;
    }
}
