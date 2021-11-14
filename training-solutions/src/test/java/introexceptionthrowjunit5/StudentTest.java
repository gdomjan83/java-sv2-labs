package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    public Student student = new Student();

    @Test
    public void testStudent() {
        student.addNote(3);
        student.addNote(4);
        assertEquals(2, student.getMarks().size());
        assertEquals(3, student.getMarks().get(0));
    }

    @Test
    public void testStudent2() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}
