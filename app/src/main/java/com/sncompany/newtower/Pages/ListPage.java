package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
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
            parent.paint(gl10, false);
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, GameRenderer.CGRectMake(1.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(1, GameRenderer.CGRectMake(300.0f, 158.0f, 199.0f, 65.0f));
            TouchManager.addTouchRectListData(2, GameRenderer.CGRectMake(300.0f, 258.0f, 199.0f, 65.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 3;
            i = TouchManager.checkTouchListStatus();

            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.setColors(0.5f);
            fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
            Texture2D.setColors(1);
        }
        images[i == 1 ? 3 : 2].drawAtPointOption(300.0f, 158.0f, 18);
        images[i == 2 ? 1 : 0].drawAtPointOption(300.0f, 258.0f, 18);
        uiEtcImage[i == 0 ? etc_back_on : etc_back_off].drawAtPointOption(1.0f, 421.0f, 18);

        if (init)
            TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int cTLS = TouchManager.checkTouchListStatus();

        if (cTLS == 0) {
            GameThread.playSound(14);
            MenuPage par = (MenuPage)parent;
            par.back(true);
            NewTower.switchPage(par, false);
        } else if (cTLS <= funcs.length) {
            GameThread.playSound(15);
            funcs[cTLS - 1].accept(cTLS - 1);
        }
    }
}
