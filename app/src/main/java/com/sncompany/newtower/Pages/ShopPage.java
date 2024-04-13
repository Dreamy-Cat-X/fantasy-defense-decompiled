package com.sncompany.newtower.Pages;

import java.util.function.Consumer;
import androidx.core.view.ViewCompat;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class ShopPage extends TPage {

    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_0_BUY = 73;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_1_WARRIOR = 74;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_2_ARCHER = 75;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_3_WIZARD = 76;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_4_CHAR_BOTTOM_BLOCK = 77;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_TOTAL_COUNT = 78;
    public static final int GAME_SHOP_HERO_SELL_TOUCH_LIST_0_OK = 73;
    public static final int GAME_SHOP_HERO_SELL_TOUCH_LIST_1_CANCEL = 74;
    public static final int GAME_SHOP_HERO_SELL_TOUCH_LIST_TOTAL_COUNT = 75;
    public static final int GAME_SHOP_SHOP_ALERT_NO = 55;
    public static final int GAME_SHOP_SHOP_ALERT_OK = 53;
    public static final int GAME_SHOP_SHOP_ALERT_YES = 54;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_0_BACK = 30;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_11_INVEN_LEFT = 32;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_12_INVEN_RIGHT = 33;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_13_BODY = 34;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_14_SIDEBAR = 35;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_15_SELL = 36;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_16_GIFT = 37;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_17_BUY = 38;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_3_EQUIP = 31;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_ETC_START = 30;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_INVEN_START = 0;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_SHOP_START = 10;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_0 = 51;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_1 = 41;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_2 = 42;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_3 = 43;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_4 = 44;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_5 = 45;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_6 = 46;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_7 = 47;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_8 = 48;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_9 = 49;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_BACK = 50;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_CLOSE = 40;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_LIST_START = 40;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_OK = 52;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TOTAL_COUNT = 56;
    public static final int GAME_SHOP_TOUCH_LIST_LOCK_HERO_0 = 75;
    public static final int GAME_SHOP_TOUCH_LIST_LOCK_HERO_1 = 76;
    public static final int GAME_SHOP_TOUCH_LIST_LOCK_HERO_2 = 77;
    static final float DRAW_SCALE_X_SMALL_DEGREE = 13.0f;
    public static final int MIN_U = 24;
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
    public final Texture2D[] uiShopImage = new Texture2D[uiShopResource.length], numberHeroismImage = new Texture2D[MenuPage.numberHeroismResource.length];;
    public final Texture2D upImg = new Texture2D(), heroismImage = new Texture2D(R.drawable.etc_heroism);
    public final CircleItemDraw upgradeItemListDraw = new CircleItemDraw(5, 30);
    protected final InventoryTable inventory;
    private final EquipPage equipP;

    public ShopPage(TPage par) {
        this(par, null);
    }

    public ShopPage(TPage par, EquipPage equipPage) {
        super(par);
        equipP = equipPage == null ? new EquipPage(par, this) : equipPage;
        inventory = equipPage == null ? new InventoryTable(this, equipP) : equipPage.inventory;
        getShopList();
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
            upgradeItemListDraw.blockSizeArray[i3] = 1.0f;
            upgradeItemListDraw.blockAlphaArray[i3] = 1.0f;
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
    public void update() {
        upgradeItemListDraw.correctDistance();
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        upgradeItemListDraw.getArrayAndCorrection();
    }

    public void paint_GAME_SHOP_SHOP(GL10 gl10, boolean init) {
        float f;
        int i2;
        int i3;
        upgradeItemListDraw.getArrayAndCorrection();
        inventory.correct();
        float f2 = 70.0f;
        int i4 = -1;
        char c = 0;
        int i = init ? TouchManager.checkTouchListStatus() : -1;
        if (init) {
            TouchManager.clearTouchMap();
            int i5 = GameThread.gameSubStatus;
            if (i5 == 0 || i5 == 1) { //Default StoremFront
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_0_BACK, GameRenderer.CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_3_EQUIP, GameRenderer.CGRectMake(19.0f, 13f, 42.0f, 48.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_11_INVEN_LEFT, GameRenderer.CGRectMake(81.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_12_INVEN_RIGHT, GameRenderer.CGRectMake(672.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_13_BODY, GameRenderer.CGRectMake(30.0f, 70.0f, 690.0f, 280.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_14_SIDEBAR, GameRenderer.CGRectMake(722.0f, 70.0f, 52.0f, 280.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_15_SELL, GameRenderer.CGRectMake(711.0f, 381.0f, 68.0f, 78.0f));
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_TOUCH_LIST_17_BUY, GameRenderer.CGRectMake(636.0f, 71.0f, 78.0f, 68.0f));
                for (int i6 = 0; i6 < 4; i6++) {
                    int i7 = (i6 * 2) + 10;
                    int i8 = i6 * 70;
                    TouchManager.addTouchRectListData(i7, GameRenderer.CGRectMake(565.0f, i8 + 75, 70.0f, 60.0f));
                    TouchManager.addTouchRectListData(i7 + 1, GameRenderer.CGRectMake(636.0f, i8 + 71, 78.0f, 68.0f));
                }
                inventory.addTouch();
            } else if (i5 == 7) //Insufficient Hero Points
                TouchManager.addTouchRectListData(GAME_SHOP_SHOP_ALERT_OK, GameRenderer.CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 56;
            parent.parent.paint(gl10, false);
        }

        char c2 = 2;
        uiShopImage[shop_titleshop].drawAtPointOption(66.0f, 5.0f, 18);
        uiShopImage[i == 31 ? shop_tabequipon : shop_tabequipoff].drawAtPointOption(40f, 13f, 17);
        uiShopImage[i == 30 ? shop_btnbackon : shop_btnbackoff].drawAtPointOption(40f, 13f, 17);

        upImg.drawAtPointOption(572.0f, 8.0f, 18);
        GameRenderer.drawNumberBlock(GameThread.myHeroism, numberHeroismImage, 779.0f, 24.0f, 1, 20, 1);
        uiShopImage[shop_shopbase].drawAtPointOption(14.0f, 54.0f, 18);
        int i10 = upgradeItemListDraw.totalHalfBlockSize - 1;
        int i11 = -1;
        while (i10 <= upgradeItemListDraw.totalHalfBlockSize + 3 + 1) {
            int i12 = upgradeItemListDraw.blockCurrentArray[i10];
            if (i12 != i4) {
                int i13 = GameThread.shopUnitValue[i12];
                if (GameThread.shopUnitValue[i12] != i4) {
                    int abs = Math.abs(i10 - upgradeItemListDraw.totalHalfBlockSize);
                    if (i10 < upgradeItemListDraw.totalHalfBlockSize) {
                        i2 = -upgradeItemListDraw.blockLengthArray[abs];
                    } else {
                        i2 = upgradeItemListDraw.blockLengthArray[abs];
                    }
                    i3 = upgradeItemListDraw.blockCorrectionPixel;
                    GameRenderer.CGRectMake(30.0f, f2, 690.0f, 280.0f);
                    int r2 = (i10 * 70) + i3;
                    uiShopImage[shop_shopitembar].drawAtPointOptionGuide(30.0f, r2 + 70, 18, GameRenderer._CGRect);
                    float f3 = i2 + i3 + 75;
                    drawUpItemImageGuide(i13, 40.0f, f3, 18, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(-2560, -2560);
                    GameRenderer.setFontSize(20);
                    GameRenderer.drawStringDoubleGuideM(DataUpgradeItem.upgradeItemName[i13], 118.0f, r2 + 81, 18, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(i4, i4);
                    GameRenderer.setFontSize(12);
                    int i14 = DataUpgradeItem.upgradeItemData[i13][c2];
                    String[] split = DataUpgradeItem.upgradeItemDescription[i13].split("_");
                    int i15 = 0;
                    while (i15 < split.length) {
                        String str = split[i15];
                        Object[] objArr = new Object[1];
                        objArr[c] = i14;
                        GameRenderer.drawStringDoubleGuideM(String.format(str, objArr), 117.0f, r2 + 108 + (i15 * 15), 18, GameRenderer._CGRect);
                        i15++;
                    }

                    GameRenderer.setFontSize(16);
                    GameRenderer.drawStringDoubleGuideM(String.valueOf(DataUpgradeItem.upgradeItemData[i13][4]), 547.0f, r2 + 78, 20, GameRenderer._CGRect);
                    int i16 = DataUpgradeItem.upgradeItemData[i13][3];
                    if (i11 >= 0 && i == (i11 * 2) + 10 + 1) {
                        uiShopImage[shop_btnbuyon].drawAtPointOptionGuide(636.0f, r2 + 71, 18, _CGRect);
                    } else {
                        uiShopImage[shop_btnbuyoff].drawAtPointOptionGuide(636.0f, r2 + 71, 18, _CGRect);
                    }
                    i10++;
                    i11++;
                }
            }
            i10++;
            i11++;
        }
        uiEtcImage[14].drawAtPointOption(747.0f, GameThread.myScrollbar[4].BarLastPosition, 9);
        int i17 = i != 32 ? i != 33 ? i != 36 ? 0 : 3 : 2 : 1;
        inventory.drawInventoryWindow(72, 362, equipP.shopShopInventorySelectPos, i17, -1, GameThread.gameSubStatus == 1);
        if (GameThread.gameSubStatus == 7) {
            uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
            setFontSize(32);
            setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
            drawStringDoubleM("Insufficient Hero Points.", CX, 180.0f, 17);
            uiPopupImage[i == 53 ? 13 : 12].drawAtPointOption(213.0f, 259.0f, 18);
        }
        if (init) {
            TouchManager.swapTouchMap();
        }
    }

    public static void drawUpItemImageGuide(int i, float f, float f2, int i2, CGRect cGRect) {
        if (i < 0) {
            return;
        }
        if (i2 == 9) {
            f -= 30.0f;
            f2 -= 30.0f;
        }
        uiUpitemImage[i].drawAtPointOptionGuide(f, f2, 18, cGRect);
        if (DataUpgradeItem.upgradeItemData[i][0] != 0) {
            return;
        }
        setFontSize(11);
        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
        drawStringDoubleGuideM(String.format("%dP", Integer.valueOf(DataUpgradeItem.upgradeItemData[i][2])), f + 30.0f, f2 + 43.0f, 17, cGRect);
    }

    public void touchCheck_GAME_SHOP_SHOP() {
        int i;
        int i2 = TouchManager.lastActionStatus;
        if (i2 == 0) {
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            int i3 = GameThread.gameSubStatus;
            if (i3 == 0 || i3 == 1) {
                if (checkTouchListStatus == 34) {
                    GameThread.gameSubStatus = 0;
                    GameRenderer.upgradeItemListDraw.backupCurrentDrawPosition();
                } else {
                    if (checkTouchListStatus != 35) {
                        return;
                    }
                    GameThread.gameSubStatus = 0;
                    GameThread.myScrollbar[4].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    GameRenderer.upgradeItemListDraw.setAnchorDrawPosition(GameThread.myScrollbar[4].BarLastValue);
                }
            }
            return;
        }
        if (i2 == 1) {
            int checkTouchListPressed = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            int i4 = GameThread.gameSubStatus;
            if (i4 == 0 || i4 == 1) {
                if (checkTouchListPressed != 34) {
                    if (checkTouchListPressed != 35) {
                        return;
                    }
                    GameThread.myScrollbar[4].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    GameRenderer.upgradeItemListDraw.setAnchorDrawPosition(GameThread.myScrollbar[4].BarLastValue);
                    return;
                }
                if (TouchManager.checkTouchMoveDegree(true)) {
                    GameRenderer.upgradeItemListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                    GameThread.myScrollbar[4].setReverseUpdatePosition(GameRenderer.upgradeItemListDraw.currentDrawPosition);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        GameRenderer.upgradeItemListDraw.resetTargetPosition();
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus2 != -1) {
            switch (GameThread.gameSubStatus) {
                case 0:
                case 1:
                    if (checkTouchListStatus2 != 36) {
                        switch (checkTouchListStatus2) {
                            case 30:
                                GameThread.playSound(15);
                                NewTower.switchPage(parent, false);
                                break;
                            case 31:
                                NewTower.switchPage(equipP, false);
                                GameThread.playSound(14);
                                break;
                            case 32:
                                GameThread.playSound(14);
                                equipP.shopShopInventorySelectPos = (equipP.shopShopInventorySelectPos - 8) % 24;
                                break;
                            case 33:
                                GameThread.playSound(14);
                                equipP.shopShopInventorySelectPos = (equipP.shopShopInventorySelectPos + 8) % 24;
                                break;
                            default:
                                if (checkTouchListStatus2 >= 10) {
                                    if (checkTouchListStatus2 < 30) {
                                        int i5 = checkTouchListStatus2 - 10;
                                        int i6 = GameRenderer.upgradeItemListDraw.blockCurrentArray[GameRenderer.upgradeItemListDraw.totalHalfBlockSize + (i5 / 2)];
                                        if (i6 != -1 && (i = GameThread.shopUnitValue[i6]) != -1) {
                                            int i7 = i5 % 2;
                                            if (i7 != 0) {
                                                if (buyShopItem(GameThread.shopUnitValue[i6]) == 2)
                                                    GameThread.gameSubStatus = 7;
                                                GameThread.playSound(14);
                                                Config.saveAll();
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    GameThread.playSound(14);
                                    GameThread.gameSubStatus = 1;
                                    equipP.shopShopInventorySelectPos = (equipP.shopShopInventorySelectPos - (equipP.shopShopInventorySelectPos % 8)) + (checkTouchListStatus2);
                                }
                                break;
                        }
                    } else if (GameThread.gameSubStatus == 1) {
                        int sellShopItem = sellShopItem();
                        GameThread.playSound(14);
                        if (sellShopItem == 0) {
                            Config.saveAll();
                            break;
                        }
                    }
                    break;
                case 7:
                    if (checkTouchListStatus2 == 53) {
                        GameThread.gameSubStatus = 0;
                        break;
                    }
                    break;
            }
        }
    }

    public void getShopList() {
        shopUnitCount = 0;
        for (int i = 0; i < 30; i++) {
            int[] iArr = shopUnitValue;
            int i2 = shopUnitCount;
            iArr[i2] = i;
            shopUnitCount = i2 + 1;
        }
        for (int i3 = shopUnitCount; i3 < 30; i3++) {
            shopUnitValue[i3] = -1;
        }
    }

    public static int buyShopItem(int i) {
        int i2;
        int[] iArr = shopUnitValue;
        if (iArr[i] == -1) {
            return 1;
        }
        int i3 = iArr[i];
        if (DataUpgradeItem.upgradeItemData[i3][1] != 0) {
            i2 = 0;
            while (true) {
                if (i2 >= 24) {
                    i2 = -1;
                    break;
                }
                if (itemUnitValue[i2] == -1) {
                    break;
                }
                i2++;
            }
        } else {
            i2 = 0;
        }
        if (i2 == -1) {
            return 3;
        }
        if (DataUpgradeItem.upgradeItemData[i3][3] == 1) {
            if (myHeroism < DataUpgradeItem.upgradeItemData[i3][4]) {
                return 2;
            }
            myHeroism -= DataUpgradeItem.upgradeItemData[i3][4];
            itemUnitValue[i2] = i3;
            int i4 = 0;
            while (i4 < 23) {
                int i5 = i4 + 1;
                for (int i6 = i5; i6 < 24; i6++) {
                    int[] iArr2 = itemUnitValue;
                    if (iArr2[i4] == -1 || (iArr2[i6] != -1 && iArr2[i4] > iArr2[i6])) {
                        int[] iArr3 = itemUnitValue;
                        int i7 = iArr3[i6];
                        iArr3[i6] = iArr3[i4];
                        iArr3[i4] = i7;
                    }
                }
                i4 = i5;
            }
            Config.saveAll(newTower);
        } else {
            if (i3 == 29 && limitCashBuyCount >= 2) {
                return 1;
            }
            if (i3 != 0) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        if (i3 != 12) {
                            if (i3 != 16) {
                                if (i3 == 20) {
                                    newTower.shopPopPurchaseDlg(11);
                                } else {
                                    switch (i3) {
                                        case 24:
                                            newTower.shopPopPurchaseDlg(12);
                                            break;
                                        case 25:
                                            newTower.shopPopPurchaseDlg(13);
                                            break;
                                        case 26:
                                            newTower.shopPopPurchaseDlg(14);
                                            break;
                                        case 27:
                                            newTower.shopPopPurchaseDlg(15);
                                            break;
                                        case 28:
                                            newTower.shopPopPurchaseDlg(16);
                                            break;
                                        case 29:
                                            newTower.shopPopPurchaseDlg(5);
                                            break;
                                    }
                                }
                            } else {
                                newTower.shopPopPurchaseDlg(10);
                            }
                        } else {
                            newTower.shopPopPurchaseDlg(9);
                        }
                    } else {
                        newTower.shopPopPurchaseDlg(8);
                    }
                } else {
                    newTower.shopPopPurchaseDlg(7);
                }
            } else {
                newTower.shopPopPurchaseDlg(6);
            }
        }
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
}
