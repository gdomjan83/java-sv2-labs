package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (!isEmpty(name)) {
            this.name = name;
        }
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject actual : taughtSubjects) {
            if (subject.getSubjectName().equals(actual.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty or null.");
        }
        return false;
    }
}
