package classstructuremethods;

public class Client {
    private String name;
    private int year;
    private String address;

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void migrate(String newAddress) {
        setAddress(newAddress);
    }
}
