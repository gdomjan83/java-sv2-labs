package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public List<String> readCodes(String fileName) throws IOException {
        List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get(fileName)));
        List<String> neptunCodes = new ArrayList<>();

        for (String actual : fileContent) {
            neptunCodes.add(actual.substring(actual.indexOf(",") + 1));
        }
        return neptunCodes;
    }

    public static void main(String[] args) {
        Neptun neptun = new Neptun();

        try {
            System.out.println(neptun.readCodes("src/main/resources/neptun.csv"));
        }
        catch (IOException ioe) {
            System.out.println("File not found");
        }
    }
}
