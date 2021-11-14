package introexceptionthrowjunit5;

public class Tank {
    private int angle = 0;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        if (Math.abs(angle + angleNumber) > 80) {
            throw new IllegalArgumentException("New angle would exceed 80 degrees");
        } else {
            angle += angleNumber;
        }
    }
}
