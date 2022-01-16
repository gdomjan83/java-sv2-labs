package exception.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file.", ioe);
        }
    }

    public List<String> validate(List<String> input) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (!isThereThreeData(input.get(i)) || (isThereEmptyData(input.get(i)))) {
                result.add("Line " + (i + 1) + ": Incorrect number of input parameters.");
            }
            if (isThereThreeData(input.get(i)) && !hasCorrectName(input.get(i))) {
                result.add("Line " + (i + 1) + ": Name in incorrect format.");
            }
            if (!isOrderCorrect(input.get(i))) {
                result.add("Line " + (i + 1) + ": Order number is not a number.");
            }
            if (!isMeasurementCorrect(input.get(i))) {
                result.add("Line " + (i + 1) + ": Measurement is not a number.");
            }
        }
        return result;
    }

    private boolean isThereThreeData(String line) {
        String[] parts = line.split(",");
        if (parts.length != 3) {
            return false;
        }
        return true;
    }

    private boolean isThereEmptyData(String line) {
        String[] parts = line.split(",");
        for (String p : parts) {
            if (p.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasCorrectName(String line) {
        String[] parts = line.split(",");
        if (parts[2].trim().contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean isOrderCorrect(String line) {
        String[] parts = line.split(",");
        try {
            int order = Integer.parseInt(parts[0]);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isMeasurementCorrect(String line) {
        String[] parts = line.split(",");
        try {
            double measurement = Double.parseDouble(parts[1]);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
