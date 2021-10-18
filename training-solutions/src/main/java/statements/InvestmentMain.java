package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mennyit szeretne befeketetni?");
        int fund = scanner.nextInt();
        System.out.println("Adja meg a kamatlábat!");
        int interestRate = scanner.nextInt();
        System.out.println("Lezáráskor levont kezelési költség: 0,3%");

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Hány napra szeretné lekötni a pénzét?");
        int days = scanner.nextInt();

        System.out.println("Befektetés összege:");
        System.out.println(fund + " Ft");
        System.out.println("Kamatláb:");
        System.out.println(interestRate + "%");
        System.out.println("Tőke:");
        System.out.println(fund + " Ft");
        System.out.println("Hozam " + days + " napra: " + investment.getYield(days));
        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));
        days += 55; //Szimulálva, hogy később is ki szeretné venni a pénzt, amikor már lezárt a befektetése.
        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));
    }
}
