package inheritancemethods.cars;

public class Jeep extends  Car{
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (fuel > 0) {
            double fuelIntoTank = Math.min(getTankCapacity() - getFuel(), fuel);
            double fuelIntoExtra = fuel - fuelIntoTank;
            super.modifyFuelAmount(fuelIntoTank);
            extraFuel += fuelIntoExtra;
        }
        if (fuel < 0) {
            if (Math.abs(fuel) > extraFuel) {
                super.modifyFuelAmount(-(Math.abs(fuel) - extraFuel));
                extraFuel = 0;
            } else {
                extraFuel -= Math.abs(fuel);
            }
        }
    }

    @Override
    public void drive(int km) {
        double fuelNeeded = km * getFuelRate() / 100;
        if (hasEnoughFuel(fuelNeeded)) {
            modifyFuelAmount(-fuelNeeded);
        }
    }

    @Override
    public double calculateRefillAmount()  {
        return (getTankCapacity() + extraCapacity) - (getFuel() + extraFuel);
    }

    private boolean hasEnoughFuel(double fuelNeeded) {
        if (getFuel() + extraFuel >= fuelNeeded) {
            return true;
        } else {
            throw new RuntimeException("Not enough fuel available!");
        }
    }
}
