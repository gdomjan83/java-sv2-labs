package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a dolgozó nevét!");
        String name = scanner.nextLine();
        System.out.println("Melyik évben születtél?");
        int year = scanner.nextInt();
        System.out.println("Add meg a születési hónapot számmal?");
        int month = scanner.nextInt();
        System.out.println("Hányadikán születtél?");
        int day = scanner.nextInt();
        Employee employee = new Employee(name, year, month, day);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési idő: " + employee.getDateOfBirth());
        System.out.println("Belépés időpontja: " + employee.getBeginEmployment());

        System.out.println("Mire változtassuk meg a nevet?");
        scanner.nextLine();
        name = scanner.nextLine();
        employee.setName(name);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési idő: " + employee.getDateOfBirth());
        System.out.println("Belépés időpontja: " + employee.getBeginEmployment());
    }
}
