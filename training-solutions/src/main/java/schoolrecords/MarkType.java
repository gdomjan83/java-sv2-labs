package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"),
    C(3, "improvement needed"), D(2, "close fail"),
    F(1, "fail");

    private final int markNumber;
    private final String markText;

    MarkType(int markNumber, String markText) {
        this.markNumber = markNumber;
        this.markText = markText;
    }

    public int getMarkNumber() {
        return markNumber;
    }

    public String getMarkText() {
        return markText;
    }
}
