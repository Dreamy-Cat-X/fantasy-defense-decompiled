package com.sncompany.newtower.Pages;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

public class InventoryTable { //Probably useless, but only one way to tell

    public static final int[] uiUpitemResource = {R.drawable.ui_upitem_reset, R.drawable.ui_upitem_blue0, R.drawable.ui_upitem_blue1, R.drawable.ui_upitem_blue2, R.drawable.ui_upitem_blue3, R.drawable.ui_upitem_blue4, R.drawable.ui_upitem_blue5, R.drawable.ui_upitem_blue6, R.drawable.ui_upitem_blue7, R.drawable.ui_upitem_blue8, R.drawable.ui_upitem_blue9, R.drawable.ui_upitem_blue10, R.drawable.ui_upitem_blue11, R.drawable.ui_upitem_blue12, R.drawable.ui_upitem_blue13, R.drawable.ui_upitem_blue14, R.drawable.ui_upitem_blue15, R.drawable.ui_upitem_red0, R.drawable.ui_upitem_red1, R.drawable.ui_upitem_red2, R.drawable.ui_upitem_red3, R.drawable.ui_upitem_red12, R.drawable.ui_upitem_red13, R.drawable.ui_upitem_red14, R.drawable.ui_upitem_red15, R.drawable.ui_upitem_herospe0, R.drawable.ui_upitem_herospe1, R.drawable.ui_upitem_herospe2, R.drawable.ui_upitem_herospe3, R.drawable.ui_upitem_limit0};

    private final Texture2D[] selectOutline = new Texture2D[2], uiUpitemImage = new Texture2D[uiUpitemResource.length];
    public int shopShopInventorySelectPos = 0;
    private final TPage imgref;
    private boolean loaded;


    public InventoryTable(TPage ref) {
        imgref = ref;
    }

    public void load(Consumer<Float> prog) {
        if (loaded)
            return;
        selectOutline[0] = new Texture2D(UpgradePage.uiUpgradeResource[UpgradePage.upgrade_iconselectn]);
        selectOutline[1] = new Texture2D(UpgradePage.uiUpgradeResource[UpgradePage.upgrade_iconselecta]);
        TPage.loadP(uiUpitemImage, uiUpitemResource, prog, 1, uiUpitemResource.length);
        loaded = true;
    }

    public void unload() {
        if (!loaded)
            return;
        selectOutline[0].dealloc();
        selectOutline[1].dealloc();
        for (Texture2D img : uiUpitemImage)
            img.dealloc();
        loaded = false;
    }

    public void addTouch() {
        for (int i = 0; i < 8; i++)
            TouchManager.addTouchRectListData(i, CGRect.CGRectMake(((i % 8) * 70) + 125, 390.0f, 60.0f, 60.0f));
    }

    public int getPage() {
        return shopShopInventorySelectPos / 8;
    }

    public int getFirstInPage() {
        if (shopShopInventorySelectPos == -1)
            return 0;
        return shopShopInventorySelectPos - getSelectedInd();
    }
    public int getSelectedInd() {
        if (shopShopInventorySelectPos == -1)
            return -1;
        return shopShopInventorySelectPos % 8;
    }
    private ShopPage getShop() {
        if (imgref instanceof EquipPage)
            return ((EquipPage)imgref).shopP;
        return (ShopPage)imgref;
    }

    public void drawInventoryWindow(int x, int y, int touch, boolean drawSell) {
        ShopPage sh = getShop();
        sh.uiShopImage[ShopPage.shop_underbar].drawAtPointOption(x, y, 18);
        for (int i = 0; i < 8; i++) {
            int i10 = getFirstInPage() + i;
            if (Config.inventory[i10] != null)
                drawUpItemImage(Config.inventory[i10], x + 53 + ((i % 8) * 70), y + 28, 18);
            else
                sh.uiShopImage[ShopPage.shop_iconempty].drawAtPointOption(x + 53 + ((i % 8) * 70), y + 28, 18);
        }
        for (int i = 0; i < 3; i++) {
            TPage.uiEtcImage[TPage.etc_stageboxone].drawAtPointOption(x + 312 + (i * 10), y + 92, 18);
        }
        TPage.uiEtcImage[TPage.etc_stageselect].drawAtPointOption(x + 306 + (getPage() * 10), y + 86, 18);
        if (drawSell && Config.inventory[shopShopInventorySelectPos] != null)
            sh.uiShopImage[touch != 3 ? ShopPage.shop_btnselloff : ShopPage.shop_btnsellon].drawAtPointOption(x + 639, y + 19, 18);

        sh.uiShopImage[touch != 1 ? ShopPage.shop_btnleftarrowoff : ShopPage.shop_btnleftarrowon].drawAtPointOption(x + 9, y + 35, 18);
        sh.uiShopImage[touch != 2 ? ShopPage.shop_btnrightarrowoff : ShopPage.shop_btnrightarrowon].drawAtPointOption(x + 600, y + 35, 18);
        if (!drawSell || shopShopInventorySelectPos == -1 || Config.inventory[shopShopInventorySelectPos] == null)
            return;

        float y2 = y + 28;
        drawSelectRedBox(x + 53 + ((getSelectedInd() % 8) * 70), y2);
        drawInvenItemDescription(x + 83 + ((getSelectedInd() % 8) * 70), y2, Config.inventory[shopShopInventorySelectPos]); //Might be wrong
    }

    public void drawUpItemImage(byte[] itm, float x, float y, int pivot) {
        if (itm == null)
            return;
        int itmslot = getItemID(itm);

        if (pivot == 9) {
            x -= 30.0f;
            y -= 30.0f;
        }
        uiUpitemImage[itmslot].drawAtPointOption(x, y, 18);
    }

    public void drawUpItemImageGuide(int id, float x, float y, CGRect cGRect) {
        if (id < 0)
            return;

        uiUpitemImage[id].drawAtPointOptionGuide(x, y, 18, cGRect);
        if (DataUpgradeItem.upgradeItemData[id][0] != 0)
            return;

        GameRenderer.setFontSize(11);
        GameRenderer.setFontDoubleColor(-1, -16777216);
        GameRenderer.drawStringDoubleGuideM(String.format("%dP", DataUpgradeItem.upgradeItemData[id][2]), x + 30, y + 43, 17, cGRect);
    }

    public void drawInvenItemDescription(float x, float y, byte[] itm) {
        if (itm == null)
            return;
        int idm = getItemID(itm);

        GameRenderer.setFontSize(17);
        GameRenderer.drawFont.getTextBounds(DataUpgradeItem.upgradeItemName[idm], 0, DataUpgradeItem.upgradeItemName[idm].length(), Texture2D.bounds_);
        int bound = Texture2D.bounds_.right - Texture2D.bounds_.left;
        GameRenderer.setFontSize(12);
        String format = String.format("%d", DataUpgradeItem.upgradeItemData[idm][4] / 2);
        GameRenderer.drawFont.getTextBounds(format, 0, format.length(), Texture2D.bounds_);
        int bound2 = Texture2D.bounds_.right - Texture2D.bounds_.left;
        GameRenderer.setFontSize(14);
        int eff = DataUpgradeItem.equipData[itm[0]][itm[1]];
        String format2 = String.format(DataUpgradeItem.upgradeItemDescription[idm], eff);
        GameRenderer.drawFont.getTextBounds(format2, 0, format2.length(), Texture2D.bounds_);
        int bnd = Math.max(bound + bound2 + 65, (Texture2D.bounds_.right - Texture2D.bounds_.left) + 28);

        float halfbnd = bnd / 2;
        float bX = x - halfbnd;
        float bY = y - 73.0f;
        GameRenderer.drawLeftRightBox(bX, bY, bnd);
        GameRenderer.setFontColor(-68096);
        GameRenderer.setFontSize(17);
        GameRenderer.drawStringM(DataUpgradeItem.upgradeItemName[idm], bX + 14.0f, bY + 14.0f, 18);
        GameRenderer.setFontSize(14);
        GameRenderer.drawStringM(String.format(DataUpgradeItem.upgradeItemDescription[idm], eff), bX + halfbnd, bY + 34.0f, 17);
        GameRenderer.setFontColor(-1);
        GameRenderer.setFontSize(12);

        float f7 = bX + bnd;
        getShop().heroismImage.drawAtPointOption((f7 - bound2) - 40.0f, bY + 12.0f, 18);
        GameRenderer.drawStringM(String.format("%d", (DataUpgradeItem.upgradeItemData[idm][4] * 50) / 100), f7 - 17.0f, bY + 18.0f, 20);
    }

    public void drawSelectRedBox(float x, float y) {
        selectOutline[0].drawAtPointOption(x - 11.0f, (-11.0f) + y, 18);
        float xw = x - 2f;
        float ty = (GameThread.gameTimeCount % 109) + y - 49f;
        selectOutline[1].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(xw, y - 2f, 64f, 2f));
        selectOutline[1].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(xw, y + 60f, 64f, 2f));
        selectOutline[1].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(xw, y, 2f, 60f));
        selectOutline[1].drawAtPointOptionGuide(xw, ty, 18, CGRect.CGRectMake(x + 60f, y, 2f, 60f));
    }

    public int getItemID(byte[] ind) {
        return (ind[0] * 4) + ind[1] + 1;
    }
}
