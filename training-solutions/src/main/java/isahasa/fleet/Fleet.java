package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public List<Ship> getShips() {
        return new ArrayList<>(ships);
    }

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int passengersToLoad = passengers;
        int cargoToLoad = cargoWeight;
        for (Ship actual : ships) {
            if (actual instanceof CanCarryPassengers) {
                passengersToLoad = ((CanCarryPassengers) actual).loadPassenger(passengersToLoad);
            }
            if (actual instanceof CanCarryGoods) {
                cargoToLoad = ((CanCarryGoods) actual).loadCargo(cargoToLoad);
            }
        }
        this.waitingCargo = cargoToLoad;
        this.waitingPeople = passengersToLoad;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
