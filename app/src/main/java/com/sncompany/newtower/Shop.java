package com.sncompany.newtower;

public class Shop {
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
