package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
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
    public static final int[] numberUnitBuyResource = {R.drawable.num_unit_buy_0, R.drawable.num_unit_buy_1, R.drawable.num_unit_buy_2, R.drawable.num_unit_buy_3, R.drawable.num_unit_buy_4, R.drawable.num_unit_buy_5, R.drawable.num_unit_buy_6, R.drawable.num_unit_buy_7, R.drawable.num_unit_buy_8, R.drawable.num_unit_buy_9};
    public static final int[] uiCharButtonResource = {R.drawable.ui_char_button_class_off, R.drawable.ui_char_button_class_on, R.drawable.ui_char_button_lvlup_off, R.drawable.ui_char_button_lvlup_on, R.drawable.ui_char_button_ok_off, R.drawable.ui_char_button_ok_on, R.drawable.ui_char_button_sell_off, R.drawable.ui_char_button_sell_on, R.drawable.ui_char_button_spe_dancing_blade_off, R.drawable.ui_char_button_spe_dancing_blade_on, R.drawable.ui_char_button_spe_millon_arrow_off, R.drawable.ui_char_button_spe_millon_arrow_on, R.drawable.ui_char_button_spe_ice_quake_off, R.drawable.ui_char_button_spe_ice_quake_on, R.drawable.ui_char_button_lvluphero_off, R.drawable.ui_char_button_lvluphero_on, R.drawable.ui_char_button_1_off, R.drawable.ui_char_button_1_on, R.drawable.ui_char_button_2_off, R.drawable.ui_char_button_2_on, R.drawable.ui_char_button_3_off, R.drawable.ui_char_button_3_on, R.drawable.ui_char_button_4_off, R.drawable.ui_char_button_4_on, R.drawable.ui_char_button_5_off, R.drawable.ui_char_button_5_on};
    public static final int[] uiCharEtcResource = {R.drawable.ui_char_etc_background, R.drawable.ui_char_etc_stat, R.drawable.ui_char_etc_lv, R.drawable.ui_char_etc_1, R.drawable.ui_char_etc_2, R.drawable.ui_char_etc_3, R.drawable.ui_char_etc_4, R.drawable.ui_char_etc_5, R.drawable.ui_char_etc_hero, R.drawable.ui_char_etc_specialdancingblade, R.drawable.ui_char_etc_specialmillionarrow, R.drawable.ui_char_etc_specialicequake, R.drawable.ui_char_etc_backline};
    public static final int[] uiCharFaceResource = {R.drawable.ui_char_face_warrior, R.drawable.ui_char_face_manatarms, R.drawable.ui_char_face_knight, R.drawable.ui_char_face_warlord, R.drawable.ui_char_face_archer, R.drawable.ui_char_face_holyeye, R.drawable.ui_char_face_splatter, R.drawable.ui_char_face_skybeholder, R.drawable.ui_char_face_wizard, R.drawable.ui_char_face_colddiviner, R.drawable.ui_char_face_warlock, R.drawable.ui_char_face_magmablaster, R.drawable.ui_char_face_hero0, R.drawable.ui_char_face_hero1, R.drawable.ui_char_face_hero2};
    public static final int[] uiCharNameResource = {R.drawable.ui_char_name_warrior, R.drawable.ui_char_name_manatarms, R.drawable.ui_char_name_knight, R.drawable.ui_char_name_warlord, R.drawable.ui_char_name_archer, R.drawable.ui_char_name_holyeye, R.drawable.ui_char_name_splatter, R.drawable.ui_char_name_skybeholder, R.drawable.ui_char_name_wizard, R.drawable.ui_char_name_colddiviner, R.drawable.ui_char_name_warlock, R.drawable.ui_char_name_blaster, R.drawable.ui_char_name_hero0, R.drawable.ui_char_name_hero1, R.drawable.ui_char_name_hero2};
    public static final int[] uiCharUpFaceResource = {R.drawable.ui_char_up_face_knight, R.drawable.ui_char_up_face_warlord, R.drawable.ui_char_up_face_splatter, R.drawable.ui_char_up_face_skybeholder, R.drawable.ui_char_up_face_warlock, R.drawable.ui_char_up_face_magmablaster};
    public static final int[] uiMonsterEtcResource = {R.drawable.ui_monster_etc_background, R.drawable.ui_monster_etc_stat, R.drawable.ui_monster_etc_nextwave, R.drawable.ui_monster_etc_warning, R.drawable.ui_monster_etc_warningglow};
    public static final int[] uiMonsterFaceResource = {R.drawable.ui_monster_face__0skulldog, R.drawable.ui_monster_face__1zombie, R.drawable.ui_monster_face__2lamia, R.drawable.ui_monster_face__3imp, R.drawable.ui_monster_face__4wraith, R.drawable.ui_monster_face__5hollowskull, R.drawable.ui_monster_face__6zombieturtle, R.drawable.ui_monster_face__7ninetail, R.drawable.ui_monster_face__8vampire, R.drawable.ui_monster_face__9swordwraith, R.drawable.ui_monster_face__10boneworm, R.drawable.ui_monster_face__11zombieknight, R.drawable.ui_monster_face__12ukiona, R.drawable.ui_monster_face__13succubus, R.drawable.ui_monster_face__14wraithbishop, R.drawable.ui_monster_face_a1ogrezombie, R.drawable.ui_monster_face_a2deviltiger, R.drawable.ui_monster_face_b1mudman, R.drawable.ui_monster_face_b2swampwoman, R.drawable.ui_monster_face_c1spinx, R.drawable.ui_monster_face_c2mummy, R.drawable.ui_monster_face_d1salamander, R.drawable.ui_monster_face_d2magmarock, R.drawable.ui_monster_face_e1demon, R.drawable.ui_monster_face_e2grimdevil, R.drawable.ui_monster_face_boss1skullgiant, R.drawable.ui_monster_face_boss2rich, R.drawable.ui_monster_face_boss3fallenangel, R.drawable.ui_monster_face_boss4lilis, R.drawable.ui_monster_face_boss5wraithking, R.drawable.ui_monster_face_ex1zombiegirl};
    public static final int[] uiMonsterNameResource = {R.drawable.ui_monster_name__0skulldog, R.drawable.ui_monster_name__1zombie, R.drawable.ui_monster_name__2lamia, R.drawable.ui_monster_name__3imp, R.drawable.ui_monster_name__4wraith, R.drawable.ui_monster_name__5hollowskull, R.drawable.ui_monster_name__6zombieturtle, R.drawable.ui_monster_name__7ninetail, R.drawable.ui_monster_name__8vampire, R.drawable.ui_monster_name__9swordwraith, R.drawable.ui_monster_name__10boneworm, R.drawable.ui_monster_name__11zombieknight, R.drawable.ui_monster_name__12ukiona, R.drawable.ui_monster_name__13succubus, R.drawable.ui_monster_name__14wraithbishop, R.drawable.ui_monster_name_a1ogrezombie, R.drawable.ui_monster_name_a2deviltiger, R.drawable.ui_monster_name_b1mudman, R.drawable.ui_monster_name_b2swampwoman, R.drawable.ui_monster_name_c1spinx, R.drawable.ui_monster_name_c2mummy, R.drawable.ui_monster_name_d1salamander, R.drawable.ui_monster_name_d2magmarock, R.drawable.ui_monster_name_e1demon, R.drawable.ui_monster_name_e2grimdevil, R.drawable.ui_monster_name_boss1skullgiant, R.drawable.ui_monster_name_boss2rich, R.drawable.ui_monster_name_boss3fallenangel, R.drawable.ui_monster_name_boss4lilis, R.drawable.ui_monster_name_boss5wraithking, R.drawable.ui_monster_name_ex1zombiegirl};
    public static final int[] numberManaResource = {R.drawable.num_mana_0, R.drawable.num_mana_1, R.drawable.num_mana_2, R.drawable.num_mana_3, R.drawable.num_mana_4, R.drawable.num_mana_5, R.drawable.num_mana_6, R.drawable.num_mana_7, R.drawable.num_mana_8, R.drawable.num_mana_9};
    public static final int[] numberLifeResource = {R.drawable.num_life_0, R.drawable.num_life_1, R.drawable.num_life_2, R.drawable.num_life_3, R.drawable.num_life_4, R.drawable.num_life_5, R.drawable.num_life_6, R.drawable.num_life_7, R.drawable.num_life_8, R.drawable.num_life_9};
    public static final int[] numberWaveResource = {R.drawable.num_wave_0, R.drawable.num_wave_1, R.drawable.num_wave_2, R.drawable.num_wave_3, R.drawable.num_wave_4, R.drawable.num_wave_5, R.drawable.num_wave_6, R.drawable.num_wave_7, R.drawable.num_wave_8, R.drawable.num_wave_9, R.drawable.num_wave_10, R.drawable.num_wave_11};
    public static final int[] numberMoneyResource = {R.drawable.num_money_0, R.drawable.num_money_1, R.drawable.num_money_2, R.drawable.num_money_3, R.drawable.num_money_4, R.drawable.num_money_5, R.drawable.num_money_6, R.drawable.num_money_7, R.drawable.num_money_8, R.drawable.num_money_9};
    public static final int[] uiUpperResource = {R.drawable.ui_upper_mana, R.drawable.ui_upper_money, R.drawable.ui_upper_ingameoff, R.drawable.ui_upper_ingameon, R.drawable.ui_upper_speed0, R.drawable.ui_upper_speed1, R.drawable.ui_upper_speed2, R.drawable.ui_upper_upbar, R.drawable.ui_upper_wave, R.drawable.ui_upper_slash, R.drawable.ui_upper_heart, R.drawable.ui_upper_hpbar, R.drawable.ui_upper_star, R.drawable.ui_upper_hero, R.drawable.ui_upper_speedempty, R.drawable.ui_upper_pauseoff, R.drawable.ui_upper_pauseon, R.drawable.ui_upper_bossstage};
    public static final int upper_mana = 0, upper_money = 1, upper_ingameoff = 2, upper_ingameon = 3, upper_speed0 = 4, upper_speed1 = 5, upper_speed2 = 6, upper_upbar = 7, upper_wave = 8,
            upper_slash = 9, upper_heart = 10, upper_hpbar = 11, upper_star = 12, upper_hero = 13, upper_speedempty = 14, upper_pauseoff = 15, upper_pauseon = 16, upper_bossstage = 17;
    public static final int[] uiButtonResource = {R.drawable.ui_addunit_warrior, R.drawable.ui_addunit_manatarms, R.drawable.ui_addunit_archer, R.drawable.ui_addunit_holyeye, R.drawable.ui_addunit_wizard, R.drawable.ui_addunit_colddiviner, R.drawable.ui_addunit_hero0, R.drawable.ui_addunit_hero1, R.drawable.ui_addunit_hero2, R.drawable.ui_addunit_warrior_f, R.drawable.ui_addunit_manatarms_f, R.drawable.ui_addunit_archer_f, R.drawable.ui_addunit_holyeye_f, R.drawable.ui_addunit_wizard_f, R.drawable.ui_addunit_colddiviner_f, R.drawable.ui_addunit_hero0_f, R.drawable.ui_addunit_hero1_f, R.drawable.ui_addunit_hero2_f, R.drawable.ui_addunit_hero};

    protected enum STATE {
        START,
        PLAYING,
        CLEAR,
        GAMEOVER,
        SOFTPAUSE, //This one is just st.waveManager.waveRunF's replacement
        PAUSE
    }
    public final Texture2D targetImage = new Texture2D(R.drawable.etc_target), backShadowImage = new Texture2D(R.drawable.etc_shadow);
    public final Texture2D[] numberManaImage = new Texture2D[numberManaResource.length], numberMoneyImage = new Texture2D[numberMoneyResource.length], numberLifeImage = new Texture2D[numberLifeResource.length],
        numberWaveImage = new Texture2D[numberWaveResource.length], shadowImage = new Texture2D[2], uiUpperImage = new Texture2D[uiUpperResource.length], uiButtonImage = new Texture2D[uiButtonResource.length],
        uiCharButtonImage = new Texture2D[uiCharButtonResource.length], uiCharEtcImage = new Texture2D[uiCharEtcResource.length], uiCharFaceImage = new Texture2D[uiCharFaceResource.length], uiCharNameImage = new Texture2D[uiCharNameResource.length],
        uiCharUpFaceImage = new Texture2D[uiCharUpFaceResource.length], uiMonsterEtcImage = new Texture2D[uiMonsterEtcResource.length], uiMonsterFaceImage = new Texture2D[uiMonsterFaceResource.length], uiMonsterNameImage = new Texture2D[uiMonsterNameResource.length],
        numberUnitBuyImage = new Texture2D[numberUnitBuyResource.length];
    public final Texture2D[][] enemyImages = new Texture2D[DataAnim.enemyDrawResource.length][], debuffImages = new Texture2D[DataAnim.debuffDrawResource.length][], heroImages = new Texture2D[DataAnim.heroDrawResource.length][],
    towerImages = new Texture2D[DataAnim.towerDrawResource.length][];
    public final DataMap tmap;
    public final DataStage st;
    public float characterAddPosX, characterAddPosY;
    public int characterMenuSelectFlag;
    protected boolean inGamePause = false;
    protected STATE state = STATE.START;

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
                numberLifeImage.length + numberWaveImage.length + uiButtonImage.length + uiCharButtonImage.length + uiCharEtcImage.length + uiCharFaceImage.length + uiCharNameImage.length +
                uiCharUpFaceImage.length + uiMonsterEtcImage.length + uiMonsterFaceImage.length + uiMonsterNameImage.length + numberUnitBuyImage.length + 2;
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
        lod = loadP(numberLifeImage, numberLifeResource, prog, lod, tot);
        lod = loadP(numberWaveImage, numberWaveResource, prog, lod, tot);
        lod = loadP(uiButtonImage, uiButtonResource, prog, lod, tot);
        lod = loadP(uiCharButtonImage, uiUpperResource, prog, lod, tot);
        lod = loadP(uiCharEtcImage, numberMoneyResource, prog, lod, tot);
        lod = loadP(uiCharFaceImage, numberManaResource, prog, lod, tot);
        lod = loadP(uiCharNameImage, numberManaResource, prog, lod, tot);
        lod = loadP(uiCharUpFaceImage, numberWaveResource, prog, lod, tot);
        lod = loadP(uiMonsterEtcImage, uiButtonResource, prog, lod, tot);
        lod = loadP(uiMonsterFaceImage, numberWaveResource, prog, lod, tot);
        lod = loadP(uiMonsterNameImage, uiButtonResource, prog, lod, tot);
        lod = loadP(numberUnitBuyImage, numberUnitBuyResource, prog, lod, tot);

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

    protected void drawUpperUI() {
        uiUpperImage[upper_upbar].drawAtPointOption(0.0f, 0.0f, 18);
        uiUpperImage[upper_money].drawAtPointOption(9.0f, 4.0f, 18);
        uiUpperImage[upper_mana].drawAtPointOption(126.0f, 5.0f, 18);
        uiUpperImage[upper_wave].drawAtPointOption(298.0f, 6.0f, 18);
        if (st.turbo == 1) {
            uiUpperImage[upper_speedempty].drawAtPointOption(22, 398, 18);
            uiUpperImage[upper_speedempty].drawAtPointOption(16, 398, 18);
            uiUpperImage[upper_speed0].drawAtPointOption(1, 391, 18);
        } else {
            uiUpperImage[upper_speed2].drawAtPointOption(13, 391, 18);
            uiUpperImage[upper_speed1].drawAtPointOption(7, 391, 18);
            uiUpperImage[upper_speed0].drawAtPointOption(1, 391, 18);
        }
        uiUpperImage[inGamePause ? upper_ingameon : upper_ingameoff].drawAtPointOption(5.0f, 437.0f, 18);
        uiUpperImage[st.waveManager.waveRunF ? upper_pauseoff : upper_pauseon].drawAtPointOption(6.0f, 344.0f, 18);
        GameRenderer.drawNumberBlock(st.Money, numberMoneyImage, 96.0f, 6.0f, 1, 20, 1);
        GameRenderer.drawNumberBlock(st.Mana, numberManaImage, 213.0f, 6.0f, 1, 20, 1);
        int wavInd = st.waveManager.current;
        if (st.mapType != 1 && wavInd >= st.waveManager.wcc)
            wavInd = st.waveManager.wcc - 1;
        float dnb = GameRenderer.drawNumberBlock(wavInd + 1, numberWaveImage, 366.0f, 8.0f, 1, 18, 2);
        numberWaveImage[10].drawAtPointOption(2.0f + dnb, 6.0f, 18);
        if (st.mapType == 1)
            numberWaveImage[11].drawAtPointOption(dnb + 10.0f, 6.0f, 18);
        else
            GameRenderer.drawNumberBlock(st.waveManager.wcc, numberWaveImage, dnb + 10.0f, 8.0f, 1, 18, 2);
        drawBaseHealth();
    }

    protected void drawBaseHealth() {
        int x;
        int y;
        if (GameThread.mapEndDirection[0] == 203)
            x = (GameThread.mapEndPosition[0][0] * 45) + 62 + 45;
        else if (GameThread.mapEndDirection[0] == 208)
            x = (GameThread.mapEndPosition[0][0] * 45) + 62 + 22;
        else {
            x = (GameThread.mapEndPosition[0][0] * 45) + 62 + 22;
            y = (GameThread.mapEndPosition[0][1] * 45) + 30;
            uiUpperImage[upper_slash].drawAtPointOption(x, (float) (y - 1), 17);
            uiUpperImage[upper_heart].drawAtPointOption((float) (x - 37), y, 18);
            GameRenderer.drawNumberBlock(st.Life, numberLifeImage, (float) (x - 2), y, -1, 20, 2);
            GameRenderer.drawNumberBlock(DataStage.maxLife, numberLifeImage, x + 2, y, -1, 18, 2);
        }
        y = ((GameThread.mapEndPosition[0][1] * 45) + 30) - 22;
        uiUpperImage[upper_slash].drawAtPointOption(x, (float) (y - 1), 17);
        float f2 = y;
        uiUpperImage[upper_heart].drawAtPointOption((float) (x - 37), f2, 18);
        GameRenderer.drawNumberBlock(st.Life, numberLifeImage, (float) (x - 2), f2, -1, 20, 2);
        GameRenderer.drawNumberBlock(DataStage.maxLife, numberLifeImage, x + 2, f2, -1, 18, 2);
    }

    public void drawSimpleTowerUnit(int type, boolean hero, float x, float y) {
        if (type == -1)
            return;

        int[] drawData;
        Texture2D[] textures;
        if (hero) {
            drawData = DataAnim.towerDrawData[type];
            textures = st.page.towerImages[type];
        } else {
            drawData = DataAnim.heroDrawData[type];
            textures = st.page.heroImages[type];
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
                textures[drawData[i7]].drawAtPointOption(x + drawData[i7 + 1], y + drawData[i7 + 2] + 10.0f, 18);
            else
                textures[drawData[i7]].drawAtPointOptionFlip(x + drawData[i7 + 1], y + drawData[i7 + 2] + 10.0f, 18);

            if (drawData[i8] != 1000) {
                Texture2D.setColors(1);
            }
        }
    }

    public void drawAddGridBlock() {
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.15f, 0.15f, 0.15f, 0.15f);
        for (int i = 0; i <= 15; i++) {
            fillWhiteImage.fillRect((i * 45) + 62, 30.0f, 1.0f, 450.0f);
        }
        for (int i2 = 0; i2 <= 10; i2++) {
            fillWhiteImage.fillRect(62.0f, (i2 * 45) + 30, 675.0f, 1.0f);
        }
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void drawAddRangeCircle(int i, int i2, int i3, float f, float f2, boolean z) {
        float f3;
        int upgradeUnitRate;
        if (i2 == -1) {
            return;
        }
        if (i == 1) {
            f3 = DataCharacter.charData[i2][4];
            int i4 = DataCharacter.charData[i2][11];
            if (i4 == 0) {
                upgradeUnitRate = GameThread.getUpgradeUnitRate(1, 9);
            } else if (i4 == 1) {
                upgradeUnitRate = GameThread.getUpgradeUnitRate(2, 9);
            } else if (i4 == 2) {
                upgradeUnitRate = GameThread.getUpgradeUnitRate(3, 9);
            }
            f3 += (upgradeUnitRate * f3) / 100.0f;
        } else if (i != 4) {
            f3 = 0.0f;
        } else {
            f3 = DataHero.heroData[i2][3];
            upgradeUnitRate = GameThread.getUpgradeItemRate(i3, 4);
            f3 += (upgradeUnitRate * f3) / 100.0f;
        }
        if (f3 <= 0.0f) {
            return;
        }
        if (z) {
            if (f3 <= 100.0f) {
                whiteCircleImage[0].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 100.0f);
                return;
            }
            if (f3 <= 200.0f) {
                whiteCircleImage[1].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 200.0f);
                return;
            } else if (f3 <= 300.0f) {
                whiteCircleImage[2].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 300.0f);
                return;
            } else {
                whiteCircleImage[3].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 400.0f);
                return;
            }
        }
        if (f3 <= 100.0f) {
            redCircleImage[0].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 100.0f);
            return;
        }
        if (f3 <= 200.0f) {
            redCircleImage[1].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 200.0f);
        } else if (f3 <= 300.0f) {
            redCircleImage[2].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 300.0f);
        } else {
            redCircleImage[3].drawAtPointOptionSize(f, f2, 9, (f3 * 0.9f) / 400.0f);
        }
    }

    public void drawUnitRangeCircle(int i, float f, float f2) {
        if (GameThread.towerUnit[i].attackRange <= 100) {
            whiteCircleImage[0].drawAtPointOptionSize((f / 50.0f) + 62.0f, (f2 / 50.0f) + 30.0f, 9, (GameThread.towerUnit[i].attackRange * 0.9f) / 100.0f);
            return;
        }
        if (GameThread.towerUnit[i].attackRange <= 200) {
            whiteCircleImage[1].drawAtPointOptionSize((f / 50.0f) + 62.0f, (f2 / 50.0f) + 30.0f, 9, (GameThread.towerUnit[i].attackRange * 0.9f) / 200.0f);
        } else if (GameThread.towerUnit[i].attackRange <= 300) {
            whiteCircleImage[2].drawAtPointOptionSize((f / 50.0f) + 62.0f, (f2 / 50.0f) + 30.0f, 9, (GameThread.towerUnit[i].attackRange * 0.9f) / 300.0f);
        } else {
            whiteCircleImage[3].drawAtPointOptionSize((f / 50.0f) + 62.0f, (f2 / 50.0f) + 30.0f, 9, (GameThread.towerUnit[i].attackRange * 0.9f) / 400.0f);
        }
    }
}