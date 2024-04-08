package com.sncompany.newtower.Pages;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

public class EquipPage extends TPage {
    public void paint_GAME_SHOP_EQUIP(GL10 gl10, boolean z) {
        int i;
        int i2;
        float f;
        inventoryItemListDraw.getArrayAndCorrection();
        if (z) {
            TouchManager.clearTouchMap();
            if (GameThread.gameSubStatus == 8) {
                TouchManager.addTouchRectListData(74, CGRectMake(213.0f, 259.0f, 381.0f, 65.0f));
            } else {
                TouchManager.addTouchRectListData(60, CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
                if (GameThread.gameSubStatus == 4) {
                    TouchManager.addTouchRectListData(73, CGRectMake(711.0f, 381.0f, 68.0f, 78.0f));
                }
                TouchManager.addTouchRectListData(62, CGRectMake(16.0f, 8.0f, 46.0f, 49.0f));
                TouchManager.addTouchRectListData(70, CGRectMake(81.0f, 397.0f, 47.0f, 48.0f));
                TouchManager.addTouchRectListData(71, CGRectMake(672.0f, 397.0f, 47.0f, 48.0f));
                if (GameThread.rewardDataValue[0] == 1) {
                    TouchManager.addTouchRectListData(10, CGRectMake(203.0f, 224.0f, 60.0f, 60.0f));
                    TouchManager.addTouchRectListData(11, CGRectMake(203.0f, 293.0f, 60.0f, 60.0f));
                } else {
                    TouchManager.addTouchRectListData(75, CGRectMake(109.0f, 174.0f, 100.0f, 120.0f));
                }
                if (GameThread.rewardDataValue[2] == 1) {
                    TouchManager.addTouchRectListData(12, CGRectMake(458.0f, 224.0f, 60.0f, 60.0f));
                    TouchManager.addTouchRectListData(13, CGRectMake(458.0f, 293.0f, 60.0f, 60.0f));
                } else {
                    TouchManager.addTouchRectListData(76, CGRectMake(364.0f, 174.0f, 100.0f, 120.0f));
                }
                if (GameThread.rewardDataValue[4] == 1) {
                    TouchManager.addTouchRectListData(14, CGRectMake(713.0f, 224.0f, 60.0f, 60.0f));
                    TouchManager.addTouchRectListData(15, CGRectMake(713.0f, 293.0f, 60.0f, 60.0f));
                } else {
                    TouchManager.addTouchRectListData(77, CGRectMake(619.0f, 174.0f, 100.0f, 120.0f));
                }
                for (int i3 = 0; i3 < 8; i3++) {
                    TouchManager.addTouchRectListData(i3 + 0, CGRectMake(((i3 % 8) * 70) + GAME_SHOP_SHOP_INVENTORY_START_X, 390.0f, 60.0f, 60.0f));
                }
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 78;
            i = TouchManager.checkTouchListStatus();
        } else {
            i = -1;
        }
        if (z) {
            mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
            mainmenuImage[5].drawAtPointOption(87.0f, 254.0f, 18);
        }
        uiShopImage[0].drawAtPointOption(66.0f, 5.0f, 18);
        if (i == 31) {
            uiShopImage[22].drawAtPointOption(40.0f, 9.0f, 17);
        } else {
            uiShopImage[21].drawAtPointOption(40.0f, 9.0f, 17);
        }
        if (i == 30) {
            uiShopImage[31].drawAtPointOption(11.0f, 356.0f, 18);
        } else {
            uiShopImage[30].drawAtPointOption(11.0f, 356.0f, 18);
        }
        uiUpgradeImage[18].drawAtPointOption(572.0f, 8.0f, 18);
        drawNumberBlock(GameThread.myHeroism, numberHeroismImage, 779.0f, 24.0f, 1, 20, 1);
        uiShopImage[13].drawAtPointOption(20.0f, 60.0f, 18);
        uiShopImage[13].drawAtPointOption(275.0f, 60.0f, 18);
        uiShopImage[13].drawAtPointOption(530.0f, 60.0f, 18);
        int i4 = GameThread.gameSubStatus;
        if (i4 == 3) {
            i2 = GameThread.heroItemType[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroEquipSelectPos];
        } else if (i4 == 6) {
            i2 = GameThread.heroItemType[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroEquipSelectPos];
        } else {
            i2 = i4 != 7 ? -1 : GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos];
        }
        setFontSize(13);
        uiShopImage[4].drawAtPointOption(20.0f, 75.0f, 18);
        if (GameThread.rewardDataValue[0] == 1) {
            uiShopImage[14].drawAtPointOption(25.0f, 222.0f, 18);
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 0 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 2) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            int i5 = GameThread.towerUnit[0].unitPower;
            drawStringDoubleM(String.valueOf(i5 + (((GameThread.getUpgradeHeroRate(GameThread.towerUnit[0].heroOrder, 7) + GameThread.getUpgradeItemRate(GameThread.towerUnit[0].heroOrder, 2)) * i5) / 100)), 167.0f, 257.0f, 20);
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 0 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 3) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            if (GameThread.towerUnit[0].towerCoolTimeMax == 1) {
                drawStringDoubleM("MAX", 167.0f, 284.0f, 20);
            } else {
                drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.towerUnit[0].towerCoolTimeMax)), 167.0f, 284.0f, 20);
            }
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 0 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 4) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            drawStringDoubleM(String.valueOf(GameThread.towerUnit[0].attackRange), 167.0f, 311.0f, 20);
            setFontColor(-8519745);
            drawStringDoubleM(getEffectTypeString(GameThread.towerUnit[0].effectType), 167.0f, 338.0f, 20);
        } else {
            uiShopImage[6].drawAtPointOption(19.0f, 74.0f, 18);
            uiShopImage[47].drawAtPointOption(109.0f, 174.0f, 18);
            setFontColor(-1);
            drawStringDoubleM("Stage Start Open", 149.0f, 284.0f, 17);
        }
        uiShopImage[5].drawAtPointOption(19.0f, 59.0f, 18);
        uiShopImage[7].drawAtPointOption(275.0f, 79.0f, 18);
        if (GameThread.rewardDataValue[2] == 1) {
            uiShopImage[14].drawAtPointOption(280.0f, 222.0f, 18);
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 1 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 2) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            int i6 = GameThread.towerUnit[1].unitPower;
            drawStringDoubleM(String.valueOf(i6 + (((GameThread.getUpgradeHeroRate(GameThread.towerUnit[1].heroOrder, 7) + GameThread.getUpgradeItemRate(GameThread.towerUnit[1].heroOrder, 2)) * i6) / 100)), 422.0f, 257.0f, 20);
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 1 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 3) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            if (GameThread.towerUnit[1].towerCoolTimeMax == 1) {
                drawStringDoubleM("MAX", 422.0f, 284.0f, 20);
            } else {
                drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.towerUnit[1].towerCoolTimeMax)), 422.0f, 284.0f, 20);
            }
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 1 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 4) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            drawStringDoubleM(String.valueOf(GameThread.towerUnit[1].attackRange), 422.0f, 311.0f, 20);
            setFontColor(-8519745);
            drawStringDoubleM(getEffectTypeString(GameThread.towerUnit[1].effectType), 422.0f, 338.0f, 20);
        } else {
            uiShopImage[9].drawAtPointOption(274.0f, 78.0f, 18);
            uiShopImage[47].drawAtPointOption(364.0f, 174.0f, 18);
            setFontColor(-1);
            drawStringDoubleM("Stage 10 Open", 404.0f, 284.0f, 17);
        }
        uiShopImage[8].drawAtPointOption(274.0f, 59.0f, 18);
        uiShopImage[10].drawAtPointOption(530.0f, 74.0f, 18);
        if (GameThread.rewardDataValue[4] == 1) {
            uiShopImage[14].drawAtPointOption(535.0f, 222.0f, 18);
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 2 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 2) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            int i7 = GameThread.towerUnit[2].unitPower;
            drawStringDoubleM(String.valueOf(i7 + (((GameThread.getUpgradeHeroRate(GameThread.towerUnit[2].heroOrder, 7) + GameThread.getUpgradeItemRate(GameThread.towerUnit[2].heroOrder, 2)) * i7) / 100)), 677.0f, 257.0f, 20);
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 2 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 3) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            if (GameThread.towerUnit[2].towerCoolTimeMax == 1) {
                drawStringDoubleM("MAX", 677.0f, 284.0f, 20);
            } else {
                drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.towerUnit[2].towerCoolTimeMax)), 677.0f, 284.0f, 20);
            }
            if (GameThread.gameSubStatus == 3 && GameThread.upgradeHeroUnitSelectPos == 2 && i2 != -1 && DataUpgradeItem.upgradeItemData[i2][5] == 4) {
                setFontColor(SupportMenu.CATEGORY_MASK);
            } else {
                setFontColor(-8519745);
            }
            drawStringDoubleM(String.valueOf(GameThread.towerUnit[2].attackRange), 677.0f, 311.0f, 20);
            setFontColor(-8519745);
            drawStringDoubleM(getEffectTypeString(GameThread.towerUnit[2].effectType), 677.0f, 338.0f, 20);
        } else {
            uiShopImage[12].drawAtPointOption(530.0f, 87.0f, 18);
            uiShopImage[47].drawAtPointOption(619.0f, 174.0f, 18);
            setFontColor(-1);
            drawStringDoubleM("Stage 20 Open", 659.0f, 284.0f, 17);
        }
        uiShopImage[11].drawAtPointOption(529.0f, 59.0f, 18);
        int i8 = i != 70 ? i != 71 ? i != 73 ? 0 : 3 : 2 : 1;
        for (int i9 = 0; i9 < 3; i9++) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (GameThread.heroItemType[i9][i10] != -1) {
                    drawUpItemImage(GameThread.heroItemType[i9][i10], (i9 * 255) + GAME_SHOP_EQUIP_SKILL_START_X, (i10 * 69) + GAME_SHOP_EQUIP_SKILL_START_Y, 18);
                }
            }
        }
        if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos != -1 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
            if (GameThread.gameTimeCount % 20 < 10) {
                f = (GameThread.gameTimeCount % 20) * 0.1f;
            } else {
                f = 1.0f - (((float) ((GameThread.gameTimeCount % 20) - 10)) * 0.1f);
            }
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f, f, f, f);
            for (int i11 = 0; i11 < 3; i11++) {
                if (GameThread.heroUnitType[i11] != -1) {
                    for (int i12 = 0; i12 < 2; i12++) {
                        uiShopImage[48].drawAtPointOption(((i11 * 255) + GAME_SHOP_EQUIP_SKILL_START_X) - 7, ((i12 * 69) + GAME_SHOP_EQUIP_SKILL_START_Y) - 7, 18);
                    }
                }
            }
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            drawInventoryWindow(72, 362, GameThread.shopShopInventorySelectPos, i8, -1, true);
        } else {
            drawInventoryWindow(72, 362, GameThread.shopShopInventorySelectPos, i8, -1, false);
        }
        TouchManager.getFirstLastActionTouch();
        int i13 = GameThread.gameSubStatus;
        if (i13 != 6) {
            if (i13 == 7 && i2 != -1) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(GAME_SHOP_EQUIP_MOVING_ALPHA, GAME_SHOP_EQUIP_MOVING_ALPHA, GAME_SHOP_EQUIP_MOVING_ALPHA, GAME_SHOP_EQUIP_MOVING_ALPHA);
                drawUpItemImage(i2, TouchManager.getFirstLastActionTouch().x, r0.y - 25.0f, 9);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
        } else if (i2 != -1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(GAME_SHOP_EQUIP_MOVING_ALPHA, GAME_SHOP_EQUIP_MOVING_ALPHA, GAME_SHOP_EQUIP_MOVING_ALPHA, GAME_SHOP_EQUIP_MOVING_ALPHA);
            drawUpItemImage(i2, TouchManager.getFirstLastActionTouch().x, r0.y - 25.0f, 9);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        int i14 = GameThread.gameSubStatus;
        if (i14 == 3) {
            int i15 = GameThread.heroItemType[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroEquipSelectPos];
            if (i15 != -1) {
                drawInvenItemDescription((GameThread.upgradeHeroUnitSelectPos * 255) + GAME_SHOP_EQUIP_SKILL_START_X + 30, (GameThread.upgradeHeroEquipSelectPos * 69) + GAME_SHOP_EQUIP_SKILL_START_Y, i15);
            }
        } else if (i14 == 8) {
            uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
            setFontSize(30);
            setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
            drawStringDoubleM("You cannot sell ", CX, 170.0f, 17);
            drawStringDoubleM("Cash items.", CX, 210.0f, 17);
            if (i == 53) {
                uiPopupImage[13].drawAtPointOption(213.0f, 259.0f, 18);
            } else {
                uiPopupImage[12].drawAtPointOption(213.0f, 259.0f, 18);
            }
        }
        if (z) {
            TouchManager.swapTouchMap();
        }
    }

    public void touchCheck_GAME_SHOP_EQUIP() {
        int i = TouchManager.lastActionStatus;
        if (i == 0) {
            int i2 = GameThread.gameSubStatus;
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == -1) {
                    touchStart_GAME_SHOP_EQUIP_NUM = -1;
                    return;
                }
                if (checkTouchListStatus < 10) {
                    if (GameThread.itemUnitValue[(GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + checkTouchListStatus] != -1) {
                        touchStart_GAME_SHOP_EQUIP_NUM = checkTouchListStatus;
                    } else {
                        touchStart_GAME_SHOP_EQUIP_NUM = -1;
                    }
                    return;
                }
                if (checkTouchListStatus < 60) {
                    int i3 = checkTouchListStatus - 10;
                    if (GameThread.heroItemType[i3 / 2][i3 % 2] != -1) {
                        touchStart_GAME_SHOP_EQUIP_NUM = checkTouchListStatus;
                    } else {
                        touchStart_GAME_SHOP_EQUIP_NUM = -1;
                    }
                    return;
                }
                touchStart_GAME_SHOP_EQUIP_NUM = -1;
                return;
            }
            touchStart_GAME_SHOP_EQUIP_NUM = -1;
            return;
        }
        if (i == 1) {
            int i4 = GameThread.gameSubStatus;
            if (i4 == 2 || i4 == 3 || i4 == 4) {
                CGPoint firstFirstActionTouch = TouchManager.getFirstFirstActionTouch();
                CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
                int checkTouchListPressed = TouchManager.checkTouchListPressed(firstFirstActionTouch);
                if (checkTouchListPressed != -1 && Math.abs(firstFirstActionTouch.x - firstLastActionTouch.x) + Math.abs(firstFirstActionTouch.y - firstLastActionTouch.y) >= 60.0f) {
                    if (checkTouchListPressed < 10) {
                        int i5 = GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8);
                        int i6 = touchStart_GAME_SHOP_EQUIP_NUM;
                        int i7 = i5 + i6;
                        if (i6 != -1 && GameThread.itemUnitValue[i7] != -1) {
                            GameThread.gameSubStatus = 7;
                            GameThread.shopShopInventorySelectPos = i7;
                        } else {
                            TouchManager.clearTouchMap();
                        }
                        return;
                    }
                    if (checkTouchListPressed < 60) {
                        int i8 = checkTouchListPressed - 10;
                        int i9 = i8 / 2;
                        int i10 = i8 % 2;
                        if (GameThread.heroItemType[i9][i10] != -1) {
                            GameThread.gameSubStatus = 6;
                            GameThread.upgradeHeroUnitSelectPos = i9;
                            GameThread.upgradeHeroEquipSelectPos = i10;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus2 == 60) {
            GameThread.gameStatus = 14;
            GameThread.playSound(15);
        } else {
            if (checkTouchListStatus2 == 62) {
                GameThread.gameStatus = 15;
                GameThread.gameSubStatus = 0;
                GameThread.shopShopChapterSelectPos = 0;
                GameThread.shopShopItemSelectPos = 0;
                GameThread.shopShopInventorySelectPos = 0;
                GameThread.getShopList();
                GameThread.playSound(14);
                TouchManager.processTouchStatus();
                return;
            }
            if (checkTouchListStatus2 == 70) {
                GameThread.playSound(14);
                GameThread.shopShopInventorySelectPos -= 8;
                if (GameThread.shopShopInventorySelectPos < 0) {
                    GameThread.shopShopInventorySelectPos += 24;
                }
                TouchManager.processTouchStatus();
                return;
            }
            if (checkTouchListStatus2 == 71) {
                GameThread.playSound(14);
                GameThread.shopShopInventorySelectPos += 8;
                if (GameThread.shopShopInventorySelectPos >= 24) {
                    GameThread.shopShopInventorySelectPos -= 24;
                }
                TouchManager.processTouchStatus();
                return;
            }
            switch (checkTouchListStatus2) {
                case 10:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 0;
                        GameThread.upgradeHeroEquipSelectPos = 0;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 11:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 0;
                        GameThread.upgradeHeroEquipSelectPos = 1;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 12:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 1;
                        GameThread.upgradeHeroEquipSelectPos = 0;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 13:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 1;
                        GameThread.upgradeHeroEquipSelectPos = 1;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 14:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 2;
                        GameThread.upgradeHeroEquipSelectPos = 0;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 15:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 2;
                        GameThread.upgradeHeroEquipSelectPos = 1;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                default:
                    switch (checkTouchListStatus2) {
                        case 73:
                            if (GameThread.gameSubStatus == 4) {
                                GameThread.playSound(14);
                                int sellShopItem = GameThread.sellShopItem();
                                if (sellShopItem == 0) {
                                    Config.saveAll(newTower);
                                } else if (sellShopItem == 2) {
                                    GameThread.gameSubStatus = 8;
                                }
                            }
                            TouchManager.processTouchStatus();
                            return;
                        case 74:
                            GameThread.gameSubStatus = 2;
                            TouchManager.processTouchStatus();
                            break;
                        case 75:
                            Log.d("GAME_SHOP_TOUCH_LIST_LOCK_HERO_0", "CHECK MOVE  " + checkTouchListStatus2);
                            break;
                        case 76:
                            Log.d("GAME_SHOP_TOUCH_LIST_LOCK_HERO_1", "CHECK MOVE  " + checkTouchListStatus2);
                            break;
                        case 77:
                            Log.d("GAME_SHOP_TOUCH_LIST_LOCK_HERO_2", "CHECK MOVE  " + checkTouchListStatus2);
                            break;
                    }
            }
        }
        if (checkTouchListStatus2 != -1 && checkTouchListStatus2 < 10) {
            GameThread.playSound(14);
            GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (checkTouchListStatus2);
            GameThread.gameSubStatus = 4;
            TouchManager.processTouchStatus();
            return;
        }
        if (checkTouchListStatus2 != -1 && checkTouchListStatus2 < 60) {
            GameThread.gameSubStatus = 3;
            int i11 = checkTouchListStatus2 - 10;
            GameThread.upgradeHeroUnitSelectPos = i11 / 2;
            GameThread.upgradeHeroEquipSelectPos = i11 % 2;
            TouchManager.processTouchStatus();
            return;
        }
        int i12 = GameThread.gameSubStatus;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 6) {
                    if (checkTouchListStatus2 == 60) {
                        GameThread.gameStatus = 14;
                        GameThread.playSound(15);
                    }
                    TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                    GameThread.unequipItem();
                    GameThread.setEquipHeroSetting();
                    Config.saveAll(newTower);
                    GameThread.gameSubStatus = 2;
                } else if (i12 == 7) {
                    if (checkTouchListStatus2 == 60) {
                        GameThread.gameStatus = 14;
                        GameThread.playSound(15);
                    }
                    int checkTouchListPressed2 = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                    if (checkTouchListPressed2 >= 10 && checkTouchListPressed2 < 60) {
                        GameThread.playSound(14);
                        int i13 = checkTouchListPressed2 - 10;
                        GameThread.upgradeHeroUnitSelectPos = i13 / 2;
                        GameThread.upgradeHeroEquipSelectPos = i13 % 2;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        Config.saveAll(newTower);
                    }
                    GameThread.gameSubStatus = 3;
                }
            } else if (checkTouchListStatus2 == 60) {
                GameThread.gameStatus = 14;
                GameThread.playSound(15);
            } else if (checkTouchListStatus2 == -1) {
                GameThread.gameSubStatus = 2;
            }
        } else if (checkTouchListStatus2 == -1) {
            GameThread.gameSubStatus = 2;
        }
        TouchManager.processTouchStatus();
    }
}
