package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    private List<String> source = Arrays.asList("Veszprém", "Körmend", "Zalalövő");


    public void writeFile(Path path, List<String> source) {
        try {
            Files.write(path, source);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file.", ioe);
        }
    }

    public static void main(String[] args) {
        RoadMap roadmap = new RoadMap();
        roadmap.writeFile(Paths.get("src/main/resources/roadmap.txt"), roadmap.source);
    }
}
