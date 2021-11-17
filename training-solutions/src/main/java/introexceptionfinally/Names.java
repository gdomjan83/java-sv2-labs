package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public void writeFirstDoctor(Path path) {
        try {
            List<String> nameList = Files.readAllLines(path);
            System.out.println(firstDoctor(nameList));
        }
        catch (IOException ioe) {
            System.out.println("Cannot read file");
        }
        finally {
            System.out.println("End of reading.");
        }
    }

    private String firstDoctor(List<String> names) {
        for (String actual : names) {
            if (actual.startsWith("dr")) {
                return actual;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Names names = new Names();

        names.writeFirstDoctor(Paths.get("src/main/resources/names.txt"));
        names.writeFirstDoctor(Paths.get("src/main/resources/names2.txt"));
        names.writeFirstDoctor(Paths.get("src/main/resources/name2s2.txt"));
    }
}
