package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person p : people) {
            int pAge = p.getAge();
            if (pAge >= 18 && pAge <= 65) {
                result.add(pAge);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = new ArrayList<>(List.of(
                new Person("DG", 40),
                new Person("ZA", 32),
                new Person("GG", 16),
                new Person("LM", 50),
                new Person("RE", 70)
        ));

        Queue<Integer> vaccinatedAges = vaccination.getVaccinationOrder(people);
        System.out.println(vaccinatedAges);
        System.out.println(vaccinatedAges.poll());
    }
}
