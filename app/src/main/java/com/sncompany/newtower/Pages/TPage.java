package com.sncompany.newtower.Pages;

import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;

import javax.microedition.khronos.opengles.GL10;

public abstract class TPage {


    public static final Texture2D fillBlackImage = new Texture2D();
    public static final Texture2D fillWhiteImage = new Texture2D();
    public static final int[] uiEtcResource = {R.drawable.ui_etc_window, R.drawable.ui_etc_back_off, R.drawable.ui_etc_back_on, R.drawable.ui_etc_option, R.drawable.ui_etc_optionbody, R.drawable.ui_etc_onon, R.drawable.ui_etc_onoff, R.drawable.ui_etc_offon, R.drawable.ui_etc_offoff, R.drawable.ui_etc_stageboxone, R.drawable.ui_etc_stageselect, R.drawable.ui_etc_about, R.drawable.ui_etc_developer, R.drawable.ui_etc_gaedungwi, R.drawable.ui_etc_scrollbutton, R.drawable.ui_ect_movie_btn};
    public static final Texture2D[] uiEtcImage = new Texture2D[uiEtcResource.length];

    static {
        fillBlackImage.initWithImageColor(-16777216);
        fillWhiteImage.initWithImageColor(-1);
        for (int i = 0; i < uiEtcImage.length; i++) {
            uiEtcImage[i] = new Texture2D();
            uiEtcImage[i].initWithImageName(uiEtcResource[i]);
        }
    }

    public final TPage parent; //Make final when constructing, can be null

    public TPage(TPage par) {
        parent = par;
    }

    public static void loadImageResourceToTexture(Texture2D[] T2Darr, int[] ress) {
        if (T2Darr == null || ress == null)
            return;
        for (int i = 0; i < T2Darr.length && i < ress.length; i++)
            T2Darr[i].initWithImageName(ress[i]);
    }

    public static void removeImageResourceArray(Texture2D[] TArr) {
        if (TArr == null)
            return;
        for (Texture2D T2 : TArr)
            T2.dealloc();
    }

    public abstract void load();

    public abstract void update();
    public abstract void draw(GL10 gra, boolean init);

    public abstract void touchCheck();

    public abstract void unload();
}
