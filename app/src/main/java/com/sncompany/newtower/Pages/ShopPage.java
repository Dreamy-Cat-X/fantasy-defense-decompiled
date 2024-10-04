package com.sncompany.newtower.Pages;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.MyScrollbar;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public class ShopPage extends TPage {

    public static final int BACK = 17, EQUIP = 18, ARROW_L = 19, ARROW_R = 20, BODY = 21, SIDEBAR = 22, SELL = 23, BTN_OK = 24, TOTAL = 25;
    public static final int[] uiShopResource = {R.drawable.ui_shop_titleequip, R.drawable.ui_shop_titleshop, R.drawable.ui_shop_warriorbody, R.drawable.ui_shop_warrioroutline, R.drawable.ui_shop_warriorshadow, R.drawable.ui_shop_archerbody, R.drawable.ui_shop_archeroutline, R.drawable.ui_shop_archershadow, R.drawable.ui_shop_wizardbody, R.drawable.ui_shop_wizardoutline, R.drawable.ui_shop_wizardshadow, R.drawable.ui_shop_herobase, R.drawable.ui_shop_heroslot, R.drawable.ui_shop_shopbase, R.drawable.ui_shop_shopitembar, R.drawable.ui_shop_shopselectbar, R.drawable.ui_shop_tabequipoff, R.drawable.ui_shop_tabequipon, R.drawable.ui_shop_tabshopoff, R.drawable.ui_shop_tabshopon, R.drawable.ui_shop_underbar, R.drawable.ui_shop_btnmshopoff, R.drawable.ui_shop_btnmshopon, R.drawable.ui_shop_btnmequipoff, R.drawable.ui_shop_btnmequipon, R.drawable.ui_shop_btnbackoff, R.drawable.ui_shop_btnbackon, R.drawable.ui_shop_btnbuyoff, R.drawable.ui_shop_btnbuyon, R.drawable.ui_shop_btnselloff, R.drawable.ui_shop_btnsellon, R.drawable.ui_shop_btnleftarrowoff, R.drawable.ui_shop_btnleftarrowon, R.drawable.ui_shop_btnrightarrowoff, R.drawable.ui_shop_btnrightarrowon, R.drawable.ui_shop_iconempty, R.drawable.ui_shop_lock, R.drawable.ui_shop_glow};
    public static final int titleequip = 0, titleshop = 1, warriorbody = 2, warrioroutline = 3, warriorshadow = 4, archerbody = 5, archeroutline = 6, archershadow = 7,
            wizardbody = 8, wizardoutline = 9, wizardshadow = 10, herobase = 11, heroslot = 12, shopbase = 13, shopitembar = 14, shopselectbar = 15, tabequipoff = 16,
            tabequipon = 17, tabshopoff = 18, tabshopon = 19, underbar = 20, btnmshopoff = 21, btnmshopon = 22, btnmequipoff = 23, btnmequipon = 24, btnbackoff = 25,
            btnbackon = 26, btnbuyoff = 27, btnbuyon = 28, btnselloff = 29, btnsellon = 30, btnleftarrowoff = 31, btnleftarrowon = 32, btnrightarrowoff = 33,
            btnrightarrowon = 34, iconempty = 35, lock = 36, glow = 37;
    public static final int MIN_U = btnmshopoff;
    public final Texture2D[] uiShopImage = new Texture2D[uiShopResource.length], numberHeroismImage = new Texture2D[MenuPage.numberHeroismResource.length];
    public final Texture2D upImg = new Texture2D(), heroismImage = new Texture2D(R.drawable.etc_heroism);
    public final CircleItemDraw upgradeItemListDraw;
    protected final InventoryTable inventory;
    private final EquipPage equipP;
    private final MyScrollbar myScrollbar = new MyScrollbar(90, GameRenderer.GAME_SHOP_SHOP_SIDEBAR_END_Y, 0, 1820);
    private int buyFail = 0;

    public ShopPage(TPage par) {
        this(par, null);
    }

    public ShopPage(TPage par, EquipPage equipPage) {
        super(par);
        inventory = equipPage == null ? new InventoryTable(this) : equipPage.inventory;
        equipP = equipPage == null ? new EquipPage(par, this) : equipPage;
        int shopUnitCount = Config.s.limitBreak >= 2 ? 29 : 30;
        upgradeItemListDraw = new CircleItemDraw(5, shopUnitCount);
    }

    @Override
    public void load(Consumer<Float> prog) {
        upImg.initWithImageName(UpgradePage.uiUpgradeResource[UpgradePage.upgrade_uprightbar]);
        int tot = uiShopResource.length + numberHeroismImage.length + 1;
        loadP(uiShopImage, uiShopResource, prog, 1, tot);
        loadP(numberHeroismImage, MenuPage.numberHeroismResource, prog, uiShopImage.length + 1, tot);
        inventory.load(prog);
        for (int i3 = 0; i3 < upgradeItemListDraw.totalHalfBlockSize; i3++) {
            upgradeItemListDraw.blockLengthArray[i3] = i3 * 70;
            upgradeItemListDraw.blockSizeArray[i3] = 1;
            upgradeItemListDraw.blockAlphaArray[i3] = 1;
        }
        upgradeItemListDraw.blockLengthArray[0] = 0;
        upgradeItemListDraw.FIRST_BLOCK_SIZE = 70;
        upgradeItemListDraw.moveSpeed = 20;
        upgradeItemListDraw.nextMoveCheckDegree = 10;
        upgradeItemListDraw.moveCloseFlag = true;
        upgradeItemListDraw.blockLastViewCount = 3;
        loaded = true;
        if (!equipP.loaded)
            equipP.load(prog);
    }

    @Override
    public void unload() {
        upImg.dealloc();
        for (Texture2D img : uiShopImage)
            img.dealloc();
        for (Texture2D img : numberHeroismImage)
            img.dealloc();
        inventory.unload();
        loaded = false;
        if (equipP.loaded)
            equipP.unload();
    }

    @Override
    public void update() {
        if (!loaded)
            load(null);//Can't be set to constructor because shopPage
        upgradeItemListDraw.correctDistance();
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        upgradeItemListDraw.getArrayAndCorrection();
        int cTLS = init ? TouchManager.checkTouchListStatus() : -1;
        if (init) {
            TouchManager.clearTouchMap();
            if (buyFail == 0) { //Default StoremFront
                TouchManager.addTouchRectListData(BACK, CGRect.make(11, 362, 68, 114));
                TouchManager.addTouchRectListData(EQUIP, CGRect.make(19, 13, 42, 48));
                TouchManager.addTouchRectListData(ARROW_L, CGRect.make(81, 397, 47, 48));
                TouchManager.addTouchRectListData(ARROW_R, CGRect.make(672, 397, 47, 48));
                TouchManager.addTouchRectListData(BODY, CGRect.make(30, 70, 690, 280));
                TouchManager.addTouchRectListData(SIDEBAR, CGRect.make(722, 70, 52, 280));
                if (inventory.shopShopInventorySelectPos != -1)
                    TouchManager.addTouchRectListData(SELL, CGRect.make(711, 381, 68, 78));
                for (int j = 0; j < 4; j++) {
                    int touch = (j * 2) + EquipPage.MIN_HERO;
                    int y = j * 70;
                    TouchManager.addTouchRectListData(touch, CGRect.make(565, y + 75, 70, 60));
                    TouchManager.addTouchRectListData(touch + 1, CGRect.make(636, y + 71, 78, 68));
                }
                inventory.addTouch();
            } else //BUy fail
                TouchManager.addTouchRectListData(BTN_OK, CGRect.make(213, 259, 381, 65));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TOTAL;
            TouchManager.swapTouchMap();
        }

        uiShopImage[titleshop].drawAtPointOption(66, 5, 18);
        uiShopImage[cTLS == EQUIP ? tabequipon : tabequipoff].drawAtPointOption(40, 13, 17);
        uiShopImage[cTLS == BACK ? btnbackon : btnbackoff].drawAtPointOption(11, 356, 18);

        upImg.drawAtPointOption(572, 8, 18);
        GameRenderer.drawNumberBlock(Config.s.heroPoints, numberHeroismImage, 779, 24, 1, 20, 1);
        uiShopImage[shopbase].drawAtPointOption(14, 54, 18);
        int curBlock = upgradeItemListDraw.totalHalfBlockSize - 1;
        int buyInd = -1;
        while (curBlock <= upgradeItemListDraw.totalHalfBlockSize + 4) {
            int curInd = upgradeItemListDraw.blockCurrentArray[curBlock];
            if (curInd != -1) {
                int abs = Math.abs(curBlock - upgradeItemListDraw.totalHalfBlockSize);
                int cY = curBlock < upgradeItemListDraw.totalHalfBlockSize ? -upgradeItemListDraw.blockLengthArray[abs] : upgradeItemListDraw.blockLengthArray[abs];

                CGRect rect = CGRect.make(30, 70, 690, 280);
                int r2 = cY + upgradeItemListDraw.blockCorrectionPixel;
                uiShopImage[shopitembar].drawAtPointOptionGuide(30, r2 + 70, 18, rect);
                inventory.drawUpItemImageGuide(curInd, 40, r2 + 75, rect);
                GameRenderer.setFontDoubleColor(-2560, -2560);
                GameRenderer.setFontSize(20);
                GameRenderer.drawStringDoubleGuideM(DataUpgradeItem.upgradeItemName[curInd], 118, r2 + 81, 18, rect);
                GameRenderer.setFontDoubleColor(-1, -1);
                GameRenderer.setFontSize(12);
                int i14 = DataUpgradeItem.upgradeItemData[curInd][2];
                String[] split = DataUpgradeItem.upgradeItemDescription[curInd].split("_");
                for (int i = 0; i < split.length; i++)
                    GameRenderer.drawStringDoubleGuideM(String.format(split[i], i14), 117, r2 + 108 + (i * 15), 18, rect);

                GameRenderer.setFontSize(16);
                GameRenderer.drawStringDoubleGuideM(String.valueOf(DataUpgradeItem.upgradeItemData[curInd][4]), 547, r2 + 78, 20, rect);
                uiShopImage[buyInd >= 0 && cTLS == (buyInd * 2) + 10 + 1 ? btnbuyon : btnbuyoff].drawAtPointOptionGuide(636, r2 + 71, 18, rect);
            }
            curBlock++;
            buyInd++;
        }
        uiEtcImage[etc_scrollbutton].drawAtPointOption(747, myScrollbar.BarLastPosition, 9);
        int invTouch = cTLS != ARROW_L ? cTLS != ARROW_R ? cTLS != SELL ? 0 : 3 : 2 : 1;
        inventory.drawInventoryWindow(72, 362, invTouch, inventory.shopShopInventorySelectPos != -1);
        if (buyFail > 0) {
            uiPopupImage[popup_background].drawAtPointOption(152, 144, 18);
            GameRenderer.setFontSize(32);
            GameRenderer.setFontDoubleColor(-1, -16777216);
            String fail = buyFail == 1 ? "Insufficient Hero Points." : buyFail == 2 ? "Inventory is full!" : "Can't buy any more of these";
            GameRenderer.drawStringDoubleM(fail, GameRenderer.CX, 180, 17);
            uiPopupImage[cTLS == 53 ? popup_okon2 : popup_okoff2].drawAtPointOption(213, 259, 18);
        }
    }

    @Override
    public void touchCheck() {
        int lastAct = TouchManager.lastActionStatus;
        if (lastAct == TouchManager.TOUCH_STATUS_NO_INPUT) {
            int cTLS = TouchManager.checkTouchListStatus();
            if (buyFail == 0) {
                if (cTLS == BODY) {
                    upgradeItemListDraw.backupCurrentDrawPosition();
                    inventory.shopShopInventorySelectPos = -1;
                } else if (cTLS == SIDEBAR) {
                    myScrollbar.setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    upgradeItemListDraw.setAnchorDrawPosition(myScrollbar.BarLastValue);
                    inventory.shopShopInventorySelectPos = -1;
                }
            }
        } else if (lastAct == TouchManager.TOUCH_STATUS_START_INPUTED) {
            int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            if (buyFail == 0) {
                if (cTLP == SIDEBAR) {
                    myScrollbar.setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    upgradeItemListDraw.setAnchorDrawPosition(myScrollbar.BarLastValue);
                } else if (TouchManager.checkTouchMoveDegree(true)) {
                    upgradeItemListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                    myScrollbar.setReverseUpdatePosition(upgradeItemListDraw.currentDrawPosition);
                }
            }
        }
        if (lastAct != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;
        int cTLS = TouchManager.checkTouchListStatus();
        upgradeItemListDraw.resetTargetPosition();
        if (cTLS != -1) {
            if (buyFail != 0) {
                if (cTLS == BTN_OK)
                    buyFail = 0;
            } else if (cTLS >= BACK) {
                switch (cTLS) {
                    case BACK:
                        GameThread.playSound(15);
                        ((MenuPage)parent.parent).child = parent;
                        unload();
                        equipP.unload();
                        break;
                    case EQUIP:
                        ((MenuPage)parent.parent).child = equipP;
                        GameThread.playSound(14);
                        break;
                    case ARROW_L:
                        GameThread.playSound(14);
                        inventory.shopShopInventorySelectPos = inventory.shopShopInventorySelectPos >= 8 ? (inventory.shopShopInventorySelectPos - 8) % 24 : 16;
                        break;
                    case ARROW_R:
                        GameThread.playSound(14);
                        inventory.shopShopInventorySelectPos = (inventory.shopShopInventorySelectPos + 8) % 24;
                        break;
                    case SELL:
                        if (sellShopItem()) {
                            GameThread.playSound(14);
                            Config.saveFile();
                        }
                        break;
                }
            } else if (cTLS >= EquipPage.MIN_HERO) {
                int hT = cTLS - EquipPage.MIN_HERO;
                int row = upgradeItemListDraw.blockCurrentArray[upgradeItemListDraw.totalHalfBlockSize + (hT / 2)];
                int dv = hT % 2;
                if (row != -1 && dv != 0) {
                    buyFail = buyShopItem(row);
                    if (buyFail == 0) {
                        GameThread.playSound(14);
                        Config.saveFile();
                    }
                }
            } else {
                GameThread.playSound(14);
                inventory.shopShopInventorySelectPos = inventory.getFirstInPage() + cTLS;
            }
        }
    }

    public int buyShopItem(int id) {
        int[] itemData = DataUpgradeItem.upgradeItemData[id];
        if (Config.s.heroPoints < itemData[4])
            return 1;

        if (id == 29) {
            if (Config.s.limitBreak >= 2)
                return 3;
            Config.s.heroPoints -= itemData[4];
            Config.s.limitBreak++;
            return 0;
        }
        if (id == 0) {
            Config.s.heroPoints -= itemData[4];
            resetUpgrade();
            return 0;
        }
        int slot = -1;
        for (int i = 0; i < Config.s.inventory.length; i++)
            if (Config.s.inventory[i] == null) {
                slot = i;
                break;
            }
        if (slot == -1)
            return 2;

        int rid = id - 1;
        Config.s.heroPoints -= itemData[4];
        Config.s.inventory[slot] = new byte[]{(byte) (rid / 4), (byte) (rid % 4)};
        return 0;
    }

    public boolean sellShopItem() {
        int sel = inventory.shopShopInventorySelectPos;
        if (inventory.shopShopInventorySelectPos == -1 || Config.s.inventory[sel] == null)
            return false;

        int id = (Config.s.inventory[sel][0] * 4) + Config.s.inventory[sel][1] + 1;
        DataAward.check_heroPoint(DataUpgradeItem.upgradeItemData[id][4] / 2);

        for (int i = sel; i < Config.s.inventory.length - 1; i++)
            Config.s.inventory[i] = Config.s.inventory[i + 1];
        Config.s.inventory[Config.s.inventory.length - 1] = null;
        return true;
    }

    public static void resetUpgrade() {
        for (int i = 0; i < Config.s.unitUpgrades.length; i++)
            for (int j = 0; j < Config.s.unitUpgrades[i].length; j++) {
                while (Config.s.unitUpgrades[i][j] > 0) {
                    int sl = (i * 6) + j;
                    DataAward.check_heroPoint(DataUpgradeUnit.upgradeUnitData[sl][1] * Config.s.unitUpgrades[i][j]);
                    Config.s.unitUpgrades[i][j]--;
                }
            }
    }
}
