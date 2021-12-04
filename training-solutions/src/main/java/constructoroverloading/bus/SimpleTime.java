package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    public SimpleTime(SimpleTime time) {
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getDifference(SimpleTime time) {
        return (this.hours * 60 + this.minutes) - (time.hours * 60 + time.minutes);
    }

    @Override
    public String toString() {
        return "Time: " + hours + ":" + minutes;
    }
}
