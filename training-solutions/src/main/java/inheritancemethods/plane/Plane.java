package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger  = new Passenger("Domján Gábor", 25000);
        PriorityPassenger prio = new PriorityPassenger("Domján Gábor", 25000, 15);
        FirstClassPassenger first = new FirstClassPassenger("Domján Gábor", 25000, 15);

        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println(prio.getName());
        System.out.println(prio.getPercent());
        System.out.println(prio.getPriceOfPlaneTicket());
        System.out.println(first.getName());
        System.out.println(first.getPercent());
        System.out.println(first.getPriceOfPlaneTicket());
    }
}
