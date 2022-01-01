package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        checkForNullInput(subject, tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        checkForNullInput(subject, tutor);
        if (!isEmpty(markType)) {
            this.markType = findMarkType(markType);
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", markType.getMarkText(), markType.getMarkNumber());
    }

    private MarkType findMarkType(String markType) {
        for (MarkType actual : MarkType.values()) {
            if (markType.equals(actual.getMarkText())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Mark does not exist with this name.");
    }

    private void checkForNullInput(Subject subject, Tutor tutor)  {
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Mark can not be empty or null.");
        }
        return false;
    }
}
