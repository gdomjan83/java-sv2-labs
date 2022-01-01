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
        Subject subject4 = new Subject("Számvitel");
        subjectList = List.of(subject1, subject2, subject3, subject4);
        tutorList = List.of(
                new Tutor("Vadvári Tibor", List.of(subject1)),
                new Tutor("Kiss Ildikó", List.of(subject2, subject3)),
                new Tutor("Hornung Tamás", List.of(subject3, subject4)));
    }

    public void showMenu() {
        System.out.println(
            "\n1. Diákok nevének listázása\n" +
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
                System.out.println(listNames());
                return true;
            case "2":
                System.out.println("Add meg a keresett diák nevét:");
                System.out.println(searchByName(getInput()));
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
                doRepetition();
                return true;
            case "6":
                System.out.print("Osztályátlag: ");
                System.out.print(calculateClassAverage());
                return true;
            case "7":
                System.out.println("Melyik tantárgy átlagát szeretnéd látni?");
                System.out.println(calculateSubjectAverage(getInput()));
                System.out.println("Tantárgy átlag:");
                return true;
            case "8":
                studyResults();
                return true;
            case "9":
                System.out.println("Melyik diák átlagát szeretnéd látni?");
                System.out.println(studentAverage(getInput()));
                return true;
            case "10":
                System.out.println("Melyik diák átlagát szeretnéd látni?");
                System.out.println(studentSubjectAverage(getInput()));
                return true;
            case "11":
                return false;
            default:
                return true;
        }
    }

    private String listNames() {
        return classRecord.listStudentNames();
    }

    private String searchByName(String name) {
        return classRecord.findStudentByName(name).toString();
    }

    private void createStudent(String name) {
        Student student = new Student(name);
        classRecord.addStudent(student);
    }

    private void deleteStudent(String name) {
        Student student = classRecord.findStudentByName(name);
        classRecord.removeStudent(student);
    }

    private void doRepetition() {
        Student student = classRecord.repetition();
        System.out.println("Felelő diák: " + student.getName());
        System.out.println("Felelés eredménye (A-B-C-D-F):");
        String markValue = getInput();
        System.out.println("Oktató neve:");
        String tutor = getInput();
        System.out.println("Tantárgy neve:");
        String subject = getInput();
        Mark mark = new Mark(MarkType.valueOf(markValue), findSubjectByName(subject), findTutorByName(tutor));
        student.grading(mark);
    }

    private double calculateClassAverage() {
        return classRecord.calculateClassAverage();
    }

    private double calculateSubjectAverage(String subject) {
        return classRecord.calculateClassAverageBySubject(findSubjectByName(subject));
    }

    private void studyResults() {
        for (StudyResultByName s : classRecord.listStudyResults()) {
            System.out.println(s.toString());
        }
    }

    private double studentAverage(String name) {
        Student student = classRecord.findStudentByName(name);
        return student.calculateAverage();
    }

    private double studentSubjectAverage(String name) {
        Student student = classRecord.findStudentByName(name);
        System.out.println("Melyik tantárgy átlagát szeretnéd látni?");
        String subject = getInput();
        return student.calculateSubjectAverage(findSubjectByName(subject));
    }

    private Subject findSubjectByName(String name) {
        for (Subject s : subjectList) {
            if (name.equals(s.getSubjectName())) {
                return s;
            }
        }
        throw new IllegalArgumentException("This subject is not taught.");
    }

    private Tutor findTutorByName(String name) {
        for (Tutor t: tutorList) {
            if (name.equals(t.getName())) {
                return t;
            }
        }
        throw new IllegalArgumentException("Tutor by this name does not exist.");
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
