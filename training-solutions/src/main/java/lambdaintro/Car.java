package lambdaintro;

public class Car {
    private String brand;
    private String type;
    private int price;
    private double length;

    public Car(String brand, String model, int price, double length) {
        this.brand = brand;
        this.type = model;
        this.price = price;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }
}
