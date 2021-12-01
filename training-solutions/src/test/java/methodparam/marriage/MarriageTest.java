package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    Marriage marriage = new Marriage();

    @Test
    void testMarriage() {
        Man man = new Man("Horváth Ádám");
        Woman woman = new Woman("Kiss Gabriella");

        marriage.getMarried(woman, man);
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(0).getDate());

        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(0).getDate());
        assertEquals("Horváth-Kiss Gabriella", woman.getName());
    }


}