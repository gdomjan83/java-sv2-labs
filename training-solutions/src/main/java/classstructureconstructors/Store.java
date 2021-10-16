package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        stock = 0;
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
    public int getStock() {
        return stock;
    }

    public String inventory() {
        return "Raktáron: " + getProduct() + " (" + getStock() + " darab)";
    }

    public void store(int volume) {
        stock += volume;
    }

    public void dispatch(int volume) {
        stock -= volume;
    }
}
