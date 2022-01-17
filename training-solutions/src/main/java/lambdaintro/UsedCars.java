package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsedCars {
    private List<Car> cars = new ArrayList<>();

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car, otherCar) -> Integer.valueOf(car.getPrice()).compareTo(otherCar.getPrice()));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car, otherCar) -> Double.valueOf(car.getLength()).compareTo(otherCar.getLength()));
        Collections.reverse(result);
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> input = filterByBrand(brand);
        input.sort((car, otherCar) -> car.getType().compareTo(otherCar.getType()));
        return input;
    }

    private List<Car> filterByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car actual : cars) {
            if (brand.equals(actual.getBrand())) {
                result.add(actual);
            }
        }
        return result;
    }
}
