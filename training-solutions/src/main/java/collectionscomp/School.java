package collectionscomp;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("Domján Gábor", 173));
        students.add(new Student("Zaránd Alina", 168));
        students.add(new Student("Nagy András", 180));

        System.out.println(students);

        Map<String, Integer> studentMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentMap.put("Domján Gábor", 173);
        studentMap.put("Zaránd Alina", 168);
        studentMap.put("Nagy András", 180);

        System.out.println(studentMap);
    }
}
