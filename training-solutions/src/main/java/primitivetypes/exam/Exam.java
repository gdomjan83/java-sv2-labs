package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> personsApplied = new ArrayList<>();

    public List<Person> getPersonsApplied() {
        return personsApplied;
    }

    public void addPerson(Person person) {
        this.personsApplied.add(person);
    }
}
