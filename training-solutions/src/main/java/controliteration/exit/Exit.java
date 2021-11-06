package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            input = sc.nextLine();
        } while (!input.equals("x"));
        System.out.println("Viszontlátásra!");
    }
}
