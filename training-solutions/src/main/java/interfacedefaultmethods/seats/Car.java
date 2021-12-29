package interfacedefaultmethods.seats;

public class Car implements Seat {
    private int numberOfSeats;
    private String name;

    public Car(int numberOfSeats, String name) {
        this.numberOfSeats = numberOfSeats;
        this.name = name;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getName() {
        return name;
    }
}
