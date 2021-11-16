package introexceptionwritefiletestjunit4;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ElectricityTest {
    Electricity electricity = new Electricity();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void testElectricity() throws IOException {
        Path path = temp.newFile("streets.txt").toPath();
        System.out.println(path);

        electricity.addData("2021-11-10", "Endrődi utca");
        electricity.addData("2021-11-12", "Széchenyi utca");
        electricity.addData("2021-12-05", "Kossuth utca");

        electricity.writeStreets(path);
        List<String> finalFile = Files.readAllLines(path);
        List<String> testResult = Arrays.asList("2021-11-10: Endrődi utca", "2021-11-12: Széchenyi utca", "2021-12-05: Kossuth utca");

        assertEquals(testResult, finalFile);
    }
}
