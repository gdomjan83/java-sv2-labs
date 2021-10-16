package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a neved:");
        String name = scanner.nextLine();
        client.setName(name);

        System.out.println("Kérlek add meg a születési éved:");
        int year = scanner.nextInt();
        client.setYear(year);

        System.out.println("Kérlek add meg a lakcímed:");
        scanner.nextLine();
        String address = scanner.nextLine();
        client.setAddress(address);

        System.out.println("Adataid:");
        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        System.out.println("Mire szeretnéd módosítani a lakcímed?");
        String newAddress = scanner.nextLine();
        client.migrate(newAddress);

        System.out.println("Új lakcím: " + client.getAddress());
    }
}
