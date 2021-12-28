package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {
    Vaccine vaccine;
    List<Person> registrated;

    @BeforeEach
    public void setUpData() {
        registrated = new ArrayList<>(Arrays.asList(
            new Person("Kiss József", 45, ChronicDisease.NO, Pregnancy.NO),
            new Person("Nagy Eleonóra", 35, ChronicDisease.NO, Pregnancy.YES),
            new Person("Szép Virág", 65, ChronicDisease.YES, Pregnancy.NO),
            new Person("Németh Béla", 72, ChronicDisease.NO, Pregnancy.NO),
            new Person("Gárdos Géza", 25, ChronicDisease.YES, Pregnancy.NO),
            new Person("Szabó Veronika", 32, ChronicDisease.NO, Pregnancy.NO),
            new Person("Vedres Károly", 53, ChronicDisease.NO, Pregnancy.NO),
            new Person("Ökrös Gizella", 33, ChronicDisease.NO, Pregnancy.YES),
            new Person("Fekete Dávid", 62, ChronicDisease.NO, Pregnancy.NO),
            new Person("Bíró Rita", 29, ChronicDisease.NO, Pregnancy.NO),
            new Person("Baráth Zita", 58, ChronicDisease.YES, Pregnancy.NO),
            new Person("Kovács Tamás", 42, ChronicDisease.YES, Pregnancy.NO),
            new Person("Török István", 81, ChronicDisease.NO, Pregnancy.NO),
            new Person("Fehér Ágnes", 34, ChronicDisease.YES, Pregnancy.YES),
            new Person("Bánkuti Bendegúz", 93, ChronicDisease.YES, Pregnancy.NO)
        ));
    }

    @Test
    public void testFirstVaccine() {
//        Expected order:
//                new Person("Nagy Eleonóra", 35, ChronicDisease.NO, Pregnancy.YES),
//                new Person("Ökrös Gizella", 33, ChronicDisease.NO, Pregnancy.YES),
//                new Person("Fehér Ágnes", 34, ChronicDisease.YES, Pregnancy.YES),
//                new Person("Németh Béla", 72, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Török István", 81, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Bánkuti Bendegúz", 93, ChronicDisease.YES, Pregnancy.NO),
//                new Person("Kiss József", 45, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Szép Virág", 65, ChronicDisease.YES, Pregnancy.NO),
//                new Person("Gárdos Géza", 25, ChronicDisease.YES, Pregnancy.NO),
//                new Person("Szabó Veronika", 32, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Vedres Károly", 53, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Fekete Dávid", 62, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Bíró Rita", 29, ChronicDisease.NO, Pregnancy.NO),
//                new Person("Baráth Zita", 58, ChronicDisease.YES, Pregnancy.NO),
//                new Person("Kovács Tamás", 42, ChronicDisease.YES, Pregnancy.NO),
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals(15, vaccine.getVaccinationList().size());
        assertEquals("Nagy Eleonóra", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Németh Béla", vaccine.getVaccinationList().get(3).getName());
        assertEquals("Kiss József", vaccine.getVaccinationList().get(6).getName());
    }

    @Test
    public void testSecondVaccine() {
//      Expected order:
//        new Person("Kiss József", 45, ChronicDisease.NO, Pregnancy.NO),
//        new Person("Szabó Veronika", 32, ChronicDisease.NO, Pregnancy.NO),
//        new Person("Vedres Károly", 53, ChronicDisease.NO, Pregnancy.NO),
//        new Person("Fekete Dávid", 62, ChronicDisease.NO, Pregnancy.NO),
//        new Person("Bíró Rita", 29, ChronicDisease.NO, Pregnancy.NO),
//        new Person("Németh Béla", 72, ChronicDisease.NO, Pregnancy.NO),
//        new Person("Török István", 81, ChronicDisease.NO, Pregnancy.NO)
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals(7, vaccine.getVaccinationList().size());
        assertEquals("Kiss József", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Németh Béla", vaccine.getVaccinationList().get(5).getName());
    }
}