package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        boolean neptuneEqual = false;
        boolean omEqual = false;

        if (student.getNeptuneCode().equals(anotherStudent.getNeptuneCode())) {
            neptuneEqual = true;
        }
        if (student.getOmID().equals(anotherStudent.getOmID())) {
            omEqual = true;
        }

        return neptuneEqual && omEqual;
    }
}
