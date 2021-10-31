package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Domján Gábor", "JAVA programozó", 900000);

        System.out.println(employee.toString());
    }
}
