package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Domján Gábor");
        students.add(student1);
        Student student2 = new Student("Kandó Kata");
        students.add(student2);
        Student student3 = new Student("Zaránd Alina");
        students.add(student3);
        Student student4 = new Student("Keller Tamás");
        students.add(student4);
        System.out.println("Felvett hallgatók: " + students.size());

        student2.setActive(false);
        student4.setActive(false);

        List<Student> inactiveList = new ArrayList<>();
        for (Student item: students) {
            if (item.getActive() == false) {
                inactiveList.add(item);
            }
        }
        students.removeAll(inactiveList);
        System.out.println("Végzett hallgatók: " + students.size());
    }
}
