package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Texture2D;

/**
 * Links everything a stage can use, from objects to units.
 */
public abstract class StageEntity {
    public int type = -1;
    protected int[] drawData; //Effectively final, but better off initialized on top constructor
    protected Texture2D[] drawTexture; //Effectively final, but better off initialized on top constructor
}
