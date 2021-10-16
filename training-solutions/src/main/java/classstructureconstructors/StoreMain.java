package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Termék neve (1):");
        String product = scanner.nextLine();
        Store store1 = new Store(product);

        System.out.println("Termék neve (2):");
        product = scanner.nextLine();
        Store store2 = new Store(product);

        System.out.println("Add meg a bevételezni kívánt mennyiséget a következő termékhez: " + store1.getProduct());
        int volume = scanner.nextInt();
        store1.store(volume);

        System.out.println("Add meg a bevételezni kívánt mennyiséget a következő termékhez: " + store2.getProduct());
        volume = scanner.nextInt();
        store2.store(volume);

        System.out.println("Raktáron lévő mennyiség:");
        System.out.println(store1.getProduct() + ": " + store1.getStock() + " darab");
        System.out.println(store2.getProduct() + ": " + store2.getStock() + " darab");

        System.out.println("Add meg a kiszállítani kívánt mennyiséget a következő termékhez: " + store1.getProduct());
        volume = scanner.nextInt();
        store1.dispatch(volume);

        System.out.println("Add meg a kiszállítani kívánt mennyiséget a következő termékhez: " + store2.getProduct());
        volume = scanner.nextInt();
        store2.dispatch(volume);

        System.out.println("Raktáron lévő mennyiség:");
        System.out.println(store1.getProduct() + ": " + store1.getStock() + " darab");
        System.out.println(store2.getProduct() + ": " + store2.getStock() + " darab");
    }
}
