package com.sncompany.newtower.Pages;

import androidx.core.internal.view.SupportMenu;
import java.util.function.Consumer;

import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class EquipPage extends TPage {

    public static final int GAME_SHOP_EQUIP_SKILL_START_X = 203;
    public static final int GAME_SHOP_EQUIP_SKILL_START_Y = 224;
    static final float GAME_SHOP_EQUIP_MOVING_ALPHA = 0.8f;
    protected final InventoryTable inventory;
    private final ShopPage shopP;
    private final HeroUnit[] heroes = new HeroUnit[Config.heroEquips.length];
    public int upgradeHeroUnitSelectPos = -1, upgradeHeroEquipSelectPos = -1;
    public static int touchStart_GAME_SHOP_EQUIP_NUM;
    public static final int BACK = 60, SHOP = 62, L_ARROW = 70, R_ARROW = 71, SELL = 73, MIN_HERO = 10, MIN_LOCK = 75;

    public EquipPage(TPage par) {
        this(par, null);
    }

    public EquipPage(TPage par, ShopPage shop) {
        super(par);
        shopP = shop == null ? new ShopPage(par, this) : shop;
        inventory = shop == null ? new InventoryTable(shopP, this) : shop.inventory;
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
        GameRenderer.inventoryItemListDraw.correctDistance();
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        int cTLS = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(BACK, GameRenderer.CGRectMake(11.0f, 362.0f, 68.0f, 114.0f));
            if (inventory.shopShopInventorySelectPos >= 0)
                TouchManager.addTouchRectListData(SELL, GameRenderer.CGRectMake(711.0f, 381.0f, 68.0f, 78.0f)); //sell
            TouchManager.addTouchRectListData(SHOP, GameRenderer.CGRectMake(16.0f, 8.0f, 46.0f, 49.0f));
            TouchManager.addTouchRectListData(L_ARROW, GameRenderer.CGRectMake(81.0f, 397.0f, 47.0f, 48.0f));
            TouchManager.addTouchRectListData(R_ARROW, GameRenderer.CGRectMake(672.0f, 397.0f, 47.0f, 48.0f));
            for (int j = 0; j < heroes.length * 2; j += 2) {
                if (Config.rewardValues[j]) {
                    float jd = 203 + (j * 127.5f); //The distance per block is 255 and 127.5 if half of that. 203 is initial value
                    TouchManager.addTouchRectListData(MIN_HERO + j, GameRenderer.CGRectMake(jd, 224.0f, 60f, 60f));
                    TouchManager.addTouchRectListData(MIN_HERO + 1 + j, GameRenderer.CGRectMake(jd, 293.0f, 60f, 60f));
                } else
                    TouchManager.addTouchRectListData(MIN_LOCK + (j / 2), GameRenderer.CGRectMake(109.0f, 174.0f, 100.0f, 120.0f));
            }
            inventory.addTouch();
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 78;
            cTLS = TouchManager.checkTouchListStatus();
            parent.parent.paint(gl10, false);
        }
        shopP.uiShopImage[ShopPage.shop_titleequip].drawAtPointOption(66f, 5f, 18);
        shopP.uiShopImage[cTLS == SHOP ? ShopPage.shop_tabshopon : ShopPage.shop_tabshopoff].drawAtPointOption(40f, 9f, 17);
        shopP.uiShopImage[cTLS == BACK ? ShopPage.shop_btnbackon : ShopPage.shop_btnbackoff].drawAtPointOption(11f, 356f, 18);

        shopP.upImg.drawAtPointOption(572f, 8f, 18);
        GameRenderer.drawNumberBlock(GameThread.myHeroism, shopP.numberHeroismImage, 779f, 24f, 1, 20, 1);
        for (int j = 0; j < heroes.length; j++)
            shopP.uiShopImage[ShopPage.shop_herobase].drawAtPointOption(20f + (j * 255), 60f, 18);

        byte[] i2 = null;
        if (upgradeHeroUnitSelectPos >= 0 && upgradeHeroEquipSelectPos >= 0) {
            i2 = Config.heroEquips[upgradeHeroUnitSelectPos][upgradeHeroEquipSelectPos];
        } else if (inventory.shopShopInventorySelectPos >= 0)
            i2 = Config.inventory[inventory.shopShopInventorySelectPos];

        GameRenderer.setFontSize(13);
        for (int j = 0; j < heroes.length; j++) {
            int pDis = (255 * j);
            shopP.uiShopImage[ShopPage.shop_warriorbody + (j * 3)].drawAtPointOption(20f + pDis, 75f, 18);
            if (Config.rewardValues[j * 2]) {
                shopP.uiShopImage[ShopPage.shop_heroslot].drawAtPointOption(25f + pDis, 222f, 18);
                boolean avail = upgradeHeroUnitSelectPos == j && i2 != null;
                if (avail && i2[0] == DataUpgradeItem.EQ_RING)
                    GameRenderer.setFontColor(SupportMenu.CATEGORY_MASK);
                else
                    GameRenderer.setFontColor(-8519745);
                int i5 = heroes[j].unitPower;
                GameRenderer.drawStringDoubleM(String.valueOf(i5 + (((heroes[j].getUpgradeRate( 7) + heroes[j].getEquipEffect(DataUpgradeItem.EQ_RING, 0)) * i5) / 100)), 167.0f, 257.0f, 20);

                if (avail && i2[0] == DataUpgradeItem.EQ_BOOT) {
                    GameRenderer.setFontColor(SupportMenu.CATEGORY_MASK);
                } else
                    GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(heroes[j].towerCoolTimeMax <= 1 ? "MAX" : String.valueOf(heroes[j].getAttackSpeed()), 167.0f, 284.0f, 20);

                if (avail && i2[0] == DataUpgradeItem.EQ_AMLT) {
                    GameRenderer.setFontColor(SupportMenu.CATEGORY_MASK);
                } else
                    GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(String.valueOf(GameThread.towerUnit[0].attackRange), 167.0f, 311.0f, 20);
                GameRenderer.setFontColor(-8519745);
                GameRenderer.drawStringDoubleM(TowerUnit.getEffectTypeString(GameThread.towerUnit[0].effectType), 167.0f, 338.0f, 20);
            } else {
                shopP.uiShopImage[ShopPage.shop_warriorshadow + (j * 3)].drawAtPointOption(19f + pDis, 74.0f, 18);
                shopP.uiShopImage[ShopPage.shop_lock].drawAtPointOption(109f, 174f, 18);
                GameRenderer.setFontColor(-1);
                GameRenderer.drawStringDoubleM(HeroUnit.getUnlock(j), 149f + pDis, 284f, 17);
            }
            shopP.uiShopImage[ShopPage.shop_warrioroutline + (j * 3)].drawAtPointOption(19f + pDis, 59f, 18);
        }
        for (int i9 = 0; i9 < heroes.length; i9++)
            for (int i10 = 0; i10 < Config.heroEquips[i9].length; i10++)
                if (Config.heroEquips[i9][i10] != null)
                    inventory.drawUpItemImage(Config.heroEquips[i9][i10], (i9 * 255) + GAME_SHOP_EQUIP_SKILL_START_X, (i10 * 69) + GAME_SHOP_EQUIP_SKILL_START_Y, 18);

        int i8 = cTLS != L_ARROW ? cTLS != R_ARROW ? cTLS != SELL ? 0 : 3 : 2 : 1;
        if (inventory.shopShopInventorySelectPos != -1 && Config.inventory[inventory.shopShopInventorySelectPos] != null) {
            float alpha;
            if (GameThread.gameTimeCount % 20 < 10)
                alpha = (GameThread.gameTimeCount % 20) * 0.1f;
            else
                alpha = 1.0f - ((GameThread.gameTimeCount % 10) * 0.1f);

            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(1, 1, 1, alpha);
            for (int i11 = 0; i11 < 3; i11++) {
                if (GameThread.heroUnitType[i11] != -1)
                    for (int i12 = 0; i12 < 2; i12++)
                        shopP.uiShopImage[ShopPage.shop_glow].drawAtPointOption(((i11 * 255) + GAME_SHOP_EQUIP_SKILL_START_X) - 7, ((i12 * 69) + GAME_SHOP_EQUIP_SKILL_START_Y) - 7, 18);
            }
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            inventory.drawInventoryWindow(72, 362, inventory.shopShopInventorySelectPos, i8, -1, true);
        } else
            inventory.drawInventoryWindow(72, 362, inventory.shopShopInventorySelectPos, i8, -1, false);

        CGPoint t = TouchManager.getFirstLastActionTouch();
        if (i2 != null) {
            if (t != TouchManager.emptyPosition) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(1f, 1f, 1f, GAME_SHOP_EQUIP_MOVING_ALPHA);
                inventory.drawUpItemImage(i2, t.x, t.y - 25.0f, 9);
                Texture2D.gl.glColor4f(1f, 1f, 1f, 1f);
            } else
                inventory.drawInvenItemDescription((upgradeHeroUnitSelectPos * 255) + GAME_SHOP_EQUIP_SKILL_START_X + 30, (upgradeHeroEquipSelectPos * 69) + GAME_SHOP_EQUIP_SKILL_START_Y, i2);
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
                if (Config.inventory[inventory.getPageStart() + cTLS] != null)
                    touchStart_GAME_SHOP_EQUIP_NUM = cTLS;
                else
                    touchStart_GAME_SHOP_EQUIP_NUM = -1;
            } else if (cTLS < BACK) {
                int hT = cTLS - MIN_HERO;
                if (Config.heroEquips[hT / 2][hT % 2] != null)
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
                    int newP = inventory.getPageStart() + touchStart_GAME_SHOP_EQUIP_NUM;
                    if (touchStart_GAME_SHOP_EQUIP_NUM != -1 && Config.inventory[newP] != null)
                        inventory.shopShopInventorySelectPos = newP;
                    else
                        TouchManager.clearTouchMap();
                } else if (cTLP < BACK) {
                    int tP = cTLP - MIN_HERO, uni = tP / 2, eqi = tP % 2;
                    if (GameThread.heroItemType[uni][eqi] != -1) {
                        GameThread.gameSubStatus = 6;
                        upgradeHeroUnitSelectPos = uni;
                        upgradeHeroEquipSelectPos = eqi;
                    }
                }
        }
        if (lastAction != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int cTLS = TouchManager.checkTouchListStatus();
        if (cTLS == -1 || cTLS >= MIN_LOCK) {
            upgradeHeroUnitSelectPos = 0;
            upgradeHeroEquipSelectPos = 0;
        } else if (cTLS < MIN_HERO) {
            GameThread.playSound(14);
            GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (cTLS);
            return;
        } else if (cTLS < MIN_HERO + 6) {
            if (inventory.shopShopInventorySelectPos >= 0 && Config.inventory[inventory.shopShopInventorySelectPos] != null) {
                GameThread.playSound(14);
                int rPos = cTLS - MIN_HERO;
                upgradeHeroUnitSelectPos = rPos / 2;
                upgradeHeroEquipSelectPos = rPos % 2;
                inventory.shopShopInventorySelectPos -= inventory.getSelectedInd();
                equipItem();
                Config.saveAll();
            }
        } else if (cTLS < BACK) {
            int cT = cTLS - MIN_HERO;
            upgradeHeroUnitSelectPos = cT / 2;
            upgradeHeroEquipSelectPos = cT % 2;
        } else switch (cTLS) {
            case BACK:
                NewTower.switchPage(parent, true);
                GameThread.playSound(15);
                break;
            case SHOP:
                NewTower.switchPage(shopP, false);
                GameThread.playSound(14);
                break;
            case L_ARROW:
                GameThread.playSound(14);
                inventory.shopShopInventorySelectPos = (inventory.shopShopInventorySelectPos - 8) % 24;
                break;
            case R_ARROW:
                GameThread.playSound(14);
                inventory.shopShopInventorySelectPos = (inventory.shopShopInventorySelectPos + 8) % 24;
                break;
            case SELL:
                if (GameThread.gameSubStatus == 4) {
                    GameThread.playSound(14);
                    if (shopP.sellShopItem())
                        Config.saveAll();
                }
        }
        int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
        if (cTLP >= MIN_HERO && cTLP < BACK) {
            GameThread.playSound(14);
            int pPos = cTLP - MIN_HERO;
            upgradeHeroUnitSelectPos = pPos / 2;
            upgradeHeroEquipSelectPos = pPos % 2;
            inventory.shopShopInventorySelectPos -= inventory.getSelectedInd();
            equipItem();
            Config.saveAll();
        } else {
            unequipItem();
            upgradeHeroUnitSelectPos = -1;
            upgradeHeroEquipSelectPos = -1;
            Config.saveAll();
        }
    }

    public void unequipItem() {
        if (Config.heroEquips[upgradeHeroUnitSelectPos][upgradeHeroEquipSelectPos] == null)
            return;

        int slot = -1;
        for (int i = 0; i < Config.inventory.length; i++)
            if (Config.inventory[i] == null) {
                slot = i;
                break;
            }
        if (slot == -1)
            return;

        Config.inventory[slot] = Config.heroEquips[upgradeHeroUnitSelectPos][upgradeHeroEquipSelectPos];
        Config.heroEquips[upgradeHeroUnitSelectPos][upgradeHeroEquipSelectPos] = null;
        setEquipHeroSetting();
    }

    public boolean equipItem() {
        if (inventory.shopShopInventorySelectPos == -1 || Config.inventory[inventory.shopShopInventorySelectPos] == null)
            return false;

        Config.heroEquips[upgradeHeroUnitSelectPos][upgradeHeroEquipSelectPos] = Config.inventory[inventory.shopShopInventorySelectPos];
        for (int i = inventory.shopShopInventorySelectPos; i < Config.inventory.length - 1; i++)
            Config.inventory[i] = Config.inventory[i + 1];
        Config.inventory[Config.inventory.length - 1] = null;

        setEquipHeroSetting();
        return true;
    }

    public void setEquipHeroSetting() {
        for (int i = 0; i < heroes.length; i++)
            if (Config.rewardValues[i * 2]) {
                if (heroes[i] == null)
                    heroes[i] = new HeroUnit(null, i, 0, 0);
                heroes[i].restatTowerUnit();
            } else
                break;
    }
}
