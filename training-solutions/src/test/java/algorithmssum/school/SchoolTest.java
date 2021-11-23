package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        School school = new School();

        List<Integer> headcounts = Arrays.asList(25, 32, 18, 26);
        int total = school.getNumberOfStudents(headcounts);

        assertEquals(101, total);
    }
}
