package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {
    private List<String> poemLines;

    public void readFile(String filePath) {
        try {
            poemLines = Files.readAllLines(Paths.get(filePath));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<String> getPoemLines() {
        return poemLines;
    }

    public static void main(String[] args) {
        Poem poem = new Poem();

        poem.readFile("src/main/resources/poem.txt");

        for (String line : poem.getPoemLines()) {
            System.out.print(line.charAt(0));
        }
    }
}
