package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }

    public void writeNames(List<String> names) {
        for (String actual : names) {
            if ("Nemecsek Ernő".equals(actual)) {
                System.out.println(actual.toLowerCase());
            } else {
                System.out.println(actual);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys boys = new PaulStreetBoys();

        try {
            boys.writeNames(boys.readFile("src/main/resources/palutcaifiuk.txt"));
        }
        catch (IllegalStateException ise) {
            System.out.println("Can not read file.");
            ise.getCause().printStackTrace();
        }
    }
}
