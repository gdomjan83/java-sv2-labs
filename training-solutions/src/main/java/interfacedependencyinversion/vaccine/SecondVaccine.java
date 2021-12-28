package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList.addAll(getYoung(registrated));
        vaccinationList.addAll(getOld(registrated));
    }

    private List<Person> getYoung(List<Person> registrated) {
        List<Person> young = new ArrayList<>();
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO && actual.getAge() <= 65) {
                young.add(actual);
            }
        }
        return young;
    }

    private List<Person> getOld(List<Person> registrated) {
        List<Person> old = new ArrayList<>();
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO && actual.getAge() > 65) {
                old.add(actual);
            }
        }
        return old;
    }
}
