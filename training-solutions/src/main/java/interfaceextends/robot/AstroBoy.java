package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public void walkTo(Point position) {
        setNewPositionAndAddToPath(position);
    }

    public void flyTo(Point position){
        setNewPositionAndAddToPath(position);
    }

    @Override
    public void moveTo(Point position) {
        setNewPositionAndAddToPath(position);
    }

    @Override
    public void liftTo(long altitude) {
        Point newPosition = new Point(position.getX(), position.getY(), altitude);
        setNewPositionAndAddToPath(newPosition);
    }

    @Override
    public void fastMoveTo(Point position) {
        Point newPosition = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        setNewPositionAndAddToPath(newPosition);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
    }

    private void setNewPositionAndAddToPath(Point position) {
        this.position = position;
        path.add(position);
    }
}
