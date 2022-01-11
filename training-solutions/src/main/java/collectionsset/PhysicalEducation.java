package collectionsset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student s : students) {
            heights.add(s.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();

        List<Student> students = Arrays.asList(
                new Student("Domján Gábor", 173),
                new Student("Domján Zoltán", 168),
                new Student("Kandó Kata", 170),
                new Student("BodnárGabriella", 167)
        );

        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
