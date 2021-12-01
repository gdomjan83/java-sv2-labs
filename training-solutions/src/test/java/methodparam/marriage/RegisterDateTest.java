package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {
    @Test
    void testCreate() {
        RegisterDate date = new RegisterDate("anyakönyvi kivonat", LocalDate.of(2021, 11, 30));
        assertEquals("anyakönyvi kivonat", date.getDescription());
        assertEquals(LocalDate.of(2021, 11, 30), date.getDate());
    }
}