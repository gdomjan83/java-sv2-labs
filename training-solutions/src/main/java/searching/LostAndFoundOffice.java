package searching;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {
    private List<LostProperty> properties = new ArrayList<>();

    public List<LostProperty> getProperties() {
        return properties;
    }

    public void addProperty(LostProperty property) {
        properties.add(property);
    }

    public LostProperty findLostProperty(LostProperty property) {
        int index = Collections.binarySearch(properties, property);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return properties.get(index);
    }
}
