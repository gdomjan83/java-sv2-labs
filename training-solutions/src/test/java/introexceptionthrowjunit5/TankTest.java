package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    public Tank tank = new Tank();

    @Test
    public void testTank() {
        tank.modifyAngle(75);
        assertEquals(75, tank.getAngle());
        tank.modifyAngle(-90);
        assertEquals(-15, tank.getAngle());
    }

    @Test
    public void testTank2() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(120));
        assertEquals("New angle would exceed 80 degrees", exception.getMessage());
    }
}
