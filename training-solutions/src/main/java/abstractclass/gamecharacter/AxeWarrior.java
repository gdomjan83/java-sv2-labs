package abstractclass.gamecharacter;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position) {
        super(position);
    }

    private int getActualSecondaryDamage() {
        int maxPrimary = getActualPrimaryDamage() * 2;
        return getRandom().nextInt(1, maxPrimary + 1);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().distance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
