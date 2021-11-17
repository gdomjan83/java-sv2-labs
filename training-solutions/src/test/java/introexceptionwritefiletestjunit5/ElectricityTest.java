package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    Electricity electricity = new Electricity();

    @TempDir
    File tempDir;

    @Test
    public void testElectricity() throws IOException {
        Path path = tempDir.toPath().resolve("streets.text");
        System.out.println(path);

        electricity.addData("2021-11-10", "Endrődi utca");
        electricity.addData("2021-11-12", "Széchenyi utca");
        electricity.addData("2021-12-05", "Kossuth utca");

        electricity.writeStreets(path);
        List<String> testResult = Arrays.asList("2021-11-10: Endrődi utca", "2021-11-12: Széchenyi utca", "2021-12-05: Kossuth utca");
        List<String> writtenLines = Files.readAllLines(path);
        assertEquals(testResult, writtenLines);
    }
}
