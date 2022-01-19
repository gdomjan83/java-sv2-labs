package streamsalgorithms;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int dateOfBirth;

    public Employee(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Domján Gábor", 1983),
                new Employee("Kandó Kata", 1996),
                new Employee("Bodnár Gabriella", 1968),
                new Employee("Domján Zoltán", 1986)
        );

        int sumDate = employees.stream()
                .map(emp -> emp.getDateOfBirth())
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum of dates: " + sumDate);

        int sumAge = employees.stream()
                .map(emp -> LocalDate.now().getYear() - emp.getDateOfBirth())
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum of ages: " + sumAge);

        long countEmployees = employees.stream()
                .count();
        System.out.println("Count of employees: " + countEmployees);

        long countAge = employees.stream()
                .filter(emp -> emp.getDateOfBirth() < 1990)
                .count();
        System.out.println("Count employees born before 1990: " + countAge);

        OptionalInt oldestDate = employees.stream()
                .sorted((o1, o2) -> o1.getDateOfBirth() - o2.getDateOfBirth())
                .map(emp -> emp.getDateOfBirth())
                .mapToInt(i -> i)
                .findFirst();
        System.out.println("First born date: " + oldestDate.getAsInt());

        Optional oldestName = employees.stream()
                .sorted((o1, o2) -> o1.getDateOfBirth() - o2.getDateOfBirth())
                .map(emp -> emp.getName())
                .findFirst();
        System.out.println("First born name: " + oldestName.get());

        boolean isBefore1980 = employees.stream()
                .allMatch(emp -> emp.getDateOfBirth() < 1980);
        System.out.println("All born before 1980: " + isBefore1980);

        List<Employee> bornBefore1990 = employees.stream()
                .filter(emp -> emp.getDateOfBirth() < 1990)
                .collect(Collectors.toList());
        System.out.println("Born before 1990: " + bornBefore1990);

        List<String> names = employees.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toList());
        System.out.println("Names : " + names);

        List<String> namesBornBefore1990 = employees.stream()
                .filter(emp -> emp.getDateOfBirth() < 1990)
                .map(emp -> emp.getName())
                .collect(Collectors.toList());
        System.out.println("Names of those born before 1990: " + namesBornBefore1990);
    }
}
