package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a vásárló nevét!");
        String name = sc.nextLine();
        System.out.println("Adja meg a megtekinteni kívánt film címét!");
        String title = sc.nextLine();
        System.out.println("Hány jegyet kíván vásárolni?");
        int tickets = sc.nextInt(); //ha itt nem számot ad meg a vásárló, akkor InputMismatchException keletkezik
        sc.nextLine();
        System.out.println("Melyik sorba kéri a jegyeket?");
        int row = sc.nextInt(); //ha itt nem számot ad meg a vásárló, akkor InputMismatchException keletkezik

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("Vásárló neve: " + name);;
        System.out.println("Film címe: " + title);

        StringBuilder sb = new StringBuilder("Lefoglalt helyek: ");
        for (int i = 1; i <= tickets; i++) {
            sb.append(String.valueOf(row) + ". sor " + String.valueOf(i) + ". szék");
            if (i != tickets) {
                sb.append(", ");
            }
        }

        System.out.println(new String(sb));
        System.out.println("Jó szórakozást!");
    }
}
