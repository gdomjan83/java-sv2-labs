package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    List<String> data = new ArrayList<>();

    public void addData(String date, String streetName) {
        data.add(date + ": " + streetName);
    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, data);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Write error.", ioe);
        }
    }
}
