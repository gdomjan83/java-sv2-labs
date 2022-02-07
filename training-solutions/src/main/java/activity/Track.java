package activity;

import java.util.ArrayList;
import java.util.Comparator;
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
