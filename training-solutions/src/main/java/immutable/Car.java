package immutable;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {
        if (checkBrand(brand)) {
            this.brand = brand;
        }
        this.model = model;
        if (checkYearOfProduction(yearOfProduction)) {
            this.yearOfProduction = yearOfProduction;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    private boolean checkBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand can not be empty.");
        }
        return true;
    }

    private boolean checkYearOfProduction(int year) {
        if (LocalDate.now().getYear() < year) {
            throw new IllegalArgumentException("Year can not be later than current year.");
        }
        return true;
    }
}
