package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (!isEmpty(name)) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        checkValidGrade(mark);
        marks.add(mark);
    }

    public double calculateAverage() {
        if (marks.size() == 0) {
            return 0.0;
        } else {
            double sum = 0d;
            for (Mark actual : marks) {
                sum += actual.getMarkType().getMarkNumber();
            }
            return Double.parseDouble(String.format(Locale.US, "%.2f", sum / marks.size()));
        }
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0d;
        int size = 0;
        for (Mark actual : marks) {
            if (subject.getSubjectName().equals(actual.getSubject().getSubjectName())) {
                sum += actual.getMarkType().getMarkNumber();
                size++;
            }
        }
        if (size == 0) {
            return 0.0;
        } else {
            return Double.parseDouble(String.format(Locale.US, "%.2f", sum / size));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " marks:");
        for (Mark m : marks) {
            sb.append(" " + m.getSubject().getSubjectName() + ": " + m.toString());
        }
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        return false;
    }

    private void checkValidGrade(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
    }
}
