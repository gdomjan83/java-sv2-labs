package introexceptioncause;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints tracking = new TrackPoints();

        try {
            tracking.calculateElevation(tracking.readFile("src/main/resources/tracking.csv"));
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }
}
