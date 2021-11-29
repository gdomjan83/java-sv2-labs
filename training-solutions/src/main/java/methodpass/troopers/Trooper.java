package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position = new Position(0, 0);

    public Trooper(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position targetPosition) {
        if (targetPosition == null) {
            throw new IllegalArgumentException("Position doesn't exist.");
        }
        position = new Position(targetPosition.getPosX(), targetPosition.getPosY());
    }

    public double distanceFrom(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Position doesn't exist.");
        }
        return position.distanceFrom(target);
    }

}
