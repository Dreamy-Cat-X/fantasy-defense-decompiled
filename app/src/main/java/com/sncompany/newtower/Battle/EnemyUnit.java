package com.sncompany.newtower.Battle;

/**
 * Superclass used to link enemies and objects.
 */
public abstract class EnemyUnit implements Comparable<EnemyUnit> {
    public int type = -1;
    public int posX;
    public int posY;

    public int unitHP;
    public int unitMaxHP;

    public boolean dead() {
        return unitHP <= 0;
    }

    public abstract boolean update();

    public abstract void hit(int dmgType, TowerUnit uni);

    public abstract void kill(TowerUnit uni);

    @Override
    public int compareTo(EnemyUnit e) {
        return Integer.compare(posY, e.posY);
    }
}
