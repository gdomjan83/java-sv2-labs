package abstractclass.gamecharacter;

public class Point {
    private long xPos;
    private long yPos;

    public Point(long xPos, long yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public long getXPos() {
        return xPos;
    }

    public long getYPos() {
        return yPos;
    }

    public long distance(Point point) {
        long xDistance = xPos - point.getXPos();
        long yDistance = yPos - point.getYPos();
        return (long) Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
