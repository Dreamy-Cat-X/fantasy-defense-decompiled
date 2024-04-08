package com.sncompany.newtower.Pages;

import androidx.core.view.ViewCompat;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.TouchManager;

public class ShopPage extends TPage {

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
            if (i5 == 0 || i5 == 1) {
                TouchManager.addTouchRectListData(30, CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
                TouchManager.addTouchRectListData(31, CGRectMake(19.0f, DRAW_SCALE_X_SMALL_DEGREE, 42.0f, 48.0f));
                TouchManager.addTouchRectListData(32, CGRectMake(81.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(33, CGRectMake(672.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(34, CGRectMake(30.0f, 70.0f, 690.0f, 280.0f));
                TouchManager.addTouchRectListData(35, CGRectMake(722.0f, 70.0f, 52.0f, 280.0f));
                TouchManager.addTouchRectListData(36, CGRectMake(711.0f, 381.0f, 68.0f, 78.0f));
                TouchManager.addTouchRectListData(38, CGRectMake(636.0f, 71.0f, 78.0f, 68.0f));
                for (int i6 = 0; i6 < 4; i6++) {
                    int i7 = (i6 * 2) + 10;
                    int i8 = i6 * 70;
                    TouchManager.addTouchRectListData(i7, CGRectMake(565.0f, i8 + 75, 70.0f, 60.0f));
                    TouchManager.addTouchRectListData(i7 + 1, CGRectMake(636.0f, i8 + 71, 78.0f, 68.0f));
                }
                for (int i9 = 0; i9 < 8; i9++) {
                    TouchManager.addTouchRectListData(i9 + 0, CGRectMake(((i9 % 8) * 70) + GAME_SHOP_SHOP_INVENTORY_START_X, 390.0f, 60.0f, 60.0f));
                }
            } else if (i5 == 3) {
                TouchManager.addTouchRectListData(54, CGRectMake(162.0f, 290.0f, 236.0f, 43.0f));
                TouchManager.addTouchRectListData(55, CGRectMake(402.0f, 290.0f, 236.0f, 43.0f));
            } else if (i5 == 5) {
                TouchManager.addTouchRectListData(53, CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            } else if (i5 == 6) {
                TouchManager.addTouchRectListData(53, CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            } else if (i5 == 7) {
                TouchManager.addTouchRectListData(53, CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            } else if (i5 == 8) {
                TouchManager.addTouchRectListData(53, CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 56;
            i = TouchManager.checkTouchListStatus();
        } else {
            i = -1;
        }
        if (z) {
            mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
            mainmenuImage[5].drawAtPointOption(87.0f, 254.0f, 18);
        }
        char c2 = 2;
        uiShopImage[2].drawAtPointOption(66.0f, 5.0f, 18);
        char c3 = 17;
        if (i == 31) {
            uiShopImage[20].drawAtPointOption(40.0f, DRAW_SCALE_X_SMALL_DEGREE, 17);
        } else {
            uiShopImage[19].drawAtPointOption(40.0f, DRAW_SCALE_X_SMALL_DEGREE, 17);
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
        switch (GameThread.gameSubStatus) {
            case 3:
                uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
                setFontSize(16);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Do you want to send this gift?", CX, 260.0f, 17);
                for (int i18 = 0; i18 < GameThread.shopSendPhoneNumberCount; i18++) {
                    drawStringDoubleM(String.format("%d", Integer.valueOf(GameThread.shopSendPhoneNumber[i18])), (i18 * 11) + 370, 210.0f, 18);
                }
                if (GameThread.shopSendItemNumber > 0) {
                    uiUpitemImage[GameThread.shopSendItemNumber].drawAtPointOption(300.0f, 180.0f, 18);
                    drawStringDoubleM(DataUpgradeItem.upgradeItemName[GameThread.shopSendItemNumber], 370.0f, 180.0f, 18);
                }
                if (i == 54) {
                    f = 290.0f;
                    uiPopupImage[6].drawAtPointOption(162.0f, 290.0f, 18);
                } else {
                    f = 290.0f;
                    uiPopupImage[5].drawAtPointOption(162.0f, 290.0f, 18);
                }
                if (i == 55) {
                    uiPopupImage[3].drawAtPointOption(402.0f, f, 18);
                    break;
                } else {
                    uiPopupImage[2].drawAtPointOption(402.0f, f, 18);
                    break;
                }
            case 4:
                setFontColor(-1);
                setFontSize(20);
                drawStringM("Sending...", CX, CY, 9);
                break;
            case 5:
                uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
                setFontSize(32);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Sent.", CX, 180.0f, 17);
                if (i == 53) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                }
            case 6:
                uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
                setFontSize(32);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Failed to send the gift.", CX, 180.0f, 17);
                if (i == 53) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                }
            case 7:
                uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
                setFontSize(32);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Insufficient Hero Points.", CX, 180.0f, 17);
                if (i == 53) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                }
            case 8:
                uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
                setFontSize(30);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("You cannot sell", CX, 170.0f, 17);
                drawStringDoubleM("Cash items.", CX, 210.0f, 17);
                if (i == 53) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 259.0f, 18);
                    break;
                }
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
                                GameThread.gameStatus = 14;
                                GameThread.playSound(15);
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
                                            if (i7 == 0) {
                                                if (DataUpgradeItem.upgradeItemData[i][3] != 0 && GameThread.myHeroism >= DataUpgradeItem.upgradeItemData[i][4]) {
                                                    GameThread.shopSendItemNumber = i;
                                                    GameThread.shopSendPhoneNumberCount = 0;
                                                    GameThread.gameSubStatus = 2;
                                                    break;
                                                }
                                            } else {
                                                if (GameThread.buyShopItem(GameThread.shopUnitValue[i6]) == 2) {
                                                    GameThread.gameSubStatus = 7;
                                                }
                                                GameThread.playSound(14);
                                                Config.saveAll(newTower);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    GameThread.playSound(14);
                                    GameThread.gameSubStatus = 1;
                                    GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (checkTouchListStatus2);
                                    break;
                                }
                                break;
                        }
                    } else if (GameThread.gameSubStatus == 1) {
                        int sellShopItem = GameThread.sellShopItem();
                        GameThread.playSound(14);
                        if (sellShopItem == 0) {
                            Config.saveAll(newTower);
                            break;
                        } else if (sellShopItem == 2) {
                            GameThread.gameSubStatus = 8;
                            break;
                        }
                    }
                    break;
                case 2:
                    switch (checkTouchListStatus2) {
                        case 40:
                            GameThread.gameSubStatus = 0;
                            break;
                        case 41:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 1;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 42:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 2;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 43:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 3;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 44:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 4;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 45:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 5;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 46:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 6;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 47:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 7;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 48:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 8;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 49:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 9;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 50:
                            if (GameThread.shopSendPhoneNumberCount > 0) {
                                GameThread.shopSendPhoneNumberCount--;
                                break;
                            }
                            break;
                        case 51:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 0;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 52:
                            if (GameThread.shopSendPhoneNumberCount >= 10) {
                                GameThread.gameSubStatus = 3;
                                break;
                            }
                            break;
                    }
                case 3:
                    if (checkTouchListStatus2 == 54) {
                        GameThread.sendGiftStartNetwork();
                        GameThread.gameSubStatus = 4;
                        break;
                    } else if (checkTouchListStatus2 == 55) {
                        GameThread.gameSubStatus = 0;
                        break;
                    }
                    break;
                case 5, 6, 7, 8:
                    if (checkTouchListStatus2 == 53) {
                        GameThread.gameSubStatus = 0;
                        break;
                    }
                    break;
            }
        }
        TouchManager.processTouchStatus();
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

    public static void buyPurchaseItem(int i) {
        int i2;
        switch (i) {
            case 5:
                i2 = 29;
                break;
            case 6:
            default:
                i2 = 0;
                break;
            case 7:
                i2 = 4;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 12;
                break;
            case 10:
                i2 = 16;
                break;
            case 11:
                i2 = 20;
                break;
            case 12:
                i2 = 24;
                break;
            case 13:
                i2 = 25;
                break;
            case 14:
                i2 = 26;
                break;
            case 15:
                i2 = 27;
                break;
            case 16:
                i2 = 28;
                break;
        }
        int i3 = DataUpgradeItem.upgradeItemData[i2][5];
        if (i3 == 0) {
            myHeroism += DataUpgradeItem.upgradeItemData[i2][2];
        } else if (i3 == 9) {
            resetUpgrade();
        } else if (i3 == 14) {
            limitCashBuyCount++;
        } else {
            getItem(i2);
        }
        Config.saveAll(newTower);
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
