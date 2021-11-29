package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return String.format("Pendrive data: %s - capacity: %d GB - price: %d", name, capacity, price);
    }

    public void risePrice(int percent) {
        price = price * (100 + percent) / 100;
    }

    public int comparePricePerCapacity(Pendrive other) {
        double originalRatio = (double) this.price / this.capacity;
        double otherRatio = (double) other.price / other.capacity;

        if (originalRatio > otherRatio) {
            return 1;
        } else if (originalRatio < otherRatio) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isCheaperThan(Pendrive other) {
        return (this.price < other.getPrice());
    }
}
