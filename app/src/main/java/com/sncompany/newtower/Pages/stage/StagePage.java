package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.Battle.EnemyUnit;
import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataMonster;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataWave;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.CinematicPage;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public class StagePage extends StageBase {
    /**
     * Contains all the dialog for reward attaining.
     */
    static final int[][] rewardInfos = {
            {R.string.unlk_hero, R.string.unlk_hero2, R.string.unlk_hero1},
            {R.string.unlk_points, R.string.unlk_points0},
            {R.string.unlk_hero, R.string.unlk_hero3, R.string.unlk_hero1},
            {R.string.unlk_upgr, R.string.unlk_upgr1, R.string.unlk_upgr2},
            {R.string.unlk_hero, R.string.unlk_hero4, R.string.unlk_hero1},
            {R.string.unlk_cap, R.string.unlk_cap1},
            {R.string.reward_hero, R.string.reward_hero_s},
            {R.string.unlk_points, R.string.unlk_points0},
            {R.string.unlk_item, R.string.unlk_item1},
            {R.string.unlk_points, R.string.unlk_points0}
    };
    private enum STATE {
        START,
        PLAYING,
        CLEAR,
        GAMEOVER,
        PAUSE
    }
    private static final int[] specialSwordResource = {R.drawable.special_sword_blade0, R.drawable.special_sword_blade1, R.drawable.special_sword_blade2, R.drawable.special_sword_blade3, R.drawable.special_sword_body, R.drawable.special_sword_background, R.drawable.special_sword_lineb, R.drawable.special_sword_linem, R.drawable.special_sword_lines, R.drawable.special_sword_wind0, R.drawable.special_sword_wind1, R.drawable.special_sword_wind2};
    private static final int[] specialArrowResource = {R.drawable.special_arrow_arrow_center1, R.drawable.special_arrow_arrow_center2, R.drawable.special_arrow_arrow_center3, R.drawable.special_arrow_arrow_center4, R.drawable.special_arrow_arrow_left1, R.drawable.special_arrow_arrow_left2, R.drawable.special_arrow_arrow_left3, R.drawable.special_arrow_arrow_left4, R.drawable.special_arrow_arrow_right1, R.drawable.special_arrow_arrow_right2, R.drawable.special_arrow_arrow_right3, R.drawable.special_arrow_arrow_right4, R.drawable.special_arrow_land, R.drawable.special_arrow_body, R.drawable.special_arrow_body2, R.drawable.special_arrow_background, R.drawable.special_arrow_lineb, R.drawable.special_arrow_linem, R.drawable.special_arrow_lines, R.drawable.special_arrow_unit};
    public static final int[] specialIceResource = {R.drawable.special_ice_body, R.drawable.special_ice_background, R.drawable.special_ice_unit, R.drawable.special_ice_1, R.drawable.special_ice_2, R.drawable.special_ice_3, R.drawable.special_ice_4, R.drawable.special_ice_5, R.drawable.special_ice_6, R.drawable.special_ice_7, R.drawable.special_ice_8, R.drawable.special_ice_9, R.drawable.special_ice_10, R.drawable.special_ice_11, R.drawable.special_ice_12, R.drawable.special_ice_13, R.drawable.special_ice_14, R.drawable.special_ice_lineb, R.drawable.special_ice_linem, R.drawable.special_ice_lines};
    public static final int[] arrowResource0 = {R.drawable.arrow_0_0};
    public static final int[] arrowResource1 = {R.drawable.arrow_1_0, R.drawable.arrow_1_1};
    public static final int[] arrowResource2 = {R.drawable.arrow_2_0, R.drawable.arrow_2_1};
    public static final int[] arrowResource3 = {R.drawable.arrow_3_0, R.drawable.arrow_3_1};
    public static final int[] arrowResource4 = {R.drawable.arrow_4_0, R.drawable.arrow_4_1, R.drawable.arrow_4_2, R.drawable.arrow_4_3, R.drawable.arrow_4_4, R.drawable.arrow_4_5};
    public static final int[] arrowResource9 = {R.drawable.arrow_9_0, R.drawable.arrow_9_1};
    public static final int[] numberClearResource = {R.drawable.num_clear_0, R.drawable.num_clear_1, R.drawable.num_clear_2, R.drawable.num_clear_3, R.drawable.num_clear_4, R.drawable.num_clear_5, R.drawable.num_clear_6, R.drawable.num_clear_7, R.drawable.num_clear_8, R.drawable.num_clear_9};
    public static final int[] numberTotalResource = {R.drawable.num_total_0, R.drawable.num_total_1, R.drawable.num_total_2, R.drawable.num_total_3, R.drawable.num_total_4, R.drawable.num_total_5, R.drawable.num_total_6, R.drawable.num_total_7, R.drawable.num_total_8, R.drawable.num_total_9};
    public static final int[] stageClearResource = {R.drawable.ui_clear_background, R.drawable.ui_clear_clear, R.drawable.ui_clear_fail, R.drawable.ui_clear_totalscore, R.drawable.ui_clear_heroism, R.drawable.ui_clear_nextstageoff, R.drawable.ui_clear_nextstageon, R.drawable.ui_clear_upgradeoff, R.drawable.ui_clear_upgradeon, R.drawable.ui_clear_stageselectoff, R.drawable.ui_clear_stageselecton, R.drawable.ui_clear_retryoff, R.drawable.ui_clear_retryon, R.drawable.ui_clear_perfect, R.drawable.ui_clear_bonus, R.drawable.ui_clear_iconskill, R.drawable.ui_clear_iconspe, R.drawable.ui_clear_iconitem, R.drawable.ui_clear_iconheroism, R.drawable.ui_clear_iconhero1, R.drawable.ui_clear_iconhero2, R.drawable.ui_clear_iconhero3, R.drawable.ui_clear_iconattup, R.drawable.ui_clear_p, R.drawable.ui_clear_e, R.drawable.ui_clear_r, R.drawable.ui_clear_f, R.drawable.ui_clear_c, R.drawable.ui_clear_t, R.drawable.ui_clear_1};
    public static final int[] ingameResource = {R.drawable.ui_ingame_paused, R.drawable.ui_ingame_resumeoff, R.drawable.ui_ingame_resumeon, R.drawable.ui_ingame_restartoff, R.drawable.ui_ingame_restarton, R.drawable.ui_ingame_stageoff, R.drawable.ui_ingame_stageon};
    public static final int[] uiThemeclearResource = {R.drawable.ui_themeclear_background, R.drawable.ui_themeclear_map1, R.drawable.ui_themeclear_map2, R.drawable.ui_themeclear_icon, R.drawable.ui_themeclear_glow, R.drawable.ui_themeclear_arrow, R.drawable.ui_themeclear_iconblack};

    public static final int[] uiCharButtonResource = {R.drawable.ui_char_button_class_off, R.drawable.ui_char_button_class_on, R.drawable.ui_char_button_lvlup_off, R.drawable.ui_char_button_lvlup_on, R.drawable.ui_char_button_ok_off, R.drawable.ui_char_button_ok_on, R.drawable.ui_char_button_sell_off, R.drawable.ui_char_button_sell_on, R.drawable.ui_char_button_spe_dancing_blade_off, R.drawable.ui_char_button_spe_dancing_blade_on, R.drawable.ui_char_button_spe_millon_arrow_off, R.drawable.ui_char_button_spe_millon_arrow_on, R.drawable.ui_char_button_spe_ice_quake_off, R.drawable.ui_char_button_spe_ice_quake_on, R.drawable.ui_char_button_lvluphero_off, R.drawable.ui_char_button_lvluphero_on, R.drawable.ui_char_button_1_off, R.drawable.ui_char_button_1_on, R.drawable.ui_char_button_2_off, R.drawable.ui_char_button_2_on, R.drawable.ui_char_button_3_off, R.drawable.ui_char_button_3_on, R.drawable.ui_char_button_4_off, R.drawable.ui_char_button_4_on, R.drawable.ui_char_button_5_off, R.drawable.ui_char_button_5_on};
    public static final int[] uiCharEtcResource = {R.drawable.ui_char_etc_background, R.drawable.ui_char_etc_stat, R.drawable.ui_char_etc_lv, R.drawable.ui_char_etc_1, R.drawable.ui_char_etc_2, R.drawable.ui_char_etc_3, R.drawable.ui_char_etc_4, R.drawable.ui_char_etc_5, R.drawable.ui_char_etc_hero, R.drawable.ui_char_etc_specialdancingblade, R.drawable.ui_char_etc_specialmillionarrow, R.drawable.ui_char_etc_specialicequake, R.drawable.ui_char_etc_backline};
    public static final int[] uiCharFaceResource = {R.drawable.ui_char_face_warrior, R.drawable.ui_char_face_manatarms, R.drawable.ui_char_face_knight, R.drawable.ui_char_face_warlord, R.drawable.ui_char_face_archer, R.drawable.ui_char_face_holyeye, R.drawable.ui_char_face_splatter, R.drawable.ui_char_face_skybeholder, R.drawable.ui_char_face_wizard, R.drawable.ui_char_face_colddiviner, R.drawable.ui_char_face_warlock, R.drawable.ui_char_face_magmablaster, R.drawable.ui_char_face_hero0, R.drawable.ui_char_face_hero1, R.drawable.ui_char_face_hero2};
    public static final int[] uiCharNameResource = {R.drawable.ui_char_name_warrior, R.drawable.ui_char_name_manatarms, R.drawable.ui_char_name_knight, R.drawable.ui_char_name_warlord, R.drawable.ui_char_name_archer, R.drawable.ui_char_name_holyeye, R.drawable.ui_char_name_splatter, R.drawable.ui_char_name_skybeholder, R.drawable.ui_char_name_wizard, R.drawable.ui_char_name_colddiviner, R.drawable.ui_char_name_warlock, R.drawable.ui_char_name_blaster, R.drawable.ui_char_name_hero0, R.drawable.ui_char_name_hero1, R.drawable.ui_char_name_hero2};
    public static final int[] uiCharUpFaceResource = {R.drawable.ui_char_up_face_knight, R.drawable.ui_char_up_face_warlord, R.drawable.ui_char_up_face_splatter, R.drawable.ui_char_up_face_skybeholder, R.drawable.ui_char_up_face_warlock, R.drawable.ui_char_up_face_magmablaster};
    public static final int[] uiMonsterEtcResource = {R.drawable.ui_monster_etc_background, R.drawable.ui_monster_etc_stat, R.drawable.ui_monster_etc_nextwave, R.drawable.ui_monster_etc_warning, R.drawable.ui_monster_etc_warningglow};
    public static final int[] uiMonsterFaceResource = {R.drawable.ui_monster_face__0skulldog, R.drawable.ui_monster_face__1zombie, R.drawable.ui_monster_face__2lamia, R.drawable.ui_monster_face__3imp, R.drawable.ui_monster_face__4wraith, R.drawable.ui_monster_face__5hollowskull, R.drawable.ui_monster_face__6zombieturtle, R.drawable.ui_monster_face__7ninetail, R.drawable.ui_monster_face__8vampire, R.drawable.ui_monster_face__9swordwraith, R.drawable.ui_monster_face__10boneworm, R.drawable.ui_monster_face__11zombieknight, R.drawable.ui_monster_face__12ukiona, R.drawable.ui_monster_face__13succubus, R.drawable.ui_monster_face__14wraithbishop, R.drawable.ui_monster_face_a1ogrezombie, R.drawable.ui_monster_face_a2deviltiger, R.drawable.ui_monster_face_b1mudman, R.drawable.ui_monster_face_b2swampwoman, R.drawable.ui_monster_face_c1spinx, R.drawable.ui_monster_face_c2mummy, R.drawable.ui_monster_face_d1salamander, R.drawable.ui_monster_face_d2magmarock, R.drawable.ui_monster_face_e1demon, R.drawable.ui_monster_face_e2grimdevil, R.drawable.ui_monster_face_boss1skullgiant, R.drawable.ui_monster_face_boss2rich, R.drawable.ui_monster_face_boss3fallenangel, R.drawable.ui_monster_face_boss4lilis, R.drawable.ui_monster_face_boss5wraithking, R.drawable.ui_monster_face_ex1zombiegirl};
    public static final int[] uiMonsterNameResource = {R.drawable.ui_monster_name__0skulldog, R.drawable.ui_monster_name__1zombie, R.drawable.ui_monster_name__2lamia, R.drawable.ui_monster_name__3imp, R.drawable.ui_monster_name__4wraith, R.drawable.ui_monster_name__5hollowskull, R.drawable.ui_monster_name__6zombieturtle, R.drawable.ui_monster_name__7ninetail, R.drawable.ui_monster_name__8vampire, R.drawable.ui_monster_name__9swordwraith, R.drawable.ui_monster_name__10boneworm, R.drawable.ui_monster_name__11zombieknight, R.drawable.ui_monster_name__12ukiona, R.drawable.ui_monster_name__13succubus, R.drawable.ui_monster_name__14wraithbishop, R.drawable.ui_monster_name_a1ogrezombie, R.drawable.ui_monster_name_a2deviltiger, R.drawable.ui_monster_name_b1mudman, R.drawable.ui_monster_name_b2swampwoman, R.drawable.ui_monster_name_c1spinx, R.drawable.ui_monster_name_c2mummy, R.drawable.ui_monster_name_d1salamander, R.drawable.ui_monster_name_d2magmarock, R.drawable.ui_monster_name_e1demon, R.drawable.ui_monster_name_e2grimdevil, R.drawable.ui_monster_name_boss1skullgiant, R.drawable.ui_monster_name_boss2rich, R.drawable.ui_monster_name_boss3fallenangel, R.drawable.ui_monster_name_boss4lilis, R.drawable.ui_monster_name_boss5wraithking, R.drawable.ui_monster_name_ex1zombiegirl};

    public final Texture2D[] specialArrowImage = new Texture2D[specialArrowResource.length], specialIceImage = new Texture2D[specialIceResource.length], specialSwordImage = new Texture2D[specialSwordResource.length];
    public final Texture2D[] arrowImage0 = new Texture2D[arrowResource0.length], arrowImage1 = new Texture2D[arrowResource1.length], arrowImage2 = new Texture2D[arrowResource2.length], arrowImage3 = new Texture2D[arrowResource3.length], arrowImage4 = new Texture2D[arrowResource4.length], arrowImage9 = new Texture2D[arrowResource9.length];
    public final Texture2D[] uiIngameImage = new Texture2D[ingameResource.length], uiThemeclearImage = new Texture2D[uiThemeclearResource.length], numberClearImage = new Texture2D[numberClearResource.length],
            numberTotalImage = new Texture2D[numberTotalResource.length], stageClearImage = new Texture2D[stageClearResource.length],
            uiCharButtonImage = new Texture2D[uiCharButtonResource.length], uiCharEtcImage = new Texture2D[uiCharEtcResource.length], uiCharFaceImage = new Texture2D[uiCharFaceResource.length], uiCharNameImage = new Texture2D[uiCharNameResource.length],
            uiCharUpFaceImage = new Texture2D[uiCharUpFaceResource.length], uiMonsterEtcImage = new Texture2D[uiMonsterEtcResource.length], uiMonsterFaceImage = new Texture2D[uiMonsterFaceResource.length], uiMonsterNameImage = new Texture2D[uiMonsterNameResource.length];

    public final Texture2D[][] effectImages = new Texture2D[DataAnim.effectDrawResource.length][];
    private int startViewCount, rewardShowOrder = -1;
    public int upgradeCount = 0, specialBlinkCount = 0, characterMenuMonsterViewCount, characterMenuMonsterStartViewCount, levelUpCount = 0, darkViewCount = 0, monsterGoalBlinkCount = 0;
    private STATE state = STATE.START;
    private byte substate;
    private short rwd_hero;

    private static final byte PLAY_HEROS = 6, PLAY_PAUSE = 10, PLAY_SOFTPAUSE = 11, PLAY_TURBO = 12, CHARMENU_SELL = 0, CHARMENU_UPGRADE = 1, CHARMENU_LVL = 2, CHARMENU_SPECIAL = 3, CHARMENU_BODY = 4, CHARMENU_NO = 5, CHARMENU_YES = 7;
    private static final byte SEL_DEF = 0, SEL_USPWN = 1, SEL_HERO = 2, SEL_HSPWN = 3, SEL_CHARMENU = 4, SEL_UPGRMENU = 5, SEL_LVMENU = 6, SEL_HEROMENU = 7;
    private static final byte VIC_DEF = 0, VIC_PERFECT = 1, VIC_MAPUNLK = 2, VIC_RWDULK = 3, VIC_MENU = 4, VIC_TOMAP = 5, VIC_TOUPGR = 6, VIC_NEXTST = 7, VTCH_MAP = 0, VTCH_UPG = 1, VTCH_NEXT = 2;

    public StagePage(TPage par, DataStage s) {
        super(par, s);

        for (int i = 0; i < 11; i++) {
            if (i < 8)
                myOscillator[i].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
            else
                myOscillator[i].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
            myOscillator[i].fastForward();
        }
    }

    @Override
    public void load(Consumer<Float> prog) {
        super.load(prog);
        int tot2 = specialArrowImage.length + specialIceImage.length + specialSwordImage.length + arrowImage0.length + arrowImage1.length + arrowImage2.length + arrowImage3.length + arrowImage4.length +
                arrowImage9.length + effectImages.length + uiIngameImage.length + uiThemeclearImage.length + numberClearImage.length + numberTotalImage.length + stageClearImage.length + uiCharButtonImage.length
                + uiCharEtcImage.length + uiCharFaceImage.length + uiCharNameImage.length + uiCharUpFaceImage.length + uiMonsterEtcImage.length + uiMonsterFaceImage.length + uiMonsterNameImage.length;
        int lod = loadP(specialArrowImage, specialArrowResource, prog, 0, tot2);
        lod = loadP(specialIceImage, specialIceResource, prog, lod, tot2);
        lod = loadP(specialSwordImage, specialSwordResource, prog, lod, tot2);
        lod = loadP(arrowImage0, arrowResource0, prog, lod, tot2);
        lod = loadP(arrowImage1, arrowResource1, prog, lod, tot2);
        lod = loadP(arrowImage2, arrowResource2, prog, lod, tot2);
        lod = loadP(arrowImage3, arrowResource3, prog, lod, tot2);
        lod = loadP(arrowImage4, arrowResource4, prog, lod, tot2);
        lod = loadP(arrowImage9, arrowResource9, prog, lod, tot2);
        for (int i = 0; i < effectImages.length; i++) {
            effectImages[i] = new Texture2D[DataAnim.effectDrawResource[i].length];
            for (int j = 0; j < effectImages[i].length; j++)
                effectImages[i][j] = new Texture2D(DataAnim.effectDrawResource[i][j]);
            if (prog != null)
                prog.accept((lod++ + 1f) / tot2);
        }
        lod = loadP(uiIngameImage, ingameResource, prog, lod, tot2);
        lod = loadP(uiThemeclearImage, uiThemeclearResource, prog, lod, tot2);
        lod = loadP(numberClearImage, numberClearResource, prog, lod, tot2);
        lod = loadP(numberTotalImage, numberTotalResource, prog, lod, tot2);
        lod = loadP(stageClearImage, stageClearResource, prog, lod, tot2);
        lod = loadP(uiCharButtonImage, uiCharButtonResource, prog, lod, tot2);
        lod = loadP(uiCharEtcImage, uiCharEtcResource, prog, lod, tot2);
        lod = loadP(uiCharFaceImage, uiCharFaceResource, prog, lod, tot2);
        lod = loadP(uiCharNameImage, uiCharNameResource, prog, lod, tot2);
        lod = loadP(uiCharUpFaceImage, uiCharUpFaceResource, prog, lod, tot2);
        lod = loadP(uiMonsterEtcImage, uiMonsterEtcResource, prog, lod, tot2);
        lod = loadP(uiMonsterFaceImage, uiMonsterFaceResource, prog, lod, tot2);
        lod = loadP(uiMonsterNameImage, uiMonsterNameResource, prog, lod, tot2);
        loaded = true;
        if (prog != null)
            prog.accept(1f);
        GameThread.playLoopSound(2);
    }

    @Override
    public void unload() {
        for (Texture2D img : specialArrowImage)
            img.dealloc();
        for (Texture2D img : specialIceImage)
            img.dealloc();
        for (Texture2D img : specialSwordImage)
            img.dealloc();
        for (Texture2D img : arrowImage0)
            img.dealloc();
        for (Texture2D img : arrowImage1)
            img.dealloc();
        for (Texture2D img : arrowImage2)
            img.dealloc();
        for (Texture2D img : arrowImage3)
            img.dealloc();
        for (Texture2D img : arrowImage4)
            img.dealloc();
        for (Texture2D img : arrowImage9)
            img.dealloc();
        for (Texture2D img : uiIngameImage)
            img.dealloc();
        for (Texture2D img : uiThemeclearImage)
            img.dealloc();
        for (Texture2D img : numberClearImage)
            img.dealloc();
        for (Texture2D img : numberTotalImage)
            img.dealloc();
        for (Texture2D img : stageClearImage)
            img.dealloc();
        for (Texture2D[] imgs : effectImages)
            for (Texture2D img : imgs)
                img.dealloc();
        for (Texture2D img : uiCharButtonImage)
            img.dealloc();
        for (Texture2D img : uiCharEtcImage)
            img.dealloc();
        for (Texture2D img : uiCharFaceImage)
            img.dealloc();
        for (Texture2D img : uiCharNameImage)
            img.dealloc();
        for (Texture2D img : uiCharUpFaceImage)
            img.dealloc();
        for (Texture2D img : uiMonsterEtcImage)
            img.dealloc();
        for (Texture2D img : uiMonsterFaceImage)
            img.dealloc();
        for (Texture2D img : uiMonsterNameImage)
            img.dealloc();
        loaded = false;
    }

    @Override
    public void update() {
        switch (state) {
            case START:
                myOscillator[11].updatePosition();
                if (startViewCount != 15) {
                    startViewCount++;
                    if (startViewCount >= 35)
                        state = STATE.PLAYING;
                }
                break;
            case PLAYING:
                for (int i = 0; i < 11; i++)
                    myOscillator[i].updatePosition();

                if (upgradeCount > 0)
                    upgradeCount--;
                if (levelUpCount > 0)
                    levelUpCount--;
                if (softPause) {
                    int spd = Math.max(st.turbo, 1);
                    for (int i = 0; i < spd; i++)
                        st.updateEffects(true);
                    return;
                }
                if (specialBlinkCount > 0)
                    specialBlinkCount--;
                if (monsterGoalBlinkCount > 0)
                    monsterGoalBlinkCount--;
                if (st.waveManager.monsterOpenTime > 0)
                    st.waveManager.monsterOpenTime--;

                HeroUnit spe = st.selectedUnit instanceof HeroUnit ? (HeroUnit)st.selectedUnit : null;
                if (st.selectedUnit == null) {
                    if (st.waveManager.waveStartT > 0) {
                        for (int i = 0; i < st.turbo; i++) {
                            st.updateNonMonster();
                            if (--st.waveManager.waveStartT > 0)
                                continue;
                            if (st.waveManager.wavePattern == 3) {
                                characterMenuMonsterViewCount = 100;
                                GameThread.playSound(20);
                            } else
                                characterMenuMonsterViewCount = 60;
                            characterMenuMonsterStartViewCount = 0;
                        }
                    } else {
                        if (characterMenuMonsterViewCount > 0) {
                            characterMenuMonsterViewCount--;
                            characterMenuMonsterStartViewCount++;
                            for (int i = 0; i < st.turbo; i++)
                                st.updateNonMonster();
                        } else {
                            for (int i = 0; i < st.turbo; i++) {
                                st.waveManager.monsterWaveUpdate();
                                st.updateEffects(false);
                                st.updateArrowUnit();
                                if (st.updateMonsterUnit()) {
                                    st.sortEntities();
                                    startViewCount = 0;
                                    state = STATE.GAMEOVER;
                                    GameThread.stopLoopSound(2);
                                    GameThread.playSound(11);
                                    if (st.mapType == 1) {
                                        Config.s.highScores[st.SID][1] = Math.max(Config.s.highScores[st.SID][1], st.getTotalScore());
                                        Config.s.stageProg[st.SID][1] = (byte)Math.max(Config.s.stageProg[st.SID][1], (st.waveManager.current > 100 ? 2 : st.waveManager.current > st.waveManager.wcc ? 1 : 0));
                                    }
                                    /*if (st.mapType == 0) {
                                        st.victoryH = (st.waveManager.current * 8) + (st.Life * 10); //This is actually just 0 every time keeeek
                                    } else if (st.mapType == 1) {
                                        st.victoryH = waveManager.current * 15;
                                    } else
                                        st.victoryH = (float)(((st.waveManager.wcc - waveManager.current) * 8) * (SID + 15)) / 15;
                                    if (Config.stageProg[st.SID][0] >= 0)
                                        st.victoryH = (st.victoryH * 7) / 10;*/
                                    //I didn't add this here, but commented it for performance purposes. I think it's better than making it 50 for all instances, but eh gotta stay true to game
                                    st.victoryH = 50;
                                    DataAward.check_heroPoint((int)st.victoryH);
                                    Config.saveFile();
                                    myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
                                    return;
                                }
                                st.updateTowerUnit();
                                st.updateObjectUnit();
                            }
                        }
                    }
                    st.unlockUnit();
                } else if (spe != null && spe.updateSpecial()) {
                    if (spe.specialAttackFrameCount == 60)
                        GameThread.playSound(17 + spe.type);
                    else if (spe.type == 2 && spe.specialAttackFrameCount == 135)
                        st.setReverseSpecialIce();
                    st.updateEffects(false);
                    st.updateArrowUnit();
                } else st.updateEffects(false);

                st.sortEntities();
                int checkWaveAndFinishCheck = st.waveManager.checkWaveAndFinishCheck();
                if (checkWaveAndFinishCheck == 3) {
                    startViewCount = 0;
                    state = STATE.GAMEOVER;
                    GameThread.stopLoopSound(2);
                    GameThread.playSound(11);
                    /*if (mapType == 0)
                        victoryH = (waveManager.current * 8) + (Life * 10);
                    else if (mapType == 1)
                        victoryH = waveManager.current * 15;
                    else
                        victoryH = waveManager.current * 5;
                    if (st.perfectClear())
                        st.victoryH *= 2;*/
                    st.victoryH = 50;
                    DataAward.check_heroPoint((int)st.victoryH);
                    Config.saveFile();
                    myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
                    return;
                } else if (checkWaveAndFinishCheck != 1)
                    return;
                GameThread.stopLoopSound(2); //win
                GameThread.playSound(10);

                if (st.SID + 1 < 50)
                    Config.s.stageProg[st.SID + 1][0] = 0;
                if (st.perfectClear())
                    Config.s.stageProg[st.SID][st.mapType] = 2;
                else {
                    if (st.life == 1)
                        Config.s.awardValues[DataAward.AWARD_Narrowly_Victory] = true;
                    Config.s.stageProg[st.SID][st.mapType] = (byte)Math.max(Config.s.stageProg[st.SID][st.mapType], 1);
                }
                Config.s.highScores[st.SID][st.mapType] = Math.max(Config.s.highScores[st.SID][st.mapType], st.getTotalScore());

                int wus = 0;
                boolean archerOnly = true, mageOnly = true;
                for (TowerUnit twr : st.towerUnit) {
                    if (twr.attackCount == 0)
                        Config.s.awardValues[DataAward.AWARD_Surplus] = true;
                    if (!(twr instanceof HeroUnit)) {
                        wus |= 1 << twr.type;
                        archerOnly &= twr.getRole() == 1;
                        mageOnly &= twr.getRole() == 2;
                    }
                }
                if (wus == 4095)
                    Config.s.awardValues[DataAward.AWARD_Full_Party] = true;
                else if (wus < 16)
                    Config.s.awardValues[DataAward.AWARD_Warriors_March] = true;
                else if (archerOnly)
                    Config.s.awardValues[DataAward.AWARD_Snipers_Toast] = true;
                else if (mageOnly)
                    Config.s.awardValues[DataAward.AWARD_Mages_Rally] = true;

                /*if (st.mapType == 0)
                    st.victoryH = (st.SID * 20) + 50 + (st.waveManager.wcc * 8) + (st.life * 10);
                else if (st.mapType == 1)
                    st.victoryH = 0;
                else
                    st.victoryH = (st.SID * 10) + (st.waveManager.current * 8) + (st.life * 3);*/
                st.victoryH = 100;
                DataAward.check_heroPoint((int)st.victoryH);

                int[] srds = new int[]{0, 14, 9, 4, 24, 19, 29, 34, 39, 44};
                for (int i = 0; i < srds.length; i++)
                    if (st.SID == srds[i] && !Config.s.rewardValues[i]) {
                        Config.s.rewardValues[i] = true;
                        rewardShowOrder = i;
                        switch (i) {
                            case 9:
                                rwd_hero += 1500; //3500
                            case 7:
                                rwd_hero += 500; //2000
                            case 1:
                                DataAward.check_heroPoint(rwd_hero += 1500);
                                break;
                            case 0:
                            case 2:
                            case 4:
                                DataStage.heroAvail[i / 2] = true;
                                break;
                            case 8:
                                Config.s.rewardValues[8] = getItem(15);
                                if (!Config.s.rewardValues[8])
                                    rewardShowOrder = -2;
                                break;
                        }
                    }
                DataAward.clear_award(st.SID);
                Config.saveFile();

                state = STATE.CLEAR;
                myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                for (int i = 12; i < myOscillator.length; i++)
                    myOscillator[i].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
                break;
            case CLEAR:
                st.updateEffects(false);
                st.sortEntities();
                if (substate == VIC_DEF) {
                    myOscillator[11].updatePosition();
                } else if (substate == VIC_MENU && startViewCount < 270) {
                    if (startViewCount % 30 == 10)
                        GameThread.playSound(15);
                    startViewCount++;
                } else if (substate == VIC_MAPUNLK) {
                    darkViewCount++;
                    if (darkViewCount >= 198)
                        substate = VIC_MENU;
                } else if (substate == VIC_PERFECT) {
                    for (int i = 12; i < myOscillator.length; i++) {
                        myOscillator[i].updatePosition();
                        if (myOscillator[i].currentCount < 5)
                            break;
                    }
                    if (myOscillator[19].currentCount >= 60) {
                        if (rewardShowOrder >= 0) {
                            substate = VIC_RWDULK;
                        } else if (st.SID % 10 == 9 && st.SID != 49) {
                            darkViewCount = 0;
                            substate = VIC_MAPUNLK;
                        } else
                            substate = VIC_MENU;
                    }
                }
                if (substate < VIC_TOMAP)
                    return;
                darkViewCount++;
                if (darkViewCount >= 45) {
                    if (st.SID < 49) {
                        Config.s.lastPlayed++;
                        Config.saveFile();
                    }
                    if (substate == VIC_TOMAP) {
                        NewTower.switchPage(parent, true); //Stage select
                    } else if (substate == VIC_TOUPGR) {
                        NewTower.switchPage(parent.parent, true); //TODO - Make it switch to list upgrade page
                    } else
                        NewTower.switchPage(new StagePage(parent, new DataStage(DataMap.loadMap(st.SID + 1), st.mapType)), true);
                }
                break;
            case GAMEOVER:
                st.updateEffects(false);
                st.sortEntities();
                if (substate == 0) {
                    if (startViewCount < 70)
                        startViewCount++;
                    if (startViewCount >= 70)
                        myOscillator[11].updatePosition();
                } else if (substate == 1) {
                    if (startViewCount % 30 == 0 && startViewCount <= 240)
                        GameThread.playSound(15);
                    startViewCount++;
                }
                if (substate < 2)
                    return;
                darkViewCount++;
                if (darkViewCount >= 45) {
                    if (substate == 2) {
                        NewTower.switchPage(parent.parent, true); //TODO Make it actually switch to upgrade
                    } else if (substate == 3) {
                        restart();
                    } else
                        NewTower.switchPage(parent, true);
                }
                break;
            case PAUSE:
                st.sortEntities();
                if (substate < 1)
                    return;
                darkViewCount++;
                if (darkViewCount >= 45) {
                    if (substate == 1)
                        restart();
                    else
                        NewTower.switchPage(parent, true);
                }
                break;
        }
    }

    public boolean getItem(int id) {
        int slot = -1;
        for (int i = 0; i < Config.s.inventory.length; i++)
            if (Config.s.inventory[i] == null) {
                slot = i;
                break;
            }
        if (slot == -1)
            return false;

        int rid = id - 1;
        Config.s.inventory[slot] = new byte[]{(byte) (rid / 4), (byte) (rid % 4)};
        return true;
    }

    private void restart() {
        GameThread.playSound(14);
        st.restart();
        startViewCount = 0;
        darkViewCount = 0;
        substate = 0;
        inGamePause = false;
        st.turbo = 1;
        softPause = false;
        state = STATE.START;
        GameThread.playLoopSound(2);
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        switch (state) {
            case START: {
                tmap.checkBackBase();
                tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0, 0, 18);
                backShadowImage.drawAtPointOption(0, 0, 18);
                drawMapTile(gl10);
                drawAllUnit(gl10);
                drawPlayingUi(true);

                float alpha = Math.min(1, startViewCount < 15 ? 1 - ((startViewCount * 0.5f) / 15) : 0.5f - (((startViewCount - 15) * 0.5f) / 20));
                if (alpha > 0) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(alpha);
                    fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1);
                }
                float walpha = Math.min(1, startViewCount < 15 ? startViewCount / 15f : 1 - ((startViewCount - 15) / 20f));
                if (walpha > 0) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(walpha);
                    GameRenderer.setFontDoubleColor(-1, -16702370);
                    GameRenderer.setFontSize(50);
                    GameRenderer.drawStringDoubleM(GameThread.chapterName[st.SID / 10], GameRenderer.CX, 115, 9);
                    GameRenderer.setFontSize(35);
                    GameRenderer.drawStringDoubleM(String.format(GameThread.getString(R.string.start_stind), st.SID + 1), 183, 220, 18);
                    GameRenderer.drawStringDoubleM(String.format(GameThread.getString(R.string.start_wvind), st.waveManager.wcc), 435, 220, 18);
                    if (st.SID % 10 == 9)
                        uiUpperImage[upper_bossstage].drawAtPointOption(GameRenderer.CX, 308, 17);

                    GameRenderer.setFontDoubleColor(-65703, -9816043);
                    GameRenderer.setFontSize(25);
                    GameRenderer.drawStringDoubleM(GameThread.getString(R.string.start_battle), GameRenderer.CX, 391, 17);
                    Texture2D.setColors(1);
                }
                TouchManager.clearTouchMap();
                TouchManager.addTouchRectListData(0, CGRect.make(0, 0, GameRenderer.SCRWIDTH, GameRenderer.SCRHEIGHT));
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 1;
                TouchManager.swapTouchMap();
                break;
            } case PLAYING:
                paint_GAME_PLAYING(gl10, init);
                break;
            case PAUSE: {
                paint_GAME_PLAYING(gl10, false);
                TouchManager.clearTouchMap();
                TouchManager.addTouchRectListData(0, CGRect.make(300, 136, 201, 61));
                TouchManager.addTouchRectListData(1, CGRect.make(300, 236, 201, 61));
                TouchManager.addTouchRectListData(2, CGRect.make(300, 336, 201, 61));
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 3;
                int cTLS = TouchManager.checkTouchListStatus();
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(0.5f);
                fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                Texture2D.setColors(1);
                uiIngameImage[0].drawAtPointOption(GameRenderer.CX, 6, 17);
                uiIngameImage[cTLS == 0 ? 2 : 1].drawAtPointOption(GameRenderer.CX, 136, 17);
                uiIngameImage[cTLS == 1 ? 4 : 3].drawAtPointOption(GameRenderer.CX, 236, 17);
                uiIngameImage[cTLS == 2 ? 6 : 5].drawAtPointOption(GameRenderer.CX, 336, 17);

                if (substate != 0) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(darkViewCount * 0.033f);
                    fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1);
                }
                TouchManager.swapTouchMap();
                break;
            } case CLEAR: {
                if (substate == 3)
                    if (uiThemeclearImage[0].name == -1)
                        loadImageResourceToTexture(uiThemeclearImage, uiThemeclearResource);
                tmap.checkBackBase();
                tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0, 0, 18);
                backShadowImage.drawAtPointOption(0, 0, 18);
                drawMapTile(gl10);
                drawAllUnit(gl10);
                drawPlayingUi(false);
                TouchManager.clearTouchMap();
                boolean z = st.mapType == 0 || Config.s.highScores[st.SID + 1][2] == -1;
                switch (substate) {
                    case VIC_DEF: case VIC_PERFECT: case VIC_MAPUNLK:
                        TouchManager.addTouchRectListData(0, CGRect.make(0, 0, GameRenderer.SCRWIDTH, GameRenderer.SCRHEIGHT));
                        break;
                    case VIC_MENU:
                        if (startViewCount < 270) {
                            TouchManager.addTouchRectListData(0, CGRect.make(0, 0, GameRenderer.SCRWIDTH, GameRenderer.SCRHEIGHT));
                        } else if (st.mapType == 1) {
                            TouchManager.addTouchRectListData(VTCH_MAP, CGRect.make(338, 382, 125, 58));
                        } else if (st.SID == 49) {
                            TouchManager.addTouchRectListData(VTCH_MAP, CGRect.make(210, 382, 381, 43));
                        } else {
                            TouchManager.addTouchRectListData(VTCH_MAP, CGRect.make(156, 382, 125, 58));
                            TouchManager.addTouchRectListData(VTCH_UPG, CGRect.make(338, 382, 125, 58));
                            if (z)
                                TouchManager.addTouchRectListData(VTCH_NEXT, CGRect.make(520, 382, 125, 58));
                        }
                        break;
                    case VIC_RWDULK:
                        TouchManager.addTouchRectListData(0, CGRect.make(213, 289, 381, 65));
                        break;
                }
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = VTCH_NEXT + 1;
                int cTLS = TouchManager.checkTouchListStatus();
                TouchManager.swapTouchMap();
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(startViewCount < 30 ? startViewCount * GAME_STAGE_CLEAR_START_BLACK_ALPHA : 0.48000002f);
                fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                Texture2D.setColors(1);
                switch (substate) {
                    case VIC_DEF:
                        stageClearImage[1].drawAtPointOption(GameRenderer.CX, 199, 17);
                        break;
                    case VIC_PERFECT:
                        stageClearImage[23].drawAtPointOption(124, myOscillator[12].getCurrentPosition() + 196, 18);
                        stageClearImage[24].drawAtPointOption(202, myOscillator[13].getCurrentPosition() + 196, 18);
                        stageClearImage[25].drawAtPointOption(270, myOscillator[14].getCurrentPosition() + 196, 18);
                        stageClearImage[26].drawAtPointOption(347, myOscillator[15].getCurrentPosition() + 196, 18);
                        stageClearImage[24].drawAtPointOption(416, myOscillator[16].getCurrentPosition() + 196, 18);
                        stageClearImage[27].drawAtPointOption(484, myOscillator[17].getCurrentPosition() + 196, 18);
                        stageClearImage[28].drawAtPointOption(552, myOscillator[18].getCurrentPosition() + 196, 18);
                        stageClearImage[29].drawAtPointOption(623, myOscillator[19].getCurrentPosition() + 196, 18);
                        break;
                    case VIC_MAPUNLK: {
                        uiThemeclearImage[0].drawAtPointOption(0, 0, 18);
                        if (darkViewCount <= 64)
                            uiThemeclearImage[1].drawAtPointOption(200, darkViewCount <= 34 ? (darkViewCount - 34) * 20 : 0, 18);

                        if (darkViewCount > 34) {
                            if (darkViewCount < 64) {
                                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                                Texture2D.setColors(((float) (darkViewCount - 34)) * 0.033f);
                                uiThemeclearImage[2].drawAtPointOption(200, 0, 18);
                                Texture2D.setColors(1);
                            } else
                                uiThemeclearImage[2].drawAtPointOption(200, 0, 18);
                        }
                        int yy = darkViewCount < 88 ? (88 - darkViewCount) * 20 : 0;
                        int chapter = st.SID / 10;
                        for (int i = 0; i < 5; i++) {
                            if (i < chapter) {
                                uiThemeclearImage[4].drawAtPointOption((i * 150) + 17, yy + 222, 18);
                            } else if (i > chapter) {
                                uiThemeclearImage[6].drawAtPointOption((i * 150) + 41, yy + 248, 18);
                            } else {
                                uiThemeclearImage[3].drawAtPointOption(40, yy + 247, 18);

                                if (darkViewCount < 88 || darkViewCount >= 168 || (darkViewCount - 88) % 20 != 1)
                                    uiThemeclearImage[5].drawAtPointOption((chapter * 150) + 132, yy + 258, 18);

                                int i21 = chapter * 150;
                                drawThemeTowerUnit(0, DataStage.heroAvail[0], i21 + 101, yy + 281);
                                drawThemeTowerUnit(DataStage.heroAvail[1] ? 1 : 4, DataStage.heroAvail[1], i21 + 66, yy + 299);
                                drawThemeTowerUnit(DataStage.heroAvail[2] ? 2 : 8, DataStage.heroAvail[2], i21 + 134, yy + 299);

                                GameRenderer.setFontSize(25);
                                GameRenderer.setFontColor(-1);
                                GameRenderer.drawStringM(String.format(GameThread.getString(R.string.theme_ulk), chapter + 1, GameThread.chapterName[chapter]), GameRenderer.CX, yy + 104, 17);
                                if (chapter < 4)
                                    GameRenderer.drawStringM(String.format(GameThread.getString(R.string.theme_ulk1), GameThread.chapterName[chapter + 1]), GameRenderer.CX, yy + 385, 17);
                                i++;
                            }
                        }
                        break;
                    } case VIC_MENU: case VIC_NEXTST: case VIC_TOMAP: case VIC_TOUPGR:
                        float f = startViewCount < 30 ? startViewCount * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            stageClearImage[0].drawAtPointOption(GameRenderer.CX, 6, 17);
                            Texture2D.setColors(1);
                        } else break;
                        GameRenderer.setFontSize(18);
                        GameRenderer.setFontColor(-1);
                        f = startViewCount < 60 ? (startViewCount - 30) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            GameRenderer.drawStringM(GameThread.getString(R.string.score), 259, 108, 18);
                            GameRenderer.drawStringM(String.valueOf((int) st.bScore), 540, 108, 20);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 90 ? (startViewCount - 60) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            GameRenderer.drawStringM(GameThread.getString(R.string.health), 259, 140, 18);
                            GameRenderer.drawStringM(String.format("%d/%d", st.life, DataStage.maxLife), 540, 140, 20);
                            if (st.perfectClear())
                                stageClearImage[13].drawAtPointOption(553, 131, 18);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 120 ? (startViewCount - 90) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            GameRenderer.drawStringM(GameThread.getString(R.string.money), 259, 172, 18);
                            GameRenderer.drawStringM(String.valueOf(st.money), 540, 172, 20);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 150 ? (startViewCount - 120) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            GameRenderer.drawStringM(GameThread.getString(R.string.mana), 259, 206, 18);
                            GameRenderer.drawStringM(String.valueOf(st.mana), 540, 206, 20);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 180 ? (startViewCount - 150) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            stageClearImage[3].drawAtPointOption(270, 257, 18);
                            GameRenderer.drawNumberBlock(st.getTotalScore(), numberTotalImage, 530, 257, 0, 20, 1);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 210 ? (startViewCount - 180) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            stageClearImage[4].drawAtPointOption(287, 288, 18);
                            GameRenderer.drawNumberBlock((int)st.victoryH, numberClearImage, 513, 288, 0, 20, 1);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 240 ? (startViewCount - 210) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(f);
                            GameRenderer.setFontDoubleColor(-1, -15385258);
                            GameRenderer.drawStringDoubleM(GameThread.getString(R.string.highscore), 290, 328, 18);
                            GameRenderer.drawStringDoubleM(String.valueOf(Config.s.highScores[st.SID][st.mapType]), 508, 328, 20);
                            Texture2D.setColors(1);
                        } else break;
                        f = startViewCount < 270 ? (startViewCount - 240) * 0.033f : 1;
                        if (f > 0) {
                            Texture2D.setColors(f);
                            if (st.SID == 49) {
                                uiPopupImage[cTLS == VTCH_MAP ? popup_okon2 : popup_okoff2].drawAtPointOption(210, 382, 18);
                            } else {
                                stageClearImage[cTLS == VTCH_MAP ? 10 : 9].drawAtPointOption(156, 382, 18);
                                stageClearImage[cTLS == VTCH_UPG ? 8 : 7].drawAtPointOption(338, 382, 18);
                                if (z)
                                    stageClearImage[cTLS == VTCH_NEXT ? 6 : 5].drawAtPointOption(520, 382, 18);
                            }
                            Texture2D.setColors(1);
                        }
                        if (substate != VIC_MENU) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(darkViewCount * 0.033f);
                            fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                            Texture2D.setColors(1);
                        }
                        break;
                    case VIC_RWDULK:
                        uiPopupImage[popup_background2].drawAtPointOption(201, 101, 18);
                        stageClearImage[14].drawAtPointOption(291, 111, 18);
                        switch (rewardShowOrder) {
                            case 0:
                                stageClearImage[19].drawAtPointOption(365, 169, 18);
                                break;
                            case 1:
                            case 7:
                            case 9:
                                stageClearImage[18].drawAtPointOption(365, 169, 18);
                                GameRenderer.setFontSize(11);
                                GameRenderer.setFontDoubleColor(-1, -16777216);
                                GameRenderer.drawStringDoubleM(String.valueOf(rwd_hero), 400, 220, 17);
                                break;
                            case 2:
                                stageClearImage[20].drawAtPointOption(365, 169, 18);
                                break;
                            case 3:
                                stageClearImage[16].drawAtPointOption(365, 169, 18);
                                break;
                            case 4:
                                stageClearImage[21].drawAtPointOption(365, 169, 18);
                                break;
                            case 5:
                                stageClearImage[15].drawAtPointOption(365, 169, 18);
                                break;
                            case 6: case -3: case -4:
                                stageClearImage[22].drawAtPointOption(365, 169, 18);
                                GameRenderer.setFontDoubleColor(-16777216, -16777216);
                                GameRenderer.setFontSize(15);
                                if (rewardShowOrder != 6)
                                    GameRenderer.drawStringDoubleM(GameThread.getString(R.string.reward_hero), GameRenderer.CX, 153, 17);
                                GameRenderer.setFontColor(-16777216);
                                if (rewardShowOrder == -3)
                                    GameRenderer.drawStringM(GameThread.getString(R.string.reward_hero0), GameRenderer.CX, 243, 17);
                                else if (rewardShowOrder == -4)
                                    GameRenderer.drawStringM(GameThread.getString(R.string.reward_hero1), GameRenderer.CX, 243, 17);
                                else if (rewardShowOrder == -5)
                                    GameRenderer.drawStringM(GameThread.getString(R.string.reward_hero2), GameRenderer.CX, 243, 17);
                                break;
                            case 8:
                                stageClearImage[17].drawAtPointOption(365, 169, 18);
                                break;
                        }
                        uiPopupImage[cTLS == 0 ? popup_okon2 : popup_okoff2].drawAtPointOption(213, 289, 18);
                        if (rewardShowOrder < 0)
                            break;
                        GameRenderer.setFontDoubleColor(-16777216, -16777216);
                        GameRenderer.setFontSize(15);

                        GameRenderer.drawStringDoubleM(GameThread.getString(rewardInfos[rewardShowOrder][0]), GameRenderer.CX, 153, 17);
                        GameRenderer.setFontColor(-16777216);
                        GameRenderer.drawStringM(GameThread.getString(rewardInfos[rewardShowOrder][1]), GameRenderer.CX, 243, 17);
                        if (rewardInfos[rewardShowOrder].length >= 3)
                            GameRenderer.drawStringM(GameThread.getString(rewardInfos[rewardShowOrder][2]), GameRenderer.CX, 262, 17);
                        break;
                }
                break;
            } case GAMEOVER: {
                float GAME_OVER_ANIM_BLACK_VIEW_ALPHA = 0.333f;
                tmap.checkBackBase();
                tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0, 0, 18);
                backShadowImage.drawAtPointOption(0, 0, 18);
                drawMapTile(gl10);
                drawAllUnit(gl10);
                drawPlayingUi(false);
                TouchManager.clearTouchMap();
                if (substate == 0) {
                    TouchManager.addTouchRectListData(3, CGRect.make(0, 0, GameRenderer.SCRWIDTH, GameRenderer.SCRHEIGHT));
                } else if (substate == 1) {
                    if (startViewCount < 270) {
                        TouchManager.addTouchRectListData(4, CGRect.make(0, 0, GameRenderer.SCRWIDTH, GameRenderer.SCRHEIGHT));
                    } else {
                        TouchManager.addTouchRectListData(2, CGRect.make(155, 380, 128, 61));
                        TouchManager.addTouchRectListData(0, CGRect.make(336, 380, 128, 61));
                        TouchManager.addTouchRectListData(1, CGRect.make(517, 380, 128, 61));
                    }
                }
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 5;
                int cTLS = TouchManager.checkTouchListStatus();
                if (substate == 0) {
                    if (startViewCount < 10) {
                        float f11 = (10 - startViewCount) * 0.1f;
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f11);
                        fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                        Texture2D.setColors(1);
                    } else {
                        float alpha = Math.min(0.7f, (startViewCount - 10) * GAME_OVER_ANIM_BLACK_VIEW_ALPHA);
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(alpha);
                        fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                        Texture2D.setColors(1);
                    }
                    stageClearImage[2].drawAtPointOption(GameRenderer.CX, myOscillator[11].getCurrentPosition() + 199, 17);
                } else if (substate == 1 || substate == 2) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(0.7f);
                    fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1);
                    float f = startViewCount < 30 ? startViewCount * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        stageClearImage[0].drawAtPointOption(GameRenderer.CX, 6, 17);
                        Texture2D.setColors(1);
                    }
                    GameRenderer.setFontSize(18);
                    GameRenderer.setFontColor(-1);
                    f = startViewCount < 60 ? (startViewCount - 30) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        GameRenderer.drawStringM(GameThread.getString(R.string.score), 259, 108, 18);
                        GameRenderer.drawStringM(String.valueOf((int) st.bScore), 540, 108, 20);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 90 ? (startViewCount - 60) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        GameRenderer.drawStringM(GameThread.getString(R.string.health), 259, 140, 18);
                        GameRenderer.drawStringM(String.format("%d/%d", st.life, DataStage.maxLife), 540, 140, 20);
                        if (st.perfectClear())
                            stageClearImage[13].drawAtPointOption(553, 131, 18);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 120 ? (startViewCount - 90) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        GameRenderer.drawStringM(GameThread.getString(R.string.money), 259, 172, 18);
                        GameRenderer.drawStringM(String.valueOf(st.money), 540, 172, 20);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 150 ? (startViewCount - 120) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        GameRenderer.drawStringM(GameThread.getString(R.string.mana), 259, 206, 18);
                        GameRenderer.drawStringM(String.valueOf(st.mana), 540, 206, 20);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 180 ? (startViewCount - 150) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        stageClearImage[3].drawAtPointOption(270, 257, 18);
                        GameRenderer.drawNumberBlock(st.getTotalScore(), numberTotalImage, 530, 257, 0, 20, 1);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 210 ? (startViewCount - 180) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        stageClearImage[4].drawAtPointOption(287, 288, 18);
                        GameRenderer.drawNumberBlock((int)st.victoryH, numberClearImage, 513, 288, 0, 20, 1);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 240 ? (startViewCount - 210) * 0.033f : 1;
                    if (f > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(f);
                        GameRenderer.setFontDoubleColor(-1, -15385258);
                        GameRenderer.drawStringDoubleM(GameThread.getString(R.string.highscore), 290, 328, 18);
                        GameRenderer.drawStringDoubleM(String.valueOf(Config.s.highScores[st.SID][st.mapType]), 508, 328, 20);
                        Texture2D.setColors(1);
                    }
                    f = startViewCount < 270 ? (startViewCount - 240) * 0.033f : 1;
                    if (f > 0) {
                        stageClearImage[cTLS == 2 ? 10 : 9].drawAtPointOption(155, 380, 18);
                        stageClearImage[cTLS == 0 ? 8 : 7].drawAtPointOption(336, 380, 18);
                        stageClearImage[cTLS == 1 ? 12 : 11].drawAtPointOption(517, 380, 18);
                    }
                }
                if (substate >= 2) {
                    float f13 = darkViewCount * 0.033f;
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(f13);
                    fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1);
                }
                TouchManager.swapTouchMap();
                break;
            }
        }
    }

    public void paint_GAME_PLAYING(GL10 gl10, boolean init) {
        tmap.checkBackBase();
        tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0, 0, 18);
        backShadowImage.drawAtPointOption(0, 0, 18);
        drawMapTile(gl10);
        HeroUnit hero = st.selectedUnit instanceof HeroUnit ? (HeroUnit)st.selectedUnit : null;
        if (st.selectedUnit != null && !(hero != null && hero.specialShowCount >= 0)) {
            drawAddGridBlock();
            st.selectedUnit.drawUnitRangeCircle();
        }
        if (tempChara != null)
            tempChara.drawUnitRangeCircle();

        drawAllUnit(gl10);
        drawPlayingUi(init);
        if (characterMenuSelectFlag == SEL_USPWN || characterMenuSelectFlag == SEL_HSPWN) {
            boolean addable = enableAddSetting(true);
            drawAddGridBlock();
            drawAddRangeCircle(characterAddNumber, characterAddPosX, characterAddPosY, addable);
        }
        if (hero != null && hero.specialAttackFrameCount != -1) {
            if (hero.type == 0) {
                if (hero.specialAttackFrameCount < 60) {
                    float alpha;
                    if (hero.specialAttackFrameCount < 50)
                        alpha = Math.min(hero.specialAttackFrameCount * 0.1f, 1);
                    else
                        alpha = Math.max((60 - hero.specialAttackFrameCount) * 0.1f, 0);

                    if (alpha > 0) {
                        if (alpha < 1) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(alpha);
                        }
                        specialSwordImage[5].drawAtPointOption(0, 0, 18);
                        specialSwordImage[5].drawAtPointOptionFlipHorizon(0, GameRenderer.SCRHEIGHT_SMALL, 34);
                        for (int i = 0; i < 90; i++)
                            specialSwordImage[(i % 3) + 6].drawAtPointOption(NewTower.getRandom(GameRenderer.SCRWIDTH), NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL), 9);
                        if (alpha < 1)
                            Texture2D.setColors(1);
                    }
                    if (hero.specialAttackFrameCount >= 10 && hero.specialAttackFrameCount < 50) {
                        int sX;
                        if (hero.specialAttackFrameCount < 15) {
                            sX = 100 - ((15 - hero.specialAttackFrameCount) * 100);
                        } else
                            sX = hero.specialAttackFrameCount >= 45 ? ((hero.specialAttackFrameCount - 45) * 100) + 100 : 100;
                        specialSwordImage[4].drawAtPointOption(sX, GameRenderer.SCRHEIGHT_SMALL, 34);
                    }
                } else for (int i = 0; i < hero.specialDataValue.length; i++) {
                    hero.specialDataValue[i][1] += hero.specialDataValue[i][3];
                    if (hero.specialDataValue[i][0] == 0) {
                        if (hero.specialDataValue[i][1] >= GameRenderer.SCRWIDTH_SMALL) {
                            hero.specialDataValue[i][1] -= (GameRenderer.SCRWIDTH_SMALL + Texture2D.SCRWIDTH_800);
                            hero.specialDataValue[i][2] = NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL);
                        }
                    } else if (hero.specialDataValue[i][0] == 1) {
                        if (hero.specialDataValue[i][1] >= GameRenderer.SCRWIDTH_SMALL) {
                            hero.specialDataValue[i][1] -= (GameRenderer.SCRWIDTH_SMALL + Texture2D.SCRHEIGHT_480);
                            hero.specialDataValue[i][2] = NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL);
                        }
                    } else if (hero.specialDataValue[i][0] == 2)
                        if (hero.specialDataValue[i][1] >= GameRenderer.SCRWIDTH_SMALL) {
                            hero.specialDataValue[i][1] -= (GameRenderer.SCRWIDTH_SMALL + Texture2D.SCRWIDTH_800);
                            hero.specialDataValue[i][2] = NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL);
                        }
                    specialSwordImage[9 + hero.specialDataValue[i][0]].drawAtPointOption(hero.specialDataValue[i][1], hero.specialDataValue[i][2], 9);
                }
            } else if (hero.type == 1) {
                if (hero.specialAttackFrameCount < 60) {
                    float alpha;
                    if (hero.specialAttackFrameCount < 50)
                        alpha = Math.min((hero.specialAttackFrameCount) * 0.1f, 1);
                    else
                        alpha = Math.max(1 - ((hero.specialAttackFrameCount - 50) * 0.1f), 0);

                    if (alpha > 0) {
                        if (alpha < 1) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(alpha);
                        }
                        specialArrowImage[15].drawAtPointOption(GameRenderer.SCRWIDTH, 0, 20);
                        specialArrowImage[15].drawAtPointOptionFlipHorizon(0, GameRenderer.SCRHEIGHT, 34);
                        for (int i = 0; i < 90; i++)
                            specialArrowImage[(i % 3) + 16].drawAtPointOption(NewTower.getRandom(GameRenderer.SCRWIDTH), NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL), 9);
                        if (alpha < 1)
                            Texture2D.setColors(1);
                    }
                    if (hero.specialAttackFrameCount >= 10 && hero.specialAttackFrameCount < 50) {
                        int bX = 200, bY = 10;
                        if (hero.specialAttackFrameCount < 15) {
                            bX -= ((15 - hero.specialAttackFrameCount) * 100);
                            bY -= ((15 - hero.specialAttackFrameCount) * 100);
                        } else {
                            if (hero.specialAttackFrameCount >= 45) {
                                bX = 200 + ((hero.specialAttackFrameCount - 45) * 100);
                                bY = ((hero.specialAttackFrameCount - 45) * 100) + 10;
                            }
                        }
                        specialArrowImage[13].drawAtPointOption(bX, bY, 18);
                        specialArrowImage[14].drawAtPointOption(bX + HeroUnit.SPECIAL_ATTACK_ARROW_LEG_POS_X, bY + HeroUnit.SPECIAL_ATTACK_ARROW_LEG_POS_Y, 18);
                    }
                }
                if (hero.specialAttackFrameCount >= 165) {
                    float alpha = Math.min((((float) (hero.specialAttackFrameCount - 165)) * 0.025f) + 0.5f, 1);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(alpha);
                    specialArrowImage[19].drawAtPointOptionSize(GameRenderer.CX, GameRenderer.CY, 9, alpha);
                    Texture2D.setColors(1);
                }
            } else {
                if (hero.specialAttackFrameCount < 60) {
                    float alpha;
                    if (hero.specialAttackFrameCount < 50) {
                        alpha = Math.min((hero.specialAttackFrameCount) * 0.1f, 1);
                    } else
                        alpha = Math.max(1 - ((hero.specialAttackFrameCount - 50) * 0.1f), 0);

                    if (alpha > 0) {
                        if (alpha < 1) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                            Texture2D.setColors(alpha);
                        }
                        specialIceImage[1].drawAtPointOption(GameRenderer.SCRWIDTH_SMALL, 0, 20);
                        specialIceImage[1].drawAtPointOptionFlip(0, 0, 18);
                        for (int i = 0; i < 90; i++)
                            specialIceImage[(i % 3) + 17].drawAtPointOption(NewTower.getRandom(GameRenderer.SCRWIDTH), NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL), 9);
                        if (alpha < 1)
                            Texture2D.setColors(1);
                    }
                    if (hero.specialAttackFrameCount >= 10 && hero.specialAttackFrameCount < 50) {
                        int mY = 40;
                        if (hero.specialAttackFrameCount < 15) {
                            mY -= ((15 - hero.specialAttackFrameCount) * 200);
                        } else if (hero.specialAttackFrameCount >= 45)
                            mY = (hero.specialAttackFrameCount - 45) * 200 + 40;
                        specialIceImage[0].drawAtPointOption(0, mY, 18);
                    }
                }
                if (hero.specialAttackFrameCount >= 135 && hero.specialAttackFrameCount < 150) {
                    float siz = Math.min((((float) (hero.specialAttackFrameCount - 135)) * 0.1f) + 0.3f, 1);
                    specialIceImage[2].drawAtPointOptionSize(GameRenderer.CX, GameRenderer.CY, 9, siz);
                }
                if (hero.specialAttackFrameCount >= 150) {
                    float alpha = Math.min(2 - (((float) (hero.specialAttackFrameCount - 150)) * 0.1f), 1);
                    if (alpha > 0) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                        Texture2D.setColors(alpha);
                        fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                        Texture2D.setColors(1);
                    }
                }
            }
        }
        int blink = 5 - Math.abs(5 - specialBlinkCount);
        if (blink > 0) {
            float alpha = blink * 0.2f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(alpha);
            fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
            Texture2D.setColors(1);
        }
        if (monsterGoalBlinkCount > 0) {
            float al = (monsterGoalBlinkCount < 3 ? monsterGoalBlinkCount : 6 - monsterGoalBlinkCount) * MONSTER_GOAL_BLINK_ALPHA_DEGREE;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(al);
            fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
            Texture2D.setColors(1);
        }
        if (characterMenuMonsterViewCount > 0) {
            if (characterMenuMonsterViewCount < 10) {
                float alpha = characterMenuMonsterViewCount * 0.1f;
                gl10.glTexEnvf(8960, 8704, 8448);
                gl10.glColor4f(alpha, alpha, alpha, alpha);
            }
            drawMonsterViewMenu();
            gl10.glColor4f(1, 1, 1, 1);
            if (st.waveManager.wavePattern != 3)
                return;

            float a = 1;
            if (characterMenuMonsterViewCount < 10) {
                a = characterMenuMonsterViewCount * 0.1f;
                gl10.glTexEnvf(8960, 8704, 8448);
                gl10.glColor4f(a, a, a, a);
            }
            uiMonsterEtcImage[3].drawAtPointOption(GameRenderer.CX - 102, 164, 18);
            float al;
            if (characterMenuMonsterViewCount % 16 < 8) {
                al = (characterMenuMonsterViewCount % 16) * 0.125f;
            } else
                al = 1 - (((float) ((characterMenuMonsterViewCount % 16) - 8)) * 0.125f);
            if (al <= a)
                a = al;

            gl10.glTexEnvf(8960, 8704, 8448);
            gl10.glColor4f(a, a, a, a);
            uiMonsterEtcImage[4].drawAtPointOption((float) (GameRenderer.CX - 119), 146, 18);
            gl10.glColor4f(1, 1, 1, 1);
        }
    }

    static final float MONSTER_GOAL_BLINK_ALPHA_DEGREE = 0.333f;
    static final float GAME_STAGE_CLEAR_START_BLACK_ALPHA = 0.333f;

    public void sellTowerUnit(TowerUnit u) {
        if (u instanceof HeroUnit)
            return;
        st.money += u.getSellPrice();
        st.towerUnit.remove(u);
        st.arrowUnit.removeIf(arr -> arr.shooter == u);
    }

    @Override
    public void touchCheck() {
        byte cTLS = (byte)TouchManager.checkTouchListStatus();
        switch (state) {
            case START:
                if (TouchManager.lastActionStatus == 2 && cTLS != -1 && startViewCount == 15) {
                    GameThread.playSound(14);
                    startViewCount++;
                }
                break;
            case PLAYING:
                int lastAction = TouchManager.lastActionStatus;
                if (lastAction == 0 && characterMenuSelectFlag < SEL_CHARMENU) {
                    if (st.waveManager.wavePattern != 3 && characterMenuMonsterViewCount > 0)
                        characterMenuMonsterViewCount = 0;

                    if (characterMenuSelectFlag >= SEL_HERO) {
                        if (cTLS > PLAY_HEROS && cTLS < PLAY_PAUSE) {
                            if (checkEnableHeroBuyUnit(cTLS - 7)) {
                                characterMenuSelectFlag = SEL_HSPWN;
                                characterAddNumber = cTLS + 5; //12 ~ 14
                            }
                        } else
                            for (int i = 8; i <= 10; i++)
                                myOscillator[i].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    } else if (cTLS != -1 && cTLS < PLAY_HEROS) {
                        int addChar = (cTLS * 2) - (cTLS % 2);
                        if (checkEnableBuyUnit(addChar)) {
                            characterAddNumber = addChar;
                            characterMenuSelectFlag = SEL_USPWN;
                            for (int i = 0; i < 7; i++)
                                if (i != cTLS)
                                    myOscillator[i].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
                        }
                    } else if (cTLS == PLAY_HEROS) {
                        TowerUnit cTWU = checkTowerUnit();
                        if (cTWU != null)
                            tempChara = cTWU;
                    }
                } else if (lastAction == 1) {
                    TowerUnit cTWU;
                    if ((characterMenuSelectFlag == SEL_DEF || characterMenuSelectFlag == SEL_HERO) && (cTWU = checkTowerUnit()) != null)
                        tempChara = cTWU;
                }
                if (lastAction != 2)
                    return;
                tempChara = null;
                if (cTLS == PLAY_HEROS) {
                    characterMenuSelectFlag = SEL_HERO;
                    for (int i = 8; i <= 10; i++)
                        myOscillator[i].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                    return;
                }
                HeroUnit hero = st.selectedUnit instanceof HeroUnit ? (HeroUnit)st.selectedUnit : null;
                if (hero != null && hero.specialAttackFrameCount >= 0) {
                    hero.specialAttackFrameCount = 999;
                    GameThread.killSound(19);
                    GameThread.killSound(hero.type + 16);
                    return;
                }
                switch (cTLS) {
                    case PLAY_PAUSE:
                        GameThread.stopLoopSound(2);
                        GameThread.playSound(14);
                        inGamePause = true;
                        state = STATE.PAUSE;
                        break;
                    case PLAY_SOFTPAUSE:
                        GameThread.playSound(14);
                        softPause = !softPause;
                        break;
                    case PLAY_TURBO:
                        GameThread.playSound(14);
                        st.turbo = (byte)(st.turbo == 1 ? 3 : 1);
                        break;
                    default:
                        switch (characterMenuSelectFlag) {
                            case SEL_HERO:
                                if (cTLS <= PLAY_HEROS || cTLS >= PLAY_PAUSE)
                                    characterMenuSelectFlag = SEL_DEF;
                            case SEL_DEF:
                                st.selectedUnit = checkTowerUnit();
                                if (st.selectedUnit != null) {
                                    GameThread.playSound(14);
                                    characterMenuSelectFlag = SEL_CHARMENU;
                                    if (characterMenuMonsterViewCount > 0) {
                                        characterMenuMonsterViewCount = 0;
                                        break;
                                    }
                                } else {
                                    EnemyUnit target = searchEnemyTouch();
                                    if (target == null) {
                                        ObjectUnit obj = searchObjectTouch();
                                        if (obj != null && obj.destroyEnableFlag)
                                            target = obj;
                                    }
                                    if (target != null) {
                                        GameThread.playSound(14);
                                        st.selectedTarget = st.selectedTarget == target ? null : target;
                                    }
                                }
                                break;
                            case SEL_USPWN:
                                characterMenuSelectFlag = SEL_DEF;
                                if (enableAddSetting(false)) {
                                    GameThread.playSound(14);
                                    enableAddSetting(true);
                                    st.addUnit(characterAddNumber, (int) ((characterAddPosX - 62) / 45), (int) ((characterAddPosY - 30) / 45));
                                    st.money -= TowerUnit.getBuyPrice(characterAddNumber);
                                }
                                int num = (characterAddNumber / 2) + (characterAddNumber % 2);
                                for (int i = 0; i < 7; i++)
                                    if (i != num)
                                        myOscillator[i].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                                st.selectedUnit = null;
                                break;
                            case SEL_HSPWN:
                                if (enableAddSetting(false)) {
                                    GameThread.playSound(14);
                                    enableAddSetting(true);
                                    st.selectedUnit = st.addHero(characterAddNumber - 12, (int) ((characterAddPosX - 62) / 45), (int) ((characterAddPosY - 30) / 45), true);
                                    for (int i = 8; i <= 10; i++)
                                        myOscillator[i].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                    characterMenuSelectFlag = SEL_HEROMENU;
                                    if (characterMenuMonsterViewCount > 0)
                                        characterMenuMonsterViewCount = 0;
                                } else {
                                    st.selectedUnit = null;
                                    characterMenuSelectFlag = SEL_DEF;
                                    for (int i = 8; i <= 10; i++)
                                        myOscillator[i].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                }
                                break;
                            case SEL_CHARMENU:
                                switch (cTLS) {
                                    case CHARMENU_SELL:
                                        GameThread.playSound(14);
                                        sellTowerUnit(st.selectedUnit);
                                        st.selectedUnit = null;
                                        characterMenuSelectFlag = SEL_DEF;
                                        break;
                                    case CHARMENU_UPGRADE:
                                        GameThread.playSound(14);
                                        characterMenuSelectFlag = SEL_UPGRMENU;
                                        break;
                                    case CHARMENU_LVL:
                                        GameThread.playSound(14);
                                        characterMenuSelectFlag = SEL_LVMENU;
                                        break;
                                    case CHARMENU_SPECIAL:
                                        GameThread.playSound(14);
                                        ((HeroUnit)st.selectedUnit).useSpecialAttack();
                                        characterMenuSelectFlag = SEL_DEF;
                                        break;
                                    default:
                                        st.selectedUnit = null;
                                        characterMenuSelectFlag = SEL_DEF;
                                        substate = 0;
                                        break;
                                }
                                break;
                            case SEL_UPGRMENU:
                            case SEL_LVMENU:
                                if (cTLS == CHARMENU_YES) {
                                    GameThread.playSound(14);
                                    if (characterMenuSelectFlag == SEL_UPGRMENU)
                                        st.selectedUnit.upgradeUnit();
                                    else
                                        st.selectedUnit.levelUpUnit();
                                    characterMenuSelectFlag = SEL_CHARMENU;
                                } else if (cTLS == CHARMENU_NO) {
                                    GameThread.playSound(15);
                                    characterMenuSelectFlag = SEL_CHARMENU;
                                }
                                break;
                            case SEL_HEROMENU:
                                if (cTLS == CHARMENU_LVL) {
                                    GameThread.playSound(14);
                                    st.mana -= HeroUnit.getHeroBuyPrice(characterAddNumber - 12);
                                    st.selectedUnit = null;
                                    characterMenuSelectFlag = SEL_DEF;
                                } else if (cTLS != CHARMENU_BODY) {
                                    st.towerUnit.remove(st.selectedUnit);
                                    st.selectedUnit = null;
                                    characterMenuSelectFlag = SEL_DEF;
                                }
                                break;
                        }
                }
                break;
            case PAUSE:
                if (TouchManager.lastActionStatus != 2 || substate != 0)
                    return;
                if (cTLS == 0) {
                    GameThread.playLoopSound(2);
                    GameThread.playSound(15);
                    inGamePause = false;
                    state = STATE.PLAYING;
                } else if (cTLS != -1) {
                    substate = cTLS;
                    darkViewCount = 0;
                }
                break;
            case CLEAR:
                if (TouchManager.lastActionStatus != 2)
                    return;
                switch (substate) {
                    case VIC_DEF: case VIC_PERFECT:
                        if (cTLS == 0)
                            substate = substate == VIC_DEF && st.perfectClear() ? VIC_PERFECT : rewardShowOrder >= 0 ? VIC_RWDULK : VIC_MENU;
                        break;
                    case VIC_MENU:
                        if (cTLS == -1)
                            break;
                        if (startViewCount < 270) {
                            GameThread.playSound(1);
                            startViewCount = 270;
                        } else if (st.SID == 49) {
                            GameThread.playLoopSound(2);
                            NewTower.switchPage(new CinematicPage(parent), true);
                        } else if (cTLS <= VTCH_NEXT) {
                            substate += (byte)(cTLS + 1);
                            darkViewCount = 0;
                        }
                        break;
                    case VIC_MAPUNLK:
                        if (darkViewCount >= 168)
                            substate = VIC_MENU;
                        break;
                    case VIC_RWDULK:
                        if (TouchManager.checkTouchListStatus() == 0) {
                            if (rewardShowOrder == 6) {
                                rewardShowOrder = -3;
                            } else if (rewardShowOrder <= -3 && rewardShowOrder >= -4) {
                                rewardShowOrder--;
                            } else if (st.SID % 10 == 9 && st.SID != 49) {
                                darkViewCount = 0;
                                substate = VIC_MAPUNLK;
                            } else
                                substate = VIC_MENU;
                        }
                }
                break;
            case GAMEOVER:
                if (TouchManager.lastActionStatus != 2 || cTLS == -1)
                    return;
                if (substate == 0) {
                    substate++;
                } else if (substate == 1) {
                    if (cTLS <= 2) {
                        substate = (byte)(cTLS + 2);
                        darkViewCount = 0;
                    } else if (cTLS == 4 && startViewCount < 270) {
                        GameThread.playSound(15);
                        startViewCount = 270;
                    }
                }
        }
    }

    public MonsterUnit searchEnemyTouch() {
        CGPoint acTouch = TouchManager.getFirstLastActionTouch();
        for (MonsterUnit mon : st.monsterUnit) {
            float xP = (mon.posX / 50f) + 62, yP = (mon.posY / 50f) + 30;
            if (!mon.dead() && acTouch.x >= xP - 20 && acTouch.y >= yP - 30 && acTouch.x < xP + 40 && acTouch.y < yP + 40)
                return mon;
        }
        return null;
    }

    public void drawMonsterViewMenu() {
        int y = 300;
        float size = 0.7f;
        int eWave = st.waveManager.current % st.waveManager.wcc;
        int stWave = Math.min(st.waveManager.current, DataWave.WAVE_MAX_COUNT - 1);
        int overWave = st.waveManager.current <= DataWave.WAVE_MAX_COUNT ? 0 : st.waveManager.current - DataWave.WAVE_MAX_COUNT;
        int uiPosY = characterMenuMonsterStartViewCount < 10 ? (10 - characterMenuMonsterStartViewCount) * 9 : 0;
        if (st.waveManager.waveMobData[eWave][3] == -1) {
            size = 1;
            y += 90;
        }
        uiMonsterEtcImage[2].drawAtPointOption(0, y + uiPosY, 34);
        for (int i14 = 0; i14 < 2; i14++) {
            if (st.waveManager.waveMobData[eWave][i14 * 3] == -1)
                continue;

            int type = st.waveManager.waveMobData[eWave][i14 * 3];
            int amount = st.waveManager.waveMobData[eWave][(i14 * 3) + 1];
            int monVis = MonsterUnit.getMonsterImageOrder(type);

            int spd;
            int bossType = st.waveManager.waveMobData[eWave][6];
            if (bossType == 2 || bossType == 3) {
                spd = (((150 * DataMonster.monsterData[type][4]) * (DataWave.monsterWaveData[stWave][10] + (DataWave.monsterWaveData[60][10] * overWave))) / 100) / 100;
            } else
                spd = (((150 * DataMonster.monsterData[type][4]) * (DataWave.monsterWaveData[stWave][2] + (DataWave.monsterWaveData[60][2] * overWave))) / 100) / 100;

            int i17 = DataMonster.monsterData[type][1];
            int hp;
            if (bossType == 2 || bossType == 3) {
                hp = (((i17 * DataWave.monsterWaveData[stWave][8]) / 100) * DataStage.stageData[st.SID][3]) / 100;
                if (st.waveManager.current >= DataWave.WAVE_MAX_COUNT)
                    hp += DataWave.monsterWaveData[60][8] * overWave;
            } else {
                hp = (((i17 * DataWave.monsterWaveData[stWave][0]) / 100) * DataStage.stageData[st.SID][2]) / 100;
                if (st.waveManager.current >= DataWave.WAVE_MAX_COUNT)
                    hp += DataWave.monsterWaveData[60][0] * overWave;
            }

            float ay = y + uiPosY;
            uiMonsterEtcImage[0].drawAtPointOption(0, ay, 18);
            uiMonsterEtcImage[1].drawAtPointOption(556, ay + 20, 18);
            uiMonsterFaceImage[monVis].drawAtPointOptionSize(130, ay + 80, 33, size);
            uiMonsterNameImage[monVis].drawAtPointOption(370, ay + 20, 17);
            GameRenderer.setFontSize(25);
            GameRenderer.setFontColor(-1);
            GameRenderer.drawStringM(String.format("x %d", amount), (uiMonsterNameImage[monVis]._sizeX / 2) + 380, ay + 27.5f, 18);
            GameRenderer.setFontSize(20);
            GameRenderer.setFontColor(-8716355);
            float bY = y + uiPosY + 55;
            GameRenderer.drawStringM(String.valueOf(hp), 582, bY, 17);
            GameRenderer.drawStringM(String.valueOf(spd), 679, bY, 17);
            y += 90;
        }
    }

    public void drawThemeTowerUnit(int type, boolean hero, float x, float y) {
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

        int main = drawData[drawData[1] + 1];
        int len = drawData[drawData[0] + drawData[main + 1 + ((GameThread.gameTimeCount / 5) % drawData[main])]];
        shadowImage[0].drawAtPointOption(x, y + 10, 9);
        for (int i = 0; i < drawData[len]; i++) {
            int data = (i * 5) + len + 1;
            int d2 = data + 3;
            if (drawData[d2] != 1000) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(drawData[d2] / 1000f);
            }
            if (drawData[data + 4] == 0)
                textures[drawData[data]].drawAtPointOption(drawData[data + 1] + x, y + drawData[data + 2] + 10, 18);
            else
                textures[drawData[data]].drawAtPointOptionFlip(drawData[data + 1] + x, y + drawData[data + 2] + 10, 18);

            if (drawData[d2] != 1000)
                Texture2D.setColors(1);
        }
    }

    public void drawCharMenu() {
        if (st.selectedUnit == null)
            return;
        int buyPrice;
        boolean cantUpgr = true, canLvl;

        HeroUnit hero = st.selectedUnit instanceof HeroUnit ? (HeroUnit)st.selectedUnit : null;
        if (hero == null) {
            buyPrice = TowerUnit.getBuyPrice(st.selectedUnit.type);
            cantUpgr = st.money < st.selectedUnit.getUpgradePrice();
            canLvl = st.selectedUnit.level < getTowerMaxLevel(false) - 1 && st.money >= st.selectedUnit.getLevelupPrice();
        } else {
            buyPrice = HeroUnit.getHeroBuyPrice(hero.type);
            canLvl = st.selectedUnit.level < getTowerMaxLevel(true) - 1 && st.mana >= (characterMenuSelectFlag == SEL_HEROMENU ? buyPrice : st.selectedUnit.getLevelupPrice());
        }
        TouchManager.clearTouchMap();
        Texture2D.gl.glTexEnvf(8960, 8704, 8448);

        Texture2D.setColors(0.2f);
        fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH, 343);
        Texture2D.setColors(1);
        uiCharEtcImage[0].drawAtPointOption(0, 343, 18);
        if (upgradeCount > 0) {
            if (upgradeCount > 5) {
                int downgradeImg = st.selectedUnit.getDowngradeType();
                if (downgradeImg != -1) {
                    uiCharFaceImage[downgradeImg].drawAtPointOption(-(10 - upgradeCount) * 80, GameRenderer.SCRHEIGHT_SMALL, 34);
                    uiCharNameImage[downgradeImg].drawAtPointOptionHorizonSize(287, 321, 10, (upgradeCount - 5) * 0.2f);
                }
            } else if (st.selectedUnit.type != -1) {
                uiCharFaceImage[st.selectedUnit.type].drawAtPointOption((-upgradeCount) * 80, GameRenderer.SCRHEIGHT_SMALL, 34);
                uiCharNameImage[st.selectedUnit.type].drawAtPointOptionHorizonSize(287, 321, 10, (5 - upgradeCount) * 0.2f);
            }
        } else if (st.selectedUnit.type != -1) {
            int t = st.selectedUnit.type + (hero == null ? 0 : 12);
            uiCharFaceImage[t].drawAtPointOption(0, GameRenderer.SCRHEIGHT_SMALL, 34);
            uiCharNameImage[t].drawAtPointOption(287, 305, 18);
        }
        if (st.selectedUnit instanceof HeroUnit)
            uiCharEtcImage[8].drawAtPointOption(287, 288, 18);

        uiCharEtcImage[12].drawAtPointOption(278, 356, 18);
        uiCharEtcImage[1].drawAtPointOption(288, 359, 18);
        uiCharEtcImage[2].drawAtPointOption(486, 314, 18);
        uiCharEtcImage[st.selectedUnit.level + 3].drawAtPointOption(519, 314, 18);
        GameRenderer.setFontSize(14);
        GameRenderer.setFontColor(-8128317);
        GameRenderer.drawStringM(String.valueOf(st.selectedUnit.getHitPower()), 420, 360, 20);
        if (st.selectedUnit.towerCoolTimeMax == 1) {
            GameRenderer.drawStringM("MAX", 420, 388, 20);
        } else
            GameRenderer.drawStringM(String.valueOf(st.selectedUnit.getAttackSpeed()), 420, 388, 20);

        GameRenderer.drawStringM(String.valueOf(st.selectedUnit.attackRange), 420, 416, 20);
        GameRenderer.drawStringM(TowerUnit.getEffectTypeString(st.selectedUnit.effectType), 420, 442, 20);
        if (characterMenuSelectFlag == SEL_HEROMENU && Config.s.rewardValues[3] && hero != null)
            uiCharEtcImage[9 + hero.type].drawAtPointOption(440, 400, 18);

        if (!(st.selectedUnit instanceof HeroUnit))
            TouchManager.addTouchRectListData(CHARMENU_SELL, CGRect.make(15, 390, 75, 75));
        if (st.selectedUnit.getUpgradeType() != -1 && !cantUpgr)
            TouchManager.addTouchRectListData(CHARMENU_UPGRADE, CGRect.make(435, 350, 235, 115));
        if (st.selectedUnit.level < getTowerMaxLevel(st.selectedUnit instanceof HeroUnit) - 1 && canLvl)
            TouchManager.addTouchRectListData(CHARMENU_LVL, CGRect.make(670, 350, 115, 115));
        if (characterMenuSelectFlag < SEL_HEROMENU && hero != null && Config.s.rewardValues[3] && hero.specialCooltime <= 0 && st.mana >= hero.specialMana)
            TouchManager.addTouchRectListData(CHARMENU_SPECIAL, CGRect.make(625, 272, 160, 69));

        TouchManager.addTouchRectListData(CHARMENU_BODY, CGRect.make(0, 343, GameRenderer.SCRWIDTH, 137));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = CHARMENU_YES + 1;
        int cTLS = TouchManager.checkTouchListStatus();
        if (!(st.selectedUnit instanceof HeroUnit)) {
            uiCharButtonImage[cTLS == CHARMENU_SELL ? 7 : 6].drawAtPointOption(15, 390, 18);
            GameRenderer.setFontColor(-1);
            GameRenderer.drawStringM(String.valueOf(st.selectedUnit.getSellPrice()), 80, 430, 20);
        }
        if (st.selectedUnit.getUpgradeType() != -1) {
            int towerImg = st.selectedUnit.getUpgradeType();
            uiCharButtonImage[cTLS == CHARMENU_UPGRADE ? 1 : 0].drawAtPointOption(435, 350, 18);
            uiCharUpFaceImage[TowerUnit.getTowerBoxImageOrder(towerImg)].drawAtPointOption(514, 364, 18);
            uiCharNameImage[towerImg].drawAtPointOptionSize(653, 449, 36, 0.4f);
            GameRenderer.drawStringM(String.valueOf(st.selectedUnit.getUpgradePrice()), 503, 421, 20);
            if (cantUpgr) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(0.5f);
                fillBlackImage.fillRect(435, 350, 235, 115);
                Texture2D.setColors(1);
            }
            if (upgradeCount > 0) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(upgradeCount * 0.1f);
                fillWhiteImage.fillRect(435, 350, 235, 115);
                Texture2D.setColors(1);
            }
        }
        if (characterMenuSelectFlag < SEL_HEROMENU && st.selectedUnit.level < getTowerMaxLevel(st.selectedUnit instanceof HeroUnit) - 1) {
            if (st.selectedUnit instanceof HeroUnit)
                uiCharButtonImage[cTLS == CHARMENU_LVL ? 15 : 14].drawAtPointOption(670, 350, 18);
            else
                uiCharButtonImage[cTLS == CHARMENU_LVL ? 3 : 2].drawAtPointOption(670, 350, 18);
            int lv = st.selectedUnit.level * 2;
            if (cTLS != CHARMENU_LVL) {
                uiCharButtonImage[lv + 17].drawAtPointOption(708, 401, 17);
                uiCharButtonImage[lv + 19].drawAtPointOption(764, 401, 17);
            } else {
                uiCharButtonImage[lv + 16].drawAtPointOption(708, 401, 17);
                uiCharButtonImage[lv + 18].drawAtPointOption(764, 401, 17);
            }
            GameRenderer.drawStringM(String.valueOf(st.selectedUnit.getLevelupPrice()), 756, 423, 20);
            if (levelUpCount > 0) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(levelUpCount * 0.1f);
                fillWhiteImage.fillRect(670, 350, 115, 115);
                Texture2D.setColors(1);
            }
            if (hero != null && Config.s.rewardValues[3]) {
                int dInd = (hero.type * 2) + 8;
                if (cTLS == CHARMENU_SPECIAL)
                    dInd++;
                uiCharButtonImage[dInd].drawAtPointOption(625, 272, 18);

                if (hero.specialCooltime > 0 || st.mana < hero.specialMana) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(0.5f);
                    fillBlackImage.fillRect(631, 278, (hero.specialCooltime * 148f) / hero.specialMaxCooltime, 57);
                    Texture2D.setColors(1);
                }
                GameRenderer.drawStringM(String.valueOf(hero.specialMana), 730, 318, 20);
            }
        } else if (characterMenuSelectFlag == SEL_HEROMENU) {
            uiCharButtonImage[TouchManager.checkTouchListStatus() == CHARMENU_LVL ? 5 : 4].drawAtPointOption(670, 350, 18);
            uiUpperImage[upper_mana].drawAtPointOption(696, 428, 18);
            GameRenderer.drawStringM(String.valueOf(buyPrice), 755, 430, 20);
        }
    }

    public static int getTowerMaxLevel(boolean isHero) {
        if (isHero)
            return GameThread.TOWER_MAX_LEVEL_HERO;
        return GameThread.TOWER_MAX_LEVEL_NORMAL;
    }

    public void drawPlayingUi(boolean init) {
        if (init && characterMenuSelectFlag < SEL_CHARMENU) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(PLAY_PAUSE, CGRect.make(0, 437, 43, 39));
            TouchManager.addTouchRectListData(PLAY_SOFTPAUSE, CGRect.make(0, 344, 43, 39));
            TouchManager.addTouchRectListData(PLAY_TURBO, CGRect.make(0, 393, 43, 39));
            if (characterMenuSelectFlag == SEL_DEF) {
                TouchManager.addTouchRectListData(PLAY_HEROS, CGRect.make(742, 12, 56, 56));
            } else if (characterMenuSelectFlag == SEL_HERO) {
                int heroPos = 586;
                for (int i = 0; i < 3; i++)
                    if (!DataStage.heroAvail[i])
                        heroPos += 60;
                for (int i = 0; i < 3; i++)
                    if (DataStage.heroAvail[i]) {
                        if (checkEnableHeroBuyUnit(i))
                            TouchManager.addTouchRectListData(i + PLAY_HEROS + 1, CGRect.make(heroPos, 12, 56, 56));
                        heroPos += 60;
                    }
            }
            for (int i = 0; i < PLAY_HEROS; i++)
                TouchManager.addTouchRectListData(i, CGRect.make(742, 77 + (65 * i), 56, 56));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = PLAY_TURBO + 1;
        }

        drawUpperUI();
        for (int i = 0; i < PLAY_HEROS; i++) {
            int v = 65 * i, ty = (i * 2) - (i % 2);
            uiButtonImage[((characterMenuSelectFlag >= SEL_HSPWN || !checkEnableBuyUnit(ty)) ? 9 : 0) + i].drawAtPointOption(myOscillator[i].getCurrentPosition() + 770, 77f + v, 17);
            GameRenderer.drawNumberBlock(TowerUnit.getBuyPrice(ty), numberUnitBuyImage, myOscillator[i].getCurrentPosition() + 770, 114f + v, -2, 17, 1);
        }
        if (characterMenuSelectFlag == SEL_HSPWN && myOscillator[8].currentCount < 10) {
            float f = myOscillator[8].currentCount * 0.1f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(f);
        }
        int heroX = 586;
        for (int i = 0; i < 3; i++)
            if (!DataStage.heroAvail[i])
                heroX += 60;
        for (int i = 0; i < 3; i++)
            if (DataStage.heroAvail[i]) {
                int heroBuyPrice = HeroUnit.getHeroBuyPrice(i);
                int cpos = myOscillator[i + 8].getCurrentPosition();
                uiButtonImage[i + 6 + (checkEnableHeroBuyUnit(i) ? 0 : 9)].drawAtPointOption(cpos + heroX, 12, 17);
                GameRenderer.drawNumberBlock(heroBuyPrice, numberHeroBuyImage, heroX + 5 + cpos, 49, -2, 17, 1);
                uiUpperImage[upper_hero].drawAtPointOption((heroX - 17) + cpos, 49, 17);
                heroX += 60;
            }
        if (characterMenuSelectFlag == SEL_HSPWN && myOscillator[8].currentCount < 10)
            Texture2D.setColors(1);
        uiButtonImage[18].drawAtPointOption(770, 12, 17);

        if (characterMenuSelectFlag >= SEL_CHARMENU) {
            drawCharMenu();
            if (characterMenuSelectFlag >= SEL_UPGRMENU && characterMenuSelectFlag < SEL_HEROMENU) {
                TouchManager.clearTouchMap();
                TouchManager.addTouchRectListData(CHARMENU_YES, CGRect.make(162, 290, 236, 43));
                TouchManager.addTouchRectListData(CHARMENU_NO, CGRect.make(402, 290, 236, 43));
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = CHARMENU_YES + 1;
                Texture2D.setColors(0.5f);
                fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                Texture2D.setColors(1);

                uiPopupImage[popup_background].drawAtPointOption(152, 144, 18);
                if (characterMenuSelectFlag == SEL_UPGRMENU) {
                    uiPopupImage[popup_stat].drawAtPointOption(392, 160, 18);
                    int upgradeType = st.selectedUnit.getUpgradeType();
                    if (upgradeType != -1) {
                        int upgradePrice = st.selectedUnit.getUpgradePrice();

                        int boxImg = TowerUnit.getTowerBoxImageOrder(upgradeType);
                        uiCharButtonImage[0].drawAtPointOption(161, 154, 18);
                        uiCharUpFaceImage[boxImg].drawAtPointOption(240, 168, 18);
                        uiCharNameImage[upgradeType].drawAtPointOptionSize(379, 253f, 36, 0.4f);
                        GameRenderer.drawStringM(String.valueOf(upgradePrice), 229, 225, 20);
                        GameRenderer.setFontSize(16);
                        GameRenderer.setFontDoubleColor(-1, -16777216);

                        GameRenderer.drawStringDoubleM(GameThread.getString(R.string.cnf_upgr), GameRenderer.CX, 270, 17);
                        GameRenderer.drawStringDoubleM(String.valueOf(st.selectedUnit.getHitPower()), 540, 162, 20);
                        if (st.selectedUnit.towerCoolTimeMax == 1) {
                            GameRenderer.drawStringDoubleM("MAX", 540, 189, 20);
                        } else
                            GameRenderer.drawStringDoubleM(String.valueOf(st.selectedUnit.getAttackSpeed()), 540, 189, 20);
                        GameRenderer.drawStringDoubleM(String.valueOf(st.selectedUnit.attackRange), 540, 217, 20);
                        GameRenderer.drawStringDoubleM(TowerUnit.getEffectTypeString(st.selectedUnit.effectType), 540, 243, 20);

                        TowerUnit nextFrm = new TowerUnit(st.selectedUnit, upgradeType, 0);
                        GameRenderer.drawStringDoubleM(String.valueOf(nextFrm.getHitPower()), 625, 162, 20);
                        if (nextFrm.towerCoolTimeMax == 1) {
                            GameRenderer.drawStringDoubleM("MAX", 625, 189, 20);
                        } else
                            GameRenderer.drawStringDoubleM(String.valueOf(nextFrm.getAttackSpeed()), 625, 189, 20);
                        GameRenderer.drawStringDoubleM(String.valueOf(nextFrm.attackRange), 625, 217, 20);
                        GameRenderer.drawStringDoubleM(TowerUnit.getEffectTypeString(nextFrm.effectType), 625, 243, 20);
                    }
                } else if (characterMenuSelectFlag == SEL_LVMENU) {
                    uiPopupImage[popup_levelup].drawAtPointOption(170, 160, 18);
                    if (st.selectedUnit.level < getTowerMaxLevel(st.selectedUnit instanceof HeroUnit) - 1) {
                        GameRenderer.setFontSize(16);
                        GameRenderer.setFontDoubleColor(-1, -16777216);

                        GameRenderer.drawStringDoubleM(GameThread.getString(R.string.cnf_lvlup), GameRenderer.CX, 270, 17);
                        GameRenderer.drawStringDoubleM(String.valueOf(st.selectedUnit.getHitPower()), 430, 162, 20);
                        if (st.selectedUnit.towerCoolTimeMax == 1) {
                            GameRenderer.drawStringDoubleM("MAX", 430, 189, 20);
                        } else
                            GameRenderer.drawStringDoubleM(String.valueOf(st.selectedUnit.getAttackSpeed()), 430, 189, 20);
                        GameRenderer.drawStringDoubleM(String.valueOf(st.selectedUnit.attackRange), 430, 217, 20);
                        GameRenderer.drawStringDoubleM(TowerUnit.getEffectTypeString(st.selectedUnit.effectType), 430, 243, 20);

                        int tp = st.selectedUnit.type, plv = st.selectedUnit.level + 1;
                        TowerUnit nextFrm = st.selectedUnit instanceof HeroUnit ? new HeroUnit(st.selectedUnit, tp, plv) : new TowerUnit(st.selectedUnit, tp, plv);
                        GameRenderer.drawStringDoubleM(String.valueOf(nextFrm.getHitPower()), 526, 162, 20);
                        if (nextFrm.towerCoolTimeMax == 1) {
                            GameRenderer.drawStringDoubleM("MAX", 526, 189, 20);
                        } else
                            GameRenderer.drawStringDoubleM(String.valueOf(nextFrm.getAttackSpeed()), 526, 189, 20);
                        GameRenderer.drawStringDoubleM(String.valueOf(nextFrm.attackRange), 526, 217, 20);
                        GameRenderer.drawStringDoubleM(TowerUnit.getEffectTypeString(nextFrm.effectType), 526, 243, 20);
                    }
                }
                int cTLS = TouchManager.checkTouchListStatus();
                uiPopupImage[cTLS == 0 ? popup_yeson : popup_yesoff].drawAtPointOption(162, 290, 18);
                uiPopupImage[cTLS == 1 ? popup_noon : popup_nooff].drawAtPointOption(402, 290, 18);
            }
        }
        if (init)
            TouchManager.swapTouchMap();
    }

    public boolean checkEnableBuyUnit(int i) {
        return st.money >= TowerUnit.getBuyPrice(i);
    }

    public boolean checkEnableHeroBuyUnit(int i) {
        for (TowerUnit twu : st.towerUnit)
            if (twu instanceof HeroUnit && twu.type == i)
                return false;

        return st.mana >= HeroUnit.getHeroBuyPrice(i);
    }
}
