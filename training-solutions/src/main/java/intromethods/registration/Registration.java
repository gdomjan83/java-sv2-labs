package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String getFullName(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vezetéknév:");
        String lastName = sc.nextLine();
        System.out.println("Keresztnév:");
        String firstName = sc.nextLine();
        String fullName = new Registration().getFullName(lastName, firstName);

        System.out.println("Születési év:");
        int year = sc.nextInt();
        System.out.println("Hónap:");
        int month = sc.nextInt();
        System.out.println("Nap:");
        int day = sc.nextInt();
        LocalDate dateOfBirth = new Registration().getDateOfBirth(year, month, day);

        System.out.println("Email cím:");
        sc.nextLine();
        String email = sc.nextLine();

        Person person = new Person(fullName, dateOfBirth, email);

        System.out.println("Adatok: " + person.toString());
    }
}
