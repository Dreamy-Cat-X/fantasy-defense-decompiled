package com.sncompany.newtower.Pages;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.MyScrollbar;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.ArrayList;
import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public class FileSelectPage extends TPage {

    private final ArrayList<Config.SaveFile> fileList = new ArrayList<>();
    private final MyScrollbar scrollbar;
    public final CircleItemDraw drawer;
    public static final int[] resources = {R.drawable.ui_record_awardbar, R.drawable.ui_award_09, R.drawable.ui_award_10, R.drawable.ui_award_11};
    public static final int bar = 0;
    public final Texture2D[] images = new Texture2D[resources.length];

    public FileSelectPage(TPage par) {
        super(par);
        String[] files = GameThread.newTower.fileList();
        for (String file : files) {
            if (!file.startsWith("SAVEDATA"))
                continue;
            Config.SaveFile sf = new Config.SaveFile(file.length() > 8 ? Integer.parseInt(file.substring(8)) : 1);
            sf.readSaveData();
            fileList.add(sf);
        }
        if (fileList.size() >= 5)
            scrollbar = new MyScrollbar(90, GameRenderer.GAME_SHOP_SHOP_SIDEBAR_END_Y, 0, (fileList.size() + 1) * 70);
        else {
            scrollbar = null;
            if (fileList.isEmpty()) {
                Config.s = new Config.SaveFile(1);
                NewTower.switchPage(new MenuPage(parent), true);
            }
        }
        drawer = new CircleItemDraw(5, fileList.size() + 1);
    }

    @Override
    public void load(Consumer<Float> prog) {
        loaded = true;
        loadP(images, resources, prog, 1, images.length);
    }

    @Override
    public void update() {
    }

    @Override
    public void paint(GL10 gra, boolean init) {
        int cTLS = init ? TouchManager.checkTouchListStatus() : -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, CGRect.make(1, 421, 68, 58));
            for (int j = 0; j < Math.min(fileList.size(), 5); j++) {
                int t = (j * 2) + 1;
                int y = j * 70;
                TouchManager.addTouchRectListData(t, CGRect.make(565, y + 75, 70, 60));
                TouchManager.addTouchRectListData(t + 1, CGRect.make(636, y + 71, 78, 68));
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 11;
            TouchManager.swapTouchMap();
        }
        alwaysImage[ALWAYS_R_BG].drawAtPointOption(0, 0, 18);
        uiEtcImage[etc_window].drawAtPointOption(GameRenderer.CX, 77, 17);
        uiEtcImage[cTLS == 0 ? etc_back_on : etc_back_off].drawAtPointOption(1, 421, 18);

        for (int j = drawer.totalHalfBlockSize - 1; j <= drawer.totalHalfBlockSize + 4; j++)
            if (drawer.blockCurrentArray[j] != -1) {
                int awd = drawer.blockCurrentArray[j];
                int abs = Math.abs(j - drawer.totalHalfBlockSize);
                int blen = j < drawer.totalHalfBlockSize ? -drawer.blockLengthArray[abs] : drawer.blockLengthArray[abs];

                CGRect rect = CGRect.make(70, 100, 660, 240);
                float y = blen + drawer.blockCorrectionPixel + 104;
                images[bar].drawAtPointOptionGuide(70, y, 18, rect);
                images[3].drawAtPointOptionGuide(74, y, 18, rect);
                GameRenderer.setFontDoubleColor(-1, -11106408);
                GameRenderer.setFontSize(22);
                GameRenderer.drawStringDoubleGuideM(fileList.get(awd).toString(), 149, y + 5, 18, rect);
                //GameRenderer.setFontSize(12);
                //GameRenderer.drawStringDoubleGuideM(DataAward.awardDescription[awd], 150, y + 32, 18, rect);

                //if (!Config.s.awardValues[awd])
                //    uiRecordImage[rec_lock].drawAtPointOptionGuide(669, y + 5, 18, rect);
                //else
                //    uiRecordImage[rec_cup].drawAtPointOptionGuide(672, y + 15, 18, rect);
            }

        if (scrollbar != null)
            uiEtcImage[etc_scrollbutton].drawAtPointOption(747, scrollbar.BarLastPosition, 9);
    }

    @Override
    public void touchCheck() {
        int lastAct = TouchManager.lastActionStatus;
        if (lastAct != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;
        int cTLS = TouchManager.checkTouchListStatus();
        if (cTLS == 0)
            NewTower.switchPage(parent, true);
    }

    @Override
    public void unload() {
        loaded = false;
    }
}
