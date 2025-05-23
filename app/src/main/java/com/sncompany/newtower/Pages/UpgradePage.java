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
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class UpgradePage extends TPage {

    private static final int BACK = 18, UPGRADE = 19, TOGGLE_HERO = 20, TOT = 21;
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
        load(null);
    }

    @Override
    public void load(Consumer<Float> prog) {
        int tot = uiUpgradeImage.length + numberUpgradeImage.length + numberHeroismImage.length + uiUpunitImage.length + uiUpheroImage.length + 3;
        loadP(uiUpgradeImage, uiUpgradeResource, prog, 1, tot);
        loadP(numberUpgradeImage, numberUpgradeResource, prog, uiUpgradeImage.length + 1, tot);
        loadP(numberHeroismImage, MenuPage.numberHeroismResource, prog, uiUpgradeImage.length + numberUpgradeImage.length + 1, tot);
        loadP(uiUpunitImage, uiUpunitResource, prog, uiUpgradeImage.length + numberUpgradeImage.length + numberHeroismImage.length + 1, tot);
        loadP(uiUpheroImage, uiUpheroResource, prog, uiUpgradeImage.length + numberUpgradeImage.length + numberHeroismImage.length + uiUpunitImage.length + 1, tot);
        shopImages[0] = new Texture2D(ShopPage.uiShopResource[ShopPage.underbar]); //Inventory img
        shopImages[1] = new Texture2D(ShopPage.uiShopResource[ShopPage.btnbackoff]);
        shopImages[2] = new Texture2D(ShopPage.uiShopResource[ShopPage.btnbackon]);
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
            TouchManager.addTouchRectListData(UPGRADE, CGRect.make(680, 367, 100, 100));
            TouchManager.addTouchRectListData(BACK, CGRect.make(11, 362, 68, 114));
            TouchManager.addTouchRectListData(TOGGLE_HERO, CGRect.make(21, 8, 38, 48));
            for (int i = 0; i < BACK; i++) {
                if (hero && !DataStage.heroAvail[i / 6])
                    break;
                int perc = i % 6, xpos = (perc % 3) * 70, ypos = perc < 3 ? 0 : 70;
                TouchManager.addTouchRectListData(i, CGRect.make(((i / 6) * 255) + 45 + xpos, ypos + GAME_UPGRADE_HERO_SKILL_START_Y, 60, 60));
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TOT;
            cTLS = TouchManager.checkTouchListStatus();
        }

        shopImages[cTLS == BACK ? 2 : 1].drawAtPointOption(11, 356, 18);
        uiUpgradeImage[hero ? cTLS == TOGGLE_HERO ? upgrade_tabuniton : upgrade_tabunitoff :
                cTLS == TOGGLE_HERO ? upgrade_tabheroon : upgrade_tabherooff].drawAtPointOption(21, 8, 18);
        uiUpgradeImage[hero ? upgrade_titlehero : upgrade_titleunit].drawAtPointOption(66, 5, 18);
        uiUpgradeImage[hero ? upgrade_basehero : upgrade_baseunit].drawAtPointOption(20, 60, 18);

        byte[][] sUpgrades = hero ? Config.s.heroUpgrades : Config.s.unitUpgrades;
        for (int I = 0; I < 3; I++)
            if (!hero || DataStage.heroAvail[I]) {
                for (int j = 0; j < 6; j++) {
                    float tx = (I * 255f) + 45 + ((j % 3) * 70);
                    float ty = (j < 3 ? 0 : 70) + GAME_UPGRADE_HERO_SKILL_START_Y + 43;
                    if (sUpgrades[I][j] == getUpgradeMax()) { //DataUpgradeUnit.upgradeUnitData[k][3] = 10 in every single instance. Least useless variable
                        uiUpgradeImage[upgrade_max].drawAtPointOption(tx + 30, ty, 17);
                    } else {
                        numberUpgradeImage[10].drawAtPointOption(30 + tx, ty, 17);
                        GameRenderer.drawNumberBlock(sUpgrades[I][j], numberUpgradeImage, tx + 15, ty, -2, 17, 1);
                        GameRenderer.drawNumberBlock(getUpgradeMax(), numberUpgradeImage, tx + 45, ty, -2, 17, 1);
                    }
                }
            } else {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(0.5f);
                fillBlackImage.fillRect((I * 255) + 21, 61, 248, 298);
                Texture2D.setColors(1);
                GameRenderer.setFontColor(-1);
                GameRenderer.drawStringDoubleM(HeroUnit.getUnlock(I), 149 + (I * 255), 284, 17);
            }
        uiUpgradeImage[upgrade_uprightbar].drawAtPointOption(572, 8, 18);
        GameRenderer.drawNumberBlock(Config.s.heroPoints, numberHeroismImage, 779, 24, 1, 20, 1);
        shopImages[0].drawAtPointOption(72, 362, 18);
        uiUpgradeImage[cTLS == UPGRADE ? upgrade_btnupgradeon : upgrade_btnupgradeoff].drawAtPointOption(680, 367, 18);

        uiUpgradeImage[upgrade_baseblack].drawAtPointOption(96, 386, 18);
        if (lastUpdateItemViewDelay > 0) {
            float rX = ((lastUpdateItemPos / 6) * 255) + 45 + ((lastUpdateItemPos % 3) * 70);
            float rY = (lastUpdateItemPos % 6 < 3 ? 0 : 70) + GAME_UPGRADE_HERO_SKILL_START_Y;
            float alpha = lastUpdateItemViewDelay * 0.066f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(alpha);
            fillWhiteImage.fillRect(rX, rY, 60, 60);
            Texture2D.setColors(1);
        }
        int sPos = upgradeUnitSelectPos % 6;
        float boxX = ((upgradeUnitSelectPos / 6) * 255) + 45 + ((sPos % 3) * 70);
        float boxY = (sPos % 6 < 3 ? 0 : 70) + GAME_UPGRADE_HERO_SKILL_START_Y;
        drawSelectRedBox(boxX, boxY);
        drawUpgradeDescription(boxX + 30, boxY, upgradeUnitSelectPos / 6, sPos);

        if (hero)
            uiUpheroImage[upgradeUnitSelectPos % 6].drawAtPointOption(97, 387, 18);
        else
            uiUpunitImage[upgradeUnitSelectPos].drawAtPointOption(97, 387, 18);
        GameRenderer.setFontSize(20);
        GameRenderer.setFontColor(-2560);
        GameRenderer.drawStringM(GameThread.getString(hero ? DataUpgradeHero.upgradeHeroName[upgradeUnitSelectPos % 6] : DataUpgradeUnit.upgradeUnitName[upgradeUnitSelectPos]), 183, 384, 18);
        GameRenderer.setFontSize(18);
        GameRenderer.setFontColor(-1);
        int lvE;
        int nexE;

        if (hero) {
            GameRenderer.drawStringM(String.format(GameThread.getString(DataUpgradeHero.upgradeHeroDescription[sPos]), DataUpgradeHero.upgradeHeroData[sPos][0]), 183, 410, 18);
            lvE = DataUpgradeHero.upgradeHeroData[sPos][0] * sUpgrades[upgradeUnitSelectPos / 6][sPos];
            nexE = lvE + DataUpgradeHero.upgradeHeroData[sPos][0];
        } else {
            GameRenderer.drawStringM(String.format(GameThread.getString(DataUpgradeUnit.upgradeUnitDescription[sPos]), DataUpgradeUnit.upgradeUnitData[sPos][0]), 183, 410, 18);
            lvE = DataUpgradeUnit.upgradeUnitData[sPos][0] * sUpgrades[upgradeUnitSelectPos / 6][sPos];
            nexE = lvE + DataUpgradeUnit.upgradeUnitData[sPos][0];
        }
        GameRenderer.setFontSize(14);
        if (sUpgrades[upgradeUnitSelectPos / 6][sPos] >= getUpgradeMax())
            GameRenderer.drawStringM(String.format("( " + GameThread.getString(R.string.max_lv) + " : %d )", lvE), 183, 435, 18);
        else
            GameRenderer.drawStringM(String.format("( %d > %d )", lvE, nexE), 183, 435, 18);
        if (init)
            TouchManager.swapTouchMap();
    }

    public int getUpgradeMax() {
        int lbreak = !hero ? Config.s.limitBreak * 5 : 0;
        if (Config.s.rewardValues[5])
            return 10 + lbreak;
        return 5 + lbreak;
    }

    public void drawSelectRedBox(float x, float y) {
        uiUpgradeImage[upgrade_iconselectn].drawAtPointOption(x - 11, (-11) + y, 18);
        float xw = x - 2f;
        float ty = (GameThread.gameTimeCount % 109) + y - 49f;
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.make(xw, y - 2f, 64f, 2f));
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.make(xw, y + 60f, 64f, 2f));
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.make(xw, y, 2f, 60f));
        uiUpgradeImage[upgrade_iconselecta].drawAtPointOptionGuide(xw, ty, 18, CGRect.make(x + 60f, y, 2f, 60f));
    }

    public void drawUpgradeDescription(float x, float y, int unI, int upgI) {
        GameRenderer.setFontSize(17);
        String name = GameThread.getString(hero ? DataUpgradeHero.upgradeHeroName[upgI] : DataUpgradeUnit.upgradeUnitName[(unI * 6) + upgI]);
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
        String desc = GameThread.getString(hero ? DataUpgradeHero.upgradeHeroDescription[upgI] : DataUpgradeUnit.upgradeUnitDescription[(unI * 6) + upgI]);
        String format2 = String.format(desc, eff);
        GameRenderer.drawFont.getTextBounds(format2, 0, format2.length(), Texture2D.bounds_);
        int rbound = Math.max((Texture2D.bounds_.right - Texture2D.bounds_.left) + 28, bound + bound2 + 65);
        float xbound = x - (rbound / 2);
        float ry = y - 73;
        GameRenderer.drawLeftRightBox(xbound, ry, rbound); //TODO - Load TestBoxImg
        GameRenderer.setFontColor(-68096);
        GameRenderer.setFontSize(17);
        GameRenderer.drawStringM(name, xbound + 14, ry + 14, 18);
        GameRenderer.setFontColor(-1);
        if (upgradeUnitHeroism > -1) {
            float xrbound = xbound + rbound;
            heroismImage.drawAtPointOption((xrbound - bound2) - 40, ry + 12, 18);
            GameRenderer.setFontSize(12);
            GameRenderer.drawStringM(String.format("%d", upgradeUnitHeroism), xrbound - 17, ry + 18, 20);
        }
        GameRenderer.setFontSize(14);
        GameRenderer.drawStringM(String.format(desc, eff), xbound + (rbound / 2), ry + 34, 17);
    }

    public int getUpgradeCost(int i, int j) {
        if (hero) {
            if (!DataStage.heroAvail[i] || (Config.s.heroUpgrades[i][j] >= getUpgradeMax()))
                return -1;
            return DataUpgradeHero.upgradeHeroData[j][1] * (Config.s.heroUpgrades[i][j] + 1);
        }
        if (Config.s.unitUpgrades[i][j] >= getUpgradeMax())
            return -1;
        return DataUpgradeUnit.upgradeUnitData[(i * 6) + j][1] * (Config.s.unitUpgrades[i][j] + 1);
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus < 0)
            return;
        if (checkTouchListStatus < BACK) {
            upgradeUnitSelectPos = checkTouchListStatus;
        } else {
            switch (checkTouchListStatus) {
                case BACK:
                    GameThread.playSound(15);
                    ((MenuPage)parent.parent).child = parent;
                    unload();
                    break;
                case UPGRADE:
                    byte[] upgrades = hero ? Config.s.heroUpgrades[upgradeUnitSelectPos / 6] : Config.s.unitUpgrades[upgradeUnitSelectPos / 6];
                    int pos = upgradeUnitSelectPos % 6;
                    int price = getUpgradeCost(upgradeUnitSelectPos / 6, pos);
                    if (price != -1 && Config.s.heroPoints > price) {
                        Config.s.heroPoints -= price;
                        upgrades[pos]++;
                        GameThread.playSound(13);
                        DataAward.check_upgrade();
                        Config.saveFile();
                        lastUpdateItemPos = upgradeUnitSelectPos;
                        lastUpdateItemViewDelay = 15;
                        break;
                    }
                    break;
                case TOGGLE_HERO:
                    hero = !hero;
                    upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    lastUpdateItemViewDelay = 0;
                    break;
            }
        }
    }
}
