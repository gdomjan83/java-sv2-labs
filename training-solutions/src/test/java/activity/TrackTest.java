package activity;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class TrackTest {

    public Track track = new Track();

    @Test
    public void testAddItemGetPoinsts() {
        assertEquals(0, track.getTrackPoints().size());
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        assertEquals(1, track.getTrackPoints().size());
        assertEquals(34.89, track.getTrackPoints().get(0).getCoordinate().getLongitude());
    }

    @Test
    public void testFullElevation() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 200));

        assertEquals(201.0, track.getFullElevation());
    }

    @Test
    public void testFullDecrese() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 200));

        assertEquals(124.0, track.getFullDecrease());
    }

    @Test
    public void testGetDistance() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertTrue(track.getDistance() > 13611579.56 && track.getDistance() < 13611579.66);
    }

    @Test
    public void testFindMinimumCoordinate() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertEquals(-12.5, track.findMinimumCoordinate().getLatitude());
        assertEquals(-42.789, track.findMinimumCoordinate().getLongitude());
    }

    @Test
    public void testFindMaximumCoordinate() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertEquals(13.7, track.findMaximumCoordinate().getLatitude());
        assertEquals(45.7, track.findMaximumCoordinate().getLongitude());
    }

    @Test
    public void testGetRectangleArea() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertEquals(2318.4118, track.getRectangleArea());
    }

    @Test
    public void testLoadFromGpxError() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> track.loadFromGpx(Paths.get("src/test/resources/trac0101k.gpx")));
        assertEquals("Can not read file.", iae. getMessage());
    }

    @Test
    public void testLoadFromGpx() {
        track.loadFromGpx(Paths.get("src/test/resources/track.gpx"));

        assertEquals(2801, track.getTrackPoints().size());
        assertEquals(18.541194, track.getTrackPoints().get(0).getCoordinate().getLongitude(), 0.000005);
        assertEquals(47.218102, track.getTrackPoints().get(0).getCoordinate().getLatitude(), 0.000005);
        assertEquals(134.2, track.getTrackPoints().get(0).getElevation(), 0.05);
    }
}