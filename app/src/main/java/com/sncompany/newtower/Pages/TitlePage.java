package com.sncompany.newtower.Pages;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class TitlePage extends TPage {

    public void update_GAME_TITLE() {
        gameTitleViewCount++;
        newTower.HideAdMob();
        switch (gameSubStatus) {
            case 0:
                if (gameTitleViewCount >= 17) {
                    gameSubStatus = 1;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 1:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 2;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 2:
                if (gameTitleViewCount >= 7) {
                    gameSubStatus = 3;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 3:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 4;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 4:
                if (gameTitleViewCount >= 7) {
                    gameSubStatus = 5;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 5:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 6;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 6:
                if (gameTitleViewCount >= 17) {
                    gameSubStatus = 7;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 7:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 8;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 8:
                if (gameTitleViewCount >= 15) {
                    gameSubStatus = 9;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 9:
                if (gameTitleViewCount >= 30) {
                    gameSubStatus = 10;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 10:
                if (gameTitleViewCount >= 30) {
                    gameSubStatus = 11;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 11:
                if (gameTitleViewCount >= 10) {
                    gameSubStatus = 12;
                    gameTitleViewCount = 0;
                    playLoopSound(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void paint_GAME_TITLE(GL10 gl10) {
        int checkTouchListStatus;
        float f;
        float f2;
        float f3;
        TouchManager.clearTouchMap();
        if (GameThread.gameSubStatus == 12) {
            TouchManager.addTouchRectListData(0, CGRectMake(296.0f, 337.0f, 208.0f, 48.0f));
            TouchManager.addTouchRectListData(1, CGRectMake(326.0f, 412.0f, 148.0f, 36.0f));
            TouchManager.addTouchRectListData(2, CGRectMake(9.0f, 429.0f, 42.0f, 42.0f));
            TouchManager.addTouchRectListData(4, CGRectMake(56.0f, 429.0f, 42.0f, 42.0f));
            TouchManager.addTouchRectListData(3, CGRectMake(104.0f, 429.0f, 42.0f, 42.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 19;
            checkTouchListStatus = TouchManager.checkTouchListStatus();
        } else {
            TouchManager.addTouchRectListData(0, CGRectMake(0.0f, 0.0f, 800.0f, 480.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 19;
            checkTouchListStatus = TouchManager.checkTouchListStatus();
        }
        switch (GameThread.gameSubStatus) {
            case 0:
            case 2:
            case 4:
            case 6:
                titleImage[0].drawAtPointOption(0.0f, 0.0f, 18);
                titleImage[2].drawAtPointOption(0.0f, 9, 18);
                titleImage[4].drawAtPointOption(64.0f, 38, 18);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
                fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                titleImage[3].drawAtPointOption(0.0f, 9, 18);
                titleImage[4].drawAtPointOption(64.0f, 38, 18);
                break;
            case 8:
                float f4 = (((GAME_TITLE_BOSS_VIEW_POS - ((int) titleBossImage[0]._sizeY)) - ((int) titleBossImage[1]._sizeY)) - ((int) titleBossImage[2]._sizeY)) - ((int) titleBossImage[3]._sizeY);
                float f5 = 1.0f - (GameThread.gameTitleViewCount * 0.066f);
                titleImage[0].drawAtPointOption(0.0f, 0.0f, 18);
                titleBossImage[2].drawAtPointOption(0.0f, ((int) r3[0]._sizeY) + f4 + ((int) titleBossImage[1]._sizeY), 18);
                titleBossImage[3].drawAtPointOption(0.0f, f4 + ((int) r3[0]._sizeY) + ((int) titleBossImage[1]._sizeY) + ((int) titleBossImage[2]._sizeY), 18);
                if (f5 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f5, f5, f5, f5);
                    fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                }
                titleImage[3].drawAtPointOption(0.0f, 9, 18);
                titleImage[4].drawAtPointOption(64.0f, 38, 18);
                break;
            case 9:
                int i = (GameThread.gameTitleViewCount * 108) + 9;
                int i2 = (GameThread.gameTitleViewCount * 108) + 38;
                float f6 = ((((GAME_TITLE_BOSS_VIEW_POS - ((int) titleBossImage[0]._sizeY)) - ((int) titleBossImage[1]._sizeY)) - ((int) titleBossImage[2]._sizeY)) - ((int) titleBossImage[3]._sizeY)) + (GameThread.gameTitleViewCount * 54);
                int i3 = GAME_TITLE_BOSS_VIEW_POS;
                if (f6 > i3) {
                    f6 = i3;
                }
                titleImage[0].drawAtPointOption(0.0f, 0.0f, 18);
                titleBossImage[0].drawAtPointOption(0.0f, f6, 18);
                titleBossImage[1].drawAtPointOption(0.0f, ((int) r4[0]._sizeY) + f6, 18);
                titleBossImage[2].drawAtPointOption(0.0f, ((int) r4[0]._sizeY) + f6 + ((int) titleBossImage[1]._sizeY), 18);
                titleBossImage[3].drawAtPointOption(0.0f, f6 + ((int) r4[0]._sizeY) + ((int) titleBossImage[1]._sizeY) + ((int) titleBossImage[2]._sizeY), 18);
                titleImage[3].drawAtPointOption(0.0f, i, 18);
                titleImage[4].drawAtPointOption(64.0f, i2, 18);
                break;
            case 10:
                float f7 = GAME_TITLE_BOSS_VIEW_POS;
                int i4 = GameThread.gameTitleViewCount;
                titleImage[0].drawAtPointOption(0.0f, 0.0f, 18);
                titleImage[1].drawAtPointOption(0.0f, 0.0f, 18);
                titleBossImage[0].drawAtPointOption(0.0f, f7, 18);
                titleBossImage[1].drawAtPointOption(0.0f, f7 + ((int) r2[0]._sizeY), 18);
                titleImage[7].drawAtPointOption(277.0f, 30.0f, 18);
                titleImage[5].drawAtPointOption(41.0f, 22.0f, 18);
                if (GameThread.gameTimeCount % 40 <= 20) {
                    f = (GameThread.gameTimeCount % 40) * TITLE_GLOW_MOVE_DEGREE;
                } else {
                    f = 1.0f - (((GameThread.gameTimeCount % 40) - 20) * TITLE_GLOW_MOVE_DEGREE);
                }
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f, f, f, f);
                titleImage[6].drawAtPointOption(24.0f, 6.0f, 18);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                if (f > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f, f, f, f);
                    fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                break;
            case 11:
                float f8 = GAME_TITLE_BOSS_VIEW_POS;
                titleImage[0].drawAtPointOption(0.0f, 0.0f, 18);
                titleImage[1].drawAtPointOption(0.0f, 0.0f, 18);
                titleBossImage[0].drawAtPointOption(0.0f, f8, 18);
                titleBossImage[1].drawAtPointOption(0.0f, f8 + ((int) r2[0]._sizeY), 18);
                titleImage[7].drawAtPointOption(277.0f, 30.0f, 18);
                titleImage[5].drawAtPointOption(41.0f, 22.0f, 18);
                if (GameThread.gameTimeCount % 40 <= 20) {
                    f2 = (GameThread.gameTimeCount % 40) * TITLE_GLOW_MOVE_DEGREE;
                } else {
                    f2 = 1.0f - (((GameThread.gameTimeCount % 40) - 20) * TITLE_GLOW_MOVE_DEGREE);
                }
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f2, f2, f2, f2);
                titleImage[6].drawAtPointOption(24.0f, 6.0f, 18);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                float f9 = GameThread.gameTitleViewCount * 0.1f;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f9, f9, f9, f9);
                titleImage[8].drawAtPointOption(296.0f, 337.0f, 18);
                titleImage[10].drawAtPointOption(326.0f, 412.0f, 18);
                titleImage[12].drawAtPointOption(CX, 456.0f, 17);
                titleImage[13].drawAtPointOption(9.0f, 429.0f, 18);
                titleImage[14].drawAtPointOption(56.0f, 429.0f, 18);
                titleImage[15].drawAtPointOption(104.0f, 429.0f, 18);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                break;
            case 12:
                float f10 = GAME_TITLE_BOSS_VIEW_POS;
                titleImage[0].drawAtPointOption(0.0f, 0.0f, 18);
                titleImage[1].drawAtPointOption(0.0f, 0.0f, 18);
                titleBossImage[0].drawAtPointOption(0.0f, f10, 18);
                titleBossImage[1].drawAtPointOption(0.0f, f10 + ((int) r2[0]._sizeY), 18);
                titleImage[7].drawAtPointOption(277.0f, 30.0f, 18);
                titleImage[5].drawAtPointOption(41.0f, 22.0f, 18);
                if (GameThread.gameTimeCount % 40 <= 20) {
                    f3 = (GameThread.gameTimeCount % 40) * TITLE_GLOW_MOVE_DEGREE;
                } else {
                    f3 = 1.0f - (((GameThread.gameTimeCount % 40) - 20) * TITLE_GLOW_MOVE_DEGREE);
                }
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f3, f3, f3, f3);
                titleImage[6].drawAtPointOption(24.0f, 6.0f, 18);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                if (checkTouchListStatus == 0) {
                    titleImage[9].drawAtPointOption(296.0f, 337.0f, 18);
                } else {
                    titleImage[8].drawAtPointOption(296.0f, 337.0f, 18);
                }
                if (checkTouchListStatus == 1) {
                    titleImage[11].drawAtPointOption(326.0f, 412.0f, 18);
                } else {
                    titleImage[10].drawAtPointOption(326.0f, 412.0f, 18);
                }
                titleImage[12].drawAtPointOption(CX, 456.0f, 17);
                titleImage[13].drawAtPointOption(9.0f, 429.0f, 18);
                titleImage[14].drawAtPointOption(56.0f, 429.0f, 18);
                titleImage[15].drawAtPointOption(104.0f, 429.0f, 18);
                break;
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_OPTION(GL10 gl10) {
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(0, CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
        TouchManager.addTouchRectListData(1, CGRectMake(310.0f, 140.0f, 390.0f, 40.0f));
        TouchManager.addTouchRectListData(2, CGRectMake(310.0f, 225.0f, 390.0f, 40.0f));
        TouchManager.addTouchRectListData(3, CGRectMake(218.0f, 307.0f, 118.0f, 46.0f));
        TouchManager.addTouchRectListData(4, CGRectMake(583.0f, 307.0f, 118.0f, 46.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 5;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        alwaysImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        uiEtcImage[3].drawAtPointOption(CX, 6.0f, 17);
        uiEtcImage[4].drawAtPointOption(CX, 77.0f, 17);

        uiEtcImage[Config.movie ? 5 : 8].drawAtPointOption(218.0f, 307.0f, 18);
        uiEtcImage[Config.vibration ? 5 : 8].drawAtPointOption(583.0f, 307.0f, 18);

        uiEtcImage[14].drawAtPointOption(GameThread.myScrollbar[0].BarLastPosition, 159.0f, 9);
        uiEtcImage[14].drawAtPointOption(GameThread.myScrollbar[1].BarLastPosition, 244.0f, 9);
        if (checkTouchListStatus == 0) {
            uiEtcImage[2].drawAtPointOption(11.0f, 412.0f, 18);
        } else {
            uiEtcImage[1].drawAtPointOption(11.0f, 412.0f, 18);
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_ABOUT(GL10 gl10) {
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(0, CGRectMake(11.0f, 412.0f, 68.0f, 58.0f));
        TouchManager.addTouchRectListData(1, CGRectMake(340.0f, 130.0f, 260.0f, 50.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 2;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        alwaysImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        uiEtcImage[0].drawAtPointOption(CX, 77.0f, 17);
        int i = GameThread.gameSubStatus;
        if (i == 0) {
            uiEtcImage[11].drawAtPointOption(CX, 5.0f, 17);
            setFontSize(20);
            setFontColor(-1);
            drawStringM("'Fantasy Defence' Version 2.0.1", CX, 100.0f, 17);
            drawStringM("Developed by SN Mobile Technology Inc.", CX, 150.0f, 17);
            drawStringM("Copyright 2011", CX, 175.0f, 17);
            drawStringM("SN Mobile Technology", CX, 200.0f, 17);
            drawStringM("All rights reserved", CX, 225.0f, 17);
            drawStringM("For support, please contact", CX, 250.0f, 17);
            drawStringM("cs@sncompany.com", CX, 275.0f, 17);
        } else if (i == 1) {
            uiEtcImage[12].drawAtPointOption(CX, 5.0f, 17);
            setFontSize(20);
            setFontColor(-1);
            drawStringM("General Director : Dong Hwa, Woo.", CX, 140.0f, 17);
            drawStringM("Producer : Min Young, Han.", CX, 165.0f, 17);
            drawStringM("Programmer : Haeng Bok, Lee.", CX, 190.0f, 17);
            drawStringM("Artist : Han Joo, Kang.", CX, 215.0f, 17);
            drawStringM("Game Designer : Min Young, Han.", CX, 240.0f, 17);
            drawStringM("Sub. Game Designer : Jin Kook, Park.", CX, 265.0f, 17);
            drawStringM("Production Company : SN Mobile Technology.", CX, 290.0f, 17);
        }
        if (checkTouchListStatus == 0) {
            uiEtcImage[2].drawAtPointOption(11.0f, 412.0f, 18);
        } else {
            uiEtcImage[1].drawAtPointOption(11.0f, 412.0f, 18);
        }
        TouchManager.swapTouchMap();
    }

    public void touchCheck_GAME_TITLE() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        switch (GameThread.gameSubStatus) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (TouchManager.checkTouchListStatus() == 0) {
                    GameThread.gameSubStatus = 12;
                    GameThread.playLoopSound(0);
                    break;
                }
                break;
            case 12:
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == 0) {
                    GameThread.gameStatus = 5;
                    GameThread.playSound(14);
                    GameThread.stopLoopSound(0);
                    GameThread.playLoopSound(1);
                    TouchManager.curruptFlag = true;
                    break;
                } else if (checkTouchListStatus == 1) {
                    GameThread.playSound(14);
                    GameThread.gameStatus = 9;
                    break;
                } else if (checkTouchListStatus == 2) {
                    GameThread.playSound(14);
                    GameThread.gameStatus = 8;
                    GameThread.gameSubStatus = 0;
                    break;
                } else if (checkTouchListStatus == 3) {
                    newTower.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/fandikor")), 1);
                    break;
                } else if (checkTouchListStatus == 4) {
                    newTower.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("http://www.twitter.com/fandi_kor")), 1);
                    break;
                }
                break;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_ABOUT() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        int i = GameThread.gameSubStatus;
        if (i != 0) {
            if (i == 1 && checkTouchListStatus == 0) {
                GameThread.gameSubStatus = 0;
                GameThread.playSound(15);
            }
        } else if (checkTouchListStatus == 0) {
            GameThread.gameStatus = 3;
            GameThread.gameSubStatus = 12;
            GameThread.gameTitleViewCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus == 1) {
            GameThread.gameSubStatus = 1;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_OPTION() {
        int i = TouchManager.lastActionStatus;
        if (i == 0) {
            CGPoint firstFirstActionTouch = TouchManager.getFirstFirstActionTouch();
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus == 1) {
                GameThread.myScrollbar[0].setUpdatePosition(firstFirstActionTouch.x);
                Config.updateVolume(GameThread.myScrollbar[0].BarLastValue);
            } else {
                if (checkTouchListStatus != 2) {
                    return;
                }
                GameThread.myScrollbar[1].setUpdatePosition(firstFirstActionTouch.x);
                Config.effectVolume = GameThread.myScrollbar[1].BarLastValue;
            }
            return;
        }
        if (i == 1) {
            int checkTouchListPressed = TouchManager.checkTouchListPressed(TouchManager.getFirstFirstActionTouch());
            if (checkTouchListPressed == 1) {
                GameThread.myScrollbar[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
                Config.updateVolume(GameThread.myScrollbar[0].BarLastValue);
                return;
            }
            if (checkTouchListPressed != 2) {
                return;
            }
            GameThread.myScrollbar[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
            Config.effectVolume = GameThread.myScrollbar[1].BarLastValue;
            return;
        }
        if (i != 2) {
            return;
        }
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus2 == 0) {
            GameThread.gameStatus = 3;
            GameThread.gameSubStatus = 12;
            GameThread.gameTitleViewCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus2 == 3) {
            GameThread.playSound(14);
            Config.movie = !Config.movie;
            Config.saveAll(newTower);
        } else if (checkTouchListStatus2 == 4) {
            GameThread.playSound(14);
            Config.vibration = !Config.vibration;

            Config.saveAll(newTower);
        }
        int checkTouchListPressed2 = TouchManager.checkTouchListPressed(TouchManager.getFirstFirstActionTouch());
        if (checkTouchListPressed2 == 1) {
            GameThread.myScrollbar[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
            Config.updateVolume(GameThread.myScrollbar[0].BarLastValue);
            Config.saveAll(newTower);
        } else if (checkTouchListPressed2 == 2) {
            GameThread.myScrollbar[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
            Config.effectVolume = GameThread.myScrollbar[1].BarLastValue;
            Config.saveAll(newTower);
        }
        TouchManager.processTouchStatus();
    }
}
