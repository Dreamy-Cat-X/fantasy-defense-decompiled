package com.sncompany.newtower.Pages;

import androidx.core.view.ViewCompat;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

public class MenuPage extends TPage { //Note: This one's parent will always be TitlePage

    public static final int[] mainmenuResource = {R.drawable.ui_mainmenu_background2, R.drawable.ui_mainmenu_startonl, R.drawable.ui_mainmenu_helponl, R.drawable.ui_mainmenu_recordonl, R.drawable.ui_mainmenu_upgradeonl, R.drawable.ui_mainmenu_shoponl, R.drawable.ui_mainmenu_backonl};
    public static final float[][] onPos = {{514.0f, 0.0f}, {228.0f, 5.0f}, {29.0f, 0.0f}, {383.0f, 204.0f}, {87.0f, 254.0f}};

    public final Texture2D[] mainmenuImage = new Texture2D[mainmenuResource.length];
    public int titlePressed = 0;

    public void paint_GAME_MAINMENU(GL10 gl10) {
        TouchManager.clearTouchMap();
        mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        TouchManager.addTouchRectListData(0, CGRectMake(535.0f, 0.0f, 265.0f, 206.0f));
        TouchManager.addTouchRectListData(1, CGRectMake(98.0f, 258.0f, 236.0f, 203.0f));
        TouchManager.addTouchRectListData(2, CGRectMake(227.0f, 2.0f, 225.0f, 159.0f));
        TouchManager.addTouchRectListData(3, CGRectMake(5.0f, 23.0f, 190.0f, 207.0f));
        TouchManager.addTouchRectListData(4, CGRectMake(398.0f, 205.0f, 324.0f, 247.0f));
        TouchManager.addTouchRectListData(5, CGRectMake(0.0f, 333.0f, 92.0f, 129.0f));
        TouchManager.addTouchRectListData(6, CGRectMake(700.0f, 333.0f, 114.0f, 129.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 7;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus == 5) {
            uiEtcImage[2].drawAtPointOption(1.0f, 421.0f, 18);
        } else {
            uiEtcImage[1].drawAtPointOption(1.0f, 421.0f, 18);
        }
        if (checkTouchListStatus == 5) {
            uiEtcImage[15].drawAtPointOption(680.0f, 371.0f, 18);
        } else {
            uiEtcImage[15].drawAtPointOption(680.0f, 371.0f, 18);
        }
        double currentTimeMillis = System.currentTimeMillis() - GameThread.freeAdViewTime;
        Double.isNaN(currentTimeMillis);
        int i = (int) (currentTimeMillis / 1000.0d);
        setFontSize(17);
        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
        drawStringDoubleM(String.format("%d/5", Integer.valueOf(GameThread.freeAdViewCount)), 740.0f, 450.0f, 17);
        if (GameThread.freeAdViewCount < 5) {
            if (i > 900) {
                double d = GameThread.freeAdViewTime;
                Double.isNaN(d);
                GameThread.freeAdViewTime = (long) (d + 900000.0d);
                GameThread.freeAdViewCount++;
            }
            int i2 = GameThread.FREE_REWARD_MOVIE_TIME - i;
            int i3 = i2 > 60 ? i2 / 60 : 0;
            setFontSize(14);
            drawStringDoubleM(String.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2 % 60)), 740.0f, 437.0f, 17);
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_MAINMENU_MOVING(GL10 gl10) {
        TouchManager.clearTouchMap();
        mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        int i = titleCount;
        if (i < TITLE_MAINMENU_COUNT_FADE_AWAY_REMOVE_COUNT) {
            float f = 1.0f - (i * TITLE_MAINMENU_COUNT_FADE_AWAY_RATE);
            if (f > 0.0f) {
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(f, f, f, f);
                if (titlePressed == 3) {
                    uiEtcImage[2].drawAtPointOption(1.0f, 421.0f, 18);
                } else {
                    uiEtcImage[1].drawAtPointOption(1.0f, 421.0f, 18);
                }
            }
        }
        if (titleCount >= TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_POS) {
            float f2 = (r0 - r4) * TITLE_MAINMENU_COUNT_LIGHT_FADE_IN_RATE;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            gl10.glTexEnvf(8960, 8704, 8448.0f);
            gl10.glColor4f(f2, f2, f2, f2);
            if (titlePressed == 10) {
                mainmenuImage[1].drawAtPointOption(514.0f, 0.0f, 18);
            }
            if (titlePressed == 14) {
                mainmenuImage[5].drawAtPointOption(87.0f, 254.0f, 18);
            }
            if (titlePressed == 15) {
                mainmenuImage[5].drawAtPointOption(87.0f, 254.0f, 18);
            }
            if (titlePressed == 18) {
                mainmenuImage[2].drawAtPointOption(228.0f, 5.0f, 18);
            }
            if (titlePressed == 19) {
                mainmenuImage[3].drawAtPointOption(29.0f, 0.0f, 18);
            }
            if (titlePressed == 11) {
                mainmenuImage[4].drawAtPointOption(383.0f, 204.0f, 18);
            }
        }
        int i2 = titleCount;
        int i3 = TITLE_MAINMENU_COUNT_FADE_IN_START_POS;
        if (i2 >= i3) {
            if (i2 > i3) {
                float f3 = (i2 - i3) * TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f3, f3, f3, f3);
                fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            float f4 = (titleCount - TITLE_MAINMENU_COUNT_FADE_IN_START_POS) * TITLE_MAINMENU_COUNT_FADE_IN_RATE;
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            if (f4 > 0.0f) {
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(f4, f4, f4, f4);
                switch (titlePressed) {
                    case 11:
                        paint_GAME_UPGRADE_LIST(gl10, false);
                        break;
                    case 12:
                        paint_GAME_UPGRADE_UNIT(gl10, false);
                        break;
                    case 14:
                        paint_GAME_SHOP_LIST(gl10, false);
                        break;
                    case 15:
                        paint_GAME_SHOP_SHOP(gl10, false);
                        break;
                }
            }
        }
        gl10.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_MAINMENU_REV_MOVING(GL10 gl10) {
        TouchManager.clearTouchMap();
        mainmenuImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        if (titleCount >= TITLE_MAINMENU_REV_COUNT_FADE_IN_START_POS) {
            float f = (r0 - r4) * TITLE_MAINMENU_REV_COUNT_FADE_AWAY_RATE;
            if (f > 1.0f) {
                f = 1.0f;
            }
            gl10.glTexEnvf(8960, 8704, 8448.0f);
            gl10.glColor4f(f, f, f, f);
            if (titlePressed == 3) {
                uiEtcImage[2].drawAtPointOption(1.0f, 421.0f, 18);
            } else {
                uiEtcImage[1].drawAtPointOption(1.0f, 421.0f, 18);
            }
        }
        float f2 = titleCount >= TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_POS ? 1.0f - ((r0 - r4) * TITLE_MAINMENU_REV_COUNT_LIGHT_FADE_OUT_RATE) : 1.0f;
        if (f2 > 0.0f) {
            gl10.glTexEnvf(8960, 8704, 8448.0f);
            gl10.glColor4f(f2, f2, f2, f2);
            int i = titlePressed;
            if (i != 3) {
                switch (i) {
                    case 10:
                        mainmenuImage[1].drawAtPointOption(514.0f, 0.0f, 18);
                        break;
                    case 11:
                    case 12:
                        mainmenuImage[4].drawAtPointOption(383.0f, 204.0f, 18);
                        break;
                    default:
                        switch (i) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                mainmenuImage[5].drawAtPointOption(87.0f, 254.0f, 18);
                                break;
                            case 18:
                                mainmenuImage[2].drawAtPointOption(228.0f, 5.0f, 18);
                                break;
                            case 19:
                                mainmenuImage[3].drawAtPointOption(29.0f, 0.0f, 18);
                                break;
                        }
                }
            } else {
                mainmenuImage[6].drawAtPointOption(8.0f, 318.0f, 18);
            }
        }
        int i2 = titleCount;
        int i3 = TITLE_MAINMENU_REV_COUNT_FADE_AWAY_REMOVE_COUNT;
        if (i2 <= i3) {
            if (i2 < i3) {
                float f3 = 0.5f - (i2 * TITLE_MAINMENU_COUNT_FADE_IN_BLACK_DEGREE);
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f3, f3, f3, f3);
                fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            float f4 = 1.0f - (titleCount * TITLE_MAINMENU_REV_COUNT_FADE_OUT_RATE);
            if (f4 > 0.0f) {
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(f4, f4, f4, f4);
                switch (titlePressed) {
                    case 11:
                        paint_GAME_UPGRADE_LIST(gl10, false);
                        break;
                    case 12:
                        paint_GAME_UPGRADE_UNIT(gl10, false);
                        break;
                    case 13:
                        paint_GAME_UPGRADE_HERO(gl10, false);
                        break;
                    case 14:
                        paint_GAME_SHOP_LIST(gl10, false);
                        break;
                    case 15:
                        paint_GAME_SHOP_SHOP(gl10, false);
                        break;
                    case 16:
                        paint_GAME_SHOP_EQUIP(gl10, false);
                        break;
                    case 18:
                        paint_GAME_HELP(gl10, false);
                        break;
                    case 19:
                        paint_GAME_RECORD(gl10, false);
                        break;
                }
            }
        }
        gl10.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        TouchManager.swapTouchMap();
    }

    public void touchCheck_GAME_MAINMENU() {
        int i = TouchManager.lastActionStatus;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            TouchManager.processTouchStatus();
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            if (TouchManager.curruptFlag) {
                TouchManager.clearTouchStatus();
                return;
            }
            switch (checkTouchListStatus) {
                case 0:
                    GameRenderer.titlePressed = 10;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 1:
                    GameRenderer.titlePressed = 14;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 2:
                    GameRenderer.titlePressed = 18;
                    GameThread.gameHelpViewNum = 0;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 3:
                    GameRenderer.titlePressed = 19;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 4:
                    GameRenderer.titlePressed = 11;
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 5:
                    GameThread.gameStatus = 3;
                    GameThread.gameSubStatus = 0;
                    GameThread.gameTitleViewCount = 0;
                    GameThread.stopLoopSound(1);
                    GameThread.stopLoopSound(0);
                    newTower.HideAdMob();
                    break;
                case 6:
                    newTower.HideAdMob();
                    if (GameThread.freeAdViewCount > 0) {
                        newTower.showMainMenuRewardDialog();
                    } else {
                        newTower.showNotRewardDialog();
                    }
                    break;
            }
        }
        TouchManager.clearTouchStatus();
    }

    public void touchCheck_GAME_MAINMENU_MOVING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_MAINMENU_REV_MOVING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void drawOn(GL10 gl, int i) {
        int loc = i - 1;
        mainmenuImage[i].drawAtPointOption(onPos[loc][0], onPos[loc][1], 18);
    }
}
