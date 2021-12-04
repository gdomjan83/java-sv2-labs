package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void testaddVehicle() {
        PublicVehicle vehicle = new Bus(3, 10.4, "Ikarus");
        PublicVehicle vehicle2 = new Tram(2, 16.3, 2);
        PublicVehicle vehicle3 = new Metro(5, 25.1, 8);
        PublicTransport transport = new PublicTransport();
        transport.addVehicle(vehicle);
        transport.addVehicle(vehicle2);
        transport.addVehicle(vehicle3);

        assertEquals(3, transport.getPublicVehicles().size());
    }
}