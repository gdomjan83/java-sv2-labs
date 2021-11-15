package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {
    public List<String> readFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }
    }

    public void calculateElevation(List<String> gpsData) {
        int delta = 0;
        for (int i = 1; i < gpsData.size(); i++) {
            delta = getElevationFromGPS(gpsData.get(i)) - getElevationFromGPS(gpsData.get(i - 1));
            System.out.println(delta);
        }
    }

    private int getElevationFromGPS(String data) {
        return Integer.parseInt(data.split(";")[2]);
    }
}
