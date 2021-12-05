package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger {
    private final int finalCharge = 2000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket, percent);
    }

    public int getFinalCharge() {
        return finalCharge;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return super.getPriceOfPlaneTicket() + finalCharge;
    }
}
