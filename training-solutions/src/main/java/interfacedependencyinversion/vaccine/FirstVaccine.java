package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList.addAll(getPregnants(registrated));
        vaccinationList.addAll(getOld(registrated));
        vaccinationList.addAll(registrated);
    }

    private List<Person> getPregnants(List<Person> registrated) {
        List<Person> pregnants = new ArrayList<>();
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.YES) {
                pregnants.add(actual);
            }
        }
        registrated.removeAll(pregnants);
        return pregnants;
    }
    private List<Person> getOld(List<Person> registrated) {
        List<Person> old = new ArrayList<>();
        for (Person actual : registrated) {
            if (actual.getAge() > 65) {
                old.add(actual);
            }
        }
        registrated.removeAll(old);
        return old;
    }
}
