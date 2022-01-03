package exception.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    Measurement measurement = new Measurement();

    @Test
    void testReadFromFileSuccess() {
        List<String> result = measurement.readFromFile(Paths.get("src/test/resources/measurementdata.csv"));
        assertEquals(11, result.size());
        assertEquals("4,12.4,JohnDoe", result.get(4));
    }

    @Test
    void testReadFromFileError() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(Paths.get("src/test/resources/measure232mentdata.csv")));
        assertEquals("Can't read file.", ise.getMessage());
    }

    @Test
    void testValidateRight() {
        List<String> input = measurement.readFromFile(Paths.get("src/test/resources/measurementdatacorrect.csv"));
        List<String> result = measurement.validate(input);
        assertEquals(0, result.size());
    }

    @Test
    void testValidateWrong() {
        List<String> input = measurement.readFromFile(Paths.get("src/test/resources/measurementdata.csv"));
        List<String> result = new ArrayList<>();
        result.add("Line 2: Incorrect number of input parameters.");
        result.add("Line 3: Order number is not a number.");
        result.add("Line 4: Measurement is not a number.");
        result.add("Line 5: Name in incorrect format.");
        result.add("Line 7: Order number is not a number.");
        result.add("Line 7: Measurement is not a number.");
        result.add("Line 8: Measurement is not a number.");
        result.add("Line 9: Incorrect number of input parameters.");
        result.add("Line 10: Incorrect number of input parameters.");
        assertEquals(input, result);
    }
}