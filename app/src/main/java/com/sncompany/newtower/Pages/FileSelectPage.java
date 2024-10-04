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
    public static final int[] resources = {R.drawable.fileselect_top, R.drawable.fileselect_bar, R.drawable.etc_heroism, R.drawable.ui_record_cup, R.drawable.ui_award_09, R.drawable.ui_award_10, R.drawable.ui_award_11};
    public static final int top = 0, bar = 1, heroism = 2, cup = 3;
    public final Texture2D[] images = new Texture2D[resources.length];
    public static final int sdis = 50, ydis = 104, max_bars = 5;

    public FileSelectPage(TPage par) {
        super(par);
        String[] files = GameThread.newTower.fileList();
        for (String file : files) {
            if (!file.startsWith("SAVEDATA"))
                continue;
            if (file.length() == 8) {
                GameThread.newTower.deleteFile(file);
                continue;
            }
            Config.SaveFile sf = new Config.SaveFile(Integer.parseInt(file.substring(8)), true);
            fileList.add(sf);
        }
        if (fileList.size() >= 4)
            scrollbar = new MyScrollbar(120, 390, 0, (fileList.size() - 3) * 70);
        else {
            scrollbar = null;
        }
        drawer = new CircleItemDraw(max_bars, fileList.size() + 1);
        drawer.FIRST_BLOCK_SIZE = 70;
        drawer.moveSpeed = 20;
        drawer.nextMoveCheckDegree = 10;
        drawer.moveCloseFlag = true;
        drawer.blockLastViewCount = 3;
        for (int i = 0; i < drawer.totalHalfBlockSize; i++) {
            drawer.blockLengthArray[i] = i * drawer.FIRST_BLOCK_SIZE;
            drawer.blockSizeArray[i] = 1;
            drawer.blockAlphaArray[i] = 1;
        }
        drawer.blockLengthArray[0] = 0;
    }

    @Override
    public void load(Consumer<Float> prog) {
        loaded = true;
        loadP(images, resources, prog, 1, images.length);
    }

    @Override
    public void update() {
        drawer.correctDistance();
        if (fileList.isEmpty()) {
            Config.setFile(new Config.SaveFile(1, false));
            NewTower.switchPage(new MenuPage(parent));
        }
    }

    @Override
    public void paint(GL10 gra, boolean init) {
        drawer.getArrayAndCorrection();
        int cTLS = init ? TouchManager.checkTouchListStatus() : -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, CGRect.make(1, 421, 68, 58));
            TouchManager.addTouchRectListData(1, CGRect.make(730, 100, 68, 290));
            for (int j = 0; j < Math.min(fileList.size() + 1, max_bars); j++) {
                int t = (j * 2) + 2;
                int y = j * 70;
                TouchManager.addTouchRectListData(t, CGRect.make(437 + sdis, y + 7 + ydis, 90, 45));
                TouchManager.addTouchRectListData(t + 1, CGRect.make(533 + sdis, y + 7 + ydis, 120, 45));
            }
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 12;
            TouchManager.swapTouchMap();
        }
        alwaysImage[ALWAYS_R_BG].drawAtPointOption(0, 0, 18);
        uiEtcImage[etc_window].drawAtPointOption(GameRenderer.CX, 77, 17);
        uiEtcImage[cTLS == 0 ? etc_back_on : etc_back_off].drawAtPointOption(1, 421, 18);
        images[top].drawAtPointOption(GameRenderer.CX, 6, 17);

        for (int j = drawer.totalHalfBlockSize - 1; j <= drawer.totalHalfBlockSize + (max_bars - 1); j++)
            if (drawer.blockCurrentArray[j] != -1) {
                int awd = drawer.blockCurrentArray[j];
                int abs = Math.abs(j - drawer.totalHalfBlockSize);
                int blen = j < drawer.totalHalfBlockSize ? -drawer.blockLengthArray[abs] : drawer.blockLengthArray[abs];

                CGRect rect = CGRect.make(sdis, 100, 660, 300);
                float y = blen + drawer.blockCorrectionPixel + ydis;
                images[bar].drawAtPointOptionGuide(sdis, y, 18, rect);
                GameRenderer.setFontDoubleColor(-1, -11106408);
                if (awd < fileList.size()) {
                    images[6].drawAtPointOptionGuide(sdis + 4, y + 4, 18, rect);
                    GameRenderer.setFontSize(22);
                    Config.SaveFile sav = fileList.get(awd);
                    GameRenderer.drawStringDoubleGuideM(sav.toString(), 60+sdis, y + 5, 18, rect);
                    GameRenderer.drawStringDoubleGuideM((sav.totalPlaytime/3600) + ":" + duo(sav.totalPlaytime/60) +
                            ":" + duo(sav.totalPlaytime),60+sdis,y + 35,18, rect);
                    for (int i = sav.stageProg.length - 1; i >= -1; i--)
                        if (i == -1 || sav.stageProg[i][0] != -1) {
                            String s = i == -1 ? "Tutorial" : String.format(GameThread.getString(R.string.start_stind), i+1);
                            GameRenderer.drawStringDoubleGuideM(s, 175+sdis, y + 5, 18, rect);
                            break;
                        }
                    images[heroism].drawAtPointOptionGuide(175+sdis, y + 35, 18, rect);
                    GameRenderer.drawStringDoubleGuideM(":" + sav.heroPoints, 195+sdis, y + 35, 18, rect);
                    images[cup].drawAtPointOptionGuide(290+sdis, y + 15, 18, rect);
                    GameRenderer.drawStringDoubleGuideM(":" + sav.getAwardCount() + "/" + (sav.awardValues.length-1), 320+sdis, y+21, 18, rect);
                } else {
                    GameRenderer.setFontSize(44);
                    GameRenderer.drawStringDoubleGuideM("New File", 155+sdis, y + 5, 18, rect);
                }
            }

        if (scrollbar != null)
            uiEtcImage[etc_scrollbutton].drawAtPointOption(747, scrollbar.BarLastPosition, 9);
    }

    private static String duo(long t) {
        if (t >= 10)
            return t + "";
        return "0" + t;
    }

    @Override
    public void touchCheck() {
        int lastAct = TouchManager.lastActionStatus;
        int cTLS = TouchManager.checkTouchListStatus();
        if (lastAct != TouchManager.TOUCH_STATUS_START_PROCESSED) {
            if (scrollbar == null || lastAct == -1)
                return;
            if (lastAct == TouchManager.TOUCH_STATUS_NO_INPUT && cTLS == 1) {
                scrollbar.setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                drawer.setAnchorDrawPosition(scrollbar.BarLastValue);
            } else if (lastAct == TouchManager.TOUCH_STATUS_START_INPUTED) {
                int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                if (cTLP == 1) {
                    scrollbar.setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    drawer.setAnchorDrawPosition(scrollbar.BarLastValue);
                }
            }
            return;
        }
        drawer.resetTargetPosition();
        if (cTLS == 0)
            NewTower.switchPage(parent);
        else if (cTLS >= 2) {
            int ind = drawer.blockCurrentArray[drawer.totalHalfBlockSize + ((cTLS - 2)/2)];
            if (cTLS % 2 == 0) {//load
                Config.setFile(ind < fileList.size() ? fileList.get(ind) : new Config.SaveFile(ind + 1, false));
                NewTower.switchPage(new MenuPage(parent));
            } else if (ind < fileList.size()) {
                fileList.get(ind).delete();
                fileList.remove(ind);
                drawer.totalDataBlockSize--;
                if (scrollbar != null)
                    scrollbar.setEnd((fileList.size() - 3) * 70);
                if (fileList.isEmpty())
                    NewTower.switchPage(parent);
            }
        }
    }

    @Override
    public void unload() {
        loaded = false;
    }
}
