package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {

    DayInMonth dayInMonth = new DayInMonth();

    @Test
    void testMonth2020LeapYear() {
        assertEquals(29, dayInMonth.daysInMonth(2020, "Február"));
    }

    @Test
    void testMonth1600LeapYear() {
        assertEquals(29, dayInMonth.daysInMonth(1600, "Február"));
    }

    @Test
    void testMonth2021NonLeapYear() {
        assertEquals(28, dayInMonth.daysInMonth(2021, "február"));
    }

    @Test
    void testMonth31Days() {
        assertEquals(31, dayInMonth.daysInMonth(2021, "Január"));

    }

    @Test
    void testMonthWrongMonth() {
        assertEquals(0, dayInMonth.daysInMonth(2021, "bad"));

    }

    @Test
    void testMonth30Days() {
        assertEquals(30, dayInMonth.daysInMonth(2021, "szeptember"));
    }
}
