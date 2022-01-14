package collectionsiterator;

public class ChristmasPresent {
    private String description;
    private String nameOfPerson;
    private int price;

    public ChristmasPresent(String description, String giveTo, int price) {
        this.description = description;
        this.nameOfPerson = giveTo;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getPrice() {
        return price;
    }
}
