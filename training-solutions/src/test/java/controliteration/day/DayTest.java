package controliteration.day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTest {
    Day day = new Day();


    @Test
    void testDayPeriod() {
        day.addHour(new Hour(6));
        day.addHour(new Hour(15));
        day.addHour(new Hour(22));
        day.addHour(new Hour(4));
        day.addHour(new Hour(23));

        day.setDayPeriod();

        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(3).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(4).getPeriod());
    }
}