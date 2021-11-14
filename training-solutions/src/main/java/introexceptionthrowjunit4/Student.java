package introexceptionthrowjunit4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> marks = new ArrayList<>();

    public List<Integer> getMarks() {
        return marks;
    }

    public void addNote(int note) {
        if (note < 1 || note > 5) {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        marks.add(note);
    }
}
