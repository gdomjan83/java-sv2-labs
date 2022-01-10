package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int findHowMany(Product product) {
        int count = 0;
        for (Product p : products) {
            if (product.equals(p)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop(List.of(
                        new Product("whiskey", "123"),
                        new Product("cola", "755"),
                        new Product("fanta", "755"),
                        new Product("7up", "755"),
                        new Product("gin", "123")));

        System.out.println(webShop.findHowMany(new Product("vodka", "123")));
        System.out.println(webShop.findHowMany(new Product("sprite", "755")));
    }
}
