package introexceptionthrowjunit4;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    private Tank tank = new Tank();

    @Test
    public void testAngle() {
        tank.modifyAngle(30);
        assertEquals(30, tank.getAngle());
        tank.modifyAngle(-80);
        assertEquals(-50, tank.getAngle());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAngle2() {
        tank.modifyAngle(100);
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testAngle3() {
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("New angle would exceed 80 degrees");
        tank.modifyAngle(-150);
    }

    @Test
    public void testAngle4() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(250));
        assertEquals("New angle would exceed 80 degrees", exception.getMessage());
    }
}
