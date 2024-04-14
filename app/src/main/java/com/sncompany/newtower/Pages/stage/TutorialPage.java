package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class TutorialPage extends StageBase {

    public static final int GAME_TUTORIAL_TOUCH_BOX_ARCHER = 20;
    public static final int GAME_TUTORIAL_TOUCH_BOX_CLEAR1 = 27;
    public static final int GAME_TUTORIAL_TOUCH_BOX_CLEAR2 = 28;
    public static final int GAME_TUTORIAL_TOUCH_BOX_COLDDIVINER = 23;
    public static final int GAME_TUTORIAL_TOUCH_BOX_ENEMYGATE = 15;
    public static final int GAME_TUTORIAL_TOUCH_BOX_FINISH1 = 29;
    public static final int GAME_TUTORIAL_TOUCH_BOX_FINISH2 = 30;
    public static final int GAME_TUTORIAL_TOUCH_BOX_GATELIFE = 17;
    public static final int GAME_TUTORIAL_TOUCH_BOX_GOLD = 10;
    public static final int GAME_TUTORIAL_TOUCH_BOX_GOLDBOX = 25;
    public static final int GAME_TUTORIAL_TOUCH_BOX_HERO = 24;
    public static final int GAME_TUTORIAL_TOUCH_BOX_HOLYEYE = 21;
    public static final int GAME_TUTORIAL_TOUCH_BOX_MANA = 11;
    public static final int GAME_TUTORIAL_TOUCH_BOX_MANASTONE = 26;
    public static final int GAME_TUTORIAL_TOUCH_BOX_MANATARMS = 19;
    public static final int GAME_TUTORIAL_TOUCH_BOX_OURGATE = 16;
    public static final int GAME_TUTORIAL_TOUCH_BOX_PAUSESWITCHMENU = 13;
    public static final int GAME_TUTORIAL_TOUCH_BOX_UNITS = 14;
    public static final int GAME_TUTORIAL_TOUCH_BOX_WARRIOR = 18;
    public static final int GAME_TUTORIAL_TOUCH_BOX_WAVE = 12;
    public static final int GAME_TUTORIAL_TOUCH_BOX_WIZARD = 22;
    public static final int GAME_TUTORIAL_TOUCH_LIST_0_WARRIOR = 0;
    public static final int GAME_TUTORIAL_TOUCH_LIST_10_HERO_SLOT_2 = 9;
    public static final int GAME_TUTORIAL_TOUCH_LIST_1_MAN_AT_ARMS = 1;
    public static final int GAME_TUTORIAL_TOUCH_LIST_2_ARCHER = 2;
    public static final int GAME_TUTORIAL_TOUCH_LIST_3_HOLY_EYE = 3;
    public static final int GAME_TUTORIAL_TOUCH_LIST_4_WIZARD = 4;
    public static final int GAME_TUTORIAL_TOUCH_LIST_5_COLD_DIVINER = 5;
    public static final int GAME_TUTORIAL_TOUCH_LIST_7_HERO_ICON = 6;
    public static final int GAME_TUTORIAL_TOUCH_LIST_8_HERO_SLOT_0 = 7;
    public static final int GAME_TUTORIAL_TOUCH_LIST_9_HERO_SLOT_1 = 8;
    public static final int GAME_TUTORIAL_TOUCH_LIST_TOTAL_COUNT = 31;
    public static final int[][] tutorialUnitPos = {new int[]{2, 7, 0, 177, 111, 770, 111, 177, 367}, new int[]{4, 7, 1, 266, 171, 770, 176, 266, 367}, new int[]{6, 7, 2, 356, 231, 770, 241, 356, 367}, new int[]{8, 7, 3, 444, 289, 770, 306, 444, 367}, new int[]{10, 7, 4, 536, 349, 770, 371, 536, 367}, new int[]{12, 7, 5, 627, 374, 770, 436, 627, 367}, new int[]{7, 7, 6, 402, 77, 580, 40, 402, 367}};
    public static final int[][] tutorialBoxLinePos = {new int[]{78, 30, 6, 203, 33, 233, 257, 81}, new int[]{194, 30, 6, 114, 127, 145, 257, 81}, new int[]{340, 30, 6, 27, 265, 57, 257, 81}, new int[]{47, 408, 12, 6, 59, 338, 371, 134}, new int[]{723, 404, 14, 6, 465, 365, 257, 81}, new int[]{125, 127, 6, 115, 58, 242, 271, 81}, new int[]{663, 153, 6, 89, 452, 242, 271, 81}, new int[]{568, 114, 60, 6, 297, 76, 271, 81}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 150, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 240, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 330, 70, 226, 226}, new int[]{0, 0, 0, 0, 179, 70, 442, 226}, new int[]{0, 0, 0, 0, 89, 174, 348, 230}, new int[]{0, 0, 0, 0, 323, 176, 350, 226}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}};
    public static final int[][] tutorialRectPos = {new int[]{737, 4, 60, 457}, new int[]{3, 336, 46, 140}, new int[]{190, 115, 152, 57}, new int[]{416, 115, 152, 57}};

    public final int[] tutorialBoxTouchFlag = new int[22];
    public int tutorStep = 0, tutorialViewCount = 0;

    public TutorialPage(TPage par) {
        super(par, new DataStage(DataMap.loadMap(50, false), -1));
    }

    public void update() {
        for (int i = 0; i < 11; i++)
            myOscillator[i].updatePosition();

        st.sortEntities();
        for (int i = 0; i < 22; i++)
            if (tutorialBoxTouchFlag[i] > 0 && tutorialBoxTouchFlag[i] < 10)
                tutorialBoxTouchFlag[i] = tutorialBoxTouchFlag[i] + 1;
        if (tutorStep == 1) {
            boolean first5Checks = true;
            for (int i = 0; i < 5; i++)
                if (tutorialBoxTouchFlag[i] < 10) {
                    first5Checks = false;
                    break;
                }
            if (first5Checks)
                tutorStep++;
        } else if (tutorStep == 2) {
            boolean Checks = true;
            for (int i = 5; i < 8; i++)
                if (tutorialBoxTouchFlag[i] < 10) {
                    Checks = false;
                    break;
                }
            if (Checks)
                tutorStep++;
        } else if (tutorStep % 2 == 1 && tutorStep <= 15) {
            byte c = (byte)Math.min(((tutorStep - 3) / 2), 6);
            int type = (c % 2) + ((c / 2) * 4);

            if (TouchManager.getPressedCount() == 0)
                tutorialViewCount++;

            if (checkTowerPos(type, tutorialUnitPos[c][0], tutorialUnitPos[c][1])) {
                if (tutorStep % 2 == 1)
                    tutorStep++;
            }
        }
    }

    public boolean checkTowerPos(int tp, int x, int y) {
        int tX = ((x * 45) + 22) * 50;
        int tY = ((y * 45) + 22) * 50;
        for (TowerUnit tow : st.towerUnit)
            if (tow.type == tp && tX == tow.posX && tY == tow.posY)
                return true;
        return false;
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
    public void paint_GAME_TUTORIAL(GL10 gl10, boolean init) {
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
        tmap.checkBackBase();
        tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0.0f, 0.0f, 18);
        backShadowImage.drawAtPointOption(0.0f, 0.0f, 18);
        drawMapTile(gl10);
        drawAllUnit(gl10);
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(11, GameRenderer.CGRectMake(0.0f, 437.0f, 43.0f, 39.0f));
        int i6 = 12;
        switch (tutorStep) {
            case 1:
                TouchManager.addTouchRectListData(10, GameRenderer.CGRectMake(tutorialBoxLinePos[0][4], tutorialBoxLinePos[0][5], tutorialBoxLinePos[0][6], tutorialBoxLinePos[0][7]));
                TouchManager.addTouchRectListData(11, GameRenderer.CGRectMake(tutorialBoxLinePos[1][4], tutorialBoxLinePos[1][5], tutorialBoxLinePos[1][6], tutorialBoxLinePos[1][7]));
                TouchManager.addTouchRectListData(12, GameRenderer.CGRectMake(tutorialBoxLinePos[2][4], tutorialBoxLinePos[2][5], tutorialBoxLinePos[2][6], tutorialBoxLinePos[2][7]));
                TouchManager.addTouchRectListData(13, GameRenderer.CGRectMake(tutorialBoxLinePos[3][4], tutorialBoxLinePos[3][5], tutorialBoxLinePos[3][6], tutorialBoxLinePos[3][7]));
                TouchManager.addTouchRectListData(14, GameRenderer.CGRectMake(tutorialBoxLinePos[4][4], tutorialBoxLinePos[4][5], tutorialBoxLinePos[4][6], tutorialBoxLinePos[4][7]));
                break;
            case 2:
                TouchManager.addTouchRectListData(15, GameRenderer.CGRectMake(tutorialBoxLinePos[5][4], tutorialBoxLinePos[5][5], tutorialBoxLinePos[5][6], tutorialBoxLinePos[5][7]));
                TouchManager.addTouchRectListData(16, GameRenderer.CGRectMake(tutorialBoxLinePos[6][4], tutorialBoxLinePos[6][5], tutorialBoxLinePos[6][6], tutorialBoxLinePos[6][7]));
                TouchManager.addTouchRectListData(17, GameRenderer.CGRectMake(tutorialBoxLinePos[7][4], tutorialBoxLinePos[7][5], tutorialBoxLinePos[7][6], tutorialBoxLinePos[7][7]));
                break;
            case 3:
                TouchManager.addTouchRectListData(0, GameRenderer.CGRectMake(742.0f, 77.0f, 56.0f, 56.0f));
                break;
            case 4:
                TouchManager.addTouchRectListData(18, GameRenderer.CGRectMake(tutorialBoxLinePos[8][4], tutorialBoxLinePos[8][5], tutorialBoxLinePos[8][6], tutorialBoxLinePos[8][7]));
                break;
            case 5:
                TouchManager.addTouchRectListData(1, GameRenderer.CGRectMake(742.0f, 142.0f, 56.0f, 56.0f));
                break;
            case 6:
                TouchManager.addTouchRectListData(19, GameRenderer.CGRectMake(tutorialBoxLinePos[9][4], tutorialBoxLinePos[9][5], tutorialBoxLinePos[9][6], tutorialBoxLinePos[9][7]));
                break;
            case 7:
                TouchManager.addTouchRectListData(2, GameRenderer.CGRectMake(742.0f, 207.0f, 56.0f, 56.0f));
                break;
            case 8:
                TouchManager.addTouchRectListData(20, GameRenderer.CGRectMake(tutorialBoxLinePos[10][4], tutorialBoxLinePos[10][5], tutorialBoxLinePos[10][6], tutorialBoxLinePos[10][7]));
                break;
            case 9:
                TouchManager.addTouchRectListData(3, GameRenderer.CGRectMake(742.0f, 272.0f, 56.0f, 56.0f));
                break;
            case 10:
                TouchManager.addTouchRectListData(21, GameRenderer.CGRectMake(tutorialBoxLinePos[11][4], tutorialBoxLinePos[11][5], tutorialBoxLinePos[11][6], tutorialBoxLinePos[11][7]));
                break;
            case 11:
                TouchManager.addTouchRectListData(4, GameRenderer.CGRectMake(742.0f, 337.0f, 56.0f, 56.0f));
                break;
            case 12:
                TouchManager.addTouchRectListData(22, GameRenderer.CGRectMake(tutorialBoxLinePos[12][4], tutorialBoxLinePos[12][5], tutorialBoxLinePos[12][6], tutorialBoxLinePos[12][7]));
                break;
            case 13:
                TouchManager.addTouchRectListData(5, GameRenderer.CGRectMake(742.0f, 402.0f, 56.0f, 56.0f));
                break;
            case 14:
                TouchManager.addTouchRectListData(23, GameRenderer.CGRectMake(tutorialBoxLinePos[13][4], tutorialBoxLinePos[13][5], tutorialBoxLinePos[13][6], tutorialBoxLinePos[13][7]));
                break;
            case 15:
                int i7 = GameThread.characterMenuSelectFlag;
                if (i7 != 0) {
                    if (i7 == 3) {
                        TouchManager.addTouchRectListData(7, GameRenderer.CGRectMake(558.0f, 12.0f, 56.0f, 56.0f));
                        TouchManager.addTouchRectListData(8, GameRenderer.CGRectMake(618.0f, 12.0f, 56.0f, 56.0f));
                        TouchManager.addTouchRectListData(9, GameRenderer.CGRectMake(678.0f, 12.0f, 56.0f, 56.0f));
                        break;
                    }
                } else {
                    TouchManager.addTouchRectListData(7, GameRenderer.CGRectMake(742.0f, 12.0f, 56.0f, 56.0f));
                    break;
                }
                break;
            case 16:
                TouchManager.addTouchRectListData(24, GameRenderer.CGRectMake(tutorialBoxLinePos[14][4], tutorialBoxLinePos[14][5], tutorialBoxLinePos[14][6], tutorialBoxLinePos[14][7]));
                break;
            case 17:
                TouchManager.addTouchRectListData(25, GameRenderer.CGRectMake(tutorialBoxLinePos[15][4], tutorialBoxLinePos[15][5], tutorialBoxLinePos[15][6], tutorialBoxLinePos[15][7]));
                break;
            case 18:
                TouchManager.addTouchRectListData(26, GameRenderer.CGRectMake(tutorialBoxLinePos[16][4], tutorialBoxLinePos[16][5], tutorialBoxLinePos[16][6], tutorialBoxLinePos[16][7]));
                break;
            case 19:
                TouchManager.addTouchRectListData(27, GameRenderer.CGRectMake(209.0f, 289.0f, 381.0f, 65.0f));
                break;
            case 20:
                TouchManager.addTouchRectListData(28, GameRenderer.CGRectMake(209.0f, 289.0f, 381.0f, 65.0f));
                break;
            case 21:
            case 22:
                TouchManager.addTouchRectListData(30, GameRenderer.CGRectMake(209.0f, 289.0f, 381.0f, 65.0f));
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
        drawNumberBlock(st.Money, numberMoneyImage, 96.0f, 6.0f, 1, 20, 1);
        drawNumberBlock(st.Mana, numberManaImage, 213.0f, 6.0f, 1, 20, 1);
        float drawNumberBlock = drawNumberBlock(1, numberWaveImage, 366.0f, 8.0f, 1, 18, 2);
        numberWaveImage[10].drawAtPointOption(2.0f + drawNumberBlock, 6.0f, 18);
        drawNumberBlock(1, numberWaveImage, drawNumberBlock + 10.0f, 8.0f, 1, 18, 2);
        drawBaseHealth();
        uiButtonImage[0].drawAtPointOption(myOscillator[0].getCurrentPosition() + 770, 77.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(0), numberUnitBuyImage, myOscillator[0].getCurrentPosition() + 770, 114.0f, -2, 17, 1);
        uiButtonImage[1].drawAtPointOption(myOscillator[1].getCurrentPosition() + 770, 142.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(3), numberUnitBuyImage, myOscillator[1].getCurrentPosition() + 770, 179.0f, -2, 17, 1);
        uiButtonImage[2].drawAtPointOption(myOscillator[2].getCurrentPosition() + 770, 207.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(12), numberUnitBuyImage, myOscillator[2].getCurrentPosition() + 770, 244.0f, -2, 17, 1);
        uiButtonImage[3].drawAtPointOption(myOscillator[3].getCurrentPosition() + 770, 272.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(15), numberUnitBuyImage, myOscillator[3].getCurrentPosition() + 770, 309.0f, -2, 17, 1);
        uiButtonImage[4].drawAtPointOption(myOscillator[4].getCurrentPosition() + 770, 337.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(24), numberUnitBuyImage, myOscillator[4].getCurrentPosition() + 770, 374.0f, -2, 17, 1);
        uiButtonImage[5].drawAtPointOption(myOscillator[5].getCurrentPosition() + 770, 402.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(27), numberUnitBuyImage, myOscillator[5].getCurrentPosition() + 770, 439.0f, -2, 17, 1);
        int i8 = 586;
        int i9 = 0;
        for (int i10 = 3; i9 < i10; i10 = 3) {
            int i11 = i9 + 8;
            uiButtonImage[6].drawAtPointOption(myOscillator[i11].getCurrentPosition() + i8, 12.0f, 17);
            drawNumberBlock(250, numberHeroBuyImage, i8 + 5 + myOscillator[i11].getCurrentPosition(), 49.0f, -2, 17, 1);
            uiUpperImage[13].drawAtPointOption((i8 - 17) + myOscillator[i11].getCurrentPosition(), 49.0f, 17);
            i8 += 60;
            i9++;
        }
        uiButtonImage[18].drawAtPointOption(770.0f, 12.0f, 17);
        int i12 = GameThread.characterMenuSelectFlag;
        if (i12 == 1 || i12 == 4) {
            boolean addable = getAddSettingPosition();
            drawAddGridBlock();
            c = 0;
            i = 3;
            f = 1.0f;
            i2 = 2;
            i3 = 7;
            drawAddRangeCircle(GameThread.characterMenuSelectFlag, GameThread.characterAddNumber, GameThread.characterAddOrder, characterAddPosX, characterAddPosY, addable);
            try {
                drawSimpleTowerUnit(GameThread.characterAddNumber, GameThread.characterAddHeroFlag, characterAddPosX, characterAddPosY);
            } catch (Exception unused) {
            }
        } else {
            i2 = 2;
            f = 1.0f;
            i = 3;
            i3 = 7;
            c = 0;
        }
        switch (tutorStep) {
            case 1:
                if (tutorialBoxTouchFlag[c] != 10) {
                    float f2 = f - (tutorialBoxTouchFlag[c] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f2, f2, f2, f2);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[c][c], tutorialBoxLinePos[c][1], tutorialBoxLinePos[c][i2], tutorialBoxLinePos[c][i]);
                    tutorialImage[20].drawAtPointOption(tutorialBoxLinePos[c][4], tutorialBoxLinePos[c][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (tutorialBoxTouchFlag[1] != 10) {
                    float f3 = f - (tutorialBoxTouchFlag[1] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f3, f3, f3, f3);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[1][c], tutorialBoxLinePos[1][1], tutorialBoxLinePos[1][i2], tutorialBoxLinePos[1][i]);
                    tutorialImage[21].drawAtPointOption(tutorialBoxLinePos[1][4], tutorialBoxLinePos[1][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (tutorialBoxTouchFlag[i2] != 10) {
                    float f4 = f - (tutorialBoxTouchFlag[i2] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f4, f4, f4, f4);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[i2][c], tutorialBoxLinePos[i2][1], tutorialBoxLinePos[i2][i2], tutorialBoxLinePos[i2][i]);
                    tutorialImage[22].drawAtPointOption(tutorialBoxLinePos[i2][4], tutorialBoxLinePos[i2][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (tutorialBoxTouchFlag[i] != 10) {
                    float f5 = f - (tutorialBoxTouchFlag[i] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f5, f5, f5, f5);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[i][c], tutorialBoxLinePos[i][1], tutorialBoxLinePos[i][i2], tutorialBoxLinePos[i][i]);
                    tutorialImage[23].drawAtPointOption(tutorialBoxLinePos[i][4], tutorialBoxLinePos[i][5], 18);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                    fillWhiteImage.fillRect(tutorialRectPos[1][c], tutorialRectPos[1][1], tutorialRectPos[1][i2], tutorialRectPos[1][i]);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (tutorialBoxTouchFlag[4] != 10) {
                    float f6 = f - (tutorialBoxTouchFlag[4] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f6, f6, f6, f6);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[4][c], tutorialBoxLinePos[4][1], tutorialBoxLinePos[4][i2], tutorialBoxLinePos[4][i]);
                    tutorialImage[24].drawAtPointOption(tutorialBoxLinePos[4][4], tutorialBoxLinePos[4][5], 18);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                    fillWhiteImage.fillRect(tutorialRectPos[c][c], tutorialRectPos[c][1], tutorialRectPos[c][i2], tutorialRectPos[c][i]);
                    Texture2D.gl.glColor4f(f, f, f, f);
                    break;
                }
                break;
            case 2:
                if (tutorialBoxTouchFlag[5] != 10) {
                    float f7 = f - (tutorialBoxTouchFlag[5] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f7, f7, f7, f7);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[5][c], tutorialBoxLinePos[5][1], tutorialBoxLinePos[5][i2], tutorialBoxLinePos[5][i]);
                    tutorialImage[25].drawAtPointOption(tutorialBoxLinePos[5][4], tutorialBoxLinePos[5][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (tutorialBoxTouchFlag[6] != 10) {
                    float f8 = f - (tutorialBoxTouchFlag[6] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f8, f8, f8, f8);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[6][c], tutorialBoxLinePos[6][1], tutorialBoxLinePos[6][i2], tutorialBoxLinePos[6][i]);
                    tutorialImage[26].drawAtPointOption(tutorialBoxLinePos[6][4], tutorialBoxLinePos[6][5], 18);
                    Texture2D.gl.glColor4f(f, f, f, f);
                }
                if (tutorialBoxTouchFlag[7] != 10) {
                    float f9 = f - (tutorialBoxTouchFlag[7] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f9, f9, f9, f9);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[7][c], tutorialBoxLinePos[7][1], tutorialBoxLinePos[7][i2], tutorialBoxLinePos[7][i]);
                    tutorialImage[27].drawAtPointOption(tutorialBoxLinePos[7][4], tutorialBoxLinePos[7][5], 18);
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
                int i13 = tutorStep;
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
                    if (tutorialViewCount % 210 < 180) {
                        i4 = (tutorialViewCount % 210) - 180;
                        i5 = 6;
                    } else if (tutorialViewCount % 210 >= 150) {
                        i4 = (tutorialViewCount % 210) - 150;
                        i5 = 5;
                    } else if (tutorialViewCount % 210 >= 120) {
                        i4 = (tutorialViewCount % 210) - 120;
                        i5 = 4;
                    } else if (tutorialViewCount % 210 >= 90) {
                        i4 = (tutorialViewCount % 210) - 90;
                        i5 = 3;
                    } else if (tutorialViewCount % 210 >= 60) {
                        i4 = (tutorialViewCount % 210) - 60;
                        i5 = 2;
                    } else if (tutorialViewCount % 210 >= 30) {
                        i4 = (tutorialViewCount % 210) - 30;
                        i5 = 1;
                    } else {
                        i4 = (tutorialViewCount % 210) + 0;
                        i5 = 0;
                    }
                    tutorialImage[17].drawAtPointOption(17.0f, 41.0f, 18);
                    if (i5 != i2) {
                        float f10 = i4 * 0.1f;
                        if (f10 < f) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                            Texture2D.gl.glColor4f(f10, f10, f10, f10);
                        }
                        tutorialImage[tutorialUnitPos[c2][i2]].drawAtPointOption(tutorialUnitPos[c2][i], tutorialUnitPos[c2][4], 18);
                    } else if (i5 > i2 && i5 < 6) {
                        tutorialImage[tutorialUnitPos[c2][i2]].drawAtPointOption(tutorialUnitPos[c2][i], tutorialUnitPos[c2][4], 18);
                    }
                    if ((i5 == 1 && (i4 / 5) % i2 == 0) || (i5 > 1 && i5 < 6)) {
                        tutorialImage[28].drawAtPointOption(tutorialUnitPos[c2][7], tutorialUnitPos[c2][8], 9);
                    }
                    if (i5 == i && (i4 / 5) % i2 == 0) {
                        tutorialImage[18].drawAtPointOption(tutorialUnitPos[c2][5] - 11, (float) (tutorialUnitPos[c2][6] - 84), 18);
                    }
                    if (i5 == 4) {
                        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                        setFontSize(40);
                        drawStringDoubleM("터치", tutorialUnitPos[c2][5] - 11, (float) (tutorialUnitPos[c2][6] - 53), 20);
                        if (i4 < i) {
                            tutorialImage[18].drawAtPointOption(tutorialUnitPos[c2][5] - 11, (float) (tutorialUnitPos[c2][6] - 84), 18);
                        } else {
                            if ((i4 / 5) % i2 == 0) {
                                tutorialImage[16].drawAtPointOption(tutorialUnitPos[c2][5], tutorialUnitPos[c2][6], 9);
                            }
                            tutorialImage[19].drawAtPointOption(tutorialUnitPos[c2][5] - 11, (float) (tutorialUnitPos[c2][6] - 84), 18);
                        }
                    }
                    if (i5 == 5) {
                        int i14 = tutorialUnitPos[c2][5] + (((tutorialUnitPos[c2][7] - tutorialUnitPos[c2][5]) * i4) / 30);
                        int i15 = tutorialUnitPos[c2][6] + (((tutorialUnitPos[c2][8] - tutorialUnitPos[c2][6]) * i4) / 30);
                        drawSimpleTowerUnit(i6, z, i14, i15);
                        float f11 = i14 - 11;
                        tutorialImage[19].drawAtPointOption(f11, (float) (i15 - 84), 18);
                        drawStringDoubleM("드래그", f11, (float) (i15 - 53), 20);
                    }
                    if (i5 == 6) {
                        drawSimpleTowerUnit(i6, z, tutorialUnitPos[c2][7], tutorialUnitPos[c2][8]);
                        break;
                    }
                } else {
                    z = false;
                    c2 = 0;
                }
                i6 = 0;
                if (tutorialViewCount % 210 < 180) {
                }
                tutorialImage[17].drawAtPointOption(17.0f, 41.0f, 18);
                if (i5 != i2) {
                }
                if (i5 == 1) {
                    tutorialImage[28].drawAtPointOption(tutorialUnitPos[c2][7], tutorialUnitPos[c2][8], 9);
                    if (i5 == i) {
                        tutorialImage[18].drawAtPointOption(tutorialUnitPos[c2][5] - 11, (float) (tutorialUnitPos[c2][6] - 84), 18);
                    }
                    if (i5 == 4) {
                    }
                    if (i5 == 5) {
                    }
                    if (i5 == 6) {
                    }
                }
                tutorialImage[28].drawAtPointOption(tutorialUnitPos[c2][7], tutorialUnitPos[c2][8], 9);
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
                int i16 = tutorStep;
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
                tutorialImage[c3].drawAtPointOption(tutorialBoxLinePos[c4][4], tutorialBoxLinePos[c4][5], 18);
                break;
            case 17:
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                fillWhiteImage.fillRect(tutorialRectPos[i2][c], tutorialRectPos[i2][1], tutorialRectPos[i2][i2], tutorialRectPos[i2][i]);
                Texture2D.gl.glColor4f(f, f, f, f);
                tutorialImage[14].drawAtPointOption(tutorialBoxLinePos[15][4], tutorialBoxLinePos[15][5], 18);
                break;
            case 18:
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
                fillWhiteImage.fillRect(tutorialRectPos[i][c], tutorialRectPos[i][1], tutorialRectPos[i][i2], tutorialRectPos[i][i]);
                Texture2D.gl.glColor4f(f, f, f, f);
                tutorialImage[15].drawAtPointOption(tutorialBoxLinePos[16][4], tutorialBoxLinePos[16][5], 18);
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
        switch (tutorStep) {
            case 1:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (checkTouchListStatus) {
                    case 10:
                        tutorialBoxTouchFlag[0] = 1;
                        break;
                    case 11:
                        tutorialBoxTouchFlag[1] = 1;
                        break;
                    case 12:
                        tutorialBoxTouchFlag[2] = 1;
                        break;
                    case 13:
                        tutorialBoxTouchFlag[3] = 1;
                        break;
                    case 14:
                        tutorialBoxTouchFlag[4] = 1;
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
                        tutorialBoxTouchFlag[5] = 1;
                        break;
                    case 16:
                        tutorialBoxTouchFlag[6] = 1;
                        break;
                    case 17:
                        tutorialBoxTouchFlag[7] = 1;
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
                        tutorialViewCount = 0;
                        int i4 = checkTouchListStatus != 0 ? checkTouchListStatus != 1 ? checkTouchListStatus != 2 ? checkTouchListStatus != 3 ? checkTouchListStatus != 4 ? 27 : 24 : 15 : 12 : 3 : 0;
                        GameThread.characterMenuSelectFlag = 1;
                        GameThread.characterAddOrder = checkTouchListStatus;
                        GameThread.characterAddNumber = i4;
                        GameThread.characterAddHeroFlag = false;
                        GameThread.characterAddType = 1;
                        while (i2 < 7) {
                            if (i2 != checkTouchListStatus) {
                                myOscillator[i2].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
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
                    int i5 = tutorStep;
                    if (i5 == 3) {
                        c = 0;
                    } else if (i5 == 5) {
                        c = 1;
                    } else if (i5 != 7) {
                        c = i5 != 9 ? i5 != 11 ? (char) 5 : (char) 4 : (char) 3;
                    }
                    int pX = (int) ((characterAddPosX - 62.0f) / 45.0f);
                    int pY = (int) ((characterAddPosY - 30.0f) / 45.0f);
                    if (pX == tutorialUnitPos[c][0] && pY == tutorialUnitPos[c][1]) {
                        GameThread.playSound(14);
                        getAddSettingPosition();
                        st.addUnit(GameThread.characterAddNumber, pX, pY);
                        st.Money -= TowerUnit.getBuyPrice(GameThread.characterAddNumber);
                        GameThread.characterMenuSelectFlag = 0;
                    }
                    while (i2 < 7) {
                        if (i2 != GameThread.characterAddOrder) {
                            myOscillator[i2].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
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
                        tutorStep = 5;
                        break;
                    case 19:
                        tutorStep = 7;
                        break;
                    case 20:
                        tutorStep = 9;
                        break;
                    case 21:
                        tutorStep = 11;
                        break;
                    case 22:
                        tutorStep = 13;
                        break;
                    case 23:
                        tutorStep = 15;
                        GameThread.characterMenuSelectFlag = 3;
                        myOscillator[8].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        myOscillator[9].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        myOscillator[10].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
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
                    int i9 = (int) ((characterAddPosX - 62.0f) / 45.0f);
                    int i10 = (int) ((characterAddPosY - 30.0f) / 45.0f);
                    if (i9 == tutorialUnitPos[6][0] && i10 == tutorialUnitPos[6][1]) {
                        GameThread.playSound(14);
                        getAddSettingPosition();
                        st.selectedUnit = st.addHero(GameThread.characterAddNumber, i9, i10, false);
                        GameThread.characterMenuSelectFlag = 0;
                        myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.characterMenuSelectFlag = 0;
                    } else {
                        GameThread.characterMenuSelectFlag = 3;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 16:
                if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 24)
                    tutorStep++;

                TouchManager.processTouchStatus();
                return;
            case 17:
                if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 25)
                    tutorStep++;

                TouchManager.processTouchStatus();
                return;
            case 18:
                if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 26) {
                    if (!Config.tutorial) {
                        tutorStep++;
                        Config.tutorial = true;
                        Config.heroPoints += 300;
                        Config.saveAll();
                        NewTower.switchPage(parent, true);
                    } else
                        tutorStep = 22;
                }
                TouchManager.processTouchStatus();
                return;
            case 19:
                if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 27)
                    tutorStep++;

                TouchManager.processTouchStatus();
                return;
            case 20:
                if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 28)
                    tutorStep++;

                TouchManager.processTouchStatus();
                break;
            case 21:
            case 22:
                if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 30) {
                    GameThread.playSound(14);

                    Config.lastPlayed = 0;
                    NewTower.switchPage(parent, true);
                }
                TouchManager.processTouchStatus();
                break;
        }
    }
}
