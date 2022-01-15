package sorting;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return p1.getReservedTime().compareTo(p2.getReservedTime());
    }
}
