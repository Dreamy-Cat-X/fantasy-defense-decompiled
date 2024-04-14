package com.sncompany.newtower.Pages;

import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public abstract class TPage {


    public static final Texture2D fillBlackImage = new Texture2D();
    public static final Texture2D fillWhiteImage = new Texture2D();
    public static final int ALWAYS_R_BG = 0, ALWAYS_R_HERO0 = 1, ALWAYS_R_HERO1 = 2, ALWAYS_R_HERO2 = 3;
    public static final int[] alwaysResource = {R.drawable.always_background, R.drawable.always_hero0, R.drawable.always_hero1, R.drawable.always_hero2};
    public static final int[] uiEtcResource = {R.drawable.ui_etc_window, R.drawable.ui_etc_back_off, R.drawable.ui_etc_back_on, R.drawable.ui_etc_option, R.drawable.ui_etc_optionbody, R.drawable.ui_etc_onon, R.drawable.ui_etc_onoff, R.drawable.ui_etc_offon, R.drawable.ui_etc_offoff, R.drawable.ui_etc_stageboxone, R.drawable.ui_etc_stageselect, R.drawable.ui_etc_about, R.drawable.ui_etc_developer, R.drawable.ui_etc_gaedungwi, R.drawable.ui_etc_scrollbutton, R.drawable.ui_ect_movie_btn};
    public static final int etc_window = 0, etc_back_off = 1, etc_back_on = 2, etc_option = 3, etc_optionbody = 4, etc_onon = 5, etc_onoff = 6, etc_offon = 7, etc_offoff = 8,
            etc_stageboxone = 9, etc_stageselect = 10, etc_about = 11, etc_developer = 12, etc_gaedungwi = 13, etc_scrollbutton = 14, ect_movie_btn = 15;
    public static final int[] uiPopupResource = {R.drawable.ui_popup_background, R.drawable.ui_popup_levelup, R.drawable.ui_popup_nooff, R.drawable.ui_popup_noon, R.drawable.ui_popup_stat, R.drawable.ui_popup_yesoff, R.drawable.ui_popup_yeson, R.drawable.ui_popup_background2, R.drawable.ui_popup_nooff2, R.drawable.ui_popup_noon2, R.drawable.ui_popup_yesoff2, R.drawable.ui_popup_yeson2, R.drawable.ui_popup_okoff2, R.drawable.ui_popup_okon2};
    public static final int popup_background = 0, popup_levelup = 1, popup_nooff = 2, popup_noon = 3, popup_stat = 4, popup_yesoff = 5, popup_yeson = 6, popup_background2 = 7,
            popup_nooff2 = 8, popup_noon2 = 9, popup_yesoff2 = 10, popup_yeson2 = 11, popup_okoff2 = 12, popup_okon2 = 13;
    public static final Texture2D[] alwaysImage = new Texture2D[alwaysResource.length];
    public static final Texture2D[] uiEtcImage = new Texture2D[uiEtcResource.length], uiPopupImage = new Texture2D[uiPopupResource.length];

    static {
        fillBlackImage.initWithImageColor(-16777216);
        fillWhiteImage.initWithImageColor(-1);
        for (int i = 0; i < uiEtcImage.length; i++)
            uiEtcImage[i] = new Texture2D(uiEtcResource[i]);
        for (int i = 0; i < uiPopupImage.length; i++)
            uiPopupImage[i] = new Texture2D(uiPopupResource[i]);
        for (int i = 0; i < alwaysImage.length; i++)
            alwaysImage[i] = new Texture2D();
    }

    public final TPage parent; //Make final when constructing, can be null
    public boolean loaded = false;

    public TPage(TPage par) {
        parent = par;
    }

    public static int loadP(Texture2D[] T2Darr, int[] ress, Consumer<Float> prog, int pstart, int ptot) {
        if (T2Darr == null || ress == null)
            return pstart;
        for (int i = 0; i < T2Darr.length && i < ress.length; i++) {
            if (T2Darr[i] == null)
                T2Darr[i] = new Texture2D(ress[i]);
            else
                T2Darr[i].initWithImageName(ress[i]);

            if (prog != null)
                prog.accept((float)(pstart + i) / ptot);
        }
        return pstart + T2Darr.length;
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

    public void onReload() {
    }
}
