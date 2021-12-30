package virtualmethod.vehicle;

public class Van extends Car {
    private int cargoWeight;

    public Van(int vehicleWeight, int numberOfPassangers, int cargoWeight) {
        super(vehicleWeight, numberOfPassangers);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{cargoWeight=" + cargoWeight + ", numberOfPassenger=" + getNumberOfPassangers() + ", vehicleWeight=" + getVehicleWeight() + "}";
    }
}
