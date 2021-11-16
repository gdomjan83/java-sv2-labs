package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> oldFormat;
    private List<String> newFormat = new ArrayList<>();

    public void readFile(Path path) {
        try {
            oldFormat = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public void convertToNewFormat() {
        for (String actual : oldFormat) {
            addLines(actual.split(";")[2] + ": " +  actual.split(";")[1]);
        }
    }

    public void writeFile(Path path) {
        try {
            Files.write(path, newFormat);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Write error.", ioe);
        }
    }

    private void addLines(String line) {
        newFormat.add(line);
    }

}
