package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(30.5, true);

        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int distanceWhole = (int)distance.getDistanceInKm();
        System.out.println(distanceWhole);
    }
}
