package com.sncompany.newtower.Pages;

import android.annotation.SuppressLint;

import java.util.function.Consumer;

import com.sncompany.newtower.CircleItemDraw;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
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

    public static final int BACK = 0,SCORE = 1,AWARD = 2,BODY = 3,SIDEBAR = 4, TOTAL = 5;
    public static final int[] uiRecordResource = {R.drawable.ui_record_title, R.drawable.ui_record_awardbase, R.drawable.ui_record_awardbar, R.drawable.ui_record_scorebase, R.drawable.ui_record_scoreback, R.drawable.ui_record_lock, R.drawable.ui_record_cup};
    public static final int rec_title = 0, rec_awardbase = 1, rec_awardbar = 2, rec_scorebase = 3, rec_scoreback = 4, rec_lock = 5, rec_cup = 6;
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
        loadP(uiRecordImage, uiRecordResource, prog, 1, bartot);
        loadP(uiAwardImage, uiAwardResource, prog, uiRecordImage.length + 1, bartot);

        for (int i = 0; i < rankListDraw.totalHalfBlockSize; i++) {
            rankListDraw.blockLengthArray[i] = i * 270;
            rankListDraw.blockSizeArray[i] = 1.0f;
            rankListDraw.blockAlphaArray[i] = 1.0f;
        }
        rankListDraw.blockLengthArray[0] = 0;
        rankListDraw.FIRST_BLOCK_SIZE = 270;
        rankListDraw.moveSpeed = 30;
        rankListDraw.nextMoveCheckDegree = 30;
        rankListDraw.moveCloseFlag = true;
        for (int i2 = 0; i2 < awardListDraw.totalHalfBlockSize; i2++) {
            awardListDraw.blockLengthArray[i2] = i2 * 60;
            awardListDraw.blockSizeArray[i2] = 1.0f;
            awardListDraw.blockAlphaArray[i2] = 1.0f;
        }
        awardListDraw.blockLengthArray[0] = 0;
        awardListDraw.FIRST_BLOCK_SIZE = 60;
        awardListDraw.moveSpeed = 20;
        awardListDraw.nextMoveCheckDegree = 10;
        awardListDraw.moveCloseFlag = true;
        awardListDraw.blockLastViewCount = 3;
        loaded = true;
    }

    @Override
    public void unload() {
        for (Texture2D uri : uiRecordImage)
            uri.dealloc();
        for (Texture2D uai : uiAwardImage)
            uai.dealloc();
        loaded = false;
    }

    @Override
    public void update() {
        rankListDraw.correctDistance();
        awardListDraw.correctDistance();
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void paint(GL10 gl10, boolean init) {
        rankListDraw.getArrayAndCorrection();
        awardListDraw.getArrayAndCorrection();

        int TLS = -1;
        if (init) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(BACK, CGRect.CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(SCORE, CGRect.CGRectMake(30.0f, 90.0f, 40.0f, 155.0f));
            TouchManager.addTouchRectListData(AWARD, CGRect.CGRectMake(30.0f, 245.0f, 40.0f, 155.0f));
            TouchManager.addTouchRectListData(BODY, CGRect.CGRectMake(70.0f, 100.0f, 660.0f, 290.0f));
            TouchManager.addTouchRectListData(SIDEBAR, CGRect.CGRectMake(730.0f, 90.0f, 40.0f, 310.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = TOTAL;
            TLS = TouchManager.checkTouchListStatus();
        }
        uiRecordImage[rec_title].drawAtPointOption(GameRenderer.CX, 6.0f, 17);
        uiEtcImage[etc_window].drawAtPointOption(GameRenderer.CX, 77.0f, 17);
        if (Dscore) {
            uiRecordImage[rec_scorebase].drawAtPointOption(30.0f, 90.0f, 18);
            int px = 0;
            for (int i = rankListDraw.totalHalfBlockSize - 1; i <= rankListDraw.totalHalfBlockSize + 1; i++)
                if (rankListDraw.blockCurrentArray[i] != -1) {
                    int bit = rankListDraw.blockCurrentArray[i];
                    int abs = Math.abs(i - rankListDraw.totalHalfBlockSize);
                    int BLA = i < rankListDraw.totalHalfBlockSize ? -rankListDraw.blockLengthArray[abs] : rankListDraw.blockLengthArray[abs];
                    int CorrectedBLA = BLA + rankListDraw.blockCorrectionPixel;

                    CGRect rect = CGRect.CGRectMake(70f, 100.0f, 660.0f, 290.0f);
                    uiRecordImage[rec_scoreback].drawAtPointOptionGuide(70f, CorrectedBLA + 100, 18, rect);
                    GameRenderer.setFontDoubleColor(-1, -16107151);
                    GameRenderer.setFontSize(27);
                    GameRenderer.drawStringDoubleGuideM(String.format("Theme %d. %s", bit + 1, GameThread.chapterName[bit]), 79.0f, CorrectedBLA + 108, 18, rect);
                    GameRenderer.setFontSize(16);
                    GameRenderer.setFontDoubleColor(-84043, -8835532);
                    float y = CorrectedBLA + 142;
                    GameRenderer.drawStringDoubleGuideM("Normal", 245.0f, y, 17, rect);
                    GameRenderer.setFontDoubleColor(-3223, -10065378);
                    GameRenderer.drawStringDoubleGuideM("Infinite", 435.0f, y, 17, rect);
                    GameRenderer.setFontDoubleColor(-10030377, -16031651);
                    GameRenderer.drawStringDoubleGuideM("Destroy the Moon", 625.0f, y, 17, rect);
                    GameRenderer.setFontDoubleColor(-1, -11106408);
                    for (int j = 0; j < 10; j++) {
                        int stInd = (bit * 10) + j;
                        float f5 = CorrectedBLA + 162 + (j * 20);
                        GameRenderer.drawStringDoubleGuideM(String.format("Stage %d", stInd + 1), 80.0f, f5, 18, rect);
                        for (int k = 0; k < 3; k++)
                            GameRenderer.drawStringDoubleGuideM(String.valueOf(Math.max(0, Config.highScores[stInd][k])), (k * 190) + 245, f5, 17, rect);
                    }
                    px = CorrectedBLA;
                }
            int curP = rankListDraw.blockCurrentArray[rankListDraw.totalHalfBlockSize];
            if (curP >= 0 && curP <= 4) {
                int[] pxs = {120, 182, 245, 307, 370};
                px = pxs[curP];
            }
            uiEtcImage[etc_scrollbutton].drawAtPointOption(731, px - ((rankListDraw.blockCorrectionPixel * 63) / 250), 10);
        } else {
            uiRecordImage[rec_awardbase].drawAtPointOption(30, 90, 18);
            for (int j = awardListDraw.totalHalfBlockSize - 1; j <= awardListDraw.totalHalfBlockSize + 4; j++)
                if (awardListDraw.blockCurrentArray[j] != -1) {
                    int awd = awardListDraw.blockCurrentArray[j];
                    int abs = Math.abs(j - awardListDraw.totalHalfBlockSize);
                    int blen = j < awardListDraw.totalHalfBlockSize ? -awardListDraw.blockLengthArray[abs] : awardListDraw.blockLengthArray[abs];

                    CGRect rect = CGRect.CGRectMake(70, 100, 660, 240);
                    float y = blen + awardListDraw.blockCorrectionPixel + 104;
                    uiRecordImage[rec_awardbar].drawAtPointOptionGuide(70, y, 18, rect);
                    uiAwardImage[awd].drawAtPointOptionGuide(74, y, 18, rect);
                    GameRenderer.setFontDoubleColor(-1, -11106408);
                    GameRenderer.setFontSize(22);
                    GameRenderer.drawStringDoubleGuideM(DataAward.awardTitle[awd], 149, y + 5, 18, rect);
                    GameRenderer.setFontSize(12);
                    GameRenderer.drawStringDoubleGuideM(DataAward.awardDescription[awd], 150, y + 32, 18, rect);

                    if (!Config.awardValues[awd])
                        uiRecordImage[rec_lock].drawAtPointOptionGuide(669, y + 5, 18, rect);
                    else
                        uiRecordImage[rec_cup].drawAtPointOptionGuide(672, y + 15, 18, rect);
                }
            uiEtcImage[etc_scrollbutton].drawAtPointOption(731.0f, (((awardListDraw.blockCurrentArray[awardListDraw.totalHalfBlockSize] * 250) / 58f) + 120) - (((awardListDraw.blockCorrectionPixel * 250) / 58f) / 250f), 10);
            GameRenderer.setFontColor(-16777216);
            GameRenderer.setFontSize(20);
            GameRenderer.drawStringM(String.format("%02d%%", (Config.getAwardCount() * 100) / 62), 320.0f, 366.0f, 20);
            GameRenderer.setFontSize(13);
            GameRenderer.drawStringM(String.format("(%02d/%02d)", Config.getAwardCount(), 62), 323.0f, 368.0f, 18);
            GameRenderer.setFontSize(20);
            GameRenderer.drawStringM(String.format("%d", Config.getAwardScore()), 610.0f, 365.0f, 18);
        }

        uiEtcImage[TLS == 0 ? etc_back_on : etc_back_off].drawAtPointOption(11.0f, 412.0f, 18);
        if (init)
            TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        int lastAction = TouchManager.lastActionStatus;
        if (Dscore) {
            if (lastAction == TouchManager.TOUCH_STATUS_NO_INPUT) { //Drag
                int cTLS = TouchManager.checkTouchListStatus();
                if (cTLS == BODY)
                    rankListDraw.backupCurrentDrawPosition();
                else if (cTLS == SIDEBAR) {
                    scrollbars[0].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    rankListDraw.setAnchorDrawPosition(scrollbars[0].BarLastValue);
                }
            } else if (lastAction == TouchManager.TOUCH_STATUS_START_INPUTED) { //Drag 2
                int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                if (cTLP == BODY) {
                    if (TouchManager.checkTouchMoveDegree(true))
                        rankListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                } else if (cTLP == SIDEBAR) {
                    scrollbars[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    rankListDraw.setAnchorDrawPosition(scrollbars[0].BarLastValue);
                }
            }
            if (lastAction != TouchManager.TOUCH_STATUS_START_PROCESSED)
                return;
            rankListDraw.resetTargetPosition();
            switch (TouchManager.checkTouchListStatus()) {
                case BACK:
                    GameThread.playSound(15);
                    MenuPage par = (MenuPage)parent;
                    par.back(true);
                    break;
                case SCORE: case AWARD:
                    GameThread.playSound(14);
                    Dscore = !Dscore;
                    break;
            }
            return;
        }
        if (lastAction == TouchManager.TOUCH_STATUS_NO_INPUT) {
            int cTLS = TouchManager.checkTouchListStatus();
            if (cTLS == BODY)
                awardListDraw.backupCurrentDrawPosition();
            else if (cTLS == SIDEBAR) {
                scrollbars[1].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                awardListDraw.setAnchorDrawPosition(scrollbars[1].BarLastValue);
            }
            return;
        } else if (lastAction == TouchManager.TOUCH_STATUS_START_INPUTED) {
            int cTLP = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            if (cTLP == BODY) {
                if (TouchManager.checkTouchMoveDegree(true))
                    awardListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
            } else if (cTLP == SIDEBAR) {
                scrollbars[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                awardListDraw.setAnchorDrawPosition(scrollbars[1].BarLastValue);
            }
            return;
        }
        if (lastAction != TouchManager.TOUCH_STATUS_START_PROCESSED) {
            return;
        }
        awardListDraw.resetTargetPosition();
        switch (TouchManager.checkTouchListStatus()) {
            case BACK:
                GameThread.playSound(15);
                MenuPage par = (MenuPage)parent;
                par.back(true);
                break;
            case SCORE: case AWARD:
                GameThread.playSound(14);
                Dscore = !Dscore;
                break;

        }
    }
}
