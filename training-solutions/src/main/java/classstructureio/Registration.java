package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Hello! Kérlek add meg a neved!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Add meg a regisztrációhoz használt email címed!");
        String email = scanner.nextLine();
        System.out.println("Adataid:");
        System.out.println("Név: " + name);
        System.out.println("Email: " + email);

    }
}
