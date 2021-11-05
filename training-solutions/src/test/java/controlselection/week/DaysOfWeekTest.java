package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysOfWeekTest {
    DaysOfWeek daysOfWeek = new DaysOfWeek();

    @Test
    void testMon() {
        assertEquals("hét eleje", daysOfWeek.getDay("hétfő"));
    }

    @Test
    void testWed() {
        assertEquals("hét közepe", daysOfWeek.getDay("Szerda"));
    }

    @Test
    void testFri() {
        assertEquals("majdnem hétvége", daysOfWeek.getDay("Péntek"));
    }

    @Test
    void testSun() {
        assertEquals("hét vége", daysOfWeek.getDay("Vasárnap"));
    }

    @Test
    void testError() {
        assertEquals("ismeretlen nap", daysOfWeek.getDay("Sunday"));
    }
}
