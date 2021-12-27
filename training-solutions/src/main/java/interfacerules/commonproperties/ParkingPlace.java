package interfacerules.commonproperties;

public class ParkingPlace implements Length, Width {
    private double length;
    private double width;

    @Override
    public double getLength() {
        return 5;
    }

    @Override
    public double getWidth() {
        return 2.2;
    }
}
