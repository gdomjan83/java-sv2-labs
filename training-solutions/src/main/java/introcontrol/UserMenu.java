package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: kilépés");

        Scanner sc = new Scanner(System.in);

        System.out.println("Menüválasztás: ");
        String input = sc.nextLine();
        if (input.equals("1")) {
            System.out.println("Felhasználók listázása");
        }
        if (input.equals("2")) {
            System.out.println("Felhasználó felvétele");
        }
    }
}
