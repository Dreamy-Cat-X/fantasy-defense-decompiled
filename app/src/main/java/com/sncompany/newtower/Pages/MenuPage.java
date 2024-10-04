package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.stage.TutorialPage;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class MenuPage extends TPage { //Note: This one's parent will always be TitlePage

    public static final int TITLE_MAINMENU_COUNT_FADE_IN_START_POS = 20;
    public static final int TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_POS = 0;
    public static final float TITLE_MAINMENU_COUNT_FADE_IN_RATE = 0.1f;
    static final float TITLE_GLOW_MOVE_DEGREE = 0.05f;
    public static final float TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_RATE = TITLE_GLOW_MOVE_DEGREE;
    public static final float TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE = TITLE_GLOW_MOVE_DEGREE;
    public static int TITLE_MAINMENU_COUNT_SHORT_MOVE_MAX_COUNT = 20;
    public static int TITLE_MAINMENU_COUNT_MOVE_MAX_COUNT = 30;

    public static int TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT = 10;
    public static int TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS = 10;
    public static float TITLE_MAINMENU_REV_COUNT_FADE_OUT_RATE = 0.1f;
    public static float TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_RATE = TITLE_GLOW_MOVE_DEGREE;
    public static int TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT = 30;
    public static final int START = 0, HELP = 1,RECORD = 2, UPGRADE = 3, SHOP = 4, BACK = 5, TCH_TOT = 6;


    public static final int[] mainmenuResource = {R.drawable.ui_mainmenu_background2, R.drawable.ui_mainmenu_startonl, R.drawable.ui_mainmenu_helponl, R.drawable.ui_mainmenu_recordonl, R.drawable.ui_mainmenu_upgradeonl, R.drawable.ui_mainmenu_shoponl, R.drawable.ui_mainmenu_backonl};
    public static final float[][] onPos = {{514, 0}, {228, 5}, {29, 0}, {383, 204}, {87, 254}, {8, 318}};
    public static final int[] numberHeroismResource = {R.drawable.num_heroism_0, R.drawable.num_heroism_1, R.drawable.num_heroism_2, R.drawable.num_heroism_3, R.drawable.num_heroism_4, R.drawable.num_heroism_5, R.drawable.num_heroism_6, R.drawable.num_heroism_7, R.drawable.num_heroism_8, R.drawable.num_heroism_9};

    public final Texture2D[] mainmenuImage = new Texture2D[mainmenuResource.length];
    protected TPage child;
    public int titlePressed = -1, titleCount = 0;
    public boolean cancel = false;

    public MenuPage(TPage par) {
        super(par);
    }

    @Override
    public void load(Consumer<Float> prog) {
        loadP(mainmenuImage, mainmenuResource, prog, 1, mainmenuImage.length);
        loaded = true;
        GameThread.playBGM(1);
    }

    @Override
    public void onReload() {
        titlePressed = -1;
        titleCount = 0;
        if (child != null && child.loaded)
            child.unload();
        child = null;
        cancel = false;
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
        if (child == null)
            return;

        if (!cancel) {
            if (titleCount > TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT)
                return;

            if (titleCount >= TITLE_MAINMENU_COUNT_SHORT_MOVE_MAX_COUNT && (titlePressed == START || titlePressed == BACK)) {
                GameThread.stopBGM(0);
                if (!Config.s.tutorial && titlePressed == START) {
                    child.unload();
                    child = new TutorialPage(new StageSelectPage(this));
                }
                NewTower.switchPage(child);
            } else if (titleCount >= TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT)
                child.update();
        } else {
            cancel = titleCount < TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT;
            if (!cancel) {
                titlePressed = -1;
                child = null;
            }
        }
        if (titlePressed != -1 && titleCount < TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT)
            titleCount++;
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        if (init)
            TouchManager.clearTouchMap();
        mainmenuImage[0].drawAtPointOption(0, 0, 18);
        if (child == null) {
            TouchManager.addTouchRectListData(START, CGRect.make(535, 0, 265, 206)); //Stage Select
            TouchManager.addTouchRectListData(HELP, CGRect.make(227, 2, 225, 159));
            TouchManager.addTouchRectListData(RECORD, CGRect.make(5, 23, 190, 207));
            TouchManager.addTouchRectListData(UPGRADE, CGRect.make(398, 205, 324, 247));
            TouchManager.addTouchRectListData(SHOP, CGRect.make(98, 258, 236, 203));
            TouchManager.addTouchRectListData(BACK, CGRect.make(0, 333, 92, 129));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TCH_TOT;
            TouchManager.swapTouchMap();
            return;
        }
        if (cancel) {
            float a = titleCount >= TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS ? 1 - ((titleCount - TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS) * TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_RATE) : 1;
            if (a > 0) {
                gl10.glTexEnvf(8960, 8704, 8448);
                gl10.glColor4f(a, a, a, a);
                drawOn(titlePressed + 1);
            }
            if (titleCount <= TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT) {
                if (titleCount < TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT) {
                    a = 0.5f - (titleCount * TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(a);
                    fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1f);
                }
                float f4 = 1 - (titleCount * TITLE_MAINMENU_REV_COUNT_FADE_OUT_RATE);
                if (f4 > 0) {
                    gl10.glTexEnvf(8960, 8704, 8448);
                    gl10.glColor4f(f4, f4, f4, f4);
                    child.paint(gl10, init);
                }
            }
            gl10.glColor4f(1, 1, 1, 1);
            return;
        }

        if (titleCount >= TITLE_MAINMENU_COUNT_FADE_IN_START_POS) {
            drawOn(titlePressed + 1);
        } else if (titleCount >= TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_POS) {
            float a = titleCount * TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_RATE;

            gl10.glTexEnvf(8960, 8704, 8448);
            gl10.glColor4f(a, a, a, a);
            drawOn(titlePressed + 1);
            gl10.glColor4f(1, 1, 1, 1);
        }
        if (titleCount >= TITLE_MAINMENU_COUNT_FADE_IN_START_POS) {
            if (titleCount > TITLE_MAINMENU_COUNT_FADE_IN_START_POS) {
                float aa = (titleCount - TITLE_MAINMENU_COUNT_FADE_IN_START_POS) * TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(aa);
                fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                Texture2D.setColors(1f);
            }
            float aaa = Math.min(1f, (titleCount - TITLE_MAINMENU_COUNT_FADE_IN_START_POS) * TITLE_MAINMENU_COUNT_FADE_IN_RATE);
            if (aaa > 0f) {
                gl10.glTexEnvf(8960, 8704, 8448);
                gl10.glColor4f(aaa, aaa, aaa, aaa);
                child.paint(gl10, init);
            }
        }
        gl10.glColor4f(1f, 1f, 1f, 1f);
    }

    @Override
    public void touchCheck() {
        if (child != null && titleCount >= TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT) {
            child.touchCheck();
            return;
        }
        int i = TouchManager.lastActionStatus;
        if (i != TouchManager.TOUCH_STATUS_NO_INPUT)
            return;

        int CTLS = TouchManager.checkTouchListStatus();
        if (CTLS != -1 && CTLS <= BACK) {
            if (TouchManager.curruptFlag) {
                TouchManager.clearTouchStatus();
                return;
            }
            titlePressed = CTLS;
            switch (CTLS) {
                case START:
                    child = new StageSelectPage(this);
                    GameThread.playSound(14);
                    break;
                case HELP:
                    child = new HelpPage(this);
                    GameThread.playSound(14);
                    break;
                case RECORD:
                    child = new RecordPage(this);
                    GameThread.playSound(14);
                    break;
                case UPGRADE: {
                    Consumer<Integer> c = (in -> child = new UpgradePage(child, in));
                    child = new ListPage(this, new Consumer[]{c, c}, new int[]{UpgradePage.uiUpgradeResource[UpgradePage.upgrade_btnherooff], UpgradePage.uiUpgradeResource[UpgradePage.upgrade_btnheroon], UpgradePage.uiUpgradeResource[UpgradePage.upgrade_btnunitoff], UpgradePage.uiUpgradeResource[UpgradePage.upgrade_btnuniton]});
                    GameThread.playSound(14);
                    break;
                } case SHOP: {
                    Consumer<Integer> c1 = (in -> child = new ShopPage(child));
                    Consumer<Integer> c2 = (in -> child = new EquipPage(child));
                    int imi = ShopPage.MIN_U;
                    child = new ListPage(this, new Consumer[]{c1, c2}, new int[]{ShopPage.uiShopResource[imi + 2], ShopPage.uiShopResource[imi + 3], ShopPage.uiShopResource[imi], ShopPage.uiShopResource[imi + 1]});
                    GameThread.playSound(14);
                    break;
                } case BACK:
                    child = parent; //lol
                    GameThread.stopBGM(1);
                    GameThread.stopBGM(0);
                    break;
            }
            titleCount = 0;
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
