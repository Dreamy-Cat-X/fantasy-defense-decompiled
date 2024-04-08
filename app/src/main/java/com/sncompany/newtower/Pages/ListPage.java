package com.sncompany.newtower.Pages;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class ListPage extends TPage {

    public final Class<TPage>[] pages;
    public final int[] resources;
    public final Texture2D[] images;

    public ListPage(Class<TPage>[] pgs, int[] ress) {
        pages = pgs;
        resources = ress;
        images = new Texture2D[resources.length];
    }

    public void load() {
        for (byte i = 0; i < images.length; i++)
            images[i] = new Texture2D(resources[i]);
    }

    public void unload() {
        for (byte i = 0; i < images.length; i++) {
            images[i].dealloc();
            images[i] = null;
        }
    }

    public void paint_GAME_UPGRADE_LIST(GL10 gl10, boolean z) {
        int i;
        if (z) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, CGRectMake(1.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(1, CGRectMake(300.0f, 158.0f, 199.0f, 65.0f));
            TouchManager.addTouchRectListData(2, CGRectMake(300.0f, 258.0f, 199.0f, 65.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 3;
            i = TouchManager.checkTouchListStatus();

            mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
            mainmenuImage[4].drawAtPointOption(383.0f, 204.0f, 18);

            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        } else
            i = -1;

        uiUpgradeImage[i == 1 ? 3 : 2].drawAtPointOption(300.0f, 158.0f, 18);
        uiUpgradeImage[i == 2 ? 1 : 0].drawAtPointOption(300.0f, 258.0f, 18);
        uiEtcImage[i == 0 ? 2 : 1].drawAtPointOption(1.0f, 421.0f, 18);

        if (z)
            TouchManager.swapTouchMap();
    }

    public void paint_GAME_SHOP_LIST(GL10 gl10, boolean z) {
        int i;
        if (z) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, CGRectMake(1.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(1, CGRectMake(300.0f, 158.0f, 199.0f, 65.0f));
            TouchManager.addTouchRectListData(2, CGRectMake(300.0f, 258.0f, 199.0f, 65.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 3;
            i = TouchManager.checkTouchListStatus();

            mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
            mainmenuImage[5].drawAtPointOption(87.0f, 254.0f, 18);

            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        } else {
            i = -1;
        }

        uiShopImage[i == 1 ? 25 : 24].drawAtPointOption(300.0f, 158.0f, 18);
        uiShopImage[i == 2 ? 27 : 26].drawAtPointOption(300.0f, 258.0f, 18);
        uiEtcImage[i == 0 ? 2 : 1].drawAtPointOption(1.0f, 421.0f, 18);

        if (z)
            TouchManager.swapTouchMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:

        if (r0 != 3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchCheck_GAME_UPGRADE_LIST() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            if (checkTouchListStatus != 0) {
                if (checkTouchListStatus == 1) {
                    GameThread.gameStatus = 12;
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                } else if (checkTouchListStatus == 2) {
                    GameThread.gameStatus = 13;
                    GameThread.gameSubStatus = 0;
                    GameThread.upgradeHeroUpgradeSelectPos = 0;
                    GameThread.upgradeHeroUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                }
            }
            GameRenderer.titlePressed = 11;
            GameThread.upgradeUnitSelectPos = 0;
            GameThread.gameStatus = 7;
            GameRenderer.titleCount = 0;
            GameThread.playSound(15);
        }
        TouchManager.processTouchStatus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:

    if (r0 != 4) goto L22;
    */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchCheck_GAME_SHOP_LIST() { //It is not possible for the touchListStatus to be 3 in this menu, meaning the gift shop is inaccessible
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int cTLS = TouchManager.checkTouchListStatus();
        if (cTLS == 0) {
            GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
            GameRenderer.titlePressed = 14;
            GameThread.shopShopChapterSelectPos = 0;
            GameThread.shopShopItemSelectPos = 0;
            GameThread.shopShopInventorySelectPos = 0;
            GameThread.gameStatus = 7;
            GameRenderer.titleCount = 0;
            GameThread.playSound(15);
        } else if (cTLS <= pages.length) {
            //TPage newP = pages[cTLS - 1].newInstance();
        }
        TouchManager.processTouchStatus();
    }
}
