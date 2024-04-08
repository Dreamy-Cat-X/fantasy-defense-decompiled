package com.sncompany.newtower.Pages;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
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
    public void load() {
        for (byte i = 0; i < uiHelpImage.length; i++)
            uiHelpImage[i] = new Texture2D(uiHelpResource[i]);
        uiHelpShotImage.initWithImageName(uiHelpShotResource[0]);
    }

    public void update_GAME_HELP() {
    }

    public void paint_GAME_HELP(GL10 gl10, boolean init) {
        int i = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_0_BACK, CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_1_TUTORIAL, CGRectMake(650.0f, 18.0f, 130.0f, 44.0f));
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_2_LEFTARROW, CGRectMake(628.0f, 417.0f, 45.0f, 50.0f));
            TouchManager.addTouchRectListData(GAME_HELP_TOUCH_LIST_3_RIGHTARROW, CGRectMake(738.0f, 417.0f, 45.0f, 50.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 4;
            i = TouchManager.checkTouchListStatus();
        }

        mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        mainmenuImage[2].drawAtPointOption(228.0f, 5.0f, 18);
        uiHelpImage[0].drawAtPointOption(CX, 6.0f, 17);
        uiEtcImage[0].drawAtPointOption(CX, 77.0f, 17);
        uiHelpShotImage.drawAtPointOption(32.0f, 94.0f, 18);

        uiHelpImage[i == 1 ? 2 : 1].drawAtPointOption(650.0f, 18.0f, 18);
        uiHelpImage[i == 2 ? 4 : 3].drawAtPointOption(628.0f, 417.0f, 18);
        uiHelpImage[i == 3 ? 6 : 5].drawAtPointOption(738.0f, 417.0f, 18);

        setFontDoubleColor(-1, -1);
        setFontSize(19);
        drawStringDoubleM(String.format("%d/%d", Integer.valueOf(GameThread.gameHelpViewNum + 1), 15), 705.0f, 431.0f, 17);

        uiEtcImage[i == 0 ? 2 : 1].drawAtPointOption(11.0f, 412.0f, 18);

        if (init)
            TouchManager.swapTouchMap();
    }

    public void touchCheck_GAME_HELP() {
        if (TouchManager.lastActionStatus != 2)
            return;

        int TLS = TouchManager.checkTouchListStatus();
        switch (TLS) {
            case GAME_HELP_TOUCH_LIST_0_BACK: //all code in this case is temp
                GameRenderer.titlePressed = 18;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
                break;
            case GAME_HELP_TOUCH_LIST_1_TUTORIAL:
                GameThread.loadMap(50, false); //Tutorial
                GameThread.gameLoadFlag = 0;
                GameThread.loadingStatus = GameThread.GAME_PLAY2_IMAGE_LOAD;
                GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                GameRenderer.loadCount_GAME_PLAY_IMAGE_LOAD = 0;
                GameRenderer.loadingViewType = GameThread.getRandom(6);
                GameThread.stopLoopSound(0);
                for (int i = 0; i < 22; i++)
                    GameThread.tutorialBoxTouchFlag[i] = 0;
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
    }
}
