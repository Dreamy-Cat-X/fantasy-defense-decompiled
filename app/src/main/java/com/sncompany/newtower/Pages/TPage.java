package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;

import javax.microedition.khronos.opengles.GL10;

public abstract class TPage {


    public static final Texture2D fillBlackImage = new Texture2D();
    public static final Texture2D fillWhiteImage = new Texture2D();
    public static final int ALWAYS_R_BG = 0;
    public static final int ALWAYS_R_HERO0 = 1;
    public static final int ALWAYS_R_HERO1 = 2;
    public static final int ALWAYS_R_HERO2 = 3;
    public static final int[] alwaysResource = {R.drawable.always_background, R.drawable.always_hero0, R.drawable.always_hero1, R.drawable.always_hero2};
    public static final int[] uiEtcResource = {R.drawable.ui_etc_window, R.drawable.ui_etc_back_off, R.drawable.ui_etc_back_on, R.drawable.ui_etc_option, R.drawable.ui_etc_optionbody, R.drawable.ui_etc_onon, R.drawable.ui_etc_onoff, R.drawable.ui_etc_offon, R.drawable.ui_etc_offoff, R.drawable.ui_etc_stageboxone, R.drawable.ui_etc_stageselect, R.drawable.ui_etc_about, R.drawable.ui_etc_developer, R.drawable.ui_etc_gaedungwi, R.drawable.ui_etc_scrollbutton, R.drawable.ui_ect_movie_btn};
    public static final Texture2D[] alwaysImage = new Texture2D[alwaysResource.length];
    public static final Texture2D[] uiEtcImage = new Texture2D[uiEtcResource.length];

    static {
        fillBlackImage.initWithImageColor(-16777216);
        fillWhiteImage.initWithImageColor(-1);
        for (int i = 0; i < uiEtcImage.length; i++)
            uiEtcImage[i] = new Texture2D(uiEtcResource[i]);
        for (int i = 0; i < alwaysImage.length; i++)
            alwaysImage[i] = new Texture2D();
    }

    public final TPage parent; //Make final when constructing, can be null
    public boolean loaded = false;

    public TPage(TPage par) {
        parent = par;
    }

    public static void loadP(Texture2D[] T2Darr, int[] ress, Consumer<Float> prog, int pstart, int ptot) {
        if (T2Darr == null || ress == null)
            return;
        for (int i = 0; i < T2Darr.length && i < ress.length; i++) {
            if (T2Darr[i] == null)
                T2Darr[i] = new Texture2D(ress[i]);
            else
                T2Darr[i].initWithImageName(ress[i]);

            if (prog != null)
                prog.accept((float)(pstart + i) / ptot);
        }
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

    public abstract void load(Consumer<Float> prog);

    public abstract void update();
    public abstract void paint(GL10 gra, boolean init);

    public abstract void touchCheck();

    public abstract void unload();
}
