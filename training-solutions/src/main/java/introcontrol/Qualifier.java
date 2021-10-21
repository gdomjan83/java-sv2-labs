package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérlek adj meg egy egész számot!");
        int num = sc.nextInt();
        if (num > 100) {
            System.out.println("Nagyobb, mint száz.");
        } else {
            System.out.println("Száz, vagy kisebb.");
        }
    }
}
