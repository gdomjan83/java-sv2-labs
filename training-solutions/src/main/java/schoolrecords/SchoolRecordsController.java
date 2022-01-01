package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {
    private ClassRecords classRecord;
    private List<Subject> subjectList = new ArrayList<>();
    private List<Tutor> tutorList = new ArrayList<>();

    public SchoolRecordsController(ClassRecords classRecord) {
        this.classRecord = classRecord;
    }

    public void init() {
        Subject subject1 = new Subject("Analízis");
        Subject subject2 = new Subject("Matematika");
        Subject subject3 = new Subject("Üzleti tervezés");
        Subject subject4 = new Subject("Számvitel tervezés");
        subjectList = List.of(subject1, subject2, subject3, subject4);
        tutorList = List.of(
                new Tutor("Vadvári Tibor", List.of(subject1)),
                new Tutor("Kiss Ildikó", List.of(subject2, subject3)),
                new Tutor("Hornung Tamás", List.of(subject3, subject4)));
    }

    public void showMenu() {
        System.out.println(
            "1. Diákok nevének listázása\n" +
            "2. Diák név alapján keresése\n" +
            "3. Diák létrehozása\n" +
            "4. Diák név alapján törlése\n" +
            "5. Diák feleltetése\n" +
            "6. Osztályátlag kiszámolása\n" +
            "7. Tantárgyi átlag kiszámolása\n" +
            "8. Diákok átlagának megjelenítése\n" +
            "9. Diák átlagának kiírása\n" +
            "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
            "11. Kilépés");
    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public boolean runApp(String option) {
        switch(option) {
            case "1":
                System.out.println("Diákok:");
                listNames();
                return true;
            case "2":
                System.out.println("Add meg a keresett diák nevét:");
                searchByName(getInput());
                return true;
            case "3":
                System.out.println("Add meg az új diák nevét:");
                createStudent(getInput());
                return true;
            case "4":
                System.out.println("Add meg a törölni kívánt diák nevét:");
                deleteStudent(getInput());
                return true;
            case "5":

                return true;
            case "6":
                return true;
            case "7":
                return true;
            case "8":
                return true;
            case "9":
                return true;
            case "10":
                return true;
            case "11":
                return false;
            default:
                return true;
        }
    }

    private void listNames() {
        classRecord.listStudentNames();
    }

    private void searchByName(String name) {
        System.out.println(classRecord.findStudentByName(name).toString());
    }

    private void createStudent(String name) {
        Student student = new Student(name);
        classRecord.addStudent(student);
    }

    private void deleteStudent(String name) {
        Student student = classRecord.findStudentByName(name);
        classRecord.removeStudent(student);
    }

    public static void main(String[] args) {
        SchoolRecordsController controller = new SchoolRecordsController(new ClassRecords("Gazdálkodási osztály, 12. D", new Random()));
        controller.init();
        boolean running = true;
        while (running) {
            controller.showMenu();
            running = controller.runApp(controller.getInput());
        }
    }
}
