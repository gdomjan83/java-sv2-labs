package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private static final int MAX_PRIMARY_DAMAGE = 10;
    private static final int MAX_PRIMARY_DEFENSE = 5;
    private Point position;
    private int hitPoint = 100;
    private Random random = new Random();

    public Character(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, MAX_PRIMARY_DAMAGE + 1);
    }

    private int getActualDefence() {
        return random.nextInt(MAX_PRIMARY_DEFENSE + 1);
    }

    protected void hit(Character enemy, int damage) {
        int enemyDefense = enemy.getActualDefence();
        if (enemyDefense < damage) {
            enemy.decreaseHitPoint(damage - enemyDefense);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    public abstract void secondaryAttack(Character enemy);
}
