package com.sncompany.newtower.DataClasses;

/**
 * Superclass used to link enemies and objects.
 */
public abstract class EnemyUnit {
    public int type;
    public int posX;
    public int posY;

    public int unitHP;
    public int unitMaxHP;

    //public abstract void hit(int dmgType, TowerUnit uni) { ??? }

    //public abstract void kill(TowerUnit uni) { type = -1; }
}
