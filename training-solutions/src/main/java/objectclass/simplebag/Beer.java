package objectclass.simplebag;

public class Beer {
    private String name;
    private int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Beer beer = (Beer) o;
        if (name.equals(beer.name) && price == beer.price) {
            return true;
        }
        return false;
    }
}
