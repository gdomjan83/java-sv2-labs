package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ügyfél neve:");
        String name = scanner.nextLine();
        System.out.println("Ügyfél számlaszáma:");
        String account = scanner.nextLine();
        System.out.println("Elhelyezett összeg:");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(account, name, balance);

        System.out.println("Nyitó adatok: " + bankAccount.getInfo());

        System.out.println("Mekkora összeget kíván befizetni a számlára?");
        int amount = scanner.nextInt();
        bankAccount.deposit(amount);
        System.out.println("Új egyenleg: " + bankAccount.getInfo());

        System.out.println("Mekkora összeget kíván kivenni a számláról?");
        amount = scanner.nextInt();
        bankAccount.withdraw(amount);
        System.out.println("Új egyenleg: " + bankAccount.getInfo());

    }
}
