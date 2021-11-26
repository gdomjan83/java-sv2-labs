package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> family;

    public Family() {
        this.family = new ArrayList<>();
    }

    public List<FamilyMember> getFamily() {
        return family;
    }

    public void addFamilyMember(FamilyMember member) {
        family.add(member);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName) {
        List<Integer> ages = new ArrayList<>();
        for (FamilyMember actual : family) {
            filterAgeByName(firstName, ages, actual);
        }
        return ages;
    }

    private void filterAgeByName(String firstName, List<Integer> ages, FamilyMember member) {
        String[] names = member.getName().split(" ");
        for (int i = 1; i < names.length; i++) {
            if (firstName.equals(names[i])) {
                ages.add(member.getAge());
            }
        }
    }
}
