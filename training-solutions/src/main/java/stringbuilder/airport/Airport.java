package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public StringBuilder getDeletedFlights() {
        StringBuilder deletedFlights = new StringBuilder("Törölve: \n");
        for (Flight flight: flights) {
            if (flight.getStatus() == Status.DELETED) {
                deletedFlights.append(flight.getFlightNumber());
                deletedFlights.append("\n");
            }
        }
        return deletedFlights;
    }

    public static void main(String[] args) {
        Airport airport = new Airport();

        Flight flight1 = new Flight("B-48454", Status.ACTIVE);
        Flight flight2 = new Flight("C-78874", Status.ACTIVE);
        Flight flight3 = new Flight("D-112321", Status.ACTIVE);
        Flight flight4 = new Flight("A-00051", Status.ACTIVE);

        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);

        flight1.setStatus(Status.DELETED);
        flight4.setStatus(Status.DELETED);

        System.out.println(airport.getDeletedFlights());

    }
}
