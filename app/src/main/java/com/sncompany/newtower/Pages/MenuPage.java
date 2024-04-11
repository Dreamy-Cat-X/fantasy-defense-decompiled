package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class MenuPage extends TPage { //Note: This one's parent will always be TitlePage

    public static final int TITLE_MAINMENU_COUNT_FADE_AWAY_REMOVE_COUNT = 10;
    public static final int TITLE_MAINMENU_COUNT_FADE_IN_START_POS = 20;
    public static final int TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_POS = 0;
    public static final float TITLE_MAINMENU_COUNT_FADE_AWAY_RATE = 0.1f;
    public static final float TITLE_MAINMENU_COUNT_FADE_IN_RATE = 0.1f;
    static final float TITLE_GLOW_MOVE_DEGREE = 0.05f;
    public static final float TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_RATE = TITLE_GLOW_MOVE_DEGREE;
    public static final float TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE = TITLE_GLOW_MOVE_DEGREE;
    public static int TITLE_MAINMENU_COUNT_SHORT_MOVE_MAX_COUNT = 20;
    public static int TITLE_MAINMENU_COUNT_MOVE_MAX_COUNT = 30;

    public static int TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT = 10;
    public static int TITLE_MAINMENU_REV_COUNT_FADE_IN_START_POS = 20;
    public static int TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS = 10;
    public static float TITLE_MAINMENU_REV_COUNT_FADE_AWAY_RATE = 0.1f;
    public static float TITLE_MAINMENU_REV_COUNT_FADE_OUT_RATE = 0.1f;
    public static float TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_RATE = TITLE_GLOW_MOVE_DEGREE;
    public static int TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT = 30;
    public static final int GAME_MAINMENU_TOUCH_LIST_0_START = 0;
    public static final int GAME_MAINMENU_TOUCH_LIST_1_HELP = 1;
    public static final int GAME_MAINMENU_TOUCH_LIST_2_RECORD = 2;
    public static final int GAME_MAINMENU_TOUCH_LIST_3_UPGRADE = 3;
    public static final int GAME_MAINMENU_TOUCH_LIST_4_SHOP = 4;
    public static final int GAME_MAINMENU_TOUCH_LIST_5_BACK = 5;
    public static final int GAME_MAINMENU_TOUCH_LIST_TOTAL_COUNT = 6;

    public static final int[] mainmenuResource = {R.drawable.ui_mainmenu_background2, R.drawable.ui_mainmenu_startonl, R.drawable.ui_mainmenu_helponl, R.drawable.ui_mainmenu_recordonl, R.drawable.ui_mainmenu_upgradeonl, R.drawable.ui_mainmenu_shoponl, R.drawable.ui_mainmenu_backonl};
    public static final float[][] onPos = {{514.0f, 0.0f}, {228.0f, 5.0f}, {29.0f, 0.0f}, {383.0f, 204.0f}, {87.0f, 254.0f}, {8.0f, 318.0f}};
    public static final int[] numberHeroismResource = {R.drawable.num_heroism_0, R.drawable.num_heroism_1, R.drawable.num_heroism_2, R.drawable.num_heroism_3, R.drawable.num_heroism_4, R.drawable.num_heroism_5, R.drawable.num_heroism_6, R.drawable.num_heroism_7, R.drawable.num_heroism_8, R.drawable.num_heroism_9};

    public final Texture2D[] mainmenuImage = new Texture2D[mainmenuResource.length];
    private TPage child;
    public int titlePressed = -1, titleCount = 0;
    public boolean cancel = false;

    public MenuPage(TPage par) {
        super(par);
    }

    @Override
    public void load(Consumer<Float> prog) {
        loadP(mainmenuImage, mainmenuResource, prog, 1, mainmenuImage.length);
        loaded = true;
    }

    public void back(boolean anim) {
        titleCount = 0;
        cancel = anim;
        if (!anim) {
            child.unload();
            child = null;
            titlePressed = -1;
        }
    }

    @Override
    public void update() {
        GameThread.myOscillator[11].updatePosition();

        if (child == null)
            return;

        if (!cancel) {
            if (titleCount >= TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT)
                return;

            if (titleCount >= TITLE_MAINMENU_COUNT_SHORT_MOVE_MAX_COUNT && (titlePressed == GAME_MAINMENU_TOUCH_LIST_0_START || titlePressed == GAME_MAINMENU_TOUCH_LIST_5_BACK)) {
                if (!Config.tutorial) {
                    child.unload();
                    child = new LoadingPage(new TutorialPage(new StageSelectPage(this)));
                }
                GameThread.stopLoopSound(0);
                NewTower.switchPage(child, true);
            } else if (GameRenderer.titleCount >= GameRenderer.TITLE_MAINMENU_COUNT_MOVE_MAX_COUNT)
                NewTower.switchPage(child, true);
            else
                child.update();
        } else if (titleCount < TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT) {
            titleCount++;
            cancel = titleCount < TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT;
            if (!cancel) {
                titlePressed = -1;
                child = null;
            }
        }
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        if (init)
            TouchManager.clearTouchMap();
        mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        if (child == null) {
            TouchManager.addTouchRectListData(GAME_MAINMENU_TOUCH_LIST_0_START, GameRenderer.CGRectMake(535.0f, 0.0f, 265.0f, 206.0f)); //Stage Select
            TouchManager.addTouchRectListData(GAME_MAINMENU_TOUCH_LIST_1_HELP, GameRenderer.CGRectMake(227.0f, 2.0f, 225.0f, 159.0f));
            TouchManager.addTouchRectListData(GAME_MAINMENU_TOUCH_LIST_2_RECORD, GameRenderer.CGRectMake(5.0f, 23.0f, 190.0f, 207.0f));
            TouchManager.addTouchRectListData(GAME_MAINMENU_TOUCH_LIST_3_UPGRADE, GameRenderer.CGRectMake(398.0f, 205.0f, 324.0f, 247.0f));
            TouchManager.addTouchRectListData(GAME_MAINMENU_TOUCH_LIST_4_SHOP, GameRenderer.CGRectMake(98.0f, 258.0f, 236.0f, 203.0f));
            TouchManager.addTouchRectListData(GAME_MAINMENU_TOUCH_LIST_5_BACK, GameRenderer.CGRectMake(0.0f, 333.0f, 92.0f, 129.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = GAME_MAINMENU_TOUCH_LIST_TOTAL_COUNT;

            TouchManager.swapTouchMap();
            return;
        }

        if (cancel) {
            float a = titleCount >= TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS ? 1.0f - ((titleCount - TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS) * TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_RATE) : 1.0f;
            if (a > 0.0f) {
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(1f, 1f, 1f, a);
                drawOn(titlePressed + 1);
            }
            if (titleCount <= TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT) {
                if (titleCount < TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT) {
                    a = 0.5f - (titleCount * TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(1f, 1f, 1f, a);
                    fillBlackImage.fillRect(0.0f, 0.0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.gl.glColor4f(1f, 1f, 1f, 1f);
                }
                float f4 = 1.0f - (titleCount * TITLE_MAINMENU_REV_COUNT_FADE_OUT_RATE);
                if (f4 > 0.0f) {
                    gl10.glTexEnvf(8960, 8704, 8448.0f);
                    gl10.glColor4f(1f, 1f, 1f, f4);
                    child.paint(gl10, false);
                }
            }
            gl10.glColor4f(1f, 1f, 1f, 1.0f);
            TouchManager.swapTouchMap();
            return;
        }

        if (titleCount >= TITLE_MAINMENU_COUNT_MOVE_MAX_COUNT) {
            drawOn(titlePressed + 1);
            return;
        }
        if (titleCount >= TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_POS) {
            float a = Math.min(1f, (titleCount - TITLE_MAINMENU_COUNT_FADE_IN_START_POS) * TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_RATE);

            gl10.glTexEnvf(8960, 8704, 8448.0f);
            gl10.glColor4f(1f, 1f, 1f, a);
            drawOn(titlePressed + 1);
        }
        if (titleCount >= TITLE_MAINMENU_COUNT_FADE_IN_START_POS) {
            if (titleCount > TITLE_MAINMENU_COUNT_FADE_IN_START_POS) {
                float aa = (titleCount - TITLE_MAINMENU_COUNT_FADE_IN_START_POS) * TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(1f, 1f, 1f, aa);
                fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                Texture2D.gl.glColor4f(1f, 1f, 1f, 1f);
            }
            float aaa = Math.min(1f, (titleCount - TITLE_MAINMENU_COUNT_FADE_IN_START_POS) * TITLE_MAINMENU_COUNT_FADE_IN_RATE);
            if (aaa > 0f) {
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(1f, 1f, 1f, aaa);
                child.paint(gl10, false);
            }
        }
        gl10.glColor4f(1f, 1f, 1f, 1f);
        TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        int i = TouchManager.lastActionStatus;
        if (i != TouchManager.TOUCH_STATUS_NO_INPUT)
            return;

        int CTLS = TouchManager.checkTouchListStatus();
        if (CTLS != -1 && CTLS <= GAME_MAINMENU_TOUCH_LIST_5_BACK) {
            if (TouchManager.curruptFlag) {
                TouchManager.clearTouchStatus();
                return;
            }
            titlePressed = CTLS;
            switch (CTLS) {
                case GAME_MAINMENU_TOUCH_LIST_0_START:
                    child = new LoadingPage(new StageSelectPage(this));
                    GameThread.playSound(14);
                    titleCount = 0;
                    break;
                case GAME_MAINMENU_TOUCH_LIST_1_HELP:
                    child = new HelpPage(this);
                    GameThread.gameHelpViewNum = 0;
                    GameThread.playSound(14);
                    titleCount = 0;
                    break;
                case GAME_MAINMENU_TOUCH_LIST_2_RECORD:
                    child = new RecordPage(this);
                    GameThread.playSound(14);
                    titleCount = 0;
                    break;
                case GAME_MAINMENU_TOUCH_LIST_3_UPGRADE: {
                    Consumer<Integer> c = (in -> NewTower.switchPage(new UpgradePage(this, in), true));
                    child = new ListPage(this, new Consumer[]{c, c}, new int[]{UpgradePage.uiUpgradeResource[0], ShopPage.uiShopResource[1], ShopPage.uiShopResource[2], ShopPage.uiShopResource[3]});
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    titleCount = 0;
                    break;
                } case GAME_MAINMENU_TOUCH_LIST_4_SHOP: {
                    Consumer<Integer> c1 = (in -> NewTower.switchPage(new ShopPage(this), true));
                    Consumer<Integer> c2 = (in -> NewTower.switchPage(new EquipPage(this), true));
                    int imi = ShopPage.MIN_U;
                    child = new ListPage(this, new Consumer[]{c1, c2}, new int[]{ShopPage.uiShopResource[imi], ShopPage.uiShopResource[imi + 1], ShopPage.uiShopResource[imi + 2], ShopPage.uiShopResource[imi + 3]});
                    GameThread.playSound(14);
                    titleCount = 0;
                    break;
                } case GAME_MAINMENU_TOUCH_LIST_5_BACK:
                    child = parent; //lol
                    GameThread.stopLoopSound(1);
                    GameThread.stopLoopSound(0);
                    break;
            }
            if (child != null)
                child.load(null);
        }
        TouchManager.clearTouchStatus();
    }

    @Override
    public void unload() {
        for (Texture2D t2d : mainmenuImage) t2d.dealloc();
        loaded = false;
    }

    public void drawOn(int i) {
        int loc = i - 1;
        mainmenuImage[i].drawAtPointOption(onPos[loc][0], onPos[loc][1], 18);
    }
}
