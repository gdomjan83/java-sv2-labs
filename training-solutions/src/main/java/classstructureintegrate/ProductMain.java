package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a termék nevét:");
        String name = scanner.nextLine();
        System.out.println("Add meg a termék árát:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println("Mennyivel növeljük az árat?");
        int amount = scanner.nextInt();
        product.increasePrice(amount);

        System.out.println(product.getName() + " új ára: " + product.getPrice() + " Ft");

        System.out.println("Mennyivel csökkentsük az árat?");
        amount = scanner.nextInt();
        product.decreasePrice(amount);

        System.out.println(product.getName() + " új ára: " + product.getPrice() + " Ft");
    }
}
