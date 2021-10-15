package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hogy hívnak?");
        client.name = scanner.nextLine();
        System.out.println("Mikor születtél?");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hol laksz?");
        client.address = scanner.nextLine();

        System.out.println("Adataid:");
        System.out.println("Name: " + client.name);
        System.out.println("Year of Birth: " + client.year);
        System.out.println("Address: " + client.address);
    }
}
