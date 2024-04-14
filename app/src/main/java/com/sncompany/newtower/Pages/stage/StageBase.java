package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.MyOscillator;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public abstract class StageBase extends TPage {

    public static final int PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS = 310;
    public static final MyOscillator[] myOscillator = new MyOscillator[20];
    public static final int[] numberManaResource = {R.drawable.num_mana_0, R.drawable.num_mana_1, R.drawable.num_mana_2, R.drawable.num_mana_3, R.drawable.num_mana_4, R.drawable.num_mana_5, R.drawable.num_mana_6, R.drawable.num_mana_7, R.drawable.num_mana_8, R.drawable.num_mana_9};
    public static final int[] numberLifeResource = {R.drawable.num_life_0, R.drawable.num_life_1, R.drawable.num_life_2, R.drawable.num_life_3, R.drawable.num_life_4, R.drawable.num_life_5, R.drawable.num_life_6, R.drawable.num_life_7, R.drawable.num_life_8, R.drawable.num_life_9};
    public static final int[] numberMoneyResource = {R.drawable.num_money_0, R.drawable.num_money_1, R.drawable.num_money_2, R.drawable.num_money_3, R.drawable.num_money_4, R.drawable.num_money_5, R.drawable.num_money_6, R.drawable.num_money_7, R.drawable.num_money_8, R.drawable.num_money_9};
    public static final int[] uiUpperResource = {R.drawable.ui_upper_mana, R.drawable.ui_upper_money, R.drawable.ui_upper_ingameoff, R.drawable.ui_upper_ingameon, R.drawable.ui_upper_speed0, R.drawable.ui_upper_speed1, R.drawable.ui_upper_speed2, R.drawable.ui_upper_upbar, R.drawable.ui_upper_wave, R.drawable.ui_upper_slash, R.drawable.ui_upper_heart, R.drawable.ui_upper_hpbar, R.drawable.ui_upper_star, R.drawable.ui_upper_hero, R.drawable.ui_upper_speedempty, R.drawable.ui_upper_pauseoff, R.drawable.ui_upper_pauseon, R.drawable.ui_upper_bossstage};
    public static final int upper_mana = 0, upper_money = 1, upper_ingameoff = 2, upper_ingameon = 3, upper_speed0 = 4, upper_speed1 = 5, upper_speed2 = 6, upper_upbar = 7, upper_wave = 8,
            upper_slash = 9, upper_heart = 10, upper_hpbar = 11, upper_star = 12, upper_hero = 13, upper_speedempty = 14, upper_pauseoff = 15, upper_pauseon = 16, upper_bossstage = 17;
    public final Texture2D targetImage = new Texture2D(R.drawable.etc_target), backShadowImage = new Texture2D(R.drawable.etc_shadow);
    public final Texture2D[] numberManaImage = new Texture2D[numberManaResource.length], numberMoneyImage = new Texture2D[numberMoneyResource.length], numberLifeImage = new Texture2D[numberLifeResource.length],
            shadowImage = new Texture2D[2], uiUpperImage = new Texture2D[uiUpperResource.length];
    public final Texture2D[][] enemyImages = new Texture2D[DataAnim.enemyDrawResource.length][], debuffImages = new Texture2D[DataAnim.debuffDrawResource.length][], heroImages = new Texture2D[DataAnim.heroDrawResource.length][],
    towerImages = new Texture2D[DataAnim.towerDrawResource.length][];
    public final DataMap tmap;
    public final DataStage st;
    public float characterAddPosX;
    public float characterAddPosY;

    public StageBase(TPage par, DataStage stage) {
        super(par);
        st = stage;
        tmap = stage.map;

        for (int i = 0; i < 20; i++) {
            if (i < 8)
                myOscillator[i] = new MyOscillator(200, 0, 10, -10, 5);
            else if (i < 11)
                myOscillator[i] = new MyOscillator(0, 300, 10, PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
            else if (i > 11)
                myOscillator[i] = new MyOscillator(300, 0, 30, -50, 10);
            else
                myOscillator[i] = new MyOscillator(-150, 0, 15, 30, 10);
        }
    }

    @Override
    public void load(Consumer<Float> prog) {
        int lod = 3;
        int tot = numberMoneyImage.length + enemyImages.length + debuffImages.length + heroImages.length + towerImages.length + uiUpperResource.length + numberManaImage.length + numberLifeImage.length + 2;
        shadowImage[0] = new Texture2D(R.drawable.etc_sha34);
        shadowImage[1] = new Texture2D(R.drawable.etc_sha63);
        for (int i = 0; i < enemyImages.length; i++) {
            enemyImages[i] = new Texture2D[DataAnim.enemyDrawResource[i].length];
            for (int j = 0; j < enemyImages[i].length; j++)
                enemyImages[i][j] = new Texture2D(DataAnim.enemyDrawResource[i][j]);
            if (prog != null)
                prog.accept((lod++ + 1f) / tot);
        }
        for (int i = 0; i < debuffImages.length; i++) {
            debuffImages[i] = new Texture2D[DataAnim.debuffDrawResource[i].length];
            for (int j = 0; j < debuffImages[i].length; j++)
                debuffImages[i][j] = new Texture2D(DataAnim.debuffDrawResource[i][j]);
            if (prog != null)
                prog.accept((lod++ + 1f) / tot);
        }
        for (int i = 0; i < heroImages.length; i++) {
            heroImages[i] = new Texture2D[DataAnim.heroDrawResource[i].length];
            for (int j = 0; j < heroImages[i].length; j++)
                heroImages[i][j] = new Texture2D(DataAnim.heroDrawResource[i][j]);
            if (prog != null)
                prog.accept((lod++ + 1f) / tot);
        }
        for (int i = 0; i < towerImages.length; i++) {
            towerImages[i] = new Texture2D[DataAnim.towerDrawResource[i].length];
            for (int j = 0; j < towerImages[i].length; j++)
                towerImages[i][j] = new Texture2D(DataAnim.towerDrawResource[i][j]);
            if (prog != null)
                prog.accept((lod++ + 1f) / tot);
        }
        lod = loadP(uiUpperImage, uiUpperResource, prog, lod, tot);
        lod = loadP(numberMoneyImage, numberMoneyResource, prog, lod, tot);
        lod = loadP(numberManaImage, numberManaResource, prog, lod, tot);
        lod = loadP(numberManaImage, numberManaResource, prog, lod, tot);

        loaded = true;
    }

    public boolean getAddSettingPosition() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x < 62.0f || firstLastActionTouch.y - 25.0f < 30.0f || firstLastActionTouch.x >= 737.0f || firstLastActionTouch.y - 25.0f >= Texture2D.VIEW_SCRHEIGHT) {
            characterAddPosX = firstLastActionTouch.x;
            characterAddPosY = firstLastActionTouch.y - 25.0f;
            return false;
        }
        int bX = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int bY = (int) (((firstLastActionTouch.y - 25.0f) - 30.0f) / 45.0f);
        characterAddPosX = (bX * 45) + 62 + 22;
        characterAddPosY = (bY * 45) + 30 + 22;
        if (tmap.mapTileData[bX][bY] != -1)
            return false;

        for (TowerUnit twu : st.towerUnit)
            if (twu.blockX == bX || twu.blockY == bY)
                return false;

        for (ObjectUnit obj : st.map.objectUnit) {
            if (!obj.dead()) {
                int sX = (obj.posX / 50) / 45;
                int sY = (obj.posY / 50) / 45;
                if (obj.blockSize == 0) {
                    if (bX == sX && bY == sY)
                        return false;
                } else if (obj.blockSize == 1) {
                    if (bX == sX && bY >= sY - 1 && bY <= sY)
                        return false;
                } else if (obj.blockSize == 2) {
                    if (bX >= sX - 1 && bX <= sX && bY >= sY - 1 && bY <= sY)
                        return false;
                } else if (obj.blockSize == 3) {
                    if (bX >= sX && bX <= sX + 1 && bY >= sY - 1 && bY <= sY + 1)
                        return false;
                } else if (obj.blockSize == 4) {
                    if (bX >= sX + 1 && bX <= sX + 2 && bY >= sY + 1 && bY <= sY + 3)
                        return false;
                } else if (obj.blockSize == 5) {
                    if (bX >= sX + 1 && bX <= sX + 3 && bY >= sY + 1 && bY <= sY + 2)
                        return false;
                }
            }
        }
        return true;
    }

    public void drawAllUnit(GL10 gl10) {
        int i;
        int uInd = 0, mInd = 0, oInd = 0;
        int nextDrawObject = getNextDrawObject(uInd, mInd, oInd);
        while (nextDrawObject != -1) {
            if (nextDrawObject == 0)
                st.monsterUnit.get(mInd++).draw();
            else if (nextDrawObject == 1)
                st.towerUnit.get(uInd++).draw();
            else
                tmap.objectUnit.get(oInd++).draw();
            nextDrawObject = getNextDrawObject(uInd, mInd, oInd);
        }
        for (int i2 = 0; i2 < st.arrowUnit.size(); i2++)
            if (st.arrowUnit.get(i2).type != -1)
                st.arrowUnit.get(i2).drawArrowUnit();
        for (i = 0; i < st.effectUnit.size(); i++)
            if (st.effectUnit.get(i).effectType != -1)
                st.effectUnit.get(i).drawEffectUnit();
    }

    public int getNextDrawObject(int uInd, int mInd, int oInd) {
        int high = -1, poS = Integer.MIN_VALUE;
        if (oInd < tmap.objectUnit.size()) {
            high = 2;
            poS = tmap.objectUnit.get(oInd).posY;
        }
        if (uInd < st.towerUnit.size() && st.towerUnit.get(uInd).posY >= poS) {
            high = 1;
            poS = st.towerUnit.get(uInd).posY;
        }
        if (mInd < st.monsterUnit.size() && st.monsterUnit.get(mInd).posY >= poS)
            high = 0;
        return high;
    }

    public void drawMapTile(GL10 gl10) {
        for (int x = 0; x < 15; x++)
            for (int y = 0; y < 10; y++)
                if (tmap.mapTileData[x][y] != -1)
                    tmap.backTileOldImage[tmap.mapTileData[x][y]].drawAtPointOption((x * 45) + 62, (y * 45) + 30, 18);
    }

    public void drawBaseHealth() {
        int x;
        int y;
        if (GameThread.mapEndDirection[0] == 203)
            x = (GameThread.mapEndPosition[0][0] * 45) + 62 + 45;
        else if (GameThread.mapEndDirection[0] == 208)
            x = (GameThread.mapEndPosition[0][0] * 45) + 62 + 22;
        else {
            x = (GameThread.mapEndPosition[0][0] * 45) + 62 + 22;
            y = (GameThread.mapEndPosition[0][1] * 45) + 30;
            uiUpperImage[9].drawAtPointOption(x, (float) (y - 1), 17);
            uiUpperImage[10].drawAtPointOption((float) (x - 37), y, 18);
            GameRenderer.drawNumberBlock(st.Life, numberLifeImage, (float) (x - 2), y, -1, 20, 2);
            GameRenderer.drawNumberBlock(DataStage.maxLife, numberLifeImage, x + 2, y, -1, 18, 2);
        }
        y = ((GameThread.mapEndPosition[0][1] * 45) + 30) - 22;
        uiUpperImage[9].drawAtPointOption(x, (float) (y - 1), 17);
        float f2 = y;
        uiUpperImage[10].drawAtPointOption((float) (x - 37), f2, 18);
        GameRenderer.drawNumberBlock(st.Life, numberLifeImage, (float) (x - 2), f2, -1, 20, 2);
        GameRenderer.drawNumberBlock(DataStage.maxLife, numberLifeImage, x + 2, f2, -1, 18, 2);
    }
}
