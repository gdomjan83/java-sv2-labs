package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> people;

    public PrimarySchool(List<Person> person) {
        this.people = person;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person actual : people) {
            if (actual.getAge() >= 6 && actual.getAge() <= 14) {
                students.add(new Student(actual.getName(), actual.getAddress()));
            }
        }
        return students;
    }
}
