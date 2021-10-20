package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();

        System.out.println("Kérlek add meg a felhasználóneved!");
        String userName = scanner.nextLine();
        System.out.println(validator.isValidUsername(userName) ? "Felhasználónév elfogadva" : "Nem megfelelő felhasználónév");

        System.out.println("Kérlek add meg a jelszót!");
        String password1 = scanner.nextLine();
        System.out.println("Jelszó megerősítése:");
        String password2 = scanner.nextLine();
        System.out.println(validator.isValidPassword(password1, password2) ? "Jelszó elfogadva" : "Hibás jelszó");

        System.out.println("Kérlek add meg az email címed!");
        String email = scanner.nextLine();
        System.out.println(validator.isValidEmail(email) ? "Email cím elfogadva" : "Nem megfelelő email cím");
    }
}
