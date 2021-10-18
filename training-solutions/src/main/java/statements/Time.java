package statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes() {
        int minuteInHour = 60;
        return hour * minuteInHour + minute;
    }
    public int getInSeconds() {
        int secondInMinute = 60;
        return getInMinutes() * secondInMinute + second;
    }

    public boolean earlierThan(Time otherTime) {
        return getInSeconds() < otherTime.getInSeconds();
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
