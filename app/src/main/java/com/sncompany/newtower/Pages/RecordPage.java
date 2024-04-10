package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.MyScrollbar;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class RecordPage extends TPage { //Parent will always be a MainPage

    public static final int GAME_RECORD_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_RECORD_TOUCH_LIST_1_SCORE = 1;
    public static final int GAME_RECORD_TOUCH_LIST_2_AWARD = 2;
    public static final int GAME_RECORD_TOUCH_LIST_3_BODY = 3;
    public static final int GAME_RECORD_TOUCH_LIST_4_SIDEBAR = 4;
    public static final int GAME_RECORD_TOUCH_LIST_TOTAL_COUNT = 5;
    public static final int[] uiRecordResource = {R.drawable.ui_record_title, R.drawable.ui_record_awardbase, R.drawable.ui_record_awardbar, R.drawable.ui_record_scorebase, R.drawable.ui_record_scoreback, R.drawable.ui_record_lock, R.drawable.ui_record_cup};
    public static final int[] uiAwardResource = {R.drawable.ui_award_01, R.drawable.ui_award_02, R.drawable.ui_award_03, R.drawable.ui_award_04, R.drawable.ui_award_05, R.drawable.ui_award_06, R.drawable.ui_award_07, R.drawable.ui_award_08, R.drawable.ui_award_09, R.drawable.ui_award_10, R.drawable.ui_award_11, R.drawable.ui_award_12, R.drawable.ui_award_13, R.drawable.ui_award_14, R.drawable.ui_award_15, R.drawable.ui_award_16, R.drawable.ui_award_17, R.drawable.ui_award_18, R.drawable.ui_award_19, R.drawable.ui_award_20, R.drawable.ui_award_21, R.drawable.ui_award_22, R.drawable.ui_award_23, R.drawable.ui_award_24, R.drawable.ui_award_25, R.drawable.ui_award_26, R.drawable.ui_award_27, R.drawable.ui_award_28, R.drawable.ui_award_29, R.drawable.ui_award_30, R.drawable.ui_award_31, R.drawable.ui_award_32, R.drawable.ui_award_33, R.drawable.ui_award_34, R.drawable.ui_award_35, R.drawable.ui_award_36, R.drawable.ui_award_37, R.drawable.ui_award_38, R.drawable.ui_award_39, R.drawable.ui_award_40, R.drawable.ui_award_41, R.drawable.ui_award_42, R.drawable.ui_award_43, R.drawable.ui_award_44, R.drawable.ui_award_45, R.drawable.ui_award_46, R.drawable.ui_award_47, R.drawable.ui_award_48, R.drawable.ui_award_49, R.drawable.ui_award_50, R.drawable.ui_award_51, R.drawable.ui_award_52, R.drawable.ui_award_53, R.drawable.ui_award_54, R.drawable.ui_award_55, R.drawable.ui_award_56, R.drawable.ui_award_57, R.drawable.ui_award_58, R.drawable.ui_award_59, R.drawable.ui_award_60, R.drawable.ui_award_61, R.drawable.ui_award_62};

    public final Texture2D[] uiRecordImage = new Texture2D[uiRecordResource.length];
    public final Texture2D[] uiAwardImage = new Texture2D[uiAwardResource.length];
    public final CircleItemDraw rankListDraw = new CircleItemDraw(2, 5);
    public final CircleItemDraw awardListDraw = new CircleItemDraw(5, 62);
    private final MyScrollbar[] scrollbars = new MyScrollbar[2]; 
    private boolean Dscore = true;

    public RecordPage(TPage par) {
        super(par);
        scrollbars[0] = new MyScrollbar(120, 370, 0, 1080);
        scrollbars[1] = new MyScrollbar(120, 370, 0, 3480);
    }

    @Override
    public void load(Consumer<Float> prog) {
        int bartot = uiRecordImage.length + uiAwardImage.length;
        for (int i = 0; i < uiRecordImage.length; i++) {
            uiRecordImage[i] = new Texture2D(uiRecordResource[i]);
            if (prog != null)
                prog.accept((i + 1f) / (bartot));
        }
        for (int i = 0; i < uiAwardImage.length; i++) {
            uiAwardImage[i] = new Texture2D(uiAwardResource[i]);
            if (prog != null)
                prog.accept((i + uiRecordImage.length + 1f) / (bartot));
        }
        loaded = true;
    }

    @Override
    public void unload() {
        for (Texture2D uri : uiRecordImage)
            uri.dealloc();
        for (Texture2D uai : uiAwardImage)
            uai.dealloc();
    }

    @Override
    public void update() {
        rankListDraw.correctDistance();
        awardListDraw.correctDistance();
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        rankListDraw.getArrayAndCorrection();
        awardListDraw.getArrayAndCorrection();

        int TLS = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, GameRenderer.CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(1, GameRenderer.CGRectMake(30.0f, 90.0f, 40.0f, 155.0f));
            TouchManager.addTouchRectListData(2, GameRenderer.CGRectMake(30.0f, 245.0f, 40.0f, 155.0f));
            TouchManager.addTouchRectListData(3, GameRenderer.CGRectMake(70.0f, 100.0f, 660.0f, 290.0f));
            TouchManager.addTouchRectListData(4, GameRenderer.CGRectMake(730.0f, 90.0f, 40.0f, 310.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 5;
            TLS = TouchManager.checkTouchListStatus();
        }

        parent.paint(gl10, false);
        uiRecordImage[0].drawAtPointOption(GameRenderer.CX, 6.0f, 17);
        uiEtcImage[0].drawAtPointOption(GameRenderer.CX, 77.0f, 17);
        if (Dscore) {
            uiRecordImage[3].drawAtPointOption(30.0f, 90.0f, 18);
            int px = 0;
            for (int i = rankListDraw.totalHalfBlockSize - 1; i <= rankListDraw.totalHalfBlockSize + 1; i++)
                if (rankListDraw.blockCurrentArray[i] != -1) {
                    int bit = rankListDraw.blockCurrentArray[i];
                    int abs = Math.abs(i - rankListDraw.totalHalfBlockSize);
                    int BLA = i < rankListDraw.totalHalfBlockSize ? -rankListDraw.blockLengthArray[abs] : rankListDraw.blockLengthArray[abs];
                    int CorrectedBLA = BLA + rankListDraw.blockCorrectionPixel;

                    GameRenderer.CGRectMake(70f, 100.0f, 660.0f, 290.0f);
                    uiRecordImage[4].drawAtPointOptionGuide(70f, CorrectedBLA + 100, 18, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(-1, -16107151);
                    GameRenderer.setFontSize(27);
                    GameRenderer.drawStringDoubleGuideM(String.format("Theme %d. %s", bit + 1, GameThread.chapterName[bit]), 79.0f, CorrectedBLA + 108, 18, GameRenderer._CGRect);
                    GameRenderer.setFontSize(16);
                    GameRenderer.setFontDoubleColor(-84043, -8835532);
                    float y = CorrectedBLA + 142;
                    GameRenderer.drawStringDoubleGuideM("Normal", 245.0f, y, 17, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(-3223, -10065378);
                    GameRenderer.drawStringDoubleGuideM("Infinite", 435.0f, y, 17, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(-10030377, -16031651);
                    GameRenderer.drawStringDoubleGuideM("Destroy the Moon", 625.0f, y, 17, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(-1, -11106408);
                    for (int j = 0; j < 10; j++) {
                        int stInd = (bit * 10) + j;
                        float f5 = CorrectedBLA + 162 + (j * 20);
                        GameRenderer.drawStringDoubleGuideM(String.format("Stage %d", stInd + 1), 80.0f, f5, 18, GameRenderer._CGRect);
                        for (int k = 0; k < 3; k++)
                            GameRenderer.drawStringDoubleGuideM(String.valueOf(Math.max(0, Config.highScores[stInd][k])), (k * 190) + 245, f5, 17, GameRenderer._CGRect);
                    }
                    px = CorrectedBLA;
                }
            int curP = rankListDraw.blockCurrentArray[rankListDraw.totalHalfBlockSize];
            if (curP >= 0 && curP <= 4) {
                int[] pxs = {120, 182, 245, 307, 370};
                px = pxs[curP];
            }
            uiEtcImage[14].drawAtPointOption(731.0f, px - ((rankListDraw.blockCorrectionPixel * 63) / 250), 10);
        } else {
            uiRecordImage[1].drawAtPointOption(30.0f, 90.0f, 18);
            for (int j = awardListDraw.totalHalfBlockSize - 1; j <= awardListDraw.totalHalfBlockSize + 4; j++)
                if (awardListDraw.blockCurrentArray[j] != -1) {
                    int awd = awardListDraw.blockCurrentArray[j];
                    int abs = Math.abs(j - awardListDraw.totalHalfBlockSize);
                    int blen = j < awardListDraw.totalHalfBlockSize ? -awardListDraw.blockLengthArray[abs] : awardListDraw.blockLengthArray[abs];

                    GameRenderer.CGRectMake(70.0f, 100.0f, 660.0f, 240.0f);
                    int ay = awd * 100;
                    uiRecordImage[2].drawAtPointOptionGuide(70.0f, ay + 100, 18, GameRenderer._CGRect);
                    float y = blen + awardListDraw.blockCorrectionPixel + 104;
                    uiAwardImage[awd].drawAtPointOptionGuide(74.0f, y, 18, GameRenderer._CGRect);
                    GameRenderer.setFontDoubleColor(-1, -11106408);
                    GameRenderer.setFontSize(22);
                    GameRenderer.drawStringDoubleGuideM(DataAward.awardTitle[awd], 149.0f, ay + 110, 18, GameRenderer._CGRect);
                    GameRenderer.setFontSize(12);
                    GameRenderer.drawStringDoubleGuideM(DataAward.awardDescription[awd], 150.0f, ay + 140, 18, GameRenderer._CGRect);

                    if (!Config.awardValues[awd])
                        uiRecordImage[5].drawAtPointOptionGuide(669.0f, y, 18, GameRenderer._CGRect);
                    else
                        uiRecordImage[6].drawAtPointOptionGuide(672.0f, ay + 112, 18, GameRenderer._CGRect);
                }
            uiEtcImage[14].drawAtPointOption(731.0f, (((awardListDraw.blockCurrentArray[awardListDraw.totalHalfBlockSize] * 250) / 58f) + 120) - (((awardListDraw.blockCorrectionPixel * 250) / 58f) / 250f), 10);
            GameRenderer.setFontColor(-16777216);
            GameRenderer.setFontSize(20);
            GameRenderer.drawStringM(String.format("%02d%%", (Config.getAwardCount() * 100) / 62), 320.0f, 366.0f, 20);
            GameRenderer.setFontSize(13);
            GameRenderer.drawStringM(String.format("(%02d/%02d)", Config.getAwardCount(), 62), 323.0f, 368.0f, 18);
            GameRenderer.setFontSize(20);
            GameRenderer.drawStringM(String.format("%d", Config.getAwardScore()), 610.0f, 365.0f, 18);
        }

        uiEtcImage[TLS == 0 ? 2 : 1].drawAtPointOption(11.0f, 412.0f, 18);
        if (init)
            TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        int lastAction = TouchManager.lastActionStatus;
        if (Dscore) {
            if (lastAction == TouchManager.TOUCH_STATUS_NO_INPUT) { //Drag
                int cTLS = TouchManager.checkTouchListStatus();
                if (cTLS == 3)
                    GameRenderer.rankListDraw.backupCurrentDrawPosition();
                else if (cTLS == 4) {
                    scrollbars[0].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    GameRenderer.rankListDraw.setAnchorDrawPosition(scrollbars[0].BarLastValue);
                }
            } else if (lastAction == TouchManager.TOUCH_STATUS_START_INPUTED) { //Drag 2
                int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                if (cTLP == 3) {
                    if (TouchManager.checkTouchMoveDegree(true))
                        GameRenderer.rankListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                } else if (cTLP == 4) {
                    scrollbars[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    GameRenderer.rankListDraw.setAnchorDrawPosition(scrollbars[0].BarLastValue);
                }
            }
            if (lastAction != TouchManager.TOUCH_STATUS_START_PROCESSED)
                return;
            GameRenderer.rankListDraw.resetTargetPosition();
            switch (TouchManager.checkTouchListStatus()) {
                case GAME_RECORD_TOUCH_LIST_0_BACK:
                    GameThread.playSound(15);
                    MenuPage par = (MenuPage)parent;
                    par.back(true);
                    NewTower.switchPage(par, false);
                    break;
                case GAME_RECORD_TOUCH_LIST_1_SCORE, GAME_RECORD_TOUCH_LIST_2_AWARD:
                    GameThread.playSound(14);
                    Dscore = !Dscore;
                    break;

            }
            TouchManager.processTouchStatus();
            return;
        }
        if (lastAction == TouchManager.TOUCH_STATUS_NO_INPUT) {
            int cTLS = TouchManager.checkTouchListStatus();
            if (cTLS == 3)
                GameRenderer.awardListDraw.backupCurrentDrawPosition();
            else if (cTLS == 4) {
                scrollbars[1].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                GameRenderer.awardListDraw.setAnchorDrawPosition(scrollbars[1].BarLastValue);
            }
            return;
        } else if (lastAction == TouchManager.TOUCH_STATUS_START_INPUTED) {
            int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            if (cTLP == 3) {
                if (TouchManager.checkTouchMoveDegree(true))
                    GameRenderer.awardListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
            } else if (cTLP == 4) {
                scrollbars[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                GameRenderer.awardListDraw.setAnchorDrawPosition(scrollbars[1].BarLastValue);
            }
            return;
        }
        if (lastAction != TouchManager.TOUCH_STATUS_START_PROCESSED) {
            return;
        }
        GameRenderer.awardListDraw.resetTargetPosition();
        switch (TouchManager.checkTouchListStatus()) {
            case GAME_RECORD_TOUCH_LIST_0_BACK:
                GameThread.playSound(15);
                MenuPage par = (MenuPage)parent;
                par.back(true);
                NewTower.switchPage(par, false);
                break;
            case GAME_RECORD_TOUCH_LIST_1_SCORE, GAME_RECORD_TOUCH_LIST_2_AWARD:
                GameThread.playSound(14);
                Dscore = !Dscore;
                break;

        }
        TouchManager.processTouchStatus();
    }
}
