package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class ListPage extends TPage { //This class' parent will be a MenuPage all the time

    public final Consumer<Integer>[] funcs;
    public final int[] resources;
    public final Texture2D[] images;

    public ListPage(TPage par, Consumer<Integer>[] fs, int[] ress) {
        super(par);
        funcs = fs;
        resources = ress;
        images = new Texture2D[resources.length];
    }

    @Override
    public void load(Consumer<Float> prog) {
        loadP(images, resources, prog, 1, images.length);
        loaded = true;
    }

    @Override
    public void unload() {
        for (byte i = 0; i < images.length; i++) {
            images[i].dealloc();
            images[i] = null;
        }
        loaded = false;
    }

    @Override
    public void update() {
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        int i = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, CGRect.make(1, 412, 68, 58));
            TouchManager.addTouchRectListData(1, CGRect.make(300, 158, 199, 65));
            TouchManager.addTouchRectListData(2, CGRect.make(300, 258, 199, 65));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 3;
            i = TouchManager.checkTouchListStatus();

            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(0.5f);
            fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
            Texture2D.setColors(1);
            TouchManager.swapTouchMap();
        }
        images[i == 1 ? 3 : 2].drawAtPointOption(300, 158, 18);
        images[i == 2 ? 1 : 0].drawAtPointOption(300, 258, 18);
        uiEtcImage[i == 0 ? etc_back_on : etc_back_off].drawAtPointOption(1, 421, 18);
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;
        int cTLS = TouchManager.checkTouchListStatus();
        if (cTLS == -1)
            return;
        if (cTLS == 0) {
            GameThread.playSound(14);
            MenuPage par = (MenuPage)parent;
            par.back(true);
        } else if (cTLS <= funcs.length) {
            GameThread.playSound(15);
            funcs[cTLS - 1].accept(cTLS - 1);
        }
    }
}
