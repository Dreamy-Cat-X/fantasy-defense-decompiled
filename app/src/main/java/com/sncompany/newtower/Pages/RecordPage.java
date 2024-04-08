package com.sncompany.newtower.Pages;

import androidx.core.view.ViewCompat;

import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.TouchManager;

public class RecordPage extends TPage {

    public void paint_GAME_RECORD(GL10 gl10, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        rankListDraw.getArrayAndCorrection();
        awardListDraw.getArrayAndCorrection();
        float f = 660.0f;
        float f2 = 100.0f;
        float f3 = 70.0f;
        int i6 = -1;
        char c = 0;
        if (z) {
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(0, CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
            TouchManager.addTouchRectListData(1, CGRectMake(30.0f, 90.0f, 40.0f, 155.0f));
            TouchManager.addTouchRectListData(2, CGRectMake(30.0f, 245.0f, 40.0f, 155.0f));
            TouchManager.addTouchRectListData(3, CGRectMake(70.0f, 100.0f, 660.0f, 290.0f));
            TouchManager.addTouchRectListData(4, CGRectMake(730.0f, 90.0f, 40.0f, 310.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 5;
            i = TouchManager.checkTouchListStatus();
        } else {
            i = -1;
        }
        mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        mainmenuImage[3].drawAtPointOption(29.0f, 0.0f, 18);
        uiRecordImage[0].drawAtPointOption(CX, 6.0f, 17);
        uiEtcImage[0].drawAtPointOption(CX, 77.0f, 17);
        int i7 = GameThread.gameSubStatus;
        if (i7 == 0) {
            uiRecordImage[3].drawAtPointOption(30.0f, 90.0f, 18);
            int i8 = rankListDraw.totalHalfBlockSize - 1;
            int i9 = 0;
            while (i8 <= rankListDraw.totalHalfBlockSize + 1) {
                if (rankListDraw.blockCurrentArray[i8] != i6) {
                    int i10 = rankListDraw.blockCurrentArray[i8];
                    int abs = Math.abs(i8 - rankListDraw.totalHalfBlockSize);
                    if (i8 < rankListDraw.totalHalfBlockSize) {
                        i2 = -rankListDraw.blockLengthArray[abs];
                        i3 = rankListDraw.blockCorrectionPixel;
                    } else {
                        i2 = rankListDraw.blockLengthArray[abs];
                        i3 = rankListDraw.blockCorrectionPixel;
                    }
                    int i11 = i2 + i3;
                    CGRectMake(f3, 100.0f, 660.0f, 290.0f);
                    uiRecordImage[4].drawAtPointOptionGuide(f3, i11 + 100, 18, _CGRect);
                    setFontDoubleColor(i6, -16107151);
                    setFontSize(27);
                    Object[] objArr = new Object[2];
                    objArr[c] = Integer.valueOf(i10 + 1);
                    objArr[1] = GameThread.chapterName[i10];
                    drawStringDoubleGuideM(String.format("Theme %d. %s", objArr), 79.0f, i11 + 108, 18, _CGRect);
                    setFontSize(16);
                    setFontDoubleColor(-84043, -8835532);
                    float f4 = i11 + 142;
                    drawStringDoubleGuideM("Normal", 245.0f, f4, 17, _CGRect);
                    setFontDoubleColor(-3223, -10065378);
                    drawStringDoubleGuideM("Infinite", 435.0f, f4, 17, _CGRect);
                    setFontDoubleColor(-10030377, -16031651);
                    drawStringDoubleGuideM("Destroy the Moon", 625.0f, f4, 17, _CGRect);
                    setFontDoubleColor(i6, -11106408);
                    int i12 = 0;
                    while (i12 < 10) {
                        Object[] objArr2 = new Object[1];
                        int i13 = (i10 * 10) + i12;
                        objArr2[c] = Integer.valueOf(i13 + 1);
                        float f5 = i11 + 162 + (i12 * 20);
                        drawStringDoubleGuideM(String.format("Stage %d", objArr2), 80.0f, f5, 18, _CGRect);
                        int i14 = 0;
                        for (int i15 = 3; i14 < i15; i15 = 3) {
                            drawStringDoubleGuideM(String.valueOf(GameThread.highScoreValue[i13][i14]), (i14 * 190) + 245, f5, 17, _CGRect);
                            i14++;
                        }
                        i12++;
                        c = 0;
                    }
                    i9 = i11;
                }
                i8++;
                f3 = 70.0f;
                i6 = -1;
                c = 0;
            }
            int i16 = rankListDraw.blockCurrentArray[rankListDraw.totalHalfBlockSize];
            if (i16 == 0) {
                i9 = 120;
            } else if (i16 == 1) {
                i9 = 182;
            } else if (i16 == 2) {
                i9 = 245;
            } else if (i16 == 3) {
                i9 = 307;
            } else if (i16 == 4) {
                i9 = 370;
            }
            uiEtcImage[14].drawAtPointOption(731.0f, i9 - ((rankListDraw.blockCorrectionPixel * 63) / 250), 10);
        } else if (i7 == 1) {
            uiRecordImage[1].drawAtPointOption(30.0f, 90.0f, 18);
            int i17 = awardListDraw.totalHalfBlockSize - 1;
            for (int i18 = 4; i17 <= awardListDraw.totalHalfBlockSize + i18; i18 = 4) {
                if (awardListDraw.blockCurrentArray[i17] != -1) {
                    int i19 = awardListDraw.blockCurrentArray[i17];
                    int abs2 = Math.abs(i17 - awardListDraw.totalHalfBlockSize);
                    if (i17 < awardListDraw.totalHalfBlockSize) {
                        i4 = -awardListDraw.blockLengthArray[abs2];
                        i5 = awardListDraw.blockCorrectionPixel;
                    } else {
                        i4 = awardListDraw.blockLengthArray[abs2];
                        i5 = awardListDraw.blockCorrectionPixel;
                    }
                    CGRectMake(70.0f, f2, f, 240.0f);
                    uiRecordImage[2].drawAtPointOptionGuide(70.0f, r6 + 100, 18, _CGRect);
                    float f6 = i4 + i5 + 104;
                    uiAwardImage[i19].drawAtPointOptionGuide(74.0f, f6, 18, _CGRect);
                    setFontDoubleColor(-1, -11106408);
                    setFontSize(22);
                    drawStringDoubleGuideM(DataAward.awardTitle[i19], 149.0f, r6 + 110, 18, _CGRect);
                    setFontSize(12);
                    drawStringDoubleGuideM(DataAward.awardDescription[i19], 150.0f, r6 + 140, 18, _CGRect);
                    if (GameThread.awardDataFlag[i19] == 0) {
                        uiRecordImage[5].drawAtPointOptionGuide(669.0f, f6, 18, _CGRect);
                    } else {
                        uiRecordImage[6].drawAtPointOptionGuide(672.0f, r6 + 112, 18, _CGRect);
                    }
                }
                i17++;
                f = 660.0f;
                f2 = 100.0f;
            }
            uiEtcImage[14].drawAtPointOption(731.0f, (((awardListDraw.blockCurrentArray[awardListDraw.totalHalfBlockSize] * 250) / 58) + 120) - (((awardListDraw.blockCorrectionPixel * 250) / 58) / 250), 10);
            setFontColor(ViewCompat.MEASURED_STATE_MASK);
            setFontSize(20);
            drawStringM(String.format("%02d%%", Integer.valueOf((GameThread.getAwardDataCount() * 100) / 62)), 320.0f, 366.0f, 20);
            setFontSize(13);
            drawStringM(String.format("(%02d/%02d)", Integer.valueOf(GameThread.getAwardDataCount()), 62), 323.0f, 368.0f, 18);
            setFontSize(20);
            drawStringM(String.format("%d", Integer.valueOf(GameThread.getAwardScoreCount())), 610.0f, 365.0f, 18);
        }
        if (i == 0) {
            uiEtcImage[2].drawAtPointOption(11.0f, 412.0f, 18);
        } else {
            uiEtcImage[1].drawAtPointOption(11.0f, 412.0f, 18);
        }
        if (z) {
            TouchManager.swapTouchMap();
        }
    }

    public void touchCheck_GAME_RECORD() {
        int i = GameThread.gameSubStatus;
        if (i == 0) {
            int i2 = TouchManager.lastActionStatus;
            if (i2 == GAME_RECORD_TOUCH_LIST_0_BACK) {
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == 3) {
                    GameRenderer.rankListDraw.backupCurrentDrawPosition();
                } else {
                    if (checkTouchListStatus != 4) {
                        return;
                    }
                    GameThread.myScrollbar[2].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    GameRenderer.rankListDraw.setAnchorDrawPosition(GameThread.myScrollbar[2].BarLastValue);
                }
                return;
            }
            if (i2 == GAME_RECORD_TOUCH_LIST_1_SCORE) {
                int checkTouchListPressed = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                if (checkTouchListPressed == 3) {
                    if (TouchManager.checkTouchMoveDegree(true))
                        GameRenderer.rankListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                } else {
                    if (checkTouchListPressed != 4) {
                        return;
                    }
                    GameThread.myScrollbar[2].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    GameRenderer.rankListDraw.setAnchorDrawPosition(GameThread.myScrollbar[2].BarLastValue);
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            GameRenderer.rankListDraw.resetTargetPosition();
            int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus2 == 0) {
                GameRenderer.titlePressed = 19;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
            } else if (checkTouchListStatus2 == 1) {
                GameThread.playSound(14);
                GameThread.gameSubStatus = 0;
            } else if (checkTouchListStatus2 == 2) {
                GameThread.playSound(14);
                GameThread.gameSubStatus = 1;
            }
            TouchManager.processTouchStatus();
            return;
        }
        if (i != 1) {
            return;
        }
        int i3 = TouchManager.lastActionStatus;
        if (i3 == 0) {
            int checkTouchListStatus3 = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus3 == 3) {
                GameRenderer.awardListDraw.backupCurrentDrawPosition();
            } else {
                if (checkTouchListStatus3 != 4) {
                    return;
                }
                GameThread.myScrollbar[3].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                GameRenderer.awardListDraw.setAnchorDrawPosition(GameThread.myScrollbar[3].BarLastValue);
            }
            return;
        }
        if (i3 == 1) {
            int checkTouchListPressed2 = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            if (checkTouchListPressed2 == 3) {
                if (TouchManager.checkTouchMoveDegree(true))
                    GameRenderer.awardListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
            } else {
                if (checkTouchListPressed2 != 4) {
                    return;
                }
                GameThread.myScrollbar[3].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                GameRenderer.awardListDraw.setAnchorDrawPosition(GameThread.myScrollbar[3].BarLastValue);
            }
            return;
        }
        if (i3 != 2) {
            return;
        }
        GameRenderer.awardListDraw.resetTargetPosition();
        int checkTouchListStatus4 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus4 == 0) {
            GameRenderer.titlePressed = 19;
            GameThread.gameStatus = 7;
            GameRenderer.titleCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus4 == 1) {
            GameThread.playSound(14);
            GameThread.gameSubStatus = 0;
        } else if (checkTouchListStatus4 == 2) {
            GameThread.playSound(14);
            GameThread.gameSubStatus = 1;
        }
        TouchManager.processTouchStatus();
    }
}
