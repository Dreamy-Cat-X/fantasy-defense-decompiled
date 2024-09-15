package com.sncompany.newtower.Pages;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
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
    public static final int[] uiShopResource = {R.drawable.ui_shop_titleequip, R.drawable.ui_shop_titlepostbox, R.drawable.ui_shop_titleshop, R.drawable.ui_shop_titleinventory, R.drawable.ui_shop_warriorbody, R.drawable.ui_shop_warrioroutline, R.drawable.ui_shop_warriorshadow, R.drawable.ui_shop_archerbody, R.drawable.ui_shop_archeroutline, R.drawable.ui_shop_archershadow, R.drawable.ui_shop_wizardbody, R.drawable.ui_shop_wizardoutline, R.drawable.ui_shop_wizardshadow, R.drawable.ui_shop_herobase, R.drawable.ui_shop_heroslot, R.drawable.ui_shop_postboxbase, R.drawable.ui_shop_shopbase, R.drawable.ui_shop_shopitembar, R.drawable.ui_shop_shopselectbar, R.drawable.ui_shop_tabequipoff, R.drawable.ui_shop_tabequipon, R.drawable.ui_shop_tabshopoff, R.drawable.ui_shop_tabshopon, R.drawable.ui_shop_underbar, R.drawable.ui_shop_btnmshopoff, R.drawable.ui_shop_btnmshopon, R.drawable.ui_shop_btnmequipoff, R.drawable.ui_shop_btnmequipon, R.drawable.ui_shop_btnmpostboxoff, R.drawable.ui_shop_btnmpostboxon, R.drawable.ui_shop_btnbackoff, R.drawable.ui_shop_btnbackon, R.drawable.ui_shop_btnbuyoff, R.drawable.ui_shop_btnbuyon, R.drawable.ui_shop_btndropoff, R.drawable.ui_shop_btndropon, R.drawable.ui_shop_btngiftoff, R.drawable.ui_shop_btngifton, R.drawable.ui_shop_btnsaveoff, R.drawable.ui_shop_btnsaveon, R.drawable.ui_shop_btnselloff, R.drawable.ui_shop_btnsellon, R.drawable.ui_shop_btnleftarrowoff, R.drawable.ui_shop_btnleftarrowon, R.drawable.ui_shop_btnrightarrowoff, R.drawable.ui_shop_btnrightarrowon, R.drawable.ui_shop_iconempty, R.drawable.ui_shop_lock, R.drawable.ui_shop_glow, R.drawable.ui_shop_telbody, R.drawable.ui_shop_tel0, R.drawable.ui_shop_tel1, R.drawable.ui_shop_tel2, R.drawable.ui_shop_tel3, R.drawable.ui_shop_tel4, R.drawable.ui_shop_tel5, R.drawable.ui_shop_tel6, R.drawable.ui_shop_tel7, R.drawable.ui_shop_tel8, R.drawable.ui_shop_tel9, R.drawable.ui_shop_telback, R.drawable.ui_shop_telok, R.drawable.ui_shop_telclsoff, R.drawable.ui_shop_telclson};
    public static final int shop_titleequip = 0, shop_titlepostbox = 1, shop_titleshop = 2, shop_titleinventory = 3, shop_warriorbody = 4,
            shop_warrioroutline = 5, shop_warriorshadow = 6, shop_archerbody = 7, shop_archeroutline = 8, shop_archershadow = 9, shop_wizardbody = 10,
            shop_wizardoutline = 11, shop_wizardshadow = 12, shop_herobase = 13, shop_heroslot = 14, shop_postboxbase = 15, shop_shopbase = 16, shop_shopitembar = 17,
            shop_shopselectbar = 18, shop_tabequipoff = 19, shop_tabequipon = 20, shop_tabshopoff = 21, shop_tabshopon = 22, shop_underbar = 23, shop_btnmshopoff = 24,
            shop_btnmshopon = 25, shop_btnmequipoff = 26, shop_btnmequipon = 27, shop_btnmpostboxoff = 28, shop_btnmpostboxon = 29, shop_btnbackoff = 30,
            shop_btnbackon = 31, shop_btnbuyoff = 32, shop_btnbuyon = 33, shop_btndropoff = 34, shop_btndropon = 35, shop_btngiftoff = 36, shop_btngifton = 37,
            shop_btnsaveoff = 38, shop_btnsaveon = 39, shop_btnselloff = 40, shop_btnsellon = 41, shop_btnleftarrowoff = 42, shop_btnleftarrowon = 43,
            shop_btnrightarrowoff = 44, shop_btnrightarrowon = 45, shop_iconempty = 46, shop_lock = 47, shop_glow = 48, shop_telbody = 49, shop_tel0 = 50, shop_tel1 = 51,
            shop_tel2 = 52, shop_tel3 = 53, shop_tel4 = 54, shop_tel5 = 55, shop_tel6 = 56, shop_tel7 = 57, shop_tel8 = 58, shop_tel9 = 59, shop_telback = 50, shop_telok = 61,
            shop_telclsoff = 62, shop_telclson = 63;
    public static final int MIN_U = shop_btnmshopoff;
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
        int shopUnitCount = Config.limitBreak >= 2 ? 29 : 30;
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
                TouchManager.addTouchRectListData(BACK, CGRect.CGRectMake(11, 362, 68, 114));
                TouchManager.addTouchRectListData(EQUIP, CGRect.CGRectMake(19, 13, 42, 48));
                TouchManager.addTouchRectListData(ARROW_L, CGRect.CGRectMake(81, 397, 47, 48));
                TouchManager.addTouchRectListData(ARROW_R, CGRect.CGRectMake(672, 397, 47, 48));
                TouchManager.addTouchRectListData(BODY, CGRect.CGRectMake(30, 70, 690, 280));
                TouchManager.addTouchRectListData(SIDEBAR, CGRect.CGRectMake(722, 70, 52, 280));
                if (inventory.shopShopInventorySelectPos != -1)
                    TouchManager.addTouchRectListData(SELL, CGRect.CGRectMake(711, 381, 68, 78));
                for (int j = 0; j < 4; j++) {
                    int touch = (j * 2) + EquipPage.MIN_HERO;
                    int y = j * 70;
                    TouchManager.addTouchRectListData(touch, CGRect.CGRectMake(565, y + 75, 70, 60));
                    TouchManager.addTouchRectListData(touch + 1, CGRect.CGRectMake(636, y + 71, 78, 68));
                }
                inventory.addTouch();
            } else //BUy fail
                TouchManager.addTouchRectListData(BTN_OK, CGRect.CGRectMake(213, 259, 381, 65));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TOTAL;
            TouchManager.swapTouchMap();
        }

        uiShopImage[shop_titleshop].drawAtPointOption(66, 5, 18);
        uiShopImage[cTLS == EQUIP ? shop_tabequipon : shop_tabequipoff].drawAtPointOption(40, 13, 17);
        uiShopImage[cTLS == BACK ? shop_btnbackon : shop_btnbackoff].drawAtPointOption(11, 356, 18);

        upImg.drawAtPointOption(572, 8, 18);
        GameRenderer.drawNumberBlock(Config.heroPoints, numberHeroismImage, 779, 24, 1, 20, 1);
        uiShopImage[shop_shopbase].drawAtPointOption(14, 54, 18);
        int curBlock = upgradeItemListDraw.totalHalfBlockSize - 1;
        int buyInd = -1;
        while (curBlock <= upgradeItemListDraw.totalHalfBlockSize + 3 + 1) {
            int curInd = upgradeItemListDraw.blockCurrentArray[curBlock];
            if (curInd != -1) {
                int abs = Math.abs(curBlock - upgradeItemListDraw.totalHalfBlockSize);
                int cY = curBlock < upgradeItemListDraw.totalHalfBlockSize ? -upgradeItemListDraw.blockLengthArray[abs] : upgradeItemListDraw.blockLengthArray[abs];

                CGRect rect = CGRect.CGRectMake(30, 70, 690, 280);
                int r2 = cY + upgradeItemListDraw.blockCorrectionPixel;
                uiShopImage[shop_shopitembar].drawAtPointOptionGuide(30, r2 + 70, 18, rect);
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
                uiShopImage[buyInd >= 0 && cTLS == (buyInd * 2) + 10 + 1 ? shop_btnbuyon : shop_btnbuyoff].drawAtPointOptionGuide(636, r2 + 71, 18, rect);
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
                            Config.saveAll();
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
                        Config.saveAll();
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
        if (Config.heroPoints < itemData[4])
            return 1;

        if (id == 29) {
            if (Config.limitBreak >= 2)
                return 3;
            Config.heroPoints -= itemData[4];
            Config.limitBreak++;
            return 0;
        }
        if (id == 0) {
            Config.heroPoints -= itemData[4];
            resetUpgrade();
            return 0;
        }
        int slot = -1;
        for (int i = 0; i < Config.inventory.length; i++)
            if (Config.inventory[i] == null) {
                slot = i;
                break;
            }
        if (slot == -1)
            return 2;

        int rid = id - 1;
        Config.heroPoints -= itemData[4];
        Config.inventory[slot] = new byte[]{(byte) (rid / 4), (byte) (rid % 4)};
        return 0;
    }

    public boolean sellShopItem() {
        int sel = inventory.shopShopInventorySelectPos;
        if (inventory.shopShopInventorySelectPos == -1 || Config.inventory[sel] == null)
            return false;

        int id = (Config.inventory[sel][0] * 4) + Config.inventory[sel][1] + 1;
        Config.heroPoints += DataUpgradeItem.upgradeItemData[id][4] / 2;

        for (int i = sel; i < Config.inventory.length - 1; i++)
            Config.inventory[i] = Config.inventory[i + 1];
        Config.inventory[Config.inventory.length - 1] = null;
        return true;
    }

    public static void resetUpgrade() {
        for (int i = 0; i < Config.unitUpgrades.length; i++)
            for (int j = 0; j < Config.unitUpgrades[i].length; j++) {
                while (Config.unitUpgrades[i][j] > 0) {
                    int sl = (i * 6) + j;
                    Config.heroPoints += DataUpgradeUnit.upgradeUnitData[sl][1] * Config.unitUpgrades[i][j];
                    Config.unitUpgrades[i][j]--;
                }
            }
    }
}
