package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroupMain {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();

        List<String> students = Arrays.asList("Tóth Géza", "Domján Gábor", "Ignácz Veronika", "Kis Judit");
        group.printStudyGroups(students);
    }
}
