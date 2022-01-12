package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {
    private List<String> roomsToHeat = new ArrayList<>();
    private List<Thermometer> thermometers = new ArrayList<>();
    private int temperatureLimit;

    public Thermostat() {
        this.temperatureLimit = 23;
    }

    public List<String> getRoomsToHeat() {
        return new ArrayList<>(roomsToHeat);
    }

    public List<Thermometer> getThermometers() {
        return thermometers;
    }

    public int getTemperatureLimit() {
        return temperatureLimit;
    }

    public void addThermometer(Thermometer thermometer) {
        thermometers.add(thermometer);
        thermometer.setThermometerObserver(
                new ThermometerObserver() {
                    @Override
                    public void handleTemperatureChange(int roomTemp, String roomName) {
                        if (roomTemp < temperatureLimit) {
                            roomsToHeat.add(roomName);
                        } else {
                            roomsToHeat.remove(roomName);
                        }
                    }
                });
    }
}
