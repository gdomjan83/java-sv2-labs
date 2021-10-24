package looptypes;

import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        for (String name: students) {
            if (name.length() <= 10) {
                System.out.println(name + " - Csoport: " + 1);
            } else {
                System.out.println(name + " - Csoport: " + 2);
            }
        }
    }
}
