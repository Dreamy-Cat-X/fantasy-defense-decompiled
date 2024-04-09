package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class UpgradePage extends TPage {

    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_0_BACK = 60;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_1_OK_TOTAL = 61;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_2_UNIT = 62;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_3_HERO = 63;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BOTTOM_SELECT = 70;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BUY_ARCHER = 66;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BUY_WARRIOR = 65;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BUY_WIZARD = 67;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_EQUIP_START = 30;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_ETC_START = 60;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_HERO_START = 20;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_INVEN_START = 0;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_LEFT_ARROW = 68;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_RIGHT_ARROW = 69;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_TOTAL_COUNT = 71;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_UPGRADE_START = 40;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_0_BACK = 24;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_1_UPGRADE = 25;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_2_UNIT = 26;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_3_HERO = 27;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_4_COMMON = 28;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_5_WARRIOR = 29;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_6_ARCHER = 30;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_7_WIZARD = 31;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_ITEM_TOTAL_COUNT = 24;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_TOTAL_COUNT = 32;
    public static final int[] uiUpgradeResource = {R.drawable.ui_upgrade_btnherooff, R.drawable.ui_upgrade_btnheroon, R.drawable.ui_upgrade_btnunitoff, R.drawable.ui_upgrade_btnuniton, R.drawable.ui_upgrade_titlehero, R.drawable.ui_upgrade_titleunit, R.drawable.ui_upgrade_basehero, R.drawable.ui_upgrade_baseunit, R.drawable.ui_upgrade_tabherooff, R.drawable.ui_upgrade_tabheroon, R.drawable.ui_upgrade_tabunitoff, R.drawable.ui_upgrade_tabuniton, R.drawable.ui_upgrade_baseblack, R.drawable.ui_upgrade_btnupgradeoff, R.drawable.ui_upgrade_btnupgradeon, R.drawable.ui_upgrade_max, R.drawable.ui_upgrade_iconselectn, R.drawable.ui_upgrade_iconselecta, R.drawable.ui_upgrade_uprightbar};
    public final Texture2D[] uiUpgradeImage = new Texture2D[uiUpgradeResource.length];

    public boolean hero = false;

    public UpgradePage(TPage par, int isHero) {
        super(par);
        hero = isHero == 1;
    }

    @Override
    public void load(Consumer<Float> prog) {
        for (int i = 0; i < uiUpgradeImage.length; i++)
            uiUpgradeImage[i] = new Texture2D(uiUpgradeResource[i]);
    }

    public void paint_GAME_UPGRADE_UNIT(GL10 gl10, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 70;
        if (z) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(25, CGRectMake(680.0f, 367.0f, 100.0f, 100.0f));
            TouchManager.addTouchRectListData(24, CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
            TouchManager.addTouchRectListData(27, CGRectMake(21.0f, 8.0f, 38.0f, 48.0f));
            for (int i10 = 0; i10 < 18; i10++) {
                int i11 = i10 % 6;
                if (i11 < 3) {
                    i7 = i11 * 70;
                    i8 = 0;
                } else {
                    i7 = (i11 - 3) * 70;
                    i8 = 70;
                }
                TouchManager.addTouchRectListData(i10, CGRectMake(((i10 / 6) * 255) + 45 + i7, i8 + GAME_UPGRADE_HERO_SKILL_START_Y, 60.0f, 60.0f));
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 32;
            i = TouchManager.checkTouchListStatus();
        } else {
            i = -1;
        }
        if (z) {
            mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
            mainmenuImage[4].drawAtPointOption(383.0f, 204.0f, 18);
        }
        if (i == 24) {
            uiShopImage[31].drawAtPointOption(11.0f, 356.0f, 18);
        } else {
            uiShopImage[30].drawAtPointOption(11.0f, 356.0f, 18);
        }
        if (i == 27) {
            uiUpgradeImage[9].drawAtPointOption(21.0f, 8.0f, 18);
        } else {
            uiUpgradeImage[8].drawAtPointOption(21.0f, 8.0f, 18);
        }
        uiUpgradeImage[5].drawAtPointOption(66.0f, 5.0f, 18);
        uiUpgradeImage[7].drawAtPointOption(20.0f, 60.0f, 18);
        for (int i12 = 0; i12 < 18; i12++) {
            int i13 = i12 % 6;
            if (i13 < 3) {
                i5 = i13 * 70;
                i6 = 0;
            } else {
                i5 = (i13 - 3) * 70;
                i6 = 70;
            }
            float f = ((i12 / 6) * 255) + 45 + i5;
            float f2 = i6 + GAME_UPGRADE_HERO_SKILL_START_Y;
            if (GameThread.upgradeUnitValue[i12] == DataUpgradeUnit.upgradeUnitData[i12][3] + (GameThread.limitCashBuyCount * 5)) {
                uiUpgradeImage[15].drawAtPointOption(f + 30.0f, f2 + 43.0f, 17);
            } else {
                float f3 = f2 + 43.0f;
                numberUpgradeImage[10].drawAtPointOption(30.0f + f, f3, 17);
                drawNumberBlock(GameThread.upgradeUnitValue[i12], numberUpgradeImage, f + 15.0f, f3, -2, 17, 1);
                drawNumberBlock(GameThread.getUpgradeUnitMax(i12), numberUpgradeImage, f + 45.0f, f3, -2, 17, 1);
            }
        }
        uiUpgradeImage[18].drawAtPointOption(572.0f, 8.0f, 18);
        drawNumberBlock(GameThread.myHeroism, numberHeroismImage, 779.0f, 24.0f, 1, 20, 1);
        uiShopImage[23].drawAtPointOption(72.0f, 362.0f, 18);
        if (i == 61) {
            uiUpgradeImage[14].drawAtPointOption(680.0f, 367.0f, 18);
        } else {
            uiUpgradeImage[13].drawAtPointOption(680.0f, 367.0f, 18);
        }
        uiUpgradeImage[12].drawAtPointOption(96.0f, 386.0f, 18);
        if (GameThread.lastUpdateItemViewDelay > 0) {
            if (GameThread.lastUpdateItemPos % 6 < 3) {
                i3 = (GameThread.lastUpdateItemPos % 6) * 70;
                i4 = 0;
            } else {
                i3 = ((GameThread.lastUpdateItemPos % 6) - 3) * 70;
                i4 = 70;
            }
            float f4 = ((GameThread.lastUpdateItemPos / 6) * 255) + 45 + i3;
            float f5 = i4 + GAME_UPGRADE_HERO_SKILL_START_Y;
            float f6 = GameThread.lastUpdateItemViewDelay * 0.066f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f6, f6, f6, f6);
            fillWhiteImage.fillRect(f4, f5, 60.0f, 60.0f);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (GameThread.upgradeUnitSelectPos % 6 < 3) {
            i2 = (GameThread.upgradeUnitSelectPos % 6) * 70;
            i9 = 0;
        } else {
            i2 = ((GameThread.upgradeUnitSelectPos % 6) - 3) * 70;
        }
        float f7 = ((GameThread.upgradeUnitSelectPos / 6) * 255) + 45 + i2;
        float f8 = i9 + GAME_UPGRADE_HERO_SKILL_START_Y;
        drawSelectRedBox(f7, f8);
        drawUpgradeUnitDescription(f7 + 30.0f, f8, GameThread.upgradeUnitSelectPos);
        uiUpunitImage[GameThread.upgradeUnitSelectPos].drawAtPointOption(97.0f, 387.0f, 18);
        setFontSize(20);
        setFontColor(-2560);
        drawStringM(DataUpgradeUnit.upgradeUnitName[GameThread.upgradeUnitSelectPos], 183.0f, 384.0f, 18);
        setFontSize(18);
        setFontColor(-1);
        int i14 = DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][0] * GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos];
        int i15 = DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][0] * (GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] + 1);
        drawStringM(String.format(DataUpgradeUnit.upgradeUnitDescription[GameThread.upgradeUnitSelectPos], Integer.valueOf(DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][0])), 183.0f, 410.0f, 18);
        setFontSize(14);
        if (GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] >= GameThread.getUpgradeUnitMax(GameThread.upgradeUnitSelectPos)) {
            drawStringM(String.format("( MAX : %d )", Integer.valueOf(i14)), 183.0f, 435.0f, 18);
        } else {
            drawStringM(String.format("( %d > %d )", Integer.valueOf(i14), Integer.valueOf(i15)), 183.0f, 435.0f, 18);
        }
        if (z) {
            TouchManager.swapTouchMap();
        }
    }

    public void paint_GAME_UPGRADE_HERO(GL10 gl10, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (z) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(61, CGRectMake(680.0f, 367.0f, 100.0f, 100.0f));
            TouchManager.addTouchRectListData(60, CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
            TouchManager.addTouchRectListData(62, CGRectMake(21.0f, 8.0f, 38.0f, 48.0f));
            for (int i10 = 0; i10 < 3; i10++) {
                if (GameThread.heroUnitType[i10] != -1) {
                    for (int i11 = 0; i11 < 6; i11++) {
                        if (i11 < 3) {
                            i8 = i11 * 70;
                            i9 = 0;
                        } else {
                            i8 = (i11 - 3) * 70;
                            i9 = 70;
                        }
                        TouchManager.addTouchRectListData((i10 * 6) + 40 + i11, CGRectMake((i10 * 255) + 45 + i8, i9 + GAME_UPGRADE_HERO_SKILL_START_Y, 60.0f, 60.0f));
                    }
                }
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 71;
            i = TouchManager.checkTouchListStatus();
        } else {
            i = -1;
        }
        if (z) {
            mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
            mainmenuImage[4].drawAtPointOption(383.0f, 204.0f, 18);
        }
        if (i == 60) {
            uiShopImage[31].drawAtPointOption(11.0f, 356.0f, 18);
        } else {
            uiShopImage[30].drawAtPointOption(11.0f, 356.0f, 18);
        }
        if (i == 62) {
            uiUpgradeImage[11].drawAtPointOption(21.0f, 8.0f, 18);
        } else {
            uiUpgradeImage[10].drawAtPointOption(21.0f, 8.0f, 18);
        }
        uiUpgradeImage[4].drawAtPointOption(66.0f, 5.0f, 18);
        uiUpgradeImage[6].drawAtPointOption(20.0f, 60.0f, 18);
        for (int i12 = 0; i12 < 3; i12++) {
            if (GameThread.heroUnitType[i12] != -1) {
                for (int i13 = 0; i13 < 6; i13++) {
                    if (i13 < 3) {
                        i6 = i13 * 70;
                        i7 = 0;
                    } else {
                        i6 = (i13 - 3) * 70;
                        i7 = 70;
                    }
                    float f = (i12 * 255) + 45 + i6;
                    float f2 = i7 + GAME_UPGRADE_HERO_SKILL_START_Y;
                    if (GameThread.heroUpgradeValue[i12][i13] == DataUpgradeHero.upgradeHeroData[i13][3]) {
                        uiUpgradeImage[15].drawAtPointOption(f + 30.0f, f2 + 43.0f, 17);
                    } else {
                        float f3 = f2 + 43.0f;
                        numberUpgradeImage[10].drawAtPointOption(f + 30.0f, f3, 17);
                        drawNumberBlock(GameThread.heroUpgradeValue[i12][i13], numberUpgradeImage, f + 15.0f, f3, -2, 17, 1);
                        drawNumberBlock(GameThread.getUpgradeHeroMax(i12, i13), numberUpgradeImage, f + 45.0f, f3, -2, 17, 1);
                    }
                }
            } else {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
                fillBlackImage.fillRect((i12 * 255) + 21, 61.0f, 248.0f, 298.0f);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                setFontColor(-1);
                if (i12 == 0) {
                    drawStringDoubleM("Stage Start Open", 149.0f, 284.0f, 17);
                } else if (i12 == 1) {
                    drawStringDoubleM("Stage 10 Open", 404.0f, 284.0f, 17);
                } else if (i12 == 2) {
                    drawStringDoubleM("Stage 20 Open", 659.0f, 284.0f, 17);
                }
            }
        }
        uiUpgradeImage[18].drawAtPointOption(572.0f, 8.0f, 18);
        drawNumberBlock(GameThread.myHeroism, numberHeroismImage, 779.0f, 24.0f, 1, 20, 1);
        uiShopImage[23].drawAtPointOption(72.0f, 362.0f, 18);
        if (i == 61) {
            uiUpgradeImage[14].drawAtPointOption(680.0f, 367.0f, 18);
        } else {
            uiUpgradeImage[13].drawAtPointOption(680.0f, 367.0f, 18);
        }
        uiUpgradeImage[12].drawAtPointOption(96.0f, 386.0f, 18);
        if (GameThread.lastUpdateItemViewDelay > 0) {
            if (GameThread.lastUpdateItemPos % 6 < 3) {
                i4 = (GameThread.lastUpdateItemPos % 6) * 70;
                i5 = 0;
            } else {
                i4 = ((GameThread.lastUpdateItemPos % 6) - 3) * 70;
                i5 = 70;
            }
            float f4 = ((GameThread.lastUpdateItemPos / 6) * 255) + 45 + i4;
            float f5 = i5 + GAME_UPGRADE_HERO_SKILL_START_Y;
            float f6 = GameThread.lastUpdateItemViewDelay * 0.066f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f6, f6, f6, f6);
            fillWhiteImage.fillRect(f4, f5, 60.0f, 60.0f);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (GameThread.heroUnitType[GameThread.upgradeHeroUnitSelectPos] != -1) {
            if (GameThread.upgradeHeroUpgradeSelectPos < 3) {
                i2 = GameThread.upgradeHeroUpgradeSelectPos * 70;
                i3 = 0;
            } else {
                i2 = (GameThread.upgradeHeroUpgradeSelectPos - 3) * 70;
                i3 = 70;
            }
            float f7 = (GameThread.upgradeHeroUnitSelectPos * 255) + 45 + i2;
            float f8 = i3 + GAME_UPGRADE_HERO_SKILL_START_Y;
            drawSelectRedBox(f7, f8);
            drawUpgradeHeroDescription(f7 + 30.0f, f8, GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos);
            uiUpheroImage[GameThread.upgradeHeroUpgradeSelectPos].drawAtPointOption(97.0f, 387.0f, 18);
            setFontSize(20);
            setFontColor(-2560);
            drawStringM(DataUpgradeHero.upgradeHeroName[GameThread.upgradeHeroUpgradeSelectPos], 183.0f, 384.0f, 18);
            setFontSize(18);
            setFontColor(-1);
            int i14 = DataUpgradeHero.upgradeHeroData[GameThread.upgradeHeroUpgradeSelectPos][0] * GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos];
            int i15 = DataUpgradeHero.upgradeHeroData[GameThread.upgradeHeroUpgradeSelectPos][0] * (GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos] + 1);
            drawStringM(String.format(DataUpgradeHero.upgradeHeroDescription[GameThread.upgradeHeroUpgradeSelectPos], Integer.valueOf(DataUpgradeHero.upgradeHeroData[GameThread.upgradeHeroUpgradeSelectPos][0])), 183.0f, 410.0f, 18);
            setFontSize(14);
            if (GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos] >= GameThread.getUpgradeHeroMax(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos)) {
                drawStringM(String.format("( MAX : %d )", Integer.valueOf(i14)), 183.0f, 435.0f, 18);
            } else {
                drawStringM(String.format("( %d > %d )", Integer.valueOf(i14), Integer.valueOf(i15)), 183.0f, 435.0f, 18);
            }
        }
        if (z) {
            TouchManager.swapTouchMap();
        }
    }

    public void touchCheck_GAME_UPGRADE_UNIT() {
        int i;
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            switch (checkTouchListStatus) {
                case 24:
                    GameThread.gameStatus = 11;
                    GameThread.playSound(15);
                    break;
                case 25:
                    if (GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] < GameThread.getUpgradeUnitMax(GameThread.upgradeUnitSelectPos) && GameThread.myHeroism >= (i = (DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][1] * ((GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] * DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][2]) + 100)) / 100)) {
                        GameThread.myHeroism -= i;
                        int[] iArr = GameThread.upgradeUnitValue;
                        int i2 = GameThread.upgradeUnitSelectPos;
                        iArr[i2] = iArr[i2] + 1;
                        GameThread.playSound(13);
                        int[] iArr2 = GameThread.awardDataValue;
                        iArr2[11] = iArr2[11] + 1;
                        if (GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] >= DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][3]) {
                            int[] iArr3 = GameThread.awardDataValue;
                            iArr3[12] = iArr3[12] + 1;
                        }
                        GameThread.recheckAwardData();
                        Config.saveAll(newTower);
                        GameThread.lastUpdateItemPos = GameThread.upgradeUnitSelectPos;
                        GameThread.lastUpdateItemViewDelay = 15;
                        break;
                    }
                    break;
                case 26:
                default:
                    GameThread.upgradeUnitSelectPos = checkTouchListStatus;
                    break;
                case 27:
                    GameThread.gameStatus = 13;
                    GameThread.gameSubStatus = 0;
                    GameThread.upgradeHeroUpgradeSelectPos = 0;
                    GameThread.upgradeHeroUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                    break;
                case 28:
                    GameThread.upgradeUnitSelectPos %= 6;
                    break;
                case 29:
                    GameThread.upgradeUnitSelectPos = (GameThread.upgradeUnitSelectPos % 6) + 6;
                    break;
                case 30:
                    GameThread.upgradeUnitSelectPos = (GameThread.upgradeUnitSelectPos % 6) + 12;
                    break;
                case 31:
                    GameThread.upgradeUnitSelectPos = (GameThread.upgradeUnitSelectPos % 6) + 18;
                    break;
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_UPGRADE_HERO() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            switch (checkTouchListStatus) {
                case 60:
                    GameThread.gameStatus = 11;
                    GameThread.playSound(15);
                    break;
                case 61:
                    if (GameThread.heroUnitType[GameThread.upgradeHeroUnitSelectPos] != -1 && GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos] < GameThread.getUpgradeHeroMax(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos) && GameThread.myHeroism >= GameThread.getUpgradeHeroHeroism(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos)) {
                        GameThread.myHeroism -= GameThread.getUpgradeHeroHeroism(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos);
                        int[] iArr = GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos];
                        int i = GameThread.upgradeHeroUpgradeSelectPos;
                        iArr[i] = iArr[i] + 1;
                        int[] iArr2 = GameThread.awardDataValue;
                        iArr2[11] = iArr2[11] + 1;
                        if (GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos] >= DataUpgradeHero.upgradeHeroData[GameThread.upgradeHeroUpgradeSelectPos][3]) {
                            int[] iArr3 = GameThread.awardDataValue;
                            iArr3[12] = iArr3[12] + 1;
                        }
                        GameThread.recheckAwardData();
                        Config.saveAll(newTower);
                        GameThread.playSound(13);
                        GameThread.lastUpdateItemPos = (GameThread.upgradeHeroUnitSelectPos * 6) + GameThread.upgradeHeroUpgradeSelectPos;
                        GameThread.lastUpdateItemViewDelay = 15;
                        break;
                    }
                    break;
                case 62:
                    GameThread.gameStatus = 12;
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                    break;
                case 63:
                case 64:
                default:
                    GameThread.playSound(14);
                    int i2 = checkTouchListStatus - 40;
                    GameThread.upgradeHeroUnitSelectPos = i2 / 6;
                    GameThread.upgradeHeroUpgradeSelectPos = i2 % 6;
                    break;
                case 65:
                    GameThread.upgradeHeroUnitSelectPos = 0;
                    break;
                case 66:
                    GameThread.upgradeHeroUnitSelectPos = 1;
                    break;
                case 67:
                    GameThread.upgradeHeroUnitSelectPos = 2;
                    break;
            }
        }
        TouchManager.processTouchStatus();
    }
}
