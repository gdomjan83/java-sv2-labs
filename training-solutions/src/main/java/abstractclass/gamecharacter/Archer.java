package abstractclass.gamecharacter;

public class Archer extends Character {
    private static final int MAX_SECONDARY_DAMAGE = 5;
    private int numberOfArrow;

    public Archer(Point position, int numberOfArrow) {
        super(position);
        this.numberOfArrow = numberOfArrow;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public int getActualSecondaryDamage() {
        return getRandom().nextInt(1, MAX_SECONDARY_DAMAGE + 1);
    }

    private void shootingArrow(Character enemy) {
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingArrow(enemy);
    }
}
