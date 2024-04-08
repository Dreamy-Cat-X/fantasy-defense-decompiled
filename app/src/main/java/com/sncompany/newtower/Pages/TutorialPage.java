package com.sncompany.newtower.Pages;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.TouchManager;

public class TutorialPage extends TPage {

    public void update_GAME_TUTORIAL() {
        int i;
        for (int i2 = 0; i2 < 11; i2++) {
            myOscillator[i2].updatePosition();
        }
        sortTowerEnemyUnit();
        for (int i3 = 0; i3 < 22; i3++) {
            int[] iArr = tutorialBoxTouchFlag;
            if (iArr[i3] > 0 && iArr[i3] < 10) {
                iArr[i3] = iArr[i3] + 1;
            }
        }
        int i4 = gameSubStatus;
        char c = 2;
        if (i4 == 1) {
            int[] iArr2 = tutorialBoxTouchFlag;
            if (iArr2[0] == 10 && iArr2[1] == 10 && iArr2[2] == 10 && iArr2[3] == 10 && iArr2[4] == 10) {
                gameSubStatus = 2;
                return;
            }
            return;
        }
        if (i4 == 2) {
            int[] iArr3 = tutorialBoxTouchFlag;
            if (iArr3[5] == 10 && iArr3[6] == 10 && iArr3[7] == 10) {
                gameSubStatus = 3;
                tutorialViewCount = 0;
                characterMenuSelectFlag = 0;
                return;
            }
            return;
        }
        if (i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 13 || i4 == 15) {
            int i5 = gameSubStatus;
            if (i5 == 3) {
                i = 0;
                c = 0;
            } else if (i5 == 5) {
                i = 3;
                c = 1;
            } else if (i5 == 7) {
                i = 12;
            } else if (i5 == 9) {
                i = 15;
                c = 3;
            } else if (i5 == 11) {
                i = 24;
                c = 4;
            } else if (i5 != 13) {
                i = 0;
                c = 6;
            } else {
                i = 27;
                c = 5;
            }
            if (TouchManager.getPressedCount() == 0) {
                tutorialViewCount++;
            }
            int[][] iArr4 = tutorialUnitPos;
            if (checkTowerPos(i, iArr4[c][0], iArr4[c][1])) {
                int i6 = gameSubStatus;
                if (i6 == 3) {
                    gameSubStatus = 4;
                    return;
                }
                if (i6 == 5) {
                    gameSubStatus = 6;
                    return;
                }
                if (i6 == 7) {
                    gameSubStatus = 8;
                    return;
                }
                if (i6 == 9) {
                    gameSubStatus = 10;
                    return;
                }
                if (i6 == 11) {
                    gameSubStatus = 12;
                } else if (i6 == 13) {
                    gameSubStatus = 14;
                } else {
                    if (i6 != 15) {
                        return;
                    }
                    gameSubStatus = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x096c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void paint_GAME_TUTORIAL(GL10 gl10) {
        char c;
        int i;
        float f;
        int i2;
        int i3;
        boolean z;
        char c2;
        int i4;
        int i5;
        char c3;
        char c4;
        checkBackBase();
        backBaseImageArray[lastShowBackBase].drawAtPointOption(0.0f, 0.0f, 18);
        backShadowImage.drawAtPointOption(0.0f, 0.0f, 18);
        drawMapTile(gl10);
        drawAllUnit(gl10);
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(11, CGRectMake(0.0f, 437.0f, 43.0f, 39.0f));
        int i6 = 12;
        switch (GameThread.gameSubStatus) {
            case 1:
                TouchManager.addTouchRectListData(10, CGRectMake(GameThread.tutorialBoxLinePos[0][4], GameThread.tutorialBoxLinePos[0][5], GameThread.tutorialBoxLinePos[0][6], GameThread.tutorialBoxLinePos[0][7]));
                TouchManager.addTouchRectListData(11, CGRectMake(GameThread.tutorialBoxLinePos[1][4], GameThread.tutorialBoxLinePos[1][5], GameThread.tutorialBoxLinePos[1][6], GameThread.tutorialBoxLinePos[1][7]));
                TouchManager.addTouchRectListData(12, CGRectMake(GameThread.tutorialBoxLinePos[2][4], GameThread.tutorialBoxLinePos[2][5], GameThread.tutorialBoxLinePos[2][6], GameThread.tutorialBoxLinePos[2][7]));
                TouchManager.addTouchRectListData(13, CGRectMake(GameThread.tutorialBoxLinePos[3][4], GameThread.tutorialBoxLinePos[3][5], GameThread.tutorialBoxLinePos[3][6], GameThread.tutorialBoxLinePos[3][7]));
                TouchManager.addTouchRectListData(14, CGRectMake(GameThread.tutorialBoxLinePos[4][4], GameThread.tutorialBoxLinePos[4][5], GameThread.tutorialBoxLinePos[4][6], GameThread.tutorialBoxLinePos[4][7]));
                break;
            case 2:
                TouchManager.addTouchRectListData(15, CGRectMake(GameThread.tutorialBoxLinePos[5][4], GameThread.tutorialBoxLinePos[5][5], GameThread.tutorialBoxLinePos[5][6], GameThread.tutorialBoxLinePos[5][7]));
                TouchManager.addTouchRectListData(16, CGRectMake(GameThread.tutorialBoxLinePos[6][4], GameThread.tutorialBoxLinePos[6][5], GameThread.tutorialBoxLinePos[6][6], GameThread.tutorialBoxLinePos[6][7]));
                TouchManager.addTouchRectListData(17, CGRectMake(GameThread.tutorialBoxLinePos[7][4], GameThread.tutorialBoxLinePos[7][5], GameThread.tutorialBoxLinePos[7][6], GameThread.tutorialBoxLinePos[7][7]));
                break;
            case 3:
                TouchManager.addTouchRectListData(0, CGRectMake(742.0f, 77.0f, 56.0f, 56.0f));
                break;
            case 4:
                TouchManager.addTouchRectListData(18, CGRectMake(GameThread.tutorialBoxLinePos[8][4], GameThread.tutorialBoxLinePos[8][5], GameThread.tutorialBoxLinePos[8][6], GameThread.tutorialBoxLinePos[8][7]));
                break;
            case 5:
                TouchManager.addTouchRectListData(1, CGRectMake(742.0f, 142.0f, 56.0f, 56.0f));
                break;
            case 6:
                TouchManager.addTouchRectListData(19, CGRectMake(GameThread.tutorialBoxLinePos[9][4], GameThread.tutorialBoxLinePos[9][5], GameThread.tutorialBoxLinePos[9][6], GameThread.tutorialBoxLinePos[9][7]));
                break;
            case 7:
                TouchManager.addTouchRectListData(2, CGRectMake(742.0f, 207.0f, 56.0f, 56.0f));
                break;
            case 8:
                TouchManager.addTouchRectListData(20, CGRectMake(GameThread.tutorialBoxLinePos[10][4], GameThread.tutorialBoxLinePos[10][5], GameThread.tutorialBoxLinePos[10][6], GameThread.tutorialBoxLinePos[10][7]));
                break;
            case 9:
                TouchManager.addTouchRectListData(3, CGRectMake(742.0f, 272.0f, 56.0f, 56.0f));
                break;
            case 10:
                TouchManager.addTouchRectListData(21, CGRectMake(GameThread.tutorialBoxLinePos[11][4], GameThread.tutorialBoxLinePos[11][5], GameThread.tutorialBoxLinePos[11][6], GameThread.tutorialBoxLinePos[11][7]));
                break;
            case 11:
                TouchManager.addTouchRectListData(4, CGRectMake(742.0f, 337.0f, 56.0f, 56.0f));
                break;
            case 12:
                TouchManager.addTouchRectListData(22, CGRectMake(GameThread.tutorialBoxLinePos[12][4], GameThread.tutorialBoxLinePos[12][5], GameThread.tutorialBoxLinePos[12][6], GameThread.tutorialBoxLinePos[12][7]));
                break;
            case 13:
                TouchManager.addTouchRectListData(5, CGRectMake(742.0f, 402.0f, 56.0f, 56.0f));
                break;
            case 14:
                TouchManager.addTouchRectListData(23, CGRectMake(GameThread.tutorialBoxLinePos[13][4], GameThread.tutorialBoxLinePos[13][5], GameThread.tutorialBoxLinePos[13][6], GameThread.tutorialBoxLinePos[13][7]));
                break;
            case 15:
                int i7 = GameThread.characterMenuSelectFlag;
                if (i7 != 0) {
                    if (i7 == 3) {
                        TouchManager.addTouchRectListData(7, CGRectMake(558.0f, 12.0f, 56.0f, 56.0f));
                        TouchManager.addTouchRectListData(8, CGRectMake(618.0f, 12.0f, 56.0f, 56.0f));
                        TouchManager.addTouchRectListData(9, CGRectMake(678.0f, 12.0f, 56.0f, 56.0f));
                        break;
                    }
                } else {
                    TouchManager.addTouchRectListData(7, CGRectMake(742.0f, 12.0f, 56.0f, 56.0f));
                    break;
                }
                break;
            case 16:
                TouchManager.addTouchRectListData(24, CGRectMake(GameThread.tutorialBoxLinePos[14][4], GameThread.tutorialBoxLinePos[14][5], GameThread.tutorialBoxLinePos[14][6], GameThread.tutorialBoxLinePos[14][7]));
                break;
            case 17:
                TouchManager.addTouchRectListData(25, CGRectMake(GameThread.tutorialBoxLinePos[15][4], GameThread.tutorialBoxLinePos[15][5], GameThread.tutorialBoxLinePos[15][6], GameThread.tutorialBoxLinePos[15][7]));
                break;
            case 18:
                TouchManager.addTouchRectListData(26, CGRectMake(GameThread.tutorialBoxLinePos[16][4], GameThread.tutorialBoxLinePos[16][5], GameThread.tutorialBoxLinePos[16][6], GameThread.tutorialBoxLinePos[16][7]));
                break;
            case 19:
                TouchManager.addTouchRectListData(27, CGRectMake(209.0f, 289.0f, 381.0f, 65.0f));
                break;
            case 20:
                TouchManager.addTouchRectListData(28, CGRectMake(209.0f, 289.0f, 381.0f, 65.0f));
                break;
            case 21:
            case 22:
                TouchManager.addTouchRectListData(30, CGRectMake(209.0f, 289.0f, 381.0f, 65.0f));
                break;
        }
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 31;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        uiUpperImage[7].drawAtPointOption(0.0f, 0.0f, 18);
        uiUpperImage[1].drawAtPointOption(9.0f, 4.0f, 18);
        uiUpperImage[0].drawAtPointOption(126.0f, 5.0f, 18);
        uiUpperImage[8].drawAtPointOption(298.0f, 6.0f, 18);
        uiUpperImage[14].drawAtPointOption(22.0f, 398.0f, 18);
        uiUpperImage[14].drawAtPointOption(16.0f, 398.0f, 18);
        uiUpperImage[4].drawAtPointOption(1.0f, 391.0f, 18);
        if (GameThread.gameStatus == 21) {
            uiUpperImage[3].drawAtPointOption(5.0f, 437.0f, 18);
        } else {
            uiUpperImage[2].drawAtPointOption(5.0f, 437.0f, 18);
        }
        uiUpperImage[16].drawAtPointOption(6.0f, 344.0f, 18);
        drawNumberBlock(GameThread.myMoney, numberMoneyImage, 96.0f, 6.0f, 1, 20, 1);
        drawNumberBlock(GameThread.myMana, numberManaImage, 213.0f, 6.0f, 1, 20, 1);
        float drawNumberBlock = drawNumberBlock(1, numberWaveImage, 366.0f, 8.0f, 1, 18, 2);
        numberWaveImage[10].drawAtPointOption(2.0f + drawNumberBlock, 6.0f, 18);
        drawNumberBlock(1, numberWaveImage, drawNumberBlock + 10.0f, 8.0f, 1, 18, 2);
        drawMyLife();
        uiButtonImage[0].drawAtPointOption(GameThread.myOscillator[0].getCurrentPosition() + 770, 77.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(0), numberUnitBuyImage, GameThread.myOscillator[0].getCurrentPosition() + 770, 114.0f, -2, 17, 1);
        uiButtonImage[1].drawAtPointOption(GameThread.myOscillator[1].getCurrentPosition() + 770, 142.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(3), numberUnitBuyImage, GameThread.myOscillator[1].getCurrentPosition() + 770, 179.0f, -2, 17, 1);
        uiButtonImage[2].drawAtPointOption(GameThread.myOscillator[2].getCurrentPosition() + 770, 207.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(12), numberUnitBuyImage, GameThread.myOscillator[2].getCurrentPosition() + 770, 244.0f, -2, 17, 1);
        uiButtonImage[3].drawAtPointOption(GameThread.myOscillator[3].getCurrentPosition() + 770, 272.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(15), numberUnitBuyImage, GameThread.myOscillator[3].getCurrentPosition() + 770, 309.0f, -2, 17, 1);
        uiButtonImage[4].drawAtPointOption(GameThread.myOscillator[4].getCurrentPosition() + 770, 337.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(24), numberUnitBuyImage, GameThread.myOscillator[4].getCurrentPosition() + 770, 374.0f, -2, 17, 1);
        uiButtonImage[5].drawAtPointOption(GameThread.myOscillator[5].getCurrentPosition() + 770, 402.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(27), numberUnitBuyImage, GameThread.myOscillator[5].getCurrentPosition() + 770, 439.0f, -2, 17, 1);
        int i8 = 586;
        int i9 = 0;
        for (int i10 = 3; i9 < i10; i10 = 3) {
            int i11 = i9 + 8;
            uiButtonImage[6].drawAtPointOption(GameThread.myOscillator[i11].getCurrentPosition() + i8, 12.0f, 17);
            drawNumberBlock(250, numberHeroBuyImage, i8 + 5 + GameThread.myOscillator[i11].getCurrentPosition(), 49.0f, -2, 17, 1);
            uiUpperImage[13].drawAtPointOption((i8 - 17) + GameThread.myOscillator[i11].getCurrentPosition(), 49.0f, 17);
            i8 += 60;
            i9++;
        }
        uiButtonImage[18].drawAtPointOption(770.0f, 12.0f, 17);
        int i12 = GameThread.characterMenuSelectFlag;
        if (i12 == 1 || i12 == 4) {
            GameThread.getAddSettingPosition();
            drawAddGridBlock();
            c = 0;
            i = 3;
            f = 1.0f;
            i2 = 2;
            i3 = 7;
            drawAddRangeCircle(GameThread.characterMenuSelectFlag, GameThread.characterAddNumber, GameThread.characterAddOrder, GameThread.characterAddPosX, GameThread.characterAddPosY, GameThread.characterAddBoolean);
            try {
                drawSimpleTowerUnit(GameThread.characterAddNumber, GameThread.characterAddHeroFlag, GameThread.characterAddPosX, GameThread.characterAddPosY);
            } catch (Exception unused) {
            }
        } else {
            i2 = 2;
            f = 1.0f;
            i = 3;
            i3 = 7;
            c = 0;
        }
        switch (GameThread.gameSubStatus) {
            case 1:
                if (GameThread.tutorialBoxTouchFlag[c] != 10) {
                    float f2 = f - (GameThread.tutorialBoxTouchFlag[c] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f2, f2, f2, f2);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[c][c], GameThread.tutorialBoxLinePos[c][1], GameThread.tutorialBoxLinePos[c][i2], GameThread.tutorialBoxLinePos[c][i]);
                    tutorialImage[20].drawAtPointOption(GameThread.tutorialBoxLinePos[c][4], GameThread.tutorialBoxLinePos[c][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (GameThread.tutorialBoxTouchFlag[1] != 10) {
                    float f3 = f - (GameThread.tutorialBoxTouchFlag[1] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f3, f3, f3, f3);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[1][c], GameThread.tutorialBoxLinePos[1][1], GameThread.tutorialBoxLinePos[1][i2], GameThread.tutorialBoxLinePos[1][i]);
                    tutorialImage[21].drawAtPointOption(GameThread.tutorialBoxLinePos[1][4], GameThread.tutorialBoxLinePos[1][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (GameThread.tutorialBoxTouchFlag[i2] != 10) {
                    float f4 = f - (GameThread.tutorialBoxTouchFlag[i2] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f4, f4, f4, f4);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[i2][c], GameThread.tutorialBoxLinePos[i2][1], GameThread.tutorialBoxLinePos[i2][i2], GameThread.tutorialBoxLinePos[i2][i]);
                    tutorialImage[22].drawAtPointOption(GameThread.tutorialBoxLinePos[i2][4], GameThread.tutorialBoxLinePos[i2][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (GameThread.tutorialBoxTouchFlag[i] != 10) {
                    float f5 = f - (GameThread.tutorialBoxTouchFlag[i] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f5, f5, f5, f5);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[i][c], GameThread.tutorialBoxLinePos[i][1], GameThread.tutorialBoxLinePos[i][i2], GameThread.tutorialBoxLinePos[i][i]);
                    tutorialImage[23].drawAtPointOption(GameThread.tutorialBoxLinePos[i][4], GameThread.tutorialBoxLinePos[i][5], 18);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                    fillWhiteImage.fillRect(GameThread.tutorialRectPos[1][c], GameThread.tutorialRectPos[1][1], GameThread.tutorialRectPos[1][i2], GameThread.tutorialRectPos[1][i]);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (GameThread.tutorialBoxTouchFlag[4] != 10) {
                    float f6 = f - (GameThread.tutorialBoxTouchFlag[4] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f6, f6, f6, f6);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[4][c], GameThread.tutorialBoxLinePos[4][1], GameThread.tutorialBoxLinePos[4][i2], GameThread.tutorialBoxLinePos[4][i]);
                    tutorialImage[24].drawAtPointOption(GameThread.tutorialBoxLinePos[4][4], GameThread.tutorialBoxLinePos[4][5], 18);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                    fillWhiteImage.fillRect(GameThread.tutorialRectPos[c][c], GameThread.tutorialRectPos[c][1], GameThread.tutorialRectPos[c][i2], GameThread.tutorialRectPos[c][i]);
                    Texture2D.gl.glColor4f(f, f, f, f);
                    break;
                }
                break;
            case 2:
                if (GameThread.tutorialBoxTouchFlag[5] != 10) {
                    float f7 = f - (GameThread.tutorialBoxTouchFlag[5] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f7, f7, f7, f7);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[5][c], GameThread.tutorialBoxLinePos[5][1], GameThread.tutorialBoxLinePos[5][i2], GameThread.tutorialBoxLinePos[5][i]);
                    tutorialImage[25].drawAtPointOption(GameThread.tutorialBoxLinePos[5][4], GameThread.tutorialBoxLinePos[5][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (GameThread.tutorialBoxTouchFlag[6] != 10) {
                    float f8 = f - (GameThread.tutorialBoxTouchFlag[6] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f8, f8, f8, f8);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[6][c], GameThread.tutorialBoxLinePos[6][1], GameThread.tutorialBoxLinePos[6][i2], GameThread.tutorialBoxLinePos[6][i]);
                    tutorialImage[26].drawAtPointOption(GameThread.tutorialBoxLinePos[6][4], GameThread.tutorialBoxLinePos[6][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (GameThread.tutorialBoxTouchFlag[7] != 10) {
                    float f9 = f - (GameThread.tutorialBoxTouchFlag[7] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f9, f9, f9, f9);
                    fillWhiteImage.fillRect(GameThread.tutorialBoxLinePos[7][c], GameThread.tutorialBoxLinePos[7][1], GameThread.tutorialBoxLinePos[7][i2], GameThread.tutorialBoxLinePos[7][i]);
                    tutorialImage[27].drawAtPointOption(GameThread.tutorialBoxLinePos[7][4], GameThread.tutorialBoxLinePos[7][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                    break;
                }
                break;
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
                int i13 = GameThread.gameSubStatus;
                if (i13 != i) {
                    if (i13 == 5) {
                        z = false;
                        c2 = 1;
                        i6 = 3;
                    } else if (i13 == i3) {
                        z = false;
                        c2 = 2;
                    } else if (i13 == 9) {
                        i6 = 15;
                        z = false;
                        c2 = 3;
                    } else if (i13 == 11) {
                        i6 = 24;
                        z = false;
                        c2 = 4;
                    } else if (i13 != 13) {
                        z = true;
                        c2 = 6;
                    } else {
                        i6 = 27;
                        z = false;
                        c2 = 5;
                    }
                    if (GameThread.tutorialViewCount % 210 < 180) {
                        i4 = (GameThread.tutorialViewCount % 210) - 180;
                        i5 = 6;
                    } else if (GameThread.tutorialViewCount % 210 >= 150) {
                        i4 = (GameThread.tutorialViewCount % 210) - 150;
                        i5 = 5;
                    } else if (GameThread.tutorialViewCount % 210 >= 120) {
                        i4 = (GameThread.tutorialViewCount % 210) - 120;
                        i5 = 4;
                    } else if (GameThread.tutorialViewCount % 210 >= 90) {
                        i4 = (GameThread.tutorialViewCount % 210) - 90;
                        i5 = 3;
                    } else if (GameThread.tutorialViewCount % 210 >= 60) {
                        i4 = (GameThread.tutorialViewCount % 210) - 60;
                        i5 = 2;
                    } else if (GameThread.tutorialViewCount % 210 >= 30) {
                        i4 = (GameThread.tutorialViewCount % 210) - 30;
                        i5 = 1;
                    } else {
                        i4 = (GameThread.tutorialViewCount % 210) + 0;
                        i5 = 0;
                    }
                    tutorialImage[17].drawAtPointOption(17.0f, 41.0f, 18);
                    if (i5 != i2) {
                        float f10 = i4 * 0.1f;
                        if (f10 < f) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                            Texture2D.gl.glColor4f(f10, f10, f10, f10);
                        }
                        tutorialImage[GameThread.tutorialUnitPos[c2][i2]].drawAtPointOption(GameThread.tutorialUnitPos[c2][i], GameThread.tutorialUnitPos[c2][4], 18);
                    } else if (i5 > i2 && i5 < 6) {
                        tutorialImage[GameThread.tutorialUnitPos[c2][i2]].drawAtPointOption(GameThread.tutorialUnitPos[c2][i], GameThread.tutorialUnitPos[c2][4], 18);
                    }
                    if ((i5 == 1 && (i4 / 5) % i2 == 0) || (i5 > 1 && i5 < 6)) {
                        tutorialImage[28].drawAtPointOption(GameThread.tutorialUnitPos[c2][7], GameThread.tutorialUnitPos[c2][8], 9);
                    }
                    if (i5 == i && (i4 / 5) % i2 == 0) {
                        tutorialImage[18].drawAtPointOption(GameThread.tutorialUnitPos[c2][5] - 11, (float) (GameThread.tutorialUnitPos[c2][6] - 84), 18);
                    }
                    if (i5 == 4) {
                        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                        setFontSize(40);
                        drawStringDoubleM("터치", GameThread.tutorialUnitPos[c2][5] - 11, (float) (GameThread.tutorialUnitPos[c2][6] - 53), 20);
                        if (i4 < i) {
                            tutorialImage[18].drawAtPointOption(GameThread.tutorialUnitPos[c2][5] - 11, (float) (GameThread.tutorialUnitPos[c2][6] - 84), 18);
                        } else {
                            if ((i4 / 5) % i2 == 0) {
                                tutorialImage[16].drawAtPointOption(GameThread.tutorialUnitPos[c2][5], GameThread.tutorialUnitPos[c2][6], 9);
                            }
                            tutorialImage[19].drawAtPointOption(GameThread.tutorialUnitPos[c2][5] - 11, (float) (GameThread.tutorialUnitPos[c2][6] - 84), 18);
                        }
                    }
                    if (i5 == 5) {
                        int i14 = GameThread.tutorialUnitPos[c2][5] + (((GameThread.tutorialUnitPos[c2][7] - GameThread.tutorialUnitPos[c2][5]) * i4) / 30);
                        int i15 = GameThread.tutorialUnitPos[c2][6] + (((GameThread.tutorialUnitPos[c2][8] - GameThread.tutorialUnitPos[c2][6]) * i4) / 30);
                        drawSimpleTowerUnit(i6, z, i14, i15);
                        float f11 = i14 - 11;
                        tutorialImage[19].drawAtPointOption(f11, (float) (i15 - 84), 18);
                        drawStringDoubleM("드래그", f11, (float) (i15 - 53), 20);
                    }
                    if (i5 == 6) {
                        drawSimpleTowerUnit(i6, z, GameThread.tutorialUnitPos[c2][7], GameThread.tutorialUnitPos[c2][8]);
                        break;
                    }
                } else {
                    z = false;
                    c2 = 0;
                }
                i6 = 0;
                if (GameThread.tutorialViewCount % 210 < 180) {
                }
                tutorialImage[17].drawAtPointOption(17.0f, 41.0f, 18);
                if (i5 != i2) {
                }
                if (i5 == 1) {
                    tutorialImage[28].drawAtPointOption(GameThread.tutorialUnitPos[c2][7], GameThread.tutorialUnitPos[c2][8], 9);
                    if (i5 == i) {
                        tutorialImage[18].drawAtPointOption(GameThread.tutorialUnitPos[c2][5] - 11, (float) (GameThread.tutorialUnitPos[c2][6] - 84), 18);
                    }
                    if (i5 == 4) {
                    }
                    if (i5 == 5) {
                    }
                    if (i5 == 6) {
                    }
                }
                tutorialImage[28].drawAtPointOption(GameThread.tutorialUnitPos[c2][7], GameThread.tutorialUnitPos[c2][8], 9);
                if (i5 == i) {
                }
                if (i5 == 4) {
                }
                if (i5 == 5) {
                }
                if (i5 == 6) {
                }
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
                int i16 = GameThread.gameSubStatus;
                if (i16 == 4) {
                    c3 = 7;
                    c4 = '\b';
                } else if (i16 == 6) {
                    c3 = '\b';
                    c4 = '\t';
                } else if (i16 == 8) {
                    c3 = '\t';
                    c4 = '\n';
                } else if (i16 == 10) {
                    c3 = '\n';
                    c4 = 11;
                } else if (i16 == 12) {
                    c3 = 11;
                    c4 = '\f';
                } else if (i16 != 14) {
                    c3 = '\r';
                    c4 = 14;
                } else {
                    c3 = '\f';
                    c4 = '\r';
                }
                tutorialImage[c3].drawAtPointOption(GameThread.tutorialBoxLinePos[c4][4], GameThread.tutorialBoxLinePos[c4][5], 18);
                break;
            case 17:
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                fillWhiteImage.fillRect(GameThread.tutorialRectPos[i2][c], GameThread.tutorialRectPos[i2][1], GameThread.tutorialRectPos[i2][i2], GameThread.tutorialRectPos[i2][i]);
                Texture2D.gl.glColor4f(f, f, f, f);
                tutorialImage[14].drawAtPointOption(GameThread.tutorialBoxLinePos[15][4], GameThread.tutorialBoxLinePos[15][5], 18);
                break;
            case 18:
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                fillWhiteImage.fillRect(GameThread.tutorialRectPos[i][c], GameThread.tutorialRectPos[i][1], GameThread.tutorialRectPos[i][i2], GameThread.tutorialRectPos[i][i]);
                Texture2D.gl.glColor4f(f, f, f, f);
                tutorialImage[15].drawAtPointOption(GameThread.tutorialBoxLinePos[16][4], GameThread.tutorialBoxLinePos[16][5], 18);
                break;
            case 19:
                uiPopupImage[i3].drawAtPointOption(201.0f, 101.0f, 18);
                setFontSize(20);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("You have cleared the Tutorial stage.", CX, 156.0f, 17);
                drawStringDoubleM("You have obtained 300 Hero Points.", CX, 206.0f, 17);
                if (checkTouchListStatus == 27) {
                    uiPopupImage[13].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                }
            case 20:
                uiPopupImage[i3].drawAtPointOption(201.0f, 101.0f, 18);
                setFontSize(20);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Use Hero Points to buy items ", CX, 156.0f, 17);
                drawStringDoubleM("or upgrade your units.", CX, 206.0f, 17);
                if (checkTouchListStatus == 28) {
                    uiPopupImage[13].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                }
            case 21:
                uiPopupImage[i3].drawAtPointOption(201.0f, 101.0f, 18);
                setFontSize(20);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Use Help if you want ", CX, 122.0f, 17);
                drawStringDoubleM("to replay the Tutorial.", CX, 162.0f, 17);
                drawStringDoubleM("(No Hero Points will be rewarded", CX, 202.0f, 17);
                drawStringDoubleM("when replaying the Tutorial.)", CX, 242.0f, 17);
                if (checkTouchListStatus == 30) {
                    uiPopupImage[13].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                }
            case 22:
                uiPopupImage[i3].drawAtPointOption(201.0f, 101.0f, 18);
                setFontSize(20);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("You have cleared the Tutorial stage.", CX, 182.0f, 17);
                if (checkTouchListStatus == 30) {
                    uiPopupImage[13].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                } else {
                    uiPopupImage[12].drawAtPointOption(209.0f, 289.0f, 18);
                    break;
                }
        }
        TouchManager.swapTouchMap();
    }

    public void touchCheck_GAME_TUTORIAL() {
        int checkTowerUnit;
        int i;
        int checkTowerUnit2;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        char c = 2;
        int i2 = 0;
        switch (GameThread.gameSubStatus) {
            case 1:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (checkTouchListStatus) {
                    case 10:
                        GameThread.tutorialBoxTouchFlag[0] = 1;
                        break;
                    case 11:
                        GameThread.tutorialBoxTouchFlag[1] = 1;
                        break;
                    case 12:
                        GameThread.tutorialBoxTouchFlag[2] = 1;
                        break;
                    case 13:
                        GameThread.tutorialBoxTouchFlag[3] = 1;
                        break;
                    case 14:
                        GameThread.tutorialBoxTouchFlag[4] = 1;
                        break;
                }
                TouchManager.processTouchStatus();
                return;
            case 2:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (TouchManager.checkTouchListStatus()) {
                    case 15:
                        GameThread.tutorialBoxTouchFlag[5] = 1;
                        break;
                    case 16:
                        GameThread.tutorialBoxTouchFlag[6] = 1;
                        break;
                    case 17:
                        GameThread.tutorialBoxTouchFlag[7] = 1;
                        break;
                }
                TouchManager.processTouchStatus();
                return;
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
                int i3 = TouchManager.lastActionStatus;
                if (i3 == 0) {
                    if (GameThread.characterMenuSelectFlag != 0) {
                        return;
                    }
                    if (checkTouchListStatus == 0 || checkTouchListStatus == 1 || checkTouchListStatus == 2 || checkTouchListStatus == 3 || checkTouchListStatus == 4 || checkTouchListStatus == 5) {
                        GameThread.tutorialViewCount = 0;
                        int i4 = checkTouchListStatus != 0 ? checkTouchListStatus != 1 ? checkTouchListStatus != 2 ? checkTouchListStatus != 3 ? checkTouchListStatus != 4 ? 27 : 24 : 15 : 12 : 3 : 0;
                        GameThread.characterMenuSelectFlag = 1;
                        GameThread.characterAddOrder = checkTouchListStatus;
                        GameThread.characterAddNumber = i4;
                        GameThread.characterAddHeroFlag = false;
                        GameThread.characterAddType = 1;
                        while (i2 < 7) {
                            if (i2 != checkTouchListStatus) {
                                GameThread.myOscillator[i2].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                }
                if (i3 == 1) {
                    if (GameThread.characterMenuSelectFlag == 0 && (checkTowerUnit = GameThread.checkTowerUnit()) != -1) {
                        GameThread.tempCharacterRangeViewNumber = checkTowerUnit;
                        return;
                    }
                    return;
                }
                if (i3 != 2) {
                    return;
                }
                GameThread.tempCharacterRangeViewNumber = -1;
                if (TouchManager.checkTouchListStatus() == 11) {
                    TouchManager.processTouchStatus();
                    return;
                }
                if (GameThread.characterMenuSelectFlag == 1) {
                    GameThread.characterMenuSelectFlag = 0;
                    int i5 = GameThread.gameSubStatus;
                    if (i5 == 3) {
                        c = 0;
                    } else if (i5 == 5) {
                        c = 1;
                    } else if (i5 != 7) {
                        c = i5 != 9 ? i5 != 11 ? (char) 5 : (char) 4 : (char) 3;
                    }
                    int i6 = (int) ((GameThread.characterAddPosX - 62.0f) / 45.0f);
                    int i7 = (int) ((GameThread.characterAddPosY - 30.0f) / 45.0f);
                    if (i6 == GameThread.tutorialUnitPos[c][0] && i7 == GameThread.tutorialUnitPos[c][1]) {
                        GameThread.playSound(14);
                        GameThread.getAddSettingPosition();
                        NewTower.gameThread.addTowerUnit(GameThread.characterAddNumber, i6, i7, true);
                        GameThread.myMoney -= GameThread.getBuyPrice(GameThread.characterAddNumber);
                        GameThread.characterMenuSelectFlag = 0;
                    }
                    while (i2 < 7) {
                        if (i2 != GameThread.characterAddOrder) {
                            GameThread.myOscillator[i2].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                        }
                        i2++;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (TouchManager.checkTouchListStatus()) {
                    case 18:
                        GameThread.gameSubStatus = 5;
                        break;
                    case 19:
                        GameThread.gameSubStatus = 7;
                        break;
                    case 20:
                        GameThread.gameSubStatus = 9;
                        break;
                    case 21:
                        GameThread.gameSubStatus = 11;
                        break;
                    case 22:
                        GameThread.gameSubStatus = 13;
                        break;
                    case 23:
                        GameThread.gameSubStatus = 15;
                        GameThread.characterMenuSelectFlag = 3;
                        GameThread.myOscillator[8].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        GameThread.myOscillator[9].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        GameThread.myOscillator[10].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        break;
                }
                TouchManager.processTouchStatus();
                return;
            case 15:
                int i8 = TouchManager.lastActionStatus;
                if (i8 == 0) {
                    if (GameThread.characterMenuSelectFlag != 3) {
                        return;
                    }
                    i = 8;
                    if (checkTouchListStatus != 7)
                        if (checkTouchListStatus != 8 && checkTouchListStatus != 9)
                            return;
                    GameThread.characterMenuSelectFlag = 4;
                    GameThread.characterAddOrder = checkTouchListStatus - i;
                    GameThread.characterAddNumber = 0;
                    GameThread.characterAddHeroFlag = true;
                    GameThread.characterAddType = 4;
                    return;
                }
                if (i8 == 1) {
                    if (GameThread.characterMenuSelectFlag == 0 && (checkTowerUnit2 = GameThread.checkTowerUnit()) != -1) {
                        GameThread.tempCharacterRangeViewNumber = checkTowerUnit2;
                        return;
                    }
                    return;
                }
                if (i8 != 2) {
                    return;
                }
                GameThread.tempCharacterRangeViewNumber = -1;
                if (TouchManager.checkTouchListStatus() == 11) {
                    TouchManager.processTouchStatus();
                    return;
                }
                if (GameThread.characterMenuSelectFlag == 4) {
                    int i9 = (int) ((GameThread.characterAddPosX - 62.0f) / 45.0f);
                    int i10 = (int) ((GameThread.characterAddPosY - 30.0f) / 45.0f);
                    if (i9 == GameThread.tutorialUnitPos[6][0] && i10 == GameThread.tutorialUnitPos[6][1]) {
                        GameThread.playSound(14);
                        GameThread.getAddSettingPosition();
                        GameThread.characterSelectNumber = GameThread.addHeroTowerUnit(GameThread.characterAddNumber, GameThread.characterAddOrder, i9, i10, true, false);
                        GameThread.characterMenuSelectFlag = 0;
                        GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.characterMenuSelectFlag = 0;
                    } else {
                        GameThread.characterMenuSelectFlag = 3;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 16:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 24) {
                    GameThread.gameSubStatus = 17;
                }
                TouchManager.processTouchStatus();
                return;
            case 17:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 25) {
                    GameThread.gameSubStatus = 18;
                }
                TouchManager.processTouchStatus();
                return;
            case 18:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 26) {
                    if (GameThread.tutorialFlag == 0) {
                        GameThread.gameSubStatus = 19;
                        GameThread.tutorialFlag = 1;
                        GameThread.myHeroism += 300;
                        GameThread.rewardDataValue[0] = 1;
                        GameThread.heroUnitType[0] = 0;
                        Config.saveAll(newTower);
                    } else {
                        GameThread.gameSubStatus = 22;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 19:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 27) {
                    GameThread.gameSubStatus = 20;
                }
                TouchManager.processTouchStatus();
                return;
            case 20:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 28) {
                    GameThread.gameSubStatus = 21;
                }
                TouchManager.processTouchStatus();
                return;
            case 21:
            case 22:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 30) {
                    GameThread.playSound(14);
                    GameThread.gameStatus = 10;
                    GameThread.gameSubStatus = 0;
                    GameRenderer.startViewCount = 0;
                    GameThread.mapNumber = 0;
                    GameThread.stageSelectChapterNumber = 0;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.mapAttackType = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.playLoopSound(1);
                }
                TouchManager.processTouchStatus();
                return;
            default:
                return;
        }
    }
}
