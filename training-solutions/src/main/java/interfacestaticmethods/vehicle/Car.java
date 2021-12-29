package interfacestaticmethods.vehicle;

public class Car implements Vehicle {
    private String brand;
    private int numberOfWheels;

    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String brand, int numberOfWheels) {
        this(numberOfWheels);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
