package junit5assert;

public class Dragon {
    private String name;
    private int numberOfHeads;
    private double heights;

    public Dragon(String name, int numberOfHeads, double heights) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.heights = heights;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public double getHeights() {
        return heights;
    }
}
