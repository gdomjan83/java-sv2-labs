package schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        if (!isEmpty(studentName)) {
            this.studentName = studentName;
        }
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    @Override
    public String toString() {
        return studentName + " - " + studyAverage;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Name of student can not be null or empty.");
        }
        return false;
    }
}
