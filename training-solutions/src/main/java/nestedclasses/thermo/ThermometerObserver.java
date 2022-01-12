package nestedclasses.thermo;

public interface ThermometerObserver {

    void handleTemperatureChange(int roomTemp, String roomName);
}
