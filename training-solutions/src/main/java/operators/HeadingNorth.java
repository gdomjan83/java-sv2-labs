package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections() {
        int turn = 0;
        int change = 0;
        for (int i = 0; i < 360; i += change) {
            change += 10;
            turn++;
        }
        return turn;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
