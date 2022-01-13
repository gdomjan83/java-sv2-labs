package collectionsmap;

import java.util.*;

public class Casting {
    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        Map<Integer, String> sortedMap = new TreeMap<>(applicants);
        for (Integer actual : sortedMap.keySet()) {
            if (actual > lastNumber) {
                return applicants.get(actual);
            }
        }
        throw new IllegalStateException("No more applicants.");
    }
}
