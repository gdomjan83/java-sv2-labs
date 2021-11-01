package stringbuilder.airport;

public class Flight {
    private String flightNumber;
    private Status status;

    public Flight(String flightNumber, Status status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setFlightNumber(String newNumber) {
        this.flightNumber = newNumber;
    }

    public void setStatus(Status newStatus) {
        this.status = newStatus;
    }
}
