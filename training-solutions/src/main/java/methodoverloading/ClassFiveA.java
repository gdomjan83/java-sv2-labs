package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Domján Gábor", "Kis Antal", "Kiss József", "Tóth Alina");

    public String getTodayReferringStudent(int number) {
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.ordinal());
    }

    public String getTodayReferringStudent(String numberName) {
        return students.get(Number.valueOf(numberName.toUpperCase()).ordinal());
    }
}
