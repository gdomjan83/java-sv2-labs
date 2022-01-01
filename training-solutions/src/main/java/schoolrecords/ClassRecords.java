package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (student.getName().equals(s.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        Student toRemove = findStudentToRemove(student);
        if (toRemove == null) {
            return false;
        }
        students.remove(toRemove);
        return true;
    }

    public double calculateClassAverage() {
        checkClassSizeForCalculation();
        double sum = 0d;
        for (Student s : students) {
            sum += s.calculateAverage();
        }
        checkIfMarksPresentForAverage(sum);
        return Double.parseDouble(String.format(Locale.US, "%.2f", sum / students.size()));
    }

    public double calculateClassAverageBySubject(Subject subject) {
        checkClassSizeForCalculation();
        double sum = 0d;
        int size = 0;
        for (Student s : students) {
            if (s.calculateSubjectAverage(subject) > 0.0) {
                sum += s.calculateSubjectAverage(subject);
                size++;
            }
        }
        checkIfMarksPresentForAverage(sum);
        return Double.parseDouble(String.format(Locale.US, "%.2f", sum / size));
    }

    public Student findStudentByName(String name) {
        isEmpty(name);
        checkClassSizeForSearch();
        for (Student s : students) {
            if (name.equals(s.getName())) {
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        checkClassSizeForRepetition();
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student s : students) {
            result.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        List<String> names = new ArrayList<>();
        for (Student s : students) {
            names.add(s.getName());
        }
        return String.join(", ", names);
    }

    private Student findStudentToRemove(Student student) {
        for (Student s : students) {
            if (student.getName().equals(s.getName())) {
                return s;
            }
        }
        return null;
    }

    private void checkIfMarksPresentForAverage(double sumOfMarks) {
        if (sumOfMarks == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
    }

    private void checkClassSizeForRepetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
    }

    private void checkClassSizeForCalculation() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    private void checkClassSizeForSearch() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
    }

    private boolean isEmpty(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        return false;
    }
}
