package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Domján Gábor", 2022, 600000);

        System.out.println("Név: " + employee.getName());
        System.out.println("Belépés éve : " + employee.getHiringYear());
        System.out.println("Bér : " + employee.getSalary() + " Ft");

        employee.raiseSalary(100000);
        System.out.println("Bér : " + employee.getSalary() + " Ft");

        System.out.println(employee.toString());
    }
}
