package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour item : hoursOfDay) {
            if (item.getHourNumber() >= 6 && item.getHourNumber() <= 22) {
                item.setPeriod(DayPeriod.DAYTIME);
            } else {
                item.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
