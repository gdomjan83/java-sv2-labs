package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        double fuelNeeded = km * fuelRate / 100;
        if (hasEnoughFuel(fuelNeeded)) {
            modifyFuelAmount(fuelNeeded * (-1));
        }
    }

    public double calculateRefillAmount()  {
        return tankCapacity - fuel;
    }

    private boolean hasEnoughFuel(double fuelNeeded) {
        if (fuel < fuelNeeded) {
            throw new RuntimeException("Not enough fuel available!");
        }
        return true;
    }
}
