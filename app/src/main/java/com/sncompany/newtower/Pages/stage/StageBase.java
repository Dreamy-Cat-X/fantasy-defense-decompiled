package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
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
    public static final int[] numberUnitBuyResource = {R.drawable.num_unit_buy_0, R.drawable.num_unit_buy_1, R.drawable.num_unit_buy_2, R.drawable.num_unit_buy_3, R.drawable.num_unit_buy_4, R.drawable.num_unit_buy_5, R.drawable.num_unit_buy_6, R.drawable.num_unit_buy_7, R.drawable.num_unit_buy_8, R.drawable.num_unit_buy_9};
    public static final int[] numberHeroBuyResource = {R.drawable.num_hero_buy_0, R.drawable.num_hero_buy_1, R.drawable.num_hero_buy_2, R.drawable.num_hero_buy_3, R.drawable.num_hero_buy_4, R.drawable.num_hero_buy_5, R.drawable.num_hero_buy_6, R.drawable.num_hero_buy_7, R.drawable.num_hero_buy_8, R.drawable.num_hero_buy_9};
    public static final int[] numberManaResource = {R.drawable.num_mana_0, R.drawable.num_mana_1, R.drawable.num_mana_2, R.drawable.num_mana_3, R.drawable.num_mana_4, R.drawable.num_mana_5, R.drawable.num_mana_6, R.drawable.num_mana_7, R.drawable.num_mana_8, R.drawable.num_mana_9};
    public static final int[] numberLifeResource = {R.drawable.num_life_0, R.drawable.num_life_1, R.drawable.num_life_2, R.drawable.num_life_3, R.drawable.num_life_4, R.drawable.num_life_5, R.drawable.num_life_6, R.drawable.num_life_7, R.drawable.num_life_8, R.drawable.num_life_9};
    public static final int[] numberWaveResource = {R.drawable.num_wave_0, R.drawable.num_wave_1, R.drawable.num_wave_2, R.drawable.num_wave_3, R.drawable.num_wave_4, R.drawable.num_wave_5, R.drawable.num_wave_6, R.drawable.num_wave_7, R.drawable.num_wave_8, R.drawable.num_wave_9, R.drawable.num_wave_10, R.drawable.num_wave_11};
    public static final int[] numberMoneyResource = {R.drawable.num_money_0, R.drawable.num_money_1, R.drawable.num_money_2, R.drawable.num_money_3, R.drawable.num_money_4, R.drawable.num_money_5, R.drawable.num_money_6, R.drawable.num_money_7, R.drawable.num_money_8, R.drawable.num_money_9};
    public static final int[] uiUpperResource = {R.drawable.ui_upper_mana, R.drawable.ui_upper_money, R.drawable.ui_upper_ingameoff, R.drawable.ui_upper_ingameon, R.drawable.ui_upper_speed0, R.drawable.ui_upper_speed1, R.drawable.ui_upper_speed2, R.drawable.ui_upper_upbar, R.drawable.ui_upper_wave, R.drawable.ui_upper_slash, R.drawable.ui_upper_heart, R.drawable.ui_upper_hpbar, R.drawable.ui_upper_star, R.drawable.ui_upper_hero, R.drawable.ui_upper_speedempty, R.drawable.ui_upper_pauseoff, R.drawable.ui_upper_pauseon, R.drawable.ui_upper_bossstage};
    public static final int upper_mana = 0, upper_money = 1, upper_ingameoff = 2, upper_ingameon = 3, upper_speed0 = 4, upper_speed1 = 5, upper_speed2 = 6, upper_upbar = 7, upper_wave = 8,
            upper_slash = 9, upper_heart = 10, upper_hpbar = 11, upper_star = 12, upper_hero = 13, upper_speedempty = 14, upper_pauseoff = 15, upper_pauseon = 16, upper_bossstage = 17;
    public static final int[] uiButtonResource = {R.drawable.ui_addunit_warrior, R.drawable.ui_addunit_manatarms, R.drawable.ui_addunit_archer, R.drawable.ui_addunit_holyeye, R.drawable.ui_addunit_wizard, R.drawable.ui_addunit_colddiviner, R.drawable.ui_addunit_hero0, R.drawable.ui_addunit_hero1, R.drawable.ui_addunit_hero2, R.drawable.ui_addunit_warrior_f, R.drawable.ui_addunit_manatarms_f, R.drawable.ui_addunit_archer_f, R.drawable.ui_addunit_holyeye_f, R.drawable.ui_addunit_wizard_f, R.drawable.ui_addunit_colddiviner_f, R.drawable.ui_addunit_hero0_f, R.drawable.ui_addunit_hero1_f, R.drawable.ui_addunit_hero2_f, R.drawable.ui_addunit_hero};
    public static final int[] gatefireResource = {R.drawable.gatefire_fire1, R.drawable.gatefire_fire2, R.drawable.gatefire_fire3, R.drawable.gatefire_fire4, R.drawable.gatefire_eyewest1, R.drawable.gatefire_eyewest2, R.drawable.gatefire_eyeeast1, R.drawable.gatefire_eyeeast2, R.drawable.gatefire_eyesouth1, R.drawable.gatefire_eyesouth2};

    public final Texture2D targetImage = new Texture2D(R.drawable.etc_target), backShadowImage = new Texture2D(R.drawable.etc_shadow);
    public final Texture2D[] numberManaImage = new Texture2D[numberManaResource.length], numberMoneyImage = new Texture2D[numberMoneyResource.length], numberLifeImage = new Texture2D[numberLifeResource.length],
        numberWaveImage = new Texture2D[numberWaveResource.length], shadowImage = new Texture2D[2], uiUpperImage = new Texture2D[uiUpperResource.length], uiButtonImage = new Texture2D[uiButtonResource.length],
        numberUnitBuyImage = new Texture2D[numberUnitBuyResource.length], numberHeroBuyImage = new Texture2D[numberHeroBuyResource.length], whiteCircleImage = new Texture2D[4], redCircleImage = new Texture2D[4],
        gatefireImage = new Texture2D[gatefireResource.length];
    public final Texture2D[][] enemyImages = new Texture2D[DataAnim.enemyDrawResource.length][], debuffImages = new Texture2D[DataAnim.debuffDrawResource.length][], heroImages = new Texture2D[DataAnim.heroDrawResource.length][],
    towerImages = new Texture2D[DataAnim.towerDrawResource.length][];
    public final DataMap tmap;
    public final DataStage st;
    public float characterAddPosX, characterAddPosY;
    public int characterAddNumber, characterMenuSelectFlag; //restructure so 1 is unit selected, 2 is hero menu, 3 is hero confirmation, 4 is check menu, 5 is promotion, 6 is leveling up, 7 is confirmation to sell an unit, 8 is hero deploy confirmation. Also used as the button for menus lol
    public TowerUnit tempChara;
    protected boolean softPause = false, inGamePause = false;

    public StageBase(TPage par, DataStage stage) {
        super(par);
        st = stage;
        tmap = stage.map;
        st.page = this;

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
        int tot = numberMoneyImage.length + enemyImages.length + debuffImages.length + heroImages.length + towerImages.length + uiUpperResource.length + numberManaImage.length +
                numberLifeImage.length + numberWaveImage.length + uiButtonImage.length + numberUnitBuyImage.length + numberHeroBuyImage.length +
                gatefireImage.length;
        shadowImage[0] = new Texture2D(R.drawable.etc_sha34);
        shadowImage[1] = new Texture2D(R.drawable.etc_sha63);
        whiteCircleImage[0] = new Texture2D(R.drawable.etc_whitecircle1);
        whiteCircleImage[1] = new Texture2D(R.drawable.etc_whitecircle2);
        whiteCircleImage[2] = new Texture2D(R.drawable.etc_whitecircle3);
        whiteCircleImage[3] = new Texture2D(R.drawable.etc_whitecircle4);
        redCircleImage[0] = new Texture2D(R.drawable.etc_redcircle1);
        redCircleImage[1] = new Texture2D(R.drawable.etc_redcircle2);
        redCircleImage[2] = new Texture2D(R.drawable.etc_redcircle3);
        redCircleImage[3] = new Texture2D(R.drawable.etc_redcircle4);

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
        lod = loadP(numberLifeImage, numberLifeResource, prog, lod, tot);
        lod = loadP(numberWaveImage, numberWaveResource, prog, lod, tot);
        lod = loadP(uiButtonImage, uiButtonResource, prog, lod, tot);
        lod = loadP(numberUnitBuyImage, numberUnitBuyResource, prog, lod, tot);
        lod = loadP(numberHeroBuyImage, numberHeroBuyResource, prog, lod, tot);
        lod = loadP(gatefireImage, gatefireResource, prog, lod, tot);
    }

    @Override
    public void unload() {
        shadowImage[0].dealloc();
        shadowImage[1].dealloc();
        whiteCircleImage[0].dealloc();
        whiteCircleImage[1].dealloc();
        whiteCircleImage[2].dealloc();
        whiteCircleImage[3].dealloc();
        redCircleImage[0].dealloc();
        redCircleImage[1].dealloc();
        redCircleImage[2].dealloc();
        redCircleImage[3].dealloc();

        for (Texture2D[] imgs : enemyImages)
            for (Texture2D img : imgs)
                img.dealloc();
        for (Texture2D[] imgs : debuffImages)
            for (Texture2D img : imgs)
                img.dealloc();
        for (Texture2D[] imgs : heroImages)
            for (Texture2D img : imgs)
                img.dealloc();
        for (Texture2D[] imgs : towerImages)
            for (Texture2D img : imgs)
                img.dealloc();

        for (Texture2D img : uiUpperImage)
            img.dealloc();
        for (Texture2D img : numberMoneyImage)
            img.dealloc();
        for (Texture2D img : numberManaImage)
            img.dealloc();
        for (Texture2D img : numberLifeImage)
            img.dealloc();
        for (Texture2D img : numberWaveImage)
            img.dealloc();
        for (Texture2D img : uiButtonImage)
            img.dealloc();
        for (Texture2D img : numberUnitBuyImage)
            img.dealloc();
        for (Texture2D img : numberHeroBuyImage)
            img.dealloc();
        for (Texture2D img : gatefireImage)
            img.dealloc();
        loaded = false;
    }

    public boolean enableAddSetting(boolean changePos) {
        CGPoint acTouch = TouchManager.getFirstLastActionTouch();
        if (acTouch.x < 62 || acTouch.y - 25 < 30 || acTouch.x >= 737 || acTouch.y - 25 >= Texture2D.VIEW_SCRHEIGHT) {
            if (changePos) {
                characterAddPosX = acTouch.x;
                characterAddPosY = acTouch.y - 25;
            }
            return false;
        }
        int bX = (int) ((acTouch.x - 62) / 45);
        int bY = (int) (((acTouch.y - 25) - 30) / 45);
        if (changePos) {
            characterAddPosX = (bX * 45) + 62 + 22;
            characterAddPosY = (bY * 45) + 30 + 22;
        }
        if (tmap.mapTileData[bX][bY] != -1)
            return false;

        for (TowerUnit twu : st.towerUnit)
            if (twu.blockX == bX && twu.blockY == bY)
                return false;
        return searchObjectTouch(bX, bY) == null;
    }

    public ObjectUnit searchObjectTouch() {
        CGPoint acTouch = TouchManager.getFirstLastActionTouch();
        int bX = (int) ((acTouch.x - 62) / 45);
        int bY = (int) (((acTouch.y - 25) - 30) / 45);
        return searchObjectTouch(bX, bY);
    }

    public ObjectUnit searchObjectTouch(float bX, float bY) {
        for (ObjectUnit obj : st.map.objectUnit) {
            if (!obj.dead()) {
                int sX = (obj.posX / 50) / 45;
                int sY = (obj.posY / 50) / 45;
                if (obj.blockSize == 0) {
                    if (bX == sX && bY == sY)
                        return obj;
                } else if (obj.blockSize == 1) {
                    if (bX == sX && bY >= sY - 1 && bY <= sY)
                        return obj;
                } else if (obj.blockSize == 2) {
                    if (bX >= sX - 1 && bX <= sX && bY >= sY - 1 && bY <= sY)
                        return obj;
                } else if (obj.blockSize == 3) {
                    if (bX >= sX && bX <= sX + 1 && bY >= sY - 1 && bY <= sY + 1)
                        return obj;
                } else if (obj.blockSize == 4) {
                    if (bX >= sX - 1 && bX <= sX && bY >= sY - 1 && bY <= sY + 1)
                        return obj;
                } else if (obj.blockSize == 5) {
                    if (bX >= sX - 1 && bX <= sX + 1 && bY >= sY - 1 && bY <= sY)
                        return obj;
                }
            }
        }
        return null;
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
            if (st.effectUnit.get(i).type != -1)
                st.effectUnit.get(i).drawEffectUnit();
    }

    public int getNextDrawObject(int uInd, int mInd, int oInd) {
        int high = -1, poS = Integer.MAX_VALUE;
        if (oInd < tmap.objectUnit.size()) {
            high = 2;
            poS = tmap.objectUnit.get(oInd).posY;
        }
        if (uInd < st.towerUnit.size() && st.towerUnit.get(uInd).posY < poS) {
            high = 1;
            poS = st.towerUnit.get(uInd).posY;
        }
        if (mInd < st.monsterUnit.size() && st.monsterUnit.get(mInd).posY < poS)
            high = 0;
        return high;
    }

    public void drawMapTile(GL10 gl10) {
        for (int x = 0; x < 15; x++)
            for (int y = 0; y < 10; y++)
                if (tmap.mapTileData[x][y] != -1)
                    tmap.backTileOldImage[tmap.mapTileData[x][y]].drawAtPointOption((x * 45) + 62, (y * 45) + 30, 18);
    }

    protected void drawUpperUI() {
        uiUpperImage[upper_upbar].drawAtPointOption(0, 0, 18);
        uiUpperImage[upper_money].drawAtPointOption(9, 4, 18);
        uiUpperImage[upper_mana].drawAtPointOption(126, 5, 18);
        uiUpperImage[upper_wave].drawAtPointOption(298, 6, 18);
        if (st.turbo == 1) {
            uiUpperImage[upper_speedempty].drawAtPointOption(22, 398, 18);
            uiUpperImage[upper_speedempty].drawAtPointOption(16, 398, 18);
            uiUpperImage[upper_speed0].drawAtPointOption(1, 391, 18);
        } else {
            uiUpperImage[upper_speed2].drawAtPointOption(13, 391, 18);
            uiUpperImage[upper_speed1].drawAtPointOption(7, 391, 18);
            uiUpperImage[upper_speed0].drawAtPointOption(1, 391, 18);
        }
        uiUpperImage[inGamePause ? upper_ingameon : upper_ingameoff].drawAtPointOption(5, 437, 18);
        uiUpperImage[softPause ? upper_pauseon : upper_pauseoff].drawAtPointOption(6, 344, 18);
        GameRenderer.drawNumberBlock(st.money, numberMoneyImage, 96, 6, 1, 20, 1);
        GameRenderer.drawNumberBlock(st.mana, numberManaImage, 213, 6, 1, 20, 1);
        int wavInd = st.waveManager.current;
        if (st.mapType != 1 && wavInd >= st.waveManager.wcc)
            wavInd = st.waveManager.wcc - 1;
        float dnb = GameRenderer.drawNumberBlock(wavInd + 1, numberWaveImage, 366, 8, 1, 18, 2);
        numberWaveImage[10].drawAtPointOption(2 + dnb, 6, 18);
        if (st.mapType == 1)
            numberWaveImage[11].drawAtPointOption(dnb + 10, 6, 18);
        else
            GameRenderer.drawNumberBlock(st.waveManager.wcc, numberWaveImage, dnb + 10, 8, 1, 18, 2);
        drawBaseHealth();
    }

    protected void drawBaseHealth() {
        int x;
        int y;
        if (tmap.mapEndDirection[0] == 203)
            x = (tmap.mapEndPosition[0][0] * 45) + 62 + 45;
        else if (tmap.mapEndDirection[0] == 208)
            x = (tmap.mapEndPosition[0][0] * 45) + 62 + 22;
        else {
            x = (tmap.mapEndPosition[0][0] * 45) + 62 + 22;
            y = (tmap.mapEndPosition[0][1] * 45) + 30;
            uiUpperImage[upper_slash].drawAtPointOption(x, (float) (y - 1), 17);
            uiUpperImage[upper_heart].drawAtPointOption((float) (x - 37), y, 18);
            GameRenderer.drawNumberBlock(st.life, numberLifeImage, (float) (x - 12), y, -1, 20, 2);
            GameRenderer.drawNumberBlock(DataStage.maxLife, numberLifeImage, x + 2, y, -1, 18, 2);
            return;
        }
        y = ((tmap.mapEndPosition[0][1] * 45) + 30) - 22;
        uiUpperImage[upper_slash].drawAtPointOption(x, (float) (y - 1), 17);
        float f2 = y;
        uiUpperImage[upper_heart].drawAtPointOption((float) (x - 37), f2, 18);
        GameRenderer.drawNumberBlock(st.life, numberLifeImage, (float) (x - 12), f2, -1, 20, 2);
        GameRenderer.drawNumberBlock(DataStage.maxLife, numberLifeImage, x + 2, f2, -1, 18, 2);
    }

    public void drawSimpleTowerUnit(int type, float x, float y) {
        if (type == -1)
            return;

        int[] drawData;
        Texture2D[] textures;
        if (type >= 12) {
            type -= 12;
            drawData = DataAnim.heroDrawData[type];
            textures = st.page.heroImages[type];
        } else {
            drawData = DataAnim.towerDrawData[type];
            textures = st.page.towerImages[type];
        }

        int main = drawData[drawData[0]];
        for (int i = 0; i < drawData[main]; i++) {
            int i7 = (i * 5) + main + 1;
            int i8 = i7 + 3;
            if (drawData[i8] != 1000) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(drawData[i8] / 1000f);
            }
            if (drawData[i7 + 4] == 0)
                textures[drawData[i7]].drawAtPointOption(x + drawData[i7 + 1], y + drawData[i7 + 2] + 10, 18);
            else
                textures[drawData[i7]].drawAtPointOptionFlip(x + drawData[i7 + 1], y + drawData[i7 + 2] + 10, 18);

            if (drawData[i8] != 1000) {
                Texture2D.setColors(1);
            }
        }
    }

    public void drawAddGridBlock() {
        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
        Texture2D.setColors(0.15f);
        for (int i = 0; i <= 15; i++) {
            fillWhiteImage.fillRect((i * 45) + 62, 30, 1, 450);
        }
        for (int i2 = 0; i2 <= 10; i2++) {
            fillWhiteImage.fillRect(62, (i2 * 45) + 30, 675, 1);
        }
        Texture2D.setColors(1);
    }

    public void drawAddRangeCircle(int type, float x, float y, boolean addable) {
        float rang;
        int rngUpgr;
        if (type == -1)
            return;

        if (type < 12) {
            rang = DataCharacter.charData[type * 3][4];
            rngUpgr = TowerUnit.getUpgradeRate(type / 6, 9);
        } else {
            int t2 = type - 12;
            rang = DataHero.heroData[t2][3];
            rngUpgr = HeroUnit.getEquipEffect(Config.heroEquips[t2], DataUpgradeItem.EQ_HELM, 4);
        }
        rang += (rngUpgr * rang) / 100f;
        if (rang <= 0)
            return;

        Texture2D[] circleImage = addable ? whiteCircleImage : redCircleImage;
        int circle = Math.min(((int)rang - 1) / 100, 3);
        circleImage[circle].drawAtPointOptionSize(x, y, 9, (rang * 0.9f) / ((circle + 1) * 100));

        try {
            drawSimpleTowerUnit(type, x, y);
        } catch (Exception ignored) {
        }
    }

    public TowerUnit checkTowerUnit() {
        CGPoint ActionTouch = TouchManager.getFirstLastActionTouch();
        if (ActionTouch.x >= 62 && ActionTouch.y >= 30 && ActionTouch.x < 737 && ActionTouch.y < Texture2D.VIEW_SCRHEIGHT) {
            int rX = (int) ((ActionTouch.x - 62) / 45);
            int rY = (int) ((ActionTouch.y - 30) / 45);
            for (TowerUnit twu : st.towerUnit)
                if (twu.blockX == rX && twu.blockY == rY)
                    return twu;
        }
        return null;
    }
}
