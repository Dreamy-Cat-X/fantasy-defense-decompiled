package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
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
    public static final int[] numberMoneyResource = {R.drawable.num_money_0, R.drawable.num_money_1, R.drawable.num_money_2, R.drawable.num_money_3, R.drawable.num_money_4, R.drawable.num_money_5, R.drawable.num_money_6, R.drawable.num_money_7, R.drawable.num_money_8, R.drawable.num_money_9};
    public final Texture2D targetImage = new Texture2D(R.drawable.etc_target), backShadowImage = new Texture2D(R.drawable.etc_shadow);
    public final Texture2D[] numberMoneyImage = new Texture2D[numberMoneyResource.length], shadowImage = new Texture2D[2];
    public final Texture2D[][] enemyImages = new Texture2D[DataAnim.enemyDrawResource.length][], debuffImages = new Texture2D[DataAnim.debuffDrawResource.length][], heroImages = new Texture2D[DataAnim.heroDrawResource.length][],
    towerImages = new Texture2D[DataAnim.towerDrawResource.length][];
    public final DataMap tmap;
    public final DataStage st;

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
        //for (int i2 = 0; i2 < 11; i2++)
        //    myOscillator[i2].fastForward();
    }

    @Override
    public void load(Consumer<Float> prog) {
        int lod = 3;
        int tot = numberMoneyImage.length + enemyImages.length + debuffImages.length + heroImages.length + towerImages.length + 2;
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
        loadP(numberMoneyImage, numberMoneyResource, prog, enemyImages.length + 1, tot);
    }

    public static void getAddSettingPosition() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x < 62.0f || firstLastActionTouch.y - 25.0f < 30.0f || firstLastActionTouch.x >= 737.0f || firstLastActionTouch.y - 25.0f >= 480.0f) {
            characterAddBoolean = false;
            characterAddPosX = firstLastActionTouch.x;
            characterAddPosY = firstLastActionTouch.y - 25.0f;
            return;
        }
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) (((firstLastActionTouch.y - 25.0f) - 30.0f) / 45.0f);
        characterAddPosX = (i * 45) + 62 + 22;
        characterAddPosY = (i2 * 45) + 30 + 22;
        if (mapTileData[i][i2] != -1) {
            characterAddBoolean = false;
            return;
        }
        for (int i3 = 0; i3 < towerUnitCount; i3++) {
            if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                characterAddBoolean = false;
                return;
            }
        }
        for (int i4 = 0; i4 < objectUnitCount; i4++) {
            if (objectUnit[i4].objectType != -1 && objectUnit[i4].objectType != -2) {
                int i5 = objectUnit[i4].blockSize;
                if (i5 == 0) {
                    int i6 = (objectUnit[i4].posX / 50) / 45;
                    int i7 = (objectUnit[i4].posY / 50) / 45;
                    if (i == i6 && i2 == i7) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 1) {
                    int i8 = (objectUnit[i4].posX / 50) / 45;
                    int i9 = (objectUnit[i4].posY / 50) / 45;
                    int i10 = i9 - 1;
                    if (i == i8 && i2 >= i10 && i2 <= i9) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 2) {
                    int i11 = (objectUnit[i4].posX / 50) / 45;
                    int i12 = (objectUnit[i4].posY / 50) / 45;
                    int i13 = i12 - 1;
                    if (i >= i11 - 1 && i <= i11 && i2 >= i13 && i2 <= i12) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 3) {
                    int i14 = (objectUnit[i4].posX / 50) / 45;
                    int i15 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i16 = i14 + 1;
                    int i17 = i15 + 2;
                    if (i >= i14 && i <= i16 && i2 >= i15 && i2 <= i17) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 4) {
                    int i18 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i19 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i20 = i18 + 1;
                    int i21 = i19 + 2;
                    if (i >= i18 && i <= i20 && i2 >= i19 && i2 <= i21) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 != 5) {
                    continue;
                } else {
                    int i22 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i23 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i24 = i22 + 2;
                    int i25 = i23 + 1;
                    if (i >= i22 && i <= i24 && i2 >= i23 && i2 <= i25) {
                        characterAddBoolean = false;
                        return;
                    }
                }
            }
        }
        characterAddBoolean = true;
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

    public void drawMyLife() {
        int i;
        int i2;
        int i3;
        int i4 = GameThread.mapEndDirection[0];
        if (i4 == 203) {
            i = (GameThread.mapEndPosition[0][0] * 45) + 62 + 45;
            i2 = GameThread.mapEndPosition[0][1];
        } else if (i4 == 208) {
            i = (GameThread.mapEndPosition[0][0] * 45) + 62 + 22;
            i2 = GameThread.mapEndPosition[0][1];
        } else {
            i = (GameThread.mapEndPosition[0][0] * 45) + 62 + 22;
            i3 = (GameThread.mapEndPosition[0][1] * 45) + 30;
            uiUpperImage[9].drawAtPointOption(i, (float) (i3 - 1), 17);
            float f = i3;
            uiUpperImage[10].drawAtPointOption((float) (i - 37), f, 18);
            drawNumberBlock(st.Life, numberLifeImage, (float) (i - 2), f, -1, 20, 2);
            drawNumberBlock(DataStage.maxLife, numberLifeImage, i + 2, f, -1, 18, 2);
        }
        i3 = ((i2 * 45) + 30) - 22;
        uiUpperImage[9].drawAtPointOption(i, (float) (i3 - 1), 17);
        float f2 = i3;
        uiUpperImage[10].drawAtPointOption((float) (i - 37), f2, 18);
        drawNumberBlock(st.Life, numberLifeImage, (float) (i - 2), f2, -1, 20, 2);
        drawNumberBlock(DataStage.maxLife, numberLifeImage, i + 2, f2, -1, 18, 2);
    }
}
