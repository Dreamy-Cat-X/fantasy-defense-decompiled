package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class LoadingPage extends TPage {

    private static final int[] tips = {R.string.tip0, R.string.tip1, R.string.tip2, R.string.tip3, R.string.tip4, R.string.tip5, R.string.tip6, R.string.tip7, R.string.tip8, R.string.tip9, R.string.tip10, R.string.tip11, R.string.tip12, R.string.tip13, R.string.tip14, R.string.tip15, R.string.tip16, R.string.tip17, R.string.tip18, R.string.tip19, R.string.tip20, R.string.tip21, R.string.tip22, R.string.tip23, R.string.tip24, R.string.tip25, R.string.tip26, R.string.tip27, R.string.tip28, R.string.tip29, R.string.tip30, R.string.tip31, R.string.tip32,
            R.string.tip33, R.string.tip34, R.string.tip35, R.string.tip36, R.string.tip37, R.string.tip38, R.string.tip39, R.string.tip40, R.string.tip41, R.string.tip42, R.string.tip43};
    private float prog = 0f;
    private final int loadingViewType;
    private int loadTipNumber;
    public static final int[] uiLoadingResource = {R.drawable.ui_loading_outline, R.drawable.ui_loading_blackline, R.drawable.ui_loading_loadingline, R.drawable.ui_loading_whiteline};
    public static final int[] uiCharFaceResource = {R.drawable.ui_char_face_warrior, R.drawable.ui_char_face_manatarms, R.drawable.ui_char_face_knight, R.drawable.ui_char_face_warlord, R.drawable.ui_char_face_archer, R.drawable.ui_char_face_holyeye, R.drawable.ui_char_face_splatter, R.drawable.ui_char_face_skybeholder, R.drawable.ui_char_face_wizard, R.drawable.ui_char_face_colddiviner, R.drawable.ui_char_face_warlock, R.drawable.ui_char_face_magmablaster, R.drawable.ui_char_face_hero0, R.drawable.ui_char_face_hero1, R.drawable.ui_char_face_hero2};
    public static final int[] uiCharNameResource = {R.drawable.ui_char_name_warrior, R.drawable.ui_char_name_manatarms, R.drawable.ui_char_name_knight, R.drawable.ui_char_name_warlord, R.drawable.ui_char_name_archer, R.drawable.ui_char_name_holyeye, R.drawable.ui_char_name_splatter, R.drawable.ui_char_name_skybeholder, R.drawable.ui_char_name_wizard, R.drawable.ui_char_name_colddiviner, R.drawable.ui_char_name_warlock, R.drawable.ui_char_name_blaster, R.drawable.ui_char_name_hero0, R.drawable.ui_char_name_hero1, R.drawable.ui_char_name_hero2};
    public static final int[] loadingUnitAdjustPos = {-57, -31, -54, -50, -45, -46, -36, -41, -30, -49, -43, -45};
    private final Texture2D[] uiLoadingImage = new Texture2D[uiLoadingResource.length];
    private final Texture2D[] uiCharNameImage = new Texture2D[uiCharNameResource.length];
    private final Texture2D[] uiCharFaceImage = new Texture2D[uiCharFaceResource.length];
    private final Consumer<Float> con = (d -> prog = d);

    public LoadingPage(TPage par) {
        super(par);
        reloadTip();
        loadingViewType = NewTower.getRandom(6);

        //Due to how loading page works, it loads pre-emptively
        alwaysImage[ALWAYS_R_BG].initWithImageName(alwaysResource[ALWAYS_R_BG]);
        for (int i = 0; i < uiLoadingImage.length; i++)
            uiLoadingImage[i] = new Texture2D(uiLoadingResource[i]);

        if (loadingViewType < 3) {
            alwaysImage[loadingViewType + 1].initWithImageName(alwaysResource[loadingViewType + 1]);
            uiCharNameImage[loadingViewType + 12] = new Texture2D(uiCharNameResource[loadingViewType + 12]);
        } else {
            for (int tp = 0; tp < 4; tp++) {
                int cat = ((loadingViewType - 3) * 4) + tp;
                uiCharFaceImage[cat] = new Texture2D(uiCharFaceResource[cat]);
                uiCharNameImage[cat] = new Texture2D(uiCharNameResource[cat]);
            }
        }
    }

    @Override
    public void load(Consumer<Float> prog) {
        loaded = true;
        parent.load(con);
    }

    @Override
    public void unload() {
        for (Texture2D t2d : uiLoadingImage)
            t2d.dealloc();

        if (loadingViewType < 3) {
            alwaysImage[loadingViewType + 1].dealloc();
            uiCharNameImage[loadingViewType + 12].dealloc();
        } else {
            for (int tp = 0; tp < 4; tp++) {
                int cat = ((loadingViewType - 3) * 4) + tp;
                uiCharFaceImage[cat].dealloc();
                uiCharNameImage[cat].dealloc();
            }
        }
        loaded = false;
    }

    @Override
    public void update() {
        if (!loaded)
            load(null);
        if (prog >= 1f)
            NewTower.switchPage(parent);
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        if (alwaysImage[ALWAYS_R_BG].name == -1 || uiLoadingImage[0].name == -1 || uiLoadingImage[1].name == -1 || uiLoadingImage[2].name == -1)
            return;
        int uiname = loadingViewType < 3 ? 12 + loadingViewType : (loadingViewType - 3) * 4;

        alwaysImage[ALWAYS_R_BG].drawAtPointOption(0, 0, 18);
        if (loadingViewType < 3) {
            alwaysImage[loadingViewType + 1].drawAtPointOption(GameRenderer.CX, GameRenderer.SCRHEIGHT_SMALL, 33);
            uiCharNameImage[uiname].drawAtPointOption(9, 10, 18);
        } else {
            uiLoadingImage[3].drawAtPointOption(0, 329, 18);
            for (int i = 0; i < 4; i++) {
                int uin = uiname + i;
                int px = (GameRenderer.SCRWIDTH_SMALL / 4) * i;
                uiCharFaceImage[uin].drawAtPointOptionGuide(loadingUnitAdjustPos[uin] + px, 328, 34, CGRect.make(px, 0, 200, 328));
                uiCharNameImage[uin].drawAtPointOption(px + 100, 335, 17);
            }
        }
        uiLoadingImage[0].drawAtPointOption(7, 428, 18);
        uiLoadingImage[1].drawAtPointOption(10, 460, 18);
        uiLoadingImage[2].drawAtPointOptionGuide(10, 460, 18, CGRect.make(10, 460, prog * 780, 10));
        GameRenderer.setFontColor(-1);
        GameRenderer.setFontSize(17);
        String text = GameThread.getString(tips[loadTipNumber]);
        String[] split = text.split("_");
        split[0] = GameThread.getString(R.string.tip_num).replace("_", (loadTipNumber+1)+"") + split[0];
        GameRenderer.drawFont.getTextBounds(text, 0, text.length(), Texture2D.bounds_);
        int boundsize = Texture2D.bounds_.right - Texture2D.bounds_.left;
        Texture2D.gl.glTexEnvf(8960, 8704, 8448);
        Texture2D.setColors(0.5f);
        fillBlackImage.fillRect((GameRenderer.CX - (boundsize / 2f)) - 5, 380, boundsize + 10, split.length * 27);
        Texture2D.setColors(1f);
        for (int part = 0; part < split.length; part++)
            GameRenderer.drawStringDoubleM(split[part], 385, (part * 21) + 387, 17);
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;
        reloadTip();
    }

    private void reloadTip() {
        loadTipNumber = NewTower.getRandom(tips.length);
    }
}
