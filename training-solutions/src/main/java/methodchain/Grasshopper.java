package methodchain;

public class Grasshopper {
    private int position;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce (Direction direction) {
        switch(direction) {
            case POSITIVE:
                position++;
                return this;
            case NEGATIVE:
                position--;
                return this;
            default:
                return this;
        }
    }

    public void moveFromZeroToThreeWithFiveHops() {
        this.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
    }
}
