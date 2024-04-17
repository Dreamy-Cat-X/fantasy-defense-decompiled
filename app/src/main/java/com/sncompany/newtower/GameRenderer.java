package com.sncompany.newtower;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.util.Log;

import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAnim;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: D:\decomp\classes.dex */
public class GameRenderer implements GLSurfaceView.Renderer {
    public static int CX = 0;
    public static int CY = 0;
    public static float DRAW_SCALE_SIZE = 1.0f;
    public static float DRAW_SCALE_SIZE_X = 1.0f;
    public static float DRAW_SCALE_SIZE_Y = 1.0f;
    public static float DRAW_SCALE_X_MOVE = 0.0f;
    public static final float DRAW_SCALE_X_SMALL_DEGREE = 13.0f;
    public static float DRAW_SCALE_Y_MOVE = 0.0f;
    public static final int GAME_SHOP_SHOP_SIDEBAR_END_Y = 330;
    public static final int GAME_STAGE_CLEAR_THEME_ARROW_BLINK_END_POS = 168;
    public static final int PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS = 310;
    public static int SCRHEIGHT = 0;
    public static int SCRHEIGHT_SMALL = 0;
    public static int SCRWIDTH = 0;
    public static int SCRWIDTH_SMALL = 0;
    public static CGPoint _CGPoint = null;
    public static CGRect _CGRect = null;
    public static Texture2D[] arrowImage0 = null;
    public static Texture2D[] arrowImage1 = null;
    public static Texture2D[] arrowImage2 = null;
    public static Texture2D[] arrowImage3 = null;
    public static Texture2D[] arrowImage4 = null;
    public static Texture2D[] arrowImage9 = null;
    public static int darkViewCount = 0;
    public static Paint drawFont = null;
    public static Texture2D drawStringBuffer = null;
    public static Texture2D[] effectImage_500 = null;
    public static Texture2D[] effectImage_502 = null;
    public static Texture2D[] effectImage_503 = null;
    public static Texture2D[] effectImage_504 = null;
    public static Texture2D[] effectImage_505 = null;
    public static Texture2D[] effectImage_509 = null;
    public static Texture2D[] effectImage_510 = null;
    public static Texture2D[] effectImage_512 = null;
    public static Texture2D[] effectImage_513 = null;
    public static Texture2D[] effectImage_514 = null;
    public static Texture2D[] effectImage_532 = null;
    public static Texture2D[] effectImage_533 = null;
    public static Texture2D[] effectImage_534 = null;
    public static Texture2D[] effectImage_535 = null;
    public static int fontColor = 0;
    public static int fontSize = 0;
    public static Texture2D[] gatefireImage = null;
    public static CircleItemDraw inventoryItemListDraw = null;
    public static boolean isPaused = false;
    public static long lastCheckTime;
    public static String lastFontName;
    public static int levelUpCount;
    public static int loadCount_GAME_MENU_IMAGE_LOAD;
    public static int loadCount_GAME_PRE_IMAGE_LOAD;
    public static int loadingViewType;
    public static int monsterGoalBlinkCount;
    public static NewTower newTower;
    public static Texture2D[] numberClearImage;
    public static Texture2D[] numberStagePointImage;
    public static Texture2D[] numberTotalImage;
    public static Texture2D[] numberUpgradeImage;
    public static Texture2D[] outBorderImage;
    public static Texture2D[] redCircleImage;
    public static Texture2D[] specialArrowImage;
    public static int specialBlinkCount;
    public static Texture2D[] specialIceImage;
    public static Texture2D[] specialSwordImage;
    public static Texture2D[] stageClearImage;
    public static int strokeColor;
    public static final Texture2D testboxImage = new Texture2D(R.drawable.etc_testbox);
    public static Tombstone textTombstone;
    public static int titlePressed;
    public static Texture2D[] tutorialImage;
    public static Texture2D[] uiIngameImage;
    public static Texture2D[] uiPopupImage;
    public static Texture2D[] uiShopImage;
    public static Texture2D[] uiStageBossImage;
    public static Texture2D[] uiStageImage;
    public static Texture2D[] uiThemeclearImage;
    public static Texture2D[] uiUpgradeImage;
    public static Texture2D[] uiUpheroImage;
    public static Texture2D[] uiUpitemImage;
    public static Texture2D[] uiUpunitImage;
    public static int upgradeCount;
    public static Texture2D[] whiteCircleImage;
    public static boolean loadViewFlag = false;
    public static final int[][] testboxCoord = {new int[]{0, 0, 20, 85}, new int[]{138, 0, 20, 85}, new int[]{59, 0, 40, 85}, new int[]{20, 0, 40, 85}};
    public static final int[] numberStagePointResource = {R.drawable.num_stage_point_0, R.drawable.num_stage_point_1, R.drawable.num_stage_point_2, R.drawable.num_stage_point_3, R.drawable.num_stage_point_4, R.drawable.num_stage_point_5, R.drawable.num_stage_point_6, R.drawable.num_stage_point_7, R.drawable.num_stage_point_8, R.drawable.num_stage_point_9};
    public static final int[] numberUpgradeResource = {R.drawable.num_upgrade_0, R.drawable.num_upgrade_1, R.drawable.num_upgrade_2, R.drawable.num_upgrade_3, R.drawable.num_upgrade_4, R.drawable.num_upgrade_5, R.drawable.num_upgrade_6, R.drawable.num_upgrade_7, R.drawable.num_upgrade_8, R.drawable.num_upgrade_9, R.drawable.num_upgrade_slash};
    public static final int[] numberClearResource = {R.drawable.num_clear_0, R.drawable.num_clear_1, R.drawable.num_clear_2, R.drawable.num_clear_3, R.drawable.num_clear_4, R.drawable.num_clear_5, R.drawable.num_clear_6, R.drawable.num_clear_7, R.drawable.num_clear_8, R.drawable.num_clear_9};
    public static final int[] numberTotalResource = {R.drawable.num_total_0, R.drawable.num_total_1, R.drawable.num_total_2, R.drawable.num_total_3, R.drawable.num_total_4, R.drawable.num_total_5, R.drawable.num_total_6, R.drawable.num_total_7, R.drawable.num_total_8, R.drawable.num_total_9};
    public static final int[] stageClearResource = {R.drawable.ui_clear_background, R.drawable.ui_clear_clear, R.drawable.ui_clear_fail, R.drawable.ui_clear_totalscore, R.drawable.ui_clear_heroism, R.drawable.ui_clear_nextstageoff, R.drawable.ui_clear_nextstageon, R.drawable.ui_clear_upgradeoff, R.drawable.ui_clear_upgradeon, R.drawable.ui_clear_stageselectoff, R.drawable.ui_clear_stageselecton, R.drawable.ui_clear_retryoff, R.drawable.ui_clear_retryon, R.drawable.ui_clear_perfect, R.drawable.ui_clear_bonus, R.drawable.ui_clear_iconskill, R.drawable.ui_clear_iconspe, R.drawable.ui_clear_iconitem, R.drawable.ui_clear_iconheroism, R.drawable.ui_clear_iconhero1, R.drawable.ui_clear_iconhero2, R.drawable.ui_clear_iconhero3, R.drawable.ui_clear_iconattup, R.drawable.ui_clear_p, R.drawable.ui_clear_e, R.drawable.ui_clear_r, R.drawable.ui_clear_f, R.drawable.ui_clear_c, R.drawable.ui_clear_t, R.drawable.ui_clear_1};
    public static final int[] ingameResource = {R.drawable.ui_ingame_paused, R.drawable.ui_ingame_resumeoff, R.drawable.ui_ingame_resumeon, R.drawable.ui_ingame_restartoff, R.drawable.ui_ingame_restarton, R.drawable.ui_ingame_stageoff, R.drawable.ui_ingame_stageon};
    public static final int[] specialSwordResource = {R.drawable.special_sword_blade0, R.drawable.special_sword_blade1, R.drawable.special_sword_blade2, R.drawable.special_sword_blade3, R.drawable.special_sword_body, R.drawable.special_sword_background, R.drawable.special_sword_lineb, R.drawable.special_sword_linem, R.drawable.special_sword_lines, R.drawable.special_sword_wind0, R.drawable.special_sword_wind1, R.drawable.special_sword_wind2};
    public static final int[] specialArrowResource = {R.drawable.special_arrow_arrow_center1, R.drawable.special_arrow_arrow_center2, R.drawable.special_arrow_arrow_center3, R.drawable.special_arrow_arrow_center4, R.drawable.special_arrow_arrow_left1, R.drawable.special_arrow_arrow_left2, R.drawable.special_arrow_arrow_left3, R.drawable.special_arrow_arrow_left4, R.drawable.special_arrow_arrow_right1, R.drawable.special_arrow_arrow_right2, R.drawable.special_arrow_arrow_right3, R.drawable.special_arrow_arrow_right4, R.drawable.special_arrow_land, R.drawable.special_arrow_body, R.drawable.special_arrow_body2, R.drawable.special_arrow_background, R.drawable.special_arrow_lineb, R.drawable.special_arrow_linem, R.drawable.special_arrow_lines, R.drawable.special_arrow_unit};
    public static final int[] specialIceResource = {R.drawable.special_ice_body, R.drawable.special_ice_background, R.drawable.special_ice_unit, R.drawable.special_ice_1, R.drawable.special_ice_2, R.drawable.special_ice_3, R.drawable.special_ice_4, R.drawable.special_ice_5, R.drawable.special_ice_6, R.drawable.special_ice_7, R.drawable.special_ice_8, R.drawable.special_ice_9, R.drawable.special_ice_10, R.drawable.special_ice_11, R.drawable.special_ice_12, R.drawable.special_ice_13, R.drawable.special_ice_14, R.drawable.special_ice_lineb, R.drawable.special_ice_linem, R.drawable.special_ice_lines};
    public static final int[] uiUpgradeResource = {R.drawable.ui_upgrade_btnherooff, R.drawable.ui_upgrade_btnheroon, R.drawable.ui_upgrade_btnunitoff, R.drawable.ui_upgrade_btnuniton, R.drawable.ui_upgrade_titlehero, R.drawable.ui_upgrade_titleunit, R.drawable.ui_upgrade_basehero, R.drawable.ui_upgrade_baseunit, R.drawable.ui_upgrade_tabherooff, R.drawable.ui_upgrade_tabheroon, R.drawable.ui_upgrade_tabunitoff, R.drawable.ui_upgrade_tabuniton, R.drawable.ui_upgrade_baseblack, R.drawable.ui_upgrade_btnupgradeoff, R.drawable.ui_upgrade_btnupgradeon, R.drawable.ui_upgrade_max, R.drawable.ui_upgrade_iconselectn, R.drawable.ui_upgrade_iconselecta, R.drawable.ui_upgrade_uprightbar};
    public static final int[] uiShopResource = {R.drawable.ui_shop_titleequip, R.drawable.ui_shop_titlepostbox, R.drawable.ui_shop_titleshop, R.drawable.ui_shop_titleinventory, R.drawable.ui_shop_warriorbody, R.drawable.ui_shop_warrioroutline, R.drawable.ui_shop_warriorshadow, R.drawable.ui_shop_archerbody, R.drawable.ui_shop_archeroutline, R.drawable.ui_shop_archershadow, R.drawable.ui_shop_wizardbody, R.drawable.ui_shop_wizardoutline, R.drawable.ui_shop_wizardshadow, R.drawable.ui_shop_herobase, R.drawable.ui_shop_heroslot, R.drawable.ui_shop_postboxbase, R.drawable.ui_shop_shopbase, R.drawable.ui_shop_shopitembar, R.drawable.ui_shop_shopselectbar, R.drawable.ui_shop_tabequipoff, R.drawable.ui_shop_tabequipon, R.drawable.ui_shop_tabshopoff, R.drawable.ui_shop_tabshopon, R.drawable.ui_shop_underbar, R.drawable.ui_shop_btnmshopoff, R.drawable.ui_shop_btnmshopon, R.drawable.ui_shop_btnmequipoff, R.drawable.ui_shop_btnmequipon, R.drawable.ui_shop_btnmpostboxoff, R.drawable.ui_shop_btnmpostboxon, R.drawable.ui_shop_btnbackoff, R.drawable.ui_shop_btnbackon, R.drawable.ui_shop_btnbuyoff, R.drawable.ui_shop_btnbuyon, R.drawable.ui_shop_btndropoff, R.drawable.ui_shop_btndropon, R.drawable.ui_shop_btngiftoff, R.drawable.ui_shop_btngifton, R.drawable.ui_shop_btnsaveoff, R.drawable.ui_shop_btnsaveon, R.drawable.ui_shop_btnselloff, R.drawable.ui_shop_btnsellon, R.drawable.ui_shop_btnleftarrowoff, R.drawable.ui_shop_btnleftarrowon, R.drawable.ui_shop_btnrightarrowoff, R.drawable.ui_shop_btnrightarrowon, R.drawable.ui_shop_iconempty, R.drawable.ui_shop_lock, R.drawable.ui_shop_glow, R.drawable.ui_shop_telbody, R.drawable.ui_shop_tel0, R.drawable.ui_shop_tel1, R.drawable.ui_shop_tel2, R.drawable.ui_shop_tel3, R.drawable.ui_shop_tel4, R.drawable.ui_shop_tel5, R.drawable.ui_shop_tel6, R.drawable.ui_shop_tel7, R.drawable.ui_shop_tel8, R.drawable.ui_shop_tel9, R.drawable.ui_shop_telback, R.drawable.ui_shop_telok, R.drawable.ui_shop_telclsoff, R.drawable.ui_shop_telclson};
    public static final int[] uiUpunitResource = {R.drawable.ui_upunit_warrior0, R.drawable.ui_upunit_warrior1, R.drawable.ui_upunit_warrior2, R.drawable.ui_upunit_warrior3, R.drawable.ui_upunit_warrior4, R.drawable.ui_upunit_warrior5, R.drawable.ui_upunit_archer0, R.drawable.ui_upunit_archer1, R.drawable.ui_upunit_archer2, R.drawable.ui_upunit_archer3, R.drawable.ui_upunit_archer4, R.drawable.ui_upunit_archer5, R.drawable.ui_upunit_wizard0, R.drawable.ui_upunit_wizard1, R.drawable.ui_upunit_wizard2, R.drawable.ui_upunit_wizard3, R.drawable.ui_upunit_wizard4, R.drawable.ui_upunit_wizard5};
    public static final int[] uiUpheroResource = {R.drawable.ui_uphero_up0, R.drawable.ui_uphero_up1, R.drawable.ui_uphero_up2, R.drawable.ui_uphero_up3, R.drawable.ui_uphero_up4, R.drawable.ui_uphero_up5};
    public static final int[] uiUpitemResource = {R.drawable.ui_upitem_reset, R.drawable.ui_upitem_blue0, R.drawable.ui_upitem_blue1, R.drawable.ui_upitem_blue2, R.drawable.ui_upitem_blue3, R.drawable.ui_upitem_blue4, R.drawable.ui_upitem_blue5, R.drawable.ui_upitem_blue6, R.drawable.ui_upitem_blue7, R.drawable.ui_upitem_blue8, R.drawable.ui_upitem_blue9, R.drawable.ui_upitem_blue10, R.drawable.ui_upitem_blue11, R.drawable.ui_upitem_blue12, R.drawable.ui_upitem_blue13, R.drawable.ui_upitem_blue14, R.drawable.ui_upitem_blue15, R.drawable.ui_upitem_red0, R.drawable.ui_upitem_red1, R.drawable.ui_upitem_red2, R.drawable.ui_upitem_red3, R.drawable.ui_upitem_red12, R.drawable.ui_upitem_red13, R.drawable.ui_upitem_red14, R.drawable.ui_upitem_red15, R.drawable.ui_upitem_herospe0, R.drawable.ui_upitem_herospe1, R.drawable.ui_upitem_herospe2, R.drawable.ui_upitem_herospe3, R.drawable.ui_upitem_limit0};
    public static final int[] uiStageResource = {R.drawable.ui_stage_leftwindow, R.drawable.ui_stage_rightwindow, R.drawable.ui_stage_effect1, R.drawable.ui_stage_effect2, R.drawable.ui_stage_effect3, R.drawable.ui_stage_effect4, R.drawable.ui_stage_effect5, R.drawable.ui_stage_back_off, R.drawable.ui_stage_back_on, R.drawable.ui_stage_chapterleft_off, R.drawable.ui_stage_chapterleft_on, R.drawable.ui_stage_chapterright_off, R.drawable.ui_stage_chapterright_on, R.drawable.ui_stage_stageleft_off, R.drawable.ui_stage_stageleft_on, R.drawable.ui_stage_stageright_off, R.drawable.ui_stage_stageright_on, R.drawable.ui_stage_chapter, R.drawable.ui_stage_1, R.drawable.ui_stage_2, R.drawable.ui_stage_3, R.drawable.ui_stage_4, R.drawable.ui_stage_5, R.drawable.ui_stage_name1, R.drawable.ui_stage_name2, R.drawable.ui_stage_name3, R.drawable.ui_stage_name4, R.drawable.ui_stage_name5, R.drawable.ui_stage_wave, R.drawable.ui_stage_highscore, R.drawable.ui_stage_stagebox, R.drawable.ui_stage_stageselect, R.drawable.ui_stage_engage_off, R.drawable.ui_stage_engage_on, R.drawable.ui_stage_mapline, R.drawable.ui_stage_normal_off, R.drawable.ui_stage_normal_on, R.drawable.ui_stage_infinity_off, R.drawable.ui_stage_infinity_on, R.drawable.ui_stage_gatebreaker_off, R.drawable.ui_stage_gatebreaker_on, R.drawable.ui_stage_infinity_noselect, R.drawable.ui_stage_gatebreaker_noselect, R.drawable.ui_stage_new, R.drawable.ui_stage_stage, R.drawable.ui_stage_lock, R.drawable.ui_stage_perfect};
    public static final int[] uiStageBossResource = {R.drawable.ui_stage_boss1, R.drawable.ui_stage_boss2, R.drawable.ui_stage_boss3, R.drawable.ui_stage_boss4, R.drawable.ui_stage_boss5};
    public static final int[] tutorialResource = {R.drawable.tutorial_arrow1, R.drawable.tutorial_arrow2, R.drawable.tutorial_arrow3, R.drawable.tutorial_arrow4, R.drawable.tutorial_arrow5, R.drawable.tutorial_arrow6, R.drawable.tutorial_arrow7, R.drawable.tutorial_box0, R.drawable.tutorial_box1, R.drawable.tutorial_box2, R.drawable.tutorial_box3, R.drawable.tutorial_box4, R.drawable.tutorial_box5, R.drawable.tutorial_box6, R.drawable.tutorial_box7, R.drawable.tutorial_box8, R.drawable.tutorial_button, R.drawable.tutorial_follow, R.drawable.tutorial_hand0, R.drawable.tutorial_hand1, R.drawable.tutorial_ment0, R.drawable.tutorial_ment1, R.drawable.tutorial_ment2, R.drawable.tutorial_ment3, R.drawable.tutorial_ment4, R.drawable.tutorial_ment5, R.drawable.tutorial_ment6, R.drawable.tutorial_ment7, R.drawable.tutorial_target};
    public static final int[] gatefireResource = {R.drawable.gatefire_fire1, R.drawable.gatefire_fire2, R.drawable.gatefire_fire3, R.drawable.gatefire_fire4, R.drawable.gatefire_eyewest1, R.drawable.gatefire_eyewest2, R.drawable.gatefire_eyeeast1, R.drawable.gatefire_eyeeast2, R.drawable.gatefire_eyesouth1, R.drawable.gatefire_eyesouth2};
    public static final int[] uiPopupResource = {R.drawable.ui_popup_background, R.drawable.ui_popup_levelup, R.drawable.ui_popup_nooff, R.drawable.ui_popup_noon, R.drawable.ui_popup_stat, R.drawable.ui_popup_yesoff, R.drawable.ui_popup_yeson, R.drawable.ui_popup_background2, R.drawable.ui_popup_nooff2, R.drawable.ui_popup_noon2, R.drawable.ui_popup_yesoff2, R.drawable.ui_popup_yeson2, R.drawable.ui_popup_okoff2, R.drawable.ui_popup_okon2};
    public static final int[] uiThemeclearResource = {R.drawable.ui_themeclear_background, R.drawable.ui_themeclear_map1, R.drawable.ui_themeclear_map2, R.drawable.ui_themeclear_icon, R.drawable.ui_themeclear_glow, R.drawable.ui_themeclear_arrow, R.drawable.ui_themeclear_iconblack};
    public static final int[] arrowResource0 = {R.drawable.arrow_0_0};
    public static final int[] arrowResource1 = {R.drawable.arrow_1_0, R.drawable.arrow_1_1};
    public static final int[] arrowResource2 = {R.drawable.arrow_2_0, R.drawable.arrow_2_1};
    public static final int[] arrowResource3 = {R.drawable.arrow_3_0, R.drawable.arrow_3_1};
    public static final int[] arrowResource4 = {R.drawable.arrow_4_0, R.drawable.arrow_4_1, R.drawable.arrow_4_2, R.drawable.arrow_4_3, R.drawable.arrow_4_4, R.drawable.arrow_4_5};
    public static final int[] arrowResource9 = {R.drawable.arrow_9_0, R.drawable.arrow_9_1};

    public GameRenderer(NewTower newTower2) {
        newTower = newTower2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Texture2D.connectGL(newTower, gl10);
        textTombstone.connectGL(gl10);
        gl10.glClearDepthf(1.0f);
        gl10.glDisable(2929);
    }

    public void onPause() {
        isPaused = true;
    }

    public void onResume() {
        isPaused = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int d1, int d2) {
        Texture2D.connectGL(newTower, gl10);
        textTombstone.connectGL(gl10);
        SCRWIDTH = Math.max(d1, d2);
        SCRHEIGHT = Math.min(d1, d2);

        SCRWIDTH_SMALL = Texture2D.SCRWIDTH_800;
        SCRHEIGHT_SMALL = Texture2D.SCRHEIGHT_480;
        CX = SCRWIDTH_SMALL / 2;
        CY = SCRHEIGHT_SMALL / 2;
        DRAW_SCALE_SIZE = 1.0f;
        DRAW_SCALE_SIZE_X = 1.0f;
        DRAW_SCALE_SIZE_Y = 1.0f;
        DRAW_SCALE_X_MOVE = 0.0f;
        DRAW_SCALE_Y_MOVE = 0.0f;
        Texture2D.DRAW_ADJUST_X_MOVE = 0.0f;
        Texture2D.DRAW_ADJUST_Y_MOVE = 0.0f;
        float dw = SCRWIDTH != SCRWIDTH_SMALL ? SCRWIDTH / SCRWIDTH_SMALL : 1;
        float dh = SCRHEIGHT != SCRHEIGHT_SMALL ? SCRHEIGHT / SCRHEIGHT_SMALL : 1;
        Log.d("WINDOW SIZE", "WINDOW SIZE " + SCRWIDTH + "," + SCRHEIGHT + "," + SCRWIDTH_SMALL + "," + SCRHEIGHT_SMALL + "," + dw + "," + dh);
        if (dw != 1.0f || dh != 1.0f) {
            float f3;
            if (dw < dh) {
                DRAW_SCALE_SIZE = dw;
                f3 = (int) (((SCRHEIGHT / dw) - SCRHEIGHT_SMALL) / 2.0f);
                DRAW_SCALE_Y_MOVE = f3;
                Texture2D.DRAW_ADJUST_Y_MOVE = f3;
            } else {
                DRAW_SCALE_SIZE = dh;
                f3 = (int) (((SCRWIDTH / dh) - SCRWIDTH_SMALL) / 2.0f);
                DRAW_SCALE_X_MOVE = f3;
                Texture2D.DRAW_ADJUST_X_MOVE = f3;
            }
        }
        gl10.glViewport(0, 0, SCRWIDTH, SCRHEIGHT);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluOrtho2D(gl10, 0.0f, SCRWIDTH, 0.0f, SCRHEIGHT);
        float f5 = DRAW_SCALE_SIZE;
        if (f5 != 1.0f) {
            gl10.glScalef(f5, f5, 1.0f);
        }
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glEnableClientState(32888);
        gl10.glEnableClientState(32884);
        gl10.glEnable(3553);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvf(8960, 8704, 8448.0f);
        gl10.glTexEnvf(8960, 8705, 6408.0f);
        gl10.glTexParameterf(3553, 10241, 9728.0f);
        gl10.glTexParameterf(3553, 10240, 9728.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (isPaused)
            return;
        drawFrame(gl10);
    }

    public static void setDefaultFont() {
        lastFontName = null;
        drawFont.setTypeface(Typeface.create(Typeface.SERIF, 1));
    }

    public static void setFontName(String str) {
        String str2 = lastFontName;
        if (str2 == null || !str2.equals(str)) {
            lastFontName = str;
            drawFont.setTypeface(Typeface.create(Typeface.SERIF, 1));
        }
    }

    public static void setFontColor(int i) {
        fontColor = i;
        strokeColor = i;
    }

    public static void setFontDoubleColor(int i, int i2) {
        fontColor = i;
        strokeColor = i2;
    }

    public static void setFontSize(int i) {
        fontSize = i;
        drawFont.setTextSize(i);
    }

    public static CGRect CGRectMake(float x, float y, float w, float h) {
        if (_CGRect == null)
            _CGRect = new CGRect();

        _CGRect.originX = x;
        _CGRect.originY = y;
        _CGRect.sizeWidth = w;
        _CGRect.sizeHeight = h;
        return _CGRect;
    }

    public static CGPoint CGPointMake(float f, float f2) {
        if (_CGPoint == null) {
            _CGPoint = new CGPoint();
        }
        _CGPoint.x = f;
        _CGPoint.y = f2;
        return _CGPoint;
    }

    private synchronized void drawFrame(GL10 gl10) {
        gl10.glClear(16384);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvf(8960, 8704, 7681.0f);
        GameThread.gameTimeCount++;
        if (NewTower.gameThread != null)
            NewTower.gameThread.updateGame();

        GameThread.currentFrameCount++;
        GameThread.currentDate = System.currentTimeMillis();
        if (GameThread.currentDate - GameThread.startDate > 1000) {
            GameThread.lastFrameCount = GameThread.currentFrameCount;
            GameThread.currentFrameCount = 0;
            GameThread.startDate = GameThread.currentDate;
        }
        GameThread.realDrawCount++;
        GameThread.currentDrawDate = System.currentTimeMillis();
        if (GameThread.currentDrawDate - GameThread.startDrawDate > 1000) {
            GameThread.lastDrawCount = GameThread.realDrawCount;
            GameThread.realDrawCount = 0;
            GameThread.startDrawDate = GameThread.currentDrawDate;
        }
        if (NewTower.currentPage != null)
            NewTower.currentPage.paint(gl10, true);

        if (outBorderImage != null) {
            if (DRAW_SCALE_X_MOVE != 0.0f) {
                if (DRAW_SCALE_X_MOVE >= DRAW_SCALE_X_SMALL_DEGREE) {
                    outBorderImage[1].drawAtPointOptionNoOut(0.0f, 0.0f, 20);
                    outBorderImage[2].drawAtPointOptionNoOut(SCRWIDTH_SMALL, 0.0f, 18);
                } else {
                    outBorderImage[0].drawAtPointOptionNoOut(0.0f, 0.0f, 20);
                    outBorderImage[0].drawAtPointOptionNoOut(SCRWIDTH_SMALL, 0.0f, 18);
                }
            }
            if (DRAW_SCALE_Y_MOVE != 0.0f) {
                outBorderImage[3].drawAtPointOptionNoOut(0.0f, 0.0f, 34);
                outBorderImage[3].drawAtPointOptionNoOut(0.0f, SCRHEIGHT_SMALL, 18);
            }
        }
    }

    public static boolean makeBaseStruct() {
        whiteCircleImage = makeTextureArray(4);
        redCircleImage = makeTextureArray(4);
        outBorderImage = makeTextureArray(4);
        numberStagePointImage = makeTextureArray(numberStagePointResource.length);
        numberUpgradeImage = makeTextureArray(numberUpgradeResource.length);
        numberClearImage = makeTextureArray(numberClearResource.length);
        numberTotalImage = makeTextureArray(numberTotalResource.length);
        tutorialImage = makeTextureArray(tutorialResource.length);
        gatefireImage = makeTextureArray(gatefireResource.length);
        stageClearImage = makeTextureArray(stageClearResource.length);
        uiIngameImage = makeTextureArray(ingameResource.length);
        uiThemeclearImage = makeTextureArray(uiThemeclearResource.length);
        specialSwordImage = makeTextureArray(specialSwordResource.length);
        specialArrowImage = makeTextureArray(specialArrowResource.length);
        specialIceImage = makeTextureArray(specialIceResource.length);
        uiUpgradeImage = makeTextureArray(uiUpgradeResource.length);
        uiShopImage = makeTextureArray(uiShopResource.length);
        uiUpunitImage = makeTextureArray(uiUpunitResource.length);
        uiUpheroImage = makeTextureArray(uiUpheroResource.length);
        uiUpitemImage = makeTextureArray(uiUpitemResource.length);
        uiStageImage = makeTextureArray(uiStageResource.length);
        uiStageBossImage = makeTextureArray(uiStageBossResource.length);
        effectImage_500 = makeTextureArray(DataAnim.unitImageResource_500.length);
        effectImage_502 = makeTextureArray(DataAnim.unitImageResource_502.length);
        effectImage_503 = makeTextureArray(DataAnim.unitImageResource_503.length);
        effectImage_504 = makeTextureArray(DataAnim.unitImageResource_504.length);
        effectImage_505 = makeTextureArray(DataAnim.unitImageResource_505.length);
        effectImage_509 = makeTextureArray(DataAnim.unitImageResource_509.length);
        effectImage_510 = makeTextureArray(DataAnim.unitImageResource_510.length);
        effectImage_533 = makeTextureArray(DataAnim.unitImageResource_533.length);
        effectImage_534 = makeTextureArray(DataAnim.unitImageResource_534.length);
        effectImage_512 = makeTextureArray(DataAnim.unitImageResource_512.length);
        effectImage_513 = makeTextureArray(DataAnim.unitImageResource_513.length);
        effectImage_514 = makeTextureArray(DataAnim.unitImageResource_514.length);
        effectImage_532 = makeTextureArray(DataAnim.unitImageResource_532.length);
        effectImage_535 = makeTextureArray(DataAnim.unitImageResource_535.length);
        arrowImage0 = makeTextureArray(arrowResource0.length);
        arrowImage1 = makeTextureArray(arrowResource1.length);
        arrowImage2 = makeTextureArray(arrowResource2.length);
        arrowImage3 = makeTextureArray(arrowResource3.length);
        arrowImage4 = makeTextureArray(arrowResource4.length);
        arrowImage9 = makeTextureArray(arrowResource9.length);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean load_GAME_PRE_TOTAL_IMAGE_LOAD(int i, boolean z) {
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", i));
        if (i != 1 && i != 2) {
            switch (i) {
                case 6:
                    loadImageResourceToTexture(uiPopupImage, uiPopupResource);
                    break;
                case 14:
                    outBorderImage[0].initWithImageName(R.drawable.etc_out);
                    outBorderImage[1].initWithImageName(R.drawable.etc_outl);
                    outBorderImage[2].initWithImageName(R.drawable.etc_outr);
                    outBorderImage[3].initWithImageName(R.drawable.etc_outu);
                    if (!z) {
                        loadViewFlag = true;
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    public static float drawNumberBlock(int number, Texture2D[] texture2DArr, float x, float y, int extW, int pivot, int maxCount) {
        float bnsY = 1.0f;
        for (int i7 = 0; i7 < 10; i7++)
            if (texture2DArr[i7]._sizeY > bnsY)
                bnsY = texture2DArr[i7]._sizeY;

        number = Math.abs(number);
        int numSiz = 0;
        int textureSiz = (int)texture2DArr[number % 10]._sizeX;
        while (Math.pow(10, ++numSiz) < number)
            textureSiz += (int) (texture2DArr[(int)(number / Math.pow(10, ++numSiz)) % 10]._sizeX);
        int nwidth = textureSiz + (numSiz * extW);

        if (numSiz < maxCount) {
            for (int i = numSiz; i < maxCount; i++)
                nwidth += (int)texture2DArr[0]._sizeX;
            nwidth += (maxCount - numSiz) * extW;
        } else
            maxCount = numSiz;

        if (pivot == 9 || pivot == 10 || pivot == 12)
            y -= bnsY / 2f;
        else if (pivot == 36 || pivot == 33 || pivot == 34)
            y -= bnsY;

        if (pivot != 9) {
            if (pivot != 10 && pivot != 17 && pivot != 18 && pivot != 33 && pivot != 34)
                nwidth /= 2;

            x += nwidth;
            float dx = x;
            for (int i11 = 0; i11 < maxCount; i11++) {
                int idrw = number % 10;
                texture2DArr[idrw].drawAtPointOption(dx, y + bnsY, 36);
                dx -= texture2DArr[idrw]._sizeX + extW;
                if (number > 0)
                    number /= 10;
            }
            return x;
        }
        return x;
    }

    public static void drawStringM(String str, float x, float y, int pivot) {
        if (setDrawStringBuffer(str, fontColor))
            drawStringBuffer.drawAtPointOption(x, y, pivot);
    }

    static void drawStringGuideM(String str, float x, float y, int pivot, CGRect cGRect) {
        if (setDrawStringBuffer(str, fontColor))
            drawStringBuffer.drawAtPointOptionGuide(x, y, pivot, cGRect);
    }

    public static void drawStringDoubleM(String str, float x, float y, int pivot) {
        if (setDrawStringBuffer(str, strokeColor))
            drawStringBuffer.drawAtPointOption(x, y, pivot);
    }

    public static void drawStringDoubleGuideM(String str, float x, float y, int pivot, CGRect rect) {
        if (setDrawStringBuffer(str, strokeColor))
            drawStringBuffer.drawAtPointOptionGuide(x, y, pivot, rect);
    }

    public static boolean setDrawStringBuffer(String str, int strokeColor) {
        int search = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
        if (search == -1) {
            textTombstone.setTombstone(str);
            search = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
            if (search == -1)
                return false;
        }
        drawStringBuffer = textTombstone.getTombstone(search);
        return true;
    }

    public static Texture2D[] makeTextureArray(int i) {
        Texture2D[] texture2DArr = new Texture2D[i];
        for (int i2 = 0; i2 < i; i2++)
            texture2DArr[i2] = new Texture2D();

        return texture2DArr;
    }

    public static void loadImageResourceToTexture(Texture2D[] texture2DArr, int[] iArr) {
        if (texture2DArr == null || iArr == null)
            return;
        for (int i = 0; i < texture2DArr.length && i < iArr.length; i++)
            texture2DArr[i].initWithImageName(iArr[i]);
    }

    public static void drawLeftRightBox(float x, float y, int bound) {
        int bX = bound - testboxCoord[1][2], cX = (bound - testboxCoord[2][2]) / 2;
        int dX = cX - testboxCoord[0][2], eX = cX + testboxCoord[2][2];

        testboxImage.drawAtPointOptionClip(x + 0, y, 18, CGRectMake(testboxCoord[0][0], testboxCoord[0][1], testboxCoord[0][2], testboxCoord[0][3]));
        testboxImage.drawAtPointOptionClip(x + bX, y, 18, CGRectMake(testboxCoord[1][0], testboxCoord[1][1], testboxCoord[1][2], testboxCoord[1][3]));
        testboxImage.drawAtPointOptionClip(x + cX, y, 18, CGRectMake(testboxCoord[2][0], testboxCoord[2][1], testboxCoord[2][2], testboxCoord[2][3]));
        testboxImage.drawAtPointOptionClipPixel(x + testboxCoord[0][2], y, 18, CGRectMake(testboxCoord[3][0], testboxCoord[3][1], testboxCoord[3][2], testboxCoord[3][3]), dX, testboxCoord[3][3]);
        testboxImage.drawAtPointOptionClipPixel(x + eX, y, 18, CGRectMake(testboxCoord[3][0], testboxCoord[3][1], testboxCoord[3][2], testboxCoord[3][3]), bX - eX, testboxCoord[3][3]);
    }
}
