package enumtype.solarsystem;

public enum SolarSystem {
    MERCURY(2), VENUS(1), EARTH(1), MARS(3), JUPITER(4), SATURN(5), URANUS(2), NEPTUNE(2);

    private final int value;

    SolarSystem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
