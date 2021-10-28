package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Exam exam = new Exam();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add meg a jelentkező nevét:");
        String name = sc.nextLine();
        System.out.println("Születési év:");
        int yearOfBirth = Integer.parseInt(sc.nextLine());
        System.out.println("Születési hónap:");
        int monthOfBirth = Integer.parseInt(sc.nextLine());
        System.out.println("Születési nap:");
        int dayOfBirth = Integer.parseInt(sc.nextLine());
        System.out.println("Irányítószám:");
        int zipCode = Integer.parseInt(sc.nextLine());
        System.out.println("Vizsgaeredmény:");
        double results = Double.parseDouble(sc.nextLine());
        LocalDate dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        Person person = new Person(name, dateOfBirth, zipCode, results);

        exam.addPerson(person);

        System.out.println(exam.getPersonsApplied().get(0).toString());
    }
}
