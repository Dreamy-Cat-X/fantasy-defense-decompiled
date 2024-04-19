package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
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
    public static final int GAME_UPGRADE_HERO_SKILL_START_Y = 220;
    public static final int[] uiUpunitResource = {R.drawable.ui_upunit_warrior0, R.drawable.ui_upunit_warrior1, R.drawable.ui_upunit_warrior2, R.drawable.ui_upunit_warrior3, R.drawable.ui_upunit_warrior4, R.drawable.ui_upunit_warrior5, R.drawable.ui_upunit_archer0, R.drawable.ui_upunit_archer1, R.drawable.ui_upunit_archer2, R.drawable.ui_upunit_archer3, R.drawable.ui_upunit_archer4, R.drawable.ui_upunit_archer5, R.drawable.ui_upunit_wizard0, R.drawable.ui_upunit_wizard1, R.drawable.ui_upunit_wizard2, R.drawable.ui_upunit_wizard3, R.drawable.ui_upunit_wizard4, R.drawable.ui_upunit_wizard5};
    public static final int[] uiUpheroResource = {R.drawable.ui_uphero_up0, R.drawable.ui_uphero_up1, R.drawable.ui_uphero_up2, R.drawable.ui_uphero_up3, R.drawable.ui_uphero_up4, R.drawable.ui_uphero_up5};
    public static final int[] numberUpgradeResource = {R.drawable.num_upgrade_0, R.drawable.num_upgrade_1, R.drawable.num_upgrade_2, R.drawable.num_upgrade_3, R.drawable.num_upgrade_4, R.drawable.num_upgrade_5, R.drawable.num_upgrade_6, R.drawable.num_upgrade_7, R.drawable.num_upgrade_8, R.drawable.num_upgrade_9, R.drawable.num_upgrade_slash};
    public static final int[] uiUpgradeResource = {R.drawable.ui_upgrade_btnherooff, R.drawable.ui_upgrade_btnheroon, R.drawable.ui_upgrade_btnunitoff, R.drawable.ui_upgrade_btnuniton, R.drawable.ui_upgrade_titlehero, R.drawable.ui_upgrade_titleunit, R.drawable.ui_upgrade_basehero, R.drawable.ui_upgrade_baseunit, R.drawable.ui_upgrade_tabherooff, R.drawable.ui_upgrade_tabheroon, R.drawable.ui_upgrade_tabunitoff, R.drawable.ui_upgrade_tabuniton, R.drawable.ui_upgrade_baseblack, R.drawable.ui_upgrade_btnupgradeoff, R.drawable.ui_upgrade_btnupgradeon, R.drawable.ui_upgrade_max, R.drawable.ui_upgrade_iconselectn, R.drawable.ui_upgrade_iconselecta, R.drawable.ui_upgrade_uprightbar};
    public static final int upgrade_btnherooff = 0, upgrade_btnheroon = 1, upgrade_btnunitoff = 2, upgrade_btnuniton = 3, upgrade_titlehero = 4, upgrade_titleunit = 5, upgrade_basehero = 6,
            upgrade_baseunit = 7, upgrade_tabherooff = 8, upgrade_tabheroon = 9, upgrade_tabunitoff = 10, upgrade_tabuniton = 11, upgrade_baseblack = 12, upgrade_btnupgradeoff = 13,
            upgrade_btnupgradeon = 14, upgrade_max = 15, upgrade_iconselectn = 16, upgrade_iconselecta = 17, upgrade_uprightbar = 18;
    public final Texture2D[] uiUpgradeImage = new Texture2D[uiUpgradeResource.length], numberUpgradeImage = new Texture2D[numberUpgradeResource.length];
    public final Texture2D[] shopImages = new Texture2D[3], numberHeroismImage = new Texture2D[MenuPage.numberHeroismResource.length];
    public final Texture2D[] uiUpunitImage = new Texture2D[uiUpunitResource.length], uiUpheroImage = new Texture2D[uiUpheroResource.length];
    private final Texture2D heroismImage = new Texture2D(R.drawable.etc_heroism);

    public boolean hero;
    public int lastUpdateItemViewDelay = 0, lastUpdateItemPos = 0, upgradeUnitSelectPos = 0;

    public UpgradePage(TPage par, int isHero) {
        super(par);
        hero = isHero == 1;
    }

    @Override
    public void load(Consumer<Float> prog) {
        int tot = uiUpgradeImage.length + numberUpgradeImage.length + numberHeroismImage.length + uiUpunitImage.length + uiUpheroImage.length + 3;
        loadP(uiUpgradeImage, uiUpgradeResource, prog, 1, tot);
        loadP(numberUpgradeImage, numberUpgradeResource, prog, uiUpgradeImage.length + 1, tot);
        loadP(numberHeroismImage, MenuPage.numberHeroismResource, prog, uiUpgradeImage.length + numberUpgradeImage.length + 1, tot);
        loadP(uiUpunitImage, uiUpunitResource, prog, uiUpgradeImage.length + numberUpgradeImage.length + numberHeroismImage.length + 1, tot);
        loadP(uiUpheroImage, uiUpheroResource, prog, uiUpgradeImage.length + numberUpgradeImage.length + numberHeroismImage.length + uiUpunitImage.length + 1, tot);
        shopImages[0] = new Texture2D(ShopPage.uiShopResource[ShopPage.shop_underbar]); //Inventory img
        shopImages[1] = new Texture2D(ShopPage.uiShopResource[ShopPage.shop_btnbackoff]);
        shopImages[2] = new Texture2D(ShopPage.uiShopResource[ShopPage.shop_btnbackon]);
        if (prog != null)
            prog.accept(1f);
        loaded = true;
    }

    @Override
    public void unload() {
        for (Texture2D img : uiUpgradeImage)
            img.dealloc();
        for (Texture2D img : numberUpgradeImage)
            img.dealloc();
        for (Texture2D img : numberHeroismImage)
            img.dealloc();
        for (Texture2D img : uiUpunitImage)
            img.dealloc();
        for (Texture2D img : uiUpheroImage)
            img.dealloc();
        shopImages[0].dealloc();
        shopImages[1].dealloc();
        shopImages[2].dealloc();
        heroismImage.dealloc();
        loaded = false;
    }

    @Override
    public void update() {
        if (lastUpdateItemViewDelay > 0)
            lastUpdateItemViewDelay--;
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        int cTLS = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(25, CGRect.CGRectMake(680.0f, 367.0f, 100.0f, 100.0f));
            TouchManager.addTouchRectListData(24, CGRect.CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
            TouchManager.addTouchRectListData(27, CGRect.CGRectMake(21.0f, 8.0f, 38.0f, 48.0f));
            for (int i = 0; i < 18; i++) {
                if (hero && !DataStage.heroAvail[i / 6])
                    break;
                int perc = i % 6, xpos = (perc % 3) * 70, ypos = perc < 3 ? 0 : 70;
                TouchManager.addTouchRectListData(i, CGRect.CGRectMake(((i / 6) * 255) + 45 + xpos, ypos + GAME_UPGRADE_HERO_SKILL_START_Y, 60.0f, 60.0f));
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 32;
            cTLS = TouchManager.checkTouchListStatus();
        }
        parent.parent.paint(gl10, false);

        shopImages[cTLS == 24 ? 2 : 1].drawAtPointOption(11.0f, 356.0f, 18);
        uiUpgradeImage[hero ? cTLS == 27 ? upgrade_tabuniton : upgrade_tabunitoff :
                cTLS == 27 ? upgrade_tabheroon : upgrade_tabherooff].drawAtPointOption(21.0f, 8.0f, 18);
        uiUpgradeImage[hero ? upgrade_titlehero : upgrade_titleunit].drawAtPointOption(66.0f, 5.0f, 18);
        uiUpgradeImage[hero ? upgrade_basehero : upgrade_baseunit].drawAtPointOption(20.0f, 60.0f, 18);

        byte[][] sUpgrades = hero ? Config.heroUpgrades : Config.unitUpgrades;
        for (int I = 0; I < 3; I++)
            if (!hero || DataStage.heroAvail[I]) {
                for (int j = 0; j < 6; j++) {
                    float tx = (I * 255f) + 45 + ((j % 3) * 70);
                    float ty = (j < 3 ? 0 : 70) + GAME_UPGRADE_HERO_SKILL_START_Y + 43.0f;
                    if (sUpgrades[I][j] == getUpgradeMax()) { //DataUpgradeUnit.upgradeUnitData[k][3] = 10 in every single instance. Least useless variable
                        uiUpgradeImage[upgrade_max].drawAtPointOption(tx + 30.0f, ty, 17);
                    } else {
                        numberUpgradeImage[10].drawAtPointOption(30.0f + tx, ty, 17);
                        GameRenderer.drawNumberBlock(sUpgrades[I][j], numberUpgradeImage, tx + 15.0f, ty, -2, 17, 1);
                        GameRenderer.drawNumberBlock(getUpgradeMax(), numberUpgradeImage, tx + 45.0f, ty, -2, 17, 1);
                    }
                }
            } else {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.setColors(0.5f);
                fillBlackImage.fillRect((I * 255) + 21, 61.0f, 248.0f, 298.0f);
                Texture2D.setColors(1);
                GameRenderer.setFontColor(-1);
                GameRenderer.drawStringDoubleM(HeroUnit.getUnlock(I), 149.0f + (I * 255), 284.0f, 17);
            }
        uiUpgradeImage[upgrade_uprightbar].drawAtPointOption(572.0f, 8.0f, 18);
        GameRenderer.drawNumberBlock(Config.heroPoints, numberHeroismImage, 779.0f, 24.0f, 1, 20, 1);
        shopImages[0].drawAtPointOption(72.0f, 362.0f, 18);
        uiUpgradeImage[cTLS == 61 ? upgrade_btnupgradeon : upgrade_btnupgradeoff].drawAtPointOption(680.0f, 367.0f, 18);

        uiUpgradeImage[upgrade_baseblack].drawAtPointOption(96.0f, 386.0f, 18);
        if (lastUpdateItemViewDelay > 0) {
            float rX = ((lastUpdateItemPos / 6) * 255) + 45 + ((lastUpdateItemPos % 3) * 70);
            float rY = (lastUpdateItemPos % 6 < 3 ? 0 : 70) + GAME_UPGRADE_HERO_SKILL_START_Y;
            float alpha = lastUpdateItemViewDelay * 0.066f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.setColors(alpha);
            fillWhiteImage.fillRect(rX, rY, 60.0f, 60.0f);
            Texture2D.setColors(1);
        }
        int sPos = hero ? upgradeUnitSelectPos % 6 : upgradeUnitSelectPos;
        float boxX = ((upgradeUnitSelectPos / 6) * 255) + 45 + ((sPos % 3) * 70);
        float boxY = (sPos % 6 < 3 ? 0 : 70) + GAME_UPGRADE_HERO_SKILL_START_Y;
        drawSelectRedBox(boxX, boxY);
        drawUpgradeDescription(boxX + 30.0f, boxY, upgradeUnitSelectPos / 6, sPos);

        if (hero)
            uiUpheroImage[upgradeUnitSelectPos % 6].drawAtPointOption(97.0f, 387.0f, 18);
        else
            uiUpunitImage[upgradeUnitSelectPos].drawAtPointOption(97.0f, 387.0f, 18);
        GameRenderer.setFontSize(20);
        GameRenderer.setFontColor(-2560);
        if (hero)
            GameRenderer.drawStringM(DataUpgradeHero.upgradeHeroName[upgradeUnitSelectPos % 6], 183.0f, 384.0f, 18);
        else
            GameRenderer.drawStringM(DataUpgradeUnit.upgradeUnitName[upgradeUnitSelectPos], 183.0f, 384.0f, 18);
        GameRenderer.setFontSize(18);
        GameRenderer.setFontColor(-1);
        int lvE;
        int nexE;

        if (hero) {
            GameRenderer.drawStringM(String.format(DataUpgradeHero.upgradeHeroDescription[sPos], DataUpgradeHero.upgradeHeroData[sPos][0]), 183.0f, 410.0f, 18);
            lvE = DataUpgradeHero.upgradeHeroData[sPos][0] * sUpgrades[upgradeUnitSelectPos / 6][sPos];
            nexE = lvE + DataUpgradeHero.upgradeHeroData[sPos][0];
        } else {
            GameRenderer.drawStringM(String.format(DataUpgradeUnit.upgradeUnitDescription[sPos], DataUpgradeUnit.upgradeUnitData[sPos][0]), 183.0f, 410.0f, 18);
            lvE = DataUpgradeUnit.upgradeUnitData[sPos][0] * sUpgrades[upgradeUnitSelectPos / 6][sPos];
            nexE = lvE + DataUpgradeUnit.upgradeUnitData[sPos][0];
        }
        GameRenderer.setFontSize(14);
        if (sUpgrades[upgradeUnitSelectPos / 6][sPos] >= getUpgradeMax())
            GameRenderer.drawStringM(String.format("( MAX : %d )", lvE), 183.0f, 435.0f, 18);
        else
            GameRenderer.drawStringM(String.format("( %d > %d )", lvE, nexE), 183.0f, 435.0f, 18);
        if (init)
            TouchManager.swapTouchMap();
    }

    public int getUpgradeMax() {
        int lbreak = !hero ? Config.limitBreak * 5 : 0;
        if (Config.rewardValues[5])
            return 10 + lbreak;
        return 5 + lbreak;
    }

    public void drawSelectRedBox(float x, float y) {
        uiUpgradeImage[upgrade_iconselectn].drawAtPointOption(x - 11.0f, (-11.0f) + y, 18);
        float xw = x - 2f;
        float ty = (GameThread.gameTimeCount % 109) + y - 49f;
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(xw, y - 2f, 64f, 2f));
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(xw, y + 60f, 64f, 2f));
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(xw, y, 2f, 60f));
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(x + 60f, y, 2f, 60f));
    }

    public void drawUpgradeDescription(float x, float y, int unI, int upgI) {
        GameRenderer.setFontSize(17);
        String name = hero ? DataUpgradeHero.upgradeHeroName[upgI] : DataUpgradeUnit.upgradeUnitName[(unI * 6) + upgI];
        GameRenderer.drawFont.getTextBounds(name, 0, name.length(), Texture2D.bounds_);
        int bound = Texture2D.bounds_.right - Texture2D.bounds_.left;
        int upgradeUnitHeroism = getUpgradeCost(unI, upgI);
        int bound2 = 0;
        if (upgradeUnitHeroism > -1) {
            GameRenderer.setFontSize(12);
            String format = String.format("%d", upgradeUnitHeroism);
            GameRenderer.drawFont.getTextBounds(format, 0, format.length(), Texture2D.bounds_);
            bound2 = Texture2D.bounds_.right - Texture2D.bounds_.left;
        }
        GameRenderer.setFontSize(14);
        int eff = hero ? DataUpgradeHero.upgradeHeroData[upgI][0] : DataUpgradeUnit.upgradeUnitData[(unI * 6) + upgI][0];
        String desc = hero ? DataUpgradeHero.upgradeHeroDescription[upgI] : DataUpgradeUnit.upgradeUnitDescription[(unI * 6) + upgI];
        String format2 = String.format(desc, eff);
        GameRenderer.drawFont.getTextBounds(format2, 0, format2.length(), Texture2D.bounds_);
        int rbound = Math.max((Texture2D.bounds_.right - Texture2D.bounds_.left) + 28, bound + bound2 + 65);
        float xbound = x - (rbound / 2);
        float ry = y - 73.0f;
        GameRenderer.drawLeftRightBox(xbound, ry, rbound); //TODO - Load TestBoxImg
        GameRenderer.setFontColor(-68096);
        GameRenderer.setFontSize(17);
        GameRenderer.drawStringM(name, xbound + 14.0f, ry + 14.0f, 18);
        GameRenderer.setFontColor(-1);
        if (upgradeUnitHeroism > -1) {
            float xrbound = xbound + rbound;
            heroismImage.drawAtPointOption((xrbound - bound2) - 40.0f, ry + 12.0f, 18);
            GameRenderer.setFontSize(12);
            GameRenderer.drawStringM(String.format("%d", upgradeUnitHeroism), xrbound - 17.0f, ry + 18.0f, 20);
        }
        GameRenderer.setFontSize(14);
        GameRenderer.drawStringM(String.format(desc, eff), xbound + (rbound / 2), ry + 34.0f, 17);
    }

    public int getUpgradeCost(int i, int j) {
        if (hero) {
            if (!DataStage.heroAvail[i] || (Config.heroUpgrades[i][j] >= getUpgradeMax()))
                return -1;
            return DataUpgradeHero.upgradeHeroData[j][1] * (Config.heroUpgrades[i][j] + 1);
        }
        if (Config.unitUpgrades[i][j] >= getUpgradeMax())
            return -1;
        return DataUpgradeUnit.upgradeUnitData[i][1] * (Config.unitUpgrades[i][2] + 1);
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus < 0)
            return;
        if (checkTouchListStatus <= 18) {
            upgradeUnitSelectPos = checkTouchListStatus;
        } else {
            switch (checkTouchListStatus) {
                case 24:
                    GameThread.playSound(15);
                    NewTower.switchPage(parent, true);
                    break;
                case 25:
                    byte[] upgrades = hero ? Config.heroUpgrades[upgradeUnitSelectPos / 6] : Config.unitUpgrades[upgradeUnitSelectPos / 6];
                    int pos = upgradeUnitSelectPos % 6;
                    int price = getUpgradeCost(upgradeUnitSelectPos / 6, pos);
                    if (Config.heroPoints > price) {
                        Config.heroPoints -= price;
                        upgrades[pos]++;
                        GameThread.playSound(13);
                        DataAward.check_upgrade();
                        Config.saveAll();
                        lastUpdateItemPos = upgradeUnitSelectPos;
                        lastUpdateItemViewDelay = 15;
                        break;
                    }
                    break;
                case 27:
                    hero = !hero;
                    upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    lastUpdateItemViewDelay = 0;
                    break;
            }
        }
    }
}
