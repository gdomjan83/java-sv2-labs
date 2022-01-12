package nestedclasses.thermo;

public class Thermometer {
    private int temperature;
    private String roomName;
    private ThermometerObserver observer;

    public Thermometer(String roomName, int temperature) {
        this.temperature = temperature;
        this.roomName = roomName;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getRoomName() {
        return roomName;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }

    public void onTemperatureChanged() {
        if (observer != null) {
            observer.handleTemperatureChange(temperature, roomName);
        }
    }

    public void setTemperature(int newTemperature) {
        this.temperature = newTemperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }
}
