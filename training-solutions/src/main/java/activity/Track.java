package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public Coordinate findMaximumCoordinate() {
        return new Coordinate(getMaxLatitude(), getMaxLongitude());
    }

    public Coordinate findMinimumCoordinate() {
        return new Coordinate(getMinLatitude(), getMinLongitude());
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            sum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));
        }
        return sum;
    }

    public double getFullDecrease() {
        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double diff = trackPoints.get(i).getElevation() - trackPoints.get(i + 1).getElevation();
            sum += (diff > 0 ? diff : 0);
        }
        return sum;
    }

    public double getFullElevation() {
        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double diff = trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            sum += (diff > 0 ? diff : 0);
        }
        return sum;
    }

    public double getRectangleArea() {
        double sideA = getMaxLatitude() - getMinLatitude();
        double sideB = getMaxLongitude() - getMinLongitude();
        return sideA * sideB;
    }

    public void loadFromGpx(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                readLine(line, br);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        }
    }

    private void readLine(String line, BufferedReader br) throws IOException {
        if (line.contains("<trkpt")) {
            String[] lineSplit = line.split("\"");
            Coordinate coordinate = new Coordinate(Double.parseDouble(lineSplit[1]), Double.parseDouble(lineSplit[3]));
            line = br.readLine();
            double elevation = Double.parseDouble(line.split(">")[1].split("<")[0]);
            addTrackPoint(new TrackPoint(coordinate, elevation));
        }
    }

    private double getMaxLatitude() {
        return trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .max()
                .orElseThrow(() -> new IllegalStateException("No coordianates found."));
    }

    private double getMinLatitude() {
        return trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .min()
                .orElseThrow(() -> new IllegalStateException("No coordianates found."));
    }

    private double getMaxLongitude() {
        return trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .max()
                .orElseThrow(() -> new IllegalStateException("No coordianates found."));
    }

    private double getMinLongitude() {
        return trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .min()
                .orElseThrow(() -> new IllegalStateException("No coordianates found."));
    }

}
