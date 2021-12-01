package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {
    Man man = new Man("Kiss Zoltán");

    @Test
    void testCreate() {
        assertEquals("Kiss Zoltán", man.getName());
    }

    @Test
    void testAddingDate() {
        RegisterDate date1 = new RegisterDate("születési dátum", LocalDate.of(1983, 12, 9));
        RegisterDate date2 = new RegisterDate("halálozási dátum", LocalDate.of(2070, 11, 1));
        man.addDate(date1);
        man.addDate(date2);

        assertEquals(2, man.getRegisterDates().size());
        assertEquals("halálozási dátum", man.getRegisterDates().get(1).getDescription());
    }
}