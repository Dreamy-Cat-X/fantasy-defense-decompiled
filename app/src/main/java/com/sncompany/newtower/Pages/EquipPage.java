package com.sncompany.newtower.Pages;

import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public class EquipPage extends TPage {

    public static final int GAME_SHOP_EQUIP_SKILL_START_X = 203;
    public static final int GAME_SHOP_EQUIP_SKILL_START_Y = 224;
    static final float GAME_SHOP_EQUIP_MOVING_ALPHA = 0.8f;
    protected final InventoryTable inventory;
    public final ShopPage shopP;
    private final HeroUnit[] heroes = new HeroUnit[Config.s.heroEquips.length];
    public int selectedHero = -1, selectedHeroEquip = -1;
    public static int touchStart_GAME_SHOP_EQUIP_NUM;
    public static final int BACK = 15, SHOP = 16, L_ARROW = 17, R_ARROW = 18, SELL = 19, MIN_HERO = 9, MIN_LOCK = 20, TOTAL = MIN_LOCK + 3;

    public EquipPage(TPage par) {
        this(par, null);
    }

    public EquipPage(TPage par, ShopPage shop) {
        super(par);
        inventory = shop == null ? new InventoryTable(this) : shop.inventory;
        shopP = shop == null ? new ShopPage(par, this) : shop;
        setEquipHeroSetting();
    }

    @Override
    public void load(Consumer<Float> prog) {
        inventory.load(prog);
        loaded = true;
        if (!shopP.loaded)
            shopP.load(prog);
    }

    @Override
    public void unload() {
        inventory.unload();
        loaded = false;
        if (shopP.loaded)
            shopP.unload();
    }

    @Override
    public void update() {
        if (!loaded)
            load(null);//Can't be set to constructor because shopPage
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        int cTLS = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(BACK, CGRect.make(11, 362, 68, 114));
            if (inventory.shopShopInventorySelectPos >= 0)
                TouchManager.addTouchRectListData(SELL, CGRect.make(711, 381, 68, 78)); //sell
            TouchManager.addTouchRectListData(SHOP, CGRect.make(16, 8, 46, 49));
            TouchManager.addTouchRectListData(L_ARROW, CGRect.make(81, 397, 47, 48));
            TouchManager.addTouchRectListData(R_ARROW, CGRect.make(672, 397, 47, 48));
            for (int j = 0; j < heroes.length * 2; j += 2) {
                if (Config.s.rewardValues[j]) {
                    float jd = 203 + (j * 127.5f); //The distance per block is 255 and 127.5 if half of that. 203 is initial value
                    TouchManager.addTouchRectListData(MIN_HERO + j, CGRect.make(jd, 224, 60f, 60f));
                    TouchManager.addTouchRectListData(MIN_HERO + 1 + j, CGRect.make(jd, 293, 60f, 60f));
                } else
                    TouchManager.addTouchRectListData(MIN_LOCK + (j / 2), CGRect.make(109, 174, 100, 120));
            }
            inventory.addTouch();
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TOTAL;
            cTLS = TouchManager.checkTouchListStatus();
        }
        shopP.uiShopImage[ShopPage.titleequip].drawAtPointOption(66f, 5f, 18);
        shopP.uiShopImage[cTLS == SHOP ? ShopPage.tabshopon : ShopPage.tabshopoff].drawAtPointOption(40f, 9f, 17);
        shopP.uiShopImage[cTLS == BACK ? ShopPage.btnbackon : ShopPage.btnbackoff].drawAtPointOption(11f, 356f, 18);

        shopP.upImg.drawAtPointOption(572f, 8f, 18);
        GameRenderer.drawNumberBlock(Config.s.heroPoints, shopP.numberHeroismImage, 779f, 24f, 1, 20, 1);
        for (int j = 0; j < heroes.length; j++)
            shopP.uiShopImage[ShopPage.herobase].drawAtPointOption(20f + (j * 255), 60f, 18);

        byte[] heq = null;
        if (selectedHero >= 0 && selectedHeroEquip >= 0) {
            heq = Config.s.heroEquips[selectedHero][selectedHeroEquip];
        } else if (inventory.shopShopInventorySelectPos >= 0)
            heq = Config.s.inventory[inventory.shopShopInventorySelectPos];

        GameRenderer.setFontSize(13);
        for (int j = 0; j < heroes.length; j++) {
            int pDis = (255 * j);
            shopP.uiShopImage[ShopPage.warriorbody + (j * 3)].drawAtPointOption(20f + pDis, 75f + (285 - shopP.uiShopImage[ShopPage.warriorbody +(j*3)]._sizeY), 18);
            if (Config.s.rewardValues[j * 2]) {
                shopP.uiShopImage[ShopPage.heroslot].drawAtPointOption(25f + pDis, 222f, 18);
                boolean avail = selectedHero == j && heq != null;
                if (avail && heq[0] == DataUpgradeItem.EQ_RING)
                    GameRenderer.setFontColor(-65536);
                else
                    GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(String.valueOf(heroes[j].getHitPower()), 167 + pDis, 257, 20);

                if (avail && heq[0] == DataUpgradeItem.EQ_BOOT) {
                    GameRenderer.setFontColor(-65536);
                } else
                    GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(heroes[j].towerCoolTimeMax <= 1 ? GameThread.getString(R.string.max) : String.valueOf(heroes[j].getAttackSpeed()), 167 + pDis, 284, 20);

                if (avail && heq[0] == DataUpgradeItem.EQ_AMLT) {
                    GameRenderer.setFontColor(-65536);
                } else
                    GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(String.valueOf(heroes[j].attackRange), 167 + pDis, 311, 20);
                GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(TowerUnit.getEffectTypeString(heroes[j].effectType), 167 + pDis, 338, 20);
            } else {
                shopP.uiShopImage[ShopPage.warriorshadow + (j * 3)].drawAtPointOption(19f + pDis, 74 + (287 - shopP.uiShopImage[ShopPage.warriorshadow +(j*3)]._sizeY), 18);
                shopP.uiShopImage[ShopPage.lock].drawAtPointOption(109f + pDis, 174f, 18);
                GameRenderer.setFontColor(-1);
                GameRenderer.drawStringDoubleM(HeroUnit.getUnlock(j), 149f + pDis, 284f, 17);
            }
            shopP.uiShopImage[ShopPage.warrioroutline + (j * 3)].drawAtPointOption(19f + pDis, 59f, 18);
        }
        for (int i9 = 0; i9 < heroes.length; i9++)
            for (int i10 = 0; i10 < Config.s.heroEquips[i9].length; i10++)
                if (Config.s.heroEquips[i9][i10] != null)
                    inventory.drawUpItemImage(Config.s.heroEquips[i9][i10], (i9 * 255) + GAME_SHOP_EQUIP_SKILL_START_X, (i10 * 69) + GAME_SHOP_EQUIP_SKILL_START_Y, 18);

        int i8 = cTLS != L_ARROW ? cTLS != R_ARROW ? cTLS != SELL ? 0 : 3 : 2 : 1;
        if (inventory.shopShopInventorySelectPos != -1 && Config.s.inventory[inventory.shopShopInventorySelectPos] != null) {
            float alpha;
            if (GameThread.gameTimeCount % 20 < 10)
                alpha = (GameThread.gameTimeCount % 20) * 0.1f;
            else
                alpha = 1 - ((GameThread.gameTimeCount % 10) * 0.1f);

            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(alpha);
            for (int j = 0; j < 3; j++) {
                if (Config.s.rewardValues[j * 2])
                    for (int i12 = 0; i12 < 2; i12++)
                        shopP.uiShopImage[ShopPage.glow].drawAtPointOption(((j * 255) + GAME_SHOP_EQUIP_SKILL_START_X) - 7, ((i12 * 69) + GAME_SHOP_EQUIP_SKILL_START_Y) - 7, 18);
            }
            Texture2D.setColors(1);
            inventory.drawInventoryWindow(72, 362, i8, true);
        } else
            inventory.drawInventoryWindow(72, 362, i8, false);

        CGPoint t = TouchManager.getFirstLastActionTouch();
        if (heq != null) {
            if (TouchManager.lastActionStatus == TouchManager.TOUCH_STATUS_START_INPUTED && t != TouchManager.emptyPosition) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(GAME_SHOP_EQUIP_MOVING_ALPHA);
                inventory.drawUpItemImage(heq, t.x, t.y - 25, 9);
                Texture2D.setColors(1f);
            } else if (selectedHero != -1)
                inventory.drawInvenItemDescription((selectedHero * 255) + GAME_SHOP_EQUIP_SKILL_START_X + 30, (selectedHeroEquip * 69) + GAME_SHOP_EQUIP_SKILL_START_Y, heq);
        }
        if (init)
            TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        int lastAction = TouchManager.lastActionStatus;
        if (lastAction == TouchManager.TOUCH_STATUS_NO_INPUT) {
            int cTLS = TouchManager.checkTouchListStatus();
            if (cTLS == -1) {
                touchStart_GAME_SHOP_EQUIP_NUM = -1;
            } else if (cTLS < MIN_HERO) {
                if (Config.s.inventory[inventory.getFirstInPage() + cTLS] != null)
                    touchStart_GAME_SHOP_EQUIP_NUM = cTLS;
                else
                    touchStart_GAME_SHOP_EQUIP_NUM = -1;
            } else if (cTLS < BACK) {
                int hT = cTLS - MIN_HERO;
                if (Config.s.heroEquips[hT / 2][hT % 2] != null)
                    touchStart_GAME_SHOP_EQUIP_NUM = cTLS;
                else
                    touchStart_GAME_SHOP_EQUIP_NUM = -1;
            } else
                touchStart_GAME_SHOP_EQUIP_NUM = -1;
        } else if (lastAction == TouchManager.TOUCH_STATUS_START_INPUTED) {
            CGPoint firstAct = TouchManager.getFirstFirstActionTouch();
            CGPoint lastAct = TouchManager.getFirstLastActionTouch();

            int cTLP = TouchManager.checkTouchListPressed(firstAct);
            if (cTLP != -1 && Math.abs(firstAct.x - lastAct.x) + Math.abs(firstAct.y - lastAct.y) >= 60)
                if (cTLP < MIN_HERO) {
                    int newP = inventory.getFirstInPage() + touchStart_GAME_SHOP_EQUIP_NUM;
                    if (touchStart_GAME_SHOP_EQUIP_NUM != -1 && Config.s.inventory[newP] != null)
                        inventory.shopShopInventorySelectPos = newP;
                    else
                        TouchManager.clearTouchMap();
                } else if (cTLP < BACK) {
                    int tP = cTLP - MIN_HERO, uni = tP / 2, eqi = tP % 2;
                    if (Config.s.heroEquips[uni][eqi] != null) {
                        selectedHero = uni;
                        selectedHeroEquip = eqi;
                    }
                }
        }
        if (lastAction != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int cTLS = TouchManager.checkTouchListStatus();
        if (cTLS == -1 || cTLS >= MIN_LOCK) {
            selectedHero = 0;
            selectedHeroEquip = 0;
        } else if (cTLS < MIN_HERO) {
            GameThread.playSound(14);
            inventory.shopShopInventorySelectPos = (inventory.shopShopInventorySelectPos - (inventory.shopShopInventorySelectPos % 8)) + (cTLS);
            return;
        } else if (cTLS < BACK) {
            if (inventory.shopShopInventorySelectPos >= 0 && Config.s.inventory[inventory.shopShopInventorySelectPos] != null) {
                GameThread.playSound(14);
                int rPos = cTLS - MIN_HERO;
                selectedHero = rPos / 2;
                selectedHeroEquip = rPos % 2;
                inventory.shopShopInventorySelectPos -= inventory.getSelectedInd();
                equipItem();
            }
        } else switch (cTLS) {
            case BACK:
                ((MenuPage)parent.parent).child = parent;
                unload();
                shopP.unload();
                GameThread.playSound(15);
                break;
            case SHOP:
                ((MenuPage)parent.parent).child = shopP;
                GameThread.playSound(14);
                break;
            case L_ARROW:
                GameThread.playSound(14);
                inventory.shopShopInventorySelectPos = inventory.shopShopInventorySelectPos >= 8 ? (inventory.shopShopInventorySelectPos - 8) % 24 : 16;
                break;
            case R_ARROW:
                GameThread.playSound(14);
                inventory.shopShopInventorySelectPos = (inventory.shopShopInventorySelectPos + 8) % 24;
                break;
            case SELL:
                if (shopP.sellShopItem()) {
                    GameThread.playSound(14);
                    Config.saveFile();
                }
                break;
        }
        int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
        if (cTLP >= MIN_HERO && cTLP < BACK) {
            GameThread.playSound(14);
            int pPos = cTLP - MIN_HERO;
            selectedHero = pPos / 2;
            selectedHeroEquip = pPos % 2;
            inventory.shopShopInventorySelectPos -= inventory.getSelectedInd();
            equipItem();
        } else if (selectedHero != -1 && selectedHeroEquip != -1) {
            unequipItem();
            selectedHero = -1;
            selectedHeroEquip = -1;
            Config.saveFile();
        }
    }

    public void unequipItem() {
        if (Config.s.heroEquips[selectedHero][selectedHeroEquip] == null)
            return;

        int slot = -1;
        for (int i = 0; i < Config.s.inventory.length; i++)
            if (Config.s.inventory[i] == null) {
                slot = i;
                break;
            }
        if (slot == -1)
            return;

        Config.s.inventory[slot] = Config.s.heroEquips[selectedHero][selectedHeroEquip];
        Config.s.heroEquips[selectedHero][selectedHeroEquip] = null;
        setEquipHeroSetting();
    }

    public boolean equipItem() {
        if (inventory.shopShopInventorySelectPos == -1 || Config.s.inventory[inventory.shopShopInventorySelectPos] == null)
            return false;

        Config.s.heroEquips[selectedHero][selectedHeroEquip] = Config.s.inventory[inventory.shopShopInventorySelectPos];
        for (int i = inventory.shopShopInventorySelectPos; i < Config.s.inventory.length - 1; i++)
            Config.s.inventory[i] = Config.s.inventory[i + 1];
        Config.s.inventory[Config.s.inventory.length - 1] = null;

        boolean armed = true;
        for (int i = 0; i < heroes.length; i++)
            for (int j = 0; j < Config.s.heroEquips[i].length; i++)
                if (Config.s.heroEquips[i][j] == null) {
                    armed = false;
                    break;
                }
        if (armed)
            Config.s.awardValues[DataAward.AWARD_Armed_To_The_Teeth] = true;

        setEquipHeroSetting();
        Config.saveFile();
        return true;
    }

    public void setEquipHeroSetting() {
        for (int i = 0; i < heroes.length; i++)
            if (Config.s.rewardValues[i * 2]) {
                if (heroes[i] == null)
                    heroes[i] = new HeroUnit(null, i, 0, 0);
                heroes[i].restatTowerUnit(false);
            } else
                break;
    }
}
