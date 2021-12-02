package methodoverloading;

import java.time.LocalTime;

public class Time {
    private LocalTime time;

    public Time(LocalTime time) {
        this.time = time;
    }

    public Time(int hours, int minutes, int seconds) {
        this.time = LocalTime.of(hours, minutes, seconds);
    }

    public LocalTime getTime() {
        return time;
    }

    public boolean isEqual(Time time) {
        int originalTimeInSeconds = this.time.getSecond() + this.time.getMinute() * 60 + this.time.getHour() * 3600;
        int newTimeInSeconds = time.getTime().getSecond() + time.getTime().getMinute() * 60 + time.getTime().getHour() * 3600;

        return originalTimeInSeconds == newTimeInSeconds;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        int originalTimeInSeconds = this.time.getSecond() + this.time.getMinute() * 60 + this.time.getHour() * 3600;
        int newTimeInSeconds = seconds + minutes * 60 + hours * 3600;

        return originalTimeInSeconds == newTimeInSeconds;
    }

    public boolean isEarlier(Time time) {
        int originalTimeInSeconds = this.time.getSecond() + this.time.getMinute() * 60 + this.time.getHour() * 3600;
        int newTimeInSeconds = time.getTime().getSecond() + time.getTime().getMinute() * 60 + time.getTime().getHour() * 3600;

        return originalTimeInSeconds < newTimeInSeconds;
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        int originalTimeInSeconds = this.time.getSecond() + this.time.getMinute() * 60 + this.time.getHour() * 3600;
        int newTimeInSeconds = seconds + minutes * 60 + hours * 3600;

        return originalTimeInSeconds < newTimeInSeconds;
    }
}
