package virtualmethod.vehicle;

public class Car extends Vehicle {
    private int numberOfPassangers;

    public Car(int vehicleWeight, int numberOfPassangers) {
        super(vehicleWeight);
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + (numberOfPassangers * Vehicle.PERSON_AVERAGE_WEIGHT);
    }

    @Override
    public String toString() {
        return "Car{numberOfPassenger=" + numberOfPassangers + ", vehicleWeight=" + getVehicleWeight() + "}";
    }
}
