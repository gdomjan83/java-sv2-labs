package introexceptionreadfiletestjunit4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path) {
        for (String actual : readFile(path)) {
            if (actual.startsWith("A")) {
                return actual;
            }
        }
        return "A";
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
