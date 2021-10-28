package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        for (SolarSystem c: SolarSystem.values()) {
            System.out.println(c + "- holdak száma: " + c.getValue());
        }
    }
}
