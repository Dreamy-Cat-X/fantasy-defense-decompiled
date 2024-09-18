package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.Pages.stage.StageBase;

/**
 * Superclass used to link enemies and objects.
 */
public abstract class EnemyUnit extends StageEntity implements Comparable<EnemyUnit> {
    public int posX;
    public int posY;

    public int unitHP;
    public int unitMaxHP;
    protected final DataStage st;

    public EnemyUnit(DataStage s) {
        st = s;
    }

    public boolean dead() {
        return unitHP <= 0;
    }

    public abstract boolean update();

    public abstract void hit(int dmgType, TowerUnit uni);

    public abstract void kill(TowerUnit uni);

    public void drawHealthBar(float f, float f2, int i, int i2) {
        int i3 = (i2 * 30) / i;
        if (i3 < 2) {
            i3 = 2;
        }
        float f3 = (int) f2;
        float f4 = ((int) f) - 15;
        st.page.uiUpperImage[StageBase.upper_hpbar].drawAtPointOptionClip(f4, f3, 18, CGRect.CGRectMake(0, 0, (float) (i3 - 1), 6));
        st.page.uiUpperImage[StageBase.upper_hpbar].drawAtPointOptionClip((f4 + i3) - 1, f3, 18, CGRect.CGRectMake(0, 0, 1, 6));
    }

    @Override
    public int compareTo(EnemyUnit e) {
        return Integer.compare(posY, e.posY);
    }
}
