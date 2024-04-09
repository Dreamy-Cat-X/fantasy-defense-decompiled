package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class HelpPage extends TPage {

    public static final byte GAME_HELP_TOUCH_LIST_0_BACK = 0;
    public static final byte GAME_HELP_TOUCH_LIST_1_TUTORIAL = 1;
    public static final byte GAME_HELP_TOUCH_LIST_2_LEFTARROW = 2;
    public static final byte GAME_HELP_TOUCH_LIST_3_RIGHTARROW = 3;
    public static final int[] uiHelpResource = {R.drawable.ui_help_title, R.drawable.ui_help_tutorialoff, R.drawable.ui_help_tutorialon, R.drawable.ui_help_chapterleft_off, R.drawable.ui_help_chapterleft_on, R.drawable.ui_help_chapterright_off, R.drawable.ui_help_chapterright_on};
    public static final int[] uiHelpShotResource = {R.drawable.ui_help_01, R.drawable.ui_help_02, R.drawable.ui_help_03, R.drawable.ui_help_04, R.drawable.ui_help_05, R.drawable.ui_help_06, R.drawable.ui_help_07, R.drawable.ui_help_08, R.drawable.ui_help_09, R.drawable.ui_help_10, R.drawable.ui_help_11, R.drawable.ui_help_12, R.drawable.ui_help_13, R.drawable.ui_help_14, R.drawable.ui_help_15};

    public byte gameHelpViewNum = 0;
    public static final Texture2D[] uiHelpImage = new Texture2D[uiHelpResource.length];
    public static Texture2D uiHelpShotImage = new Texture2D();

    public HelpPage(TPage par) {
        super(par);
    }

    @Override
    public void load(Consumer<Float> prog) {
        for (byte i = 0; i < uiHelpImage.length; i++) {
            uiHelpImage[i] = new Texture2D(uiHelpResource[i]);
            if (prog != null)
                prog.accept((i + 1f) / (uiHelpImage.length + 1f));
        }
        uiHelpShotImage.initWithImageName(uiHelpShotResource[0]);
        if (prog != null)
            prog.accept(1f);
        loaded = true;
    }

    @Override
    public void update() {
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        int i = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_0_BACK, GameRenderer.CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_1_TUTORIAL, GameRenderer.CGRectMake(650.0f, 18.0f, 130.0f, 44.0f));
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_2_LEFTARROW, GameRenderer.CGRectMake(628.0f, 417.0f, 45.0f, 50.0f));
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_3_RIGHTARROW, GameRenderer.CGRectMake(738.0f, 417.0f, 45.0f, 50.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 4;
            i = TouchManager.checkTouchListStatus();
        }
        parent.paint(gl10, false);

        uiHelpImage[0].drawAtPointOption(GameRenderer.CX, 6.0f, 17);
        uiEtcImage[0].drawAtPointOption(GameRenderer.CX, 77.0f, 17);
        uiHelpShotImage.drawAtPointOption(32.0f, 94.0f, 18);

        uiHelpImage[i == 1 ? 2 : 1].drawAtPointOption(650.0f, 18.0f, 18);
        uiHelpImage[i == 2 ? 4 : 3].drawAtPointOption(628.0f, 417.0f, 18);
        uiHelpImage[i == 3 ? 6 : 5].drawAtPointOption(738.0f, 417.0f, 18);

        GameRenderer.setFontDoubleColor(-1, -1);
        GameRenderer.setFontSize(19);
        GameRenderer.drawStringDoubleM(String.format("%d/%d", Integer.valueOf(GameThread.gameHelpViewNum + 1), 15), 705.0f, 431.0f, 17);

        uiEtcImage[i == 0 ? 2 : 1].drawAtPointOption(11.0f, 412.0f, 18);

        if (init)
            TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        int TLS = TouchManager.checkTouchListStatus();
        switch (TLS) {
            case GAME_HELP_TOUCH_LIST_0_BACK:
                GameThread.playSound(14);
                MenuPage par = (MenuPage)parent;
                par.back(true);
                NewTower.switchPage(par, false);
                break;
            case GAME_HELP_TOUCH_LIST_1_TUTORIAL:
                GameThread.stopLoopSound(0);
                NewTower.switchPage(new LoadingPage(new TutorialPage(new StageSelectPage(parent))), true);
                break;
            case GAME_HELP_TOUCH_LIST_2_LEFTARROW:
                gameHelpViewNum = (byte)((gameHelpViewNum - 1) % 15);

                uiHelpShotImage.dealloc();
                uiHelpShotImage.initWithImageName(uiHelpShotResource[gameHelpViewNum]);
                break;
            case GAME_HELP_TOUCH_LIST_3_RIGHTARROW:
                gameHelpViewNum = (byte)((gameHelpViewNum + 1) % 15);

                uiHelpShotImage.dealloc();
                uiHelpShotImage.initWithImageName(uiHelpShotResource[gameHelpViewNum]);
                break;
        }
    }

    @Override
    public void unload() {
        for (Texture2D texture2D : uiHelpImage) texture2D.dealloc();
        if (uiHelpShotImage.name != -1)
            uiHelpShotImage.dealloc();
        loaded = false;
    }
}
