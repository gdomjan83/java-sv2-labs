package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        checkNumberExceptions(hour, minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time) {
        checkStringExceptions(time);
        try {
            int convertedHour = Integer.parseInt(time.split(":")[0]);
            int convertedMinute = Integer.parseInt(time.split(":")[1]);
            checkNumberExceptions(convertedHour, convertedMinute);
            this.hour = convertedHour;
            this.minute = convertedMinute;
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    private void checkNumberExceptions(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    private void checkStringExceptions(String time) {
        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!time.contains(":")) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }
}
