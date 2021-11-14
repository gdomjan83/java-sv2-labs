package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    Student student = new Student();

    @Test
    public void testAddNote() {
        student.addNote(4);
        student.addNote(2);
        assertEquals(2, student.getMarks().size());
        assertEquals(4, student.getMarks().get(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testException1() {
        student.addNote(6);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testException2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        student.addNote(0);
    }

    @Test
    public void testException3() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }



}
