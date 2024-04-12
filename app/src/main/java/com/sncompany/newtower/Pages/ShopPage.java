package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
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
    public static final int shop_titleequip = 0, shop_titlepostbox = 1, shop_titleshop = 2, shop_titleinventory = 3;
    public final Texture2D[] uiShopImage = new Texture2D[uiShopResource.length];
    public final CircleItemDraw upgradeItemListDraw = new CircleItemDraw(5, 30);

    public ShopPage(TPage par) {
        super(par);
    }

    @Override
    public void load(Consumer<Float> prog) {
        loadP(uiShopImage, uiShopResource, prog, 1, uiShopResource.length);
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
    }

    @Override
    public void update() {
        upgradeItemListDraw.correctDistance();
        inventoryItemListDraw.correctDistance();
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        upgradeItemListDraw.getArrayAndCorrection();
        inventoryItemListDraw.getArrayAndCorrection();
    }

    public void paint_GAME_SHOP_SHOP(GL10 gl10, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        upgradeItemListDraw.getArrayAndCorrection();
        inventoryItemListDraw.getArrayAndCorrection();
        float f2 = 70.0f;
        int i4 = -1;
        char c = 0;
        if (z) {
            TouchManager.clearTouchMap();
            int i5 = GameThread.gameSubStatus;
            if (i5 == 0 || i5 == 1) { //Default StoremFront
                TouchManager.addTouchRectListData(30, GameRenderer.CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
                TouchManager.addTouchRectListData(31, GameRenderer.CGRectMake(19.0f, 13f, 42.0f, 48.0f));
                TouchManager.addTouchRectListData(32, GameRenderer.CGRectMake(81.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(33, GameRenderer.CGRectMake(672.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(34, GameRenderer.CGRectMake(30.0f, 70.0f, 690.0f, 280.0f));
                TouchManager.addTouchRectListData(35, GameRenderer.CGRectMake(722.0f, 70.0f, 52.0f, 280.0f));
                TouchManager.addTouchRectListData(36, GameRenderer.CGRectMake(711.0f, 381.0f, 68.0f, 78.0f));
                TouchManager.addTouchRectListData(38, GameRenderer.CGRectMake(636.0f, 71.0f, 78.0f, 68.0f));
                for (int i6 = 0; i6 < 4; i6++) {
                    int i7 = (i6 * 2) + 10;
                    int i8 = i6 * 70;
                    TouchManager.addTouchRectListData(i7, GameRenderer.CGRectMake(565.0f, i8 + 75, 70.0f, 60.0f));
                    TouchManager.addTouchRectListData(i7 + 1, GameRenderer.CGRectMake(636.0f, i8 + 71, 78.0f, 68.0f));
                }
                for (int i9 = 0; i9 < 8; i9++) {
                    TouchManager.addTouchRectListData(i9, GameRenderer.CGRectMake(((i9 % 8) * 70) + 125, 390.0f, 60.0f, 60.0f));
                }
            } else if (i5 == 7) //Insufficient Hero Points
                TouchManager.addTouchRectListData(53, GameRenderer.CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 56;
            i = TouchManager.checkTouchListStatus();
        } else {
            i = -1;
        }
        if (z)
            parent.paint(gl10, false);

        char c2 = 2;
        uiShopImage[shop_titleshop].drawAtPointOption(66.0f, 5.0f, 18);
        char c3 = 17;
        if (i == 31) {
            uiShopImage[20].drawAtPointOption(40f, 13f, 17);
        } else {
            uiShopImage[19].drawAtPointOption(40f, 13f, 17);
        }
        if (i == 30) {
            uiShopImage[31].drawAtPointOption(11.0f, 356.0f, 18);
        } else {
            uiShopImage[30].drawAtPointOption(11.0f, 356.0f, 18);
        }
        uiUpgradeImage[18].drawAtPointOption(572.0f, 8.0f, 18);
        drawNumberBlock(GameThread.myHeroism, numberHeroismImage, 779.0f, 24.0f, 1, 20, 1);
        uiShopImage[16].drawAtPointOption(14.0f, 54.0f, 18);
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
                        i3 = upgradeItemListDraw.blockCorrectionPixel;
                    } else {
                        i2 = upgradeItemListDraw.blockLengthArray[abs];
                        i3 = upgradeItemListDraw.blockCorrectionPixel;
                    }
                    CGRectMake(30.0f, f2, 690.0f, 280.0f);
                    uiShopImage[c3].drawAtPointOptionGuide(30.0f, r2 + 70, 18, _CGRect);
                    float f3 = i2 + i3 + 75;
                    drawUpItemImageGuide(i13, 40.0f, f3, 18, _CGRect);
                    setFontDoubleColor(-2560, -2560);
                    setFontSize(20);
                    drawStringDoubleGuideM(DataUpgradeItem.upgradeItemName[i13], 118.0f, r2 + 81, 18, _CGRect);
                    setFontDoubleColor(i4, i4);
                    setFontSize(12);
                    int i14 = DataUpgradeItem.upgradeItemData[i13][c2];
                    String[] split = DataUpgradeItem.upgradeItemDescription[i13].split("_");
                    int i15 = 0;
                    while (i15 < split.length) {
                        String str = split[i15];
                        Object[] objArr = new Object[1];
                        objArr[c] = Integer.valueOf(i14);
                        drawStringDoubleGuideM(String.format(str, objArr), 117.0f, r2 + 108 + (i15 * 15), 18, _CGRect);
                        i15++;
                        c = 0;
                    }
                    if (DataUpgradeItem.upgradeItemData[i13][3] == 0) {
                        dollarImage.drawAtPointOptionGuide(485.0f, f3, 18, _CGRect);
                    }
                    setFontSize(16);
                    drawStringDoubleGuideM(String.valueOf(DataUpgradeItem.upgradeItemData[i13][4]), 547.0f, r2 + 78, 20, _CGRect);
                    int i16 = DataUpgradeItem.upgradeItemData[i13][3];
                    if (i11 >= 0 && i == (i11 * 2) + 10 + 1) {
                        uiShopImage[33].drawAtPointOptionGuide(636.0f, r2 + 71, 18, _CGRect);
                    } else {
                        uiShopImage[32].drawAtPointOptionGuide(636.0f, r2 + 71, 18, _CGRect);
                    }
                    i10++;
                    i11++;
                    f2 = 70.0f;
                    i4 = -1;
                    c = 0;
                    c2 = 2;
                    c3 = 17;
                }
            }
            i10++;
            i11++;
            f2 = 70.0f;
            i4 = -1;
            c = 0;
            c2 = 2;
            c3 = 17;
        }
        uiEtcImage[14].drawAtPointOption(747.0f, GameThread.myScrollbar[4].BarLastPosition, 9);
        int i17 = i != 32 ? i != 33 ? i != 36 ? 0 : 3 : 2 : 1;
        if (GameThread.gameSubStatus == 1) {
            drawInventoryWindow(72, 362, GameThread.shopShopInventorySelectPos, i17, -1, true);
        } else {
            drawInventoryWindow(72, 362, GameThread.shopShopInventorySelectPos, i17, -1, false);
        }
        if (GameThread.gameSubStatus == 7) {
            uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
            setFontSize(32);
            setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
            drawStringDoubleM("Insufficient Hero Points.", CX, 180.0f, 17);
            uiPopupImage[i == 53 ? 13 : 12].drawAtPointOption(213.0f, 259.0f, 18);
        }
        if (z) {
            TouchManager.swapTouchMap();
        }
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
                                GameThread.gameStatus = 16;
                                GameThread.gameSubStatus = 2;
                                GameThread.upgradeHeroUnitSelectPos = 0;
                                GameThread.shopShopInventorySelectPos = 0;
                                GameThread.upgradeHeroEquipSelectPos = 0;
                                GameThread.setEquipHeroSetting();
                                GameThread.playSound(14);
                                break;
                            case 32:
                                GameThread.playSound(14);
                                GameThread.shopShopInventorySelectPos -= 8;
                                if (GameThread.shopShopInventorySelectPos < 0) {
                                    GameThread.shopShopInventorySelectPos += 24;
                                    break;
                                }
                                break;
                            case 33:
                                GameThread.playSound(14);
                                GameThread.shopShopInventorySelectPos += 8;
                                if (GameThread.shopShopInventorySelectPos >= 24) {
                                    GameThread.shopShopInventorySelectPos -= 24;
                                    break;
                                }
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
                                    GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (checkTouchListStatus2);
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

    public static void getShopList() {
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

    public static int sellShopItem() {
        int[] iArr;
        int i;
        int i2 = shopShopInventorySelectPos;
        if (i2 == -1 || (i = (iArr = itemUnitValue)[i2]) == -1) {
            return 1;
        }
        if (i >= 30) {
            iArr[i2] = -1;
        } else {
            if (DataUpgradeItem.upgradeItemData[i][3] == 0) {
                return 2;
            }
            myHeroism += (DataUpgradeItem.upgradeItemData[i][4] * 50) / 100;
            itemUnitValue[shopShopInventorySelectPos] = -1;
        }
        int i3 = shopShopInventorySelectPos;
        while (i3 < 23) {
            int i4 = i3 + 1;
            for (int i5 = i4; i5 < 24; i5++) {
                int[] iArr2 = itemUnitValue;
                if (iArr2[i3] == -1 || (iArr2[i5] != -1 && iArr2[i3] > iArr2[i5])) {
                    int[] iArr3 = itemUnitValue;
                    int i6 = iArr3[i5];
                    iArr3[i5] = iArr3[i3];
                    iArr3[i3] = i6;
                }
            }
            i3 = i4;
        }
        return 0;
    }
}
