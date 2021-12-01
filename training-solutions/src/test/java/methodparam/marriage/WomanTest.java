package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    Woman woman = new Woman("Kiss Jolán");

    @Test
    void testCreate() {
        assertEquals("Kiss Jolán", woman.getName());
    }

    @Test
    void testAddingDate() {
        RegisterDate date1 = new RegisterDate("születési dátum", LocalDate.of(1983, 12, 9));
        RegisterDate date2 = new RegisterDate("halálozási dátum", LocalDate.of(2070, 11, 1));
        woman.addDate(date1);
        woman.addDate(date2);

        assertEquals(2, woman.getRegisterDates().size());
        assertEquals("halálozási dátum", woman.getRegisterDates().get(1).getDescription());
    }

    @Test
    void testSetName() {
        woman.setName("Nagy Gabriella");
        assertEquals("Nagy Gabriella", woman.getName());
    }

}