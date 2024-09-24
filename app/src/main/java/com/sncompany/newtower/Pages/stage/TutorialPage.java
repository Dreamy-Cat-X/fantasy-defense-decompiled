package com.sncompany.newtower.Pages.stage;

import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public class TutorialPage extends StageBase {

    public static final int[] tutorialResource = {R.drawable.tutorial_arrow1, R.drawable.tutorial_arrow2, R.drawable.tutorial_arrow3, R.drawable.tutorial_arrow4, R.drawable.tutorial_arrow5, R.drawable.tutorial_arrow6, R.drawable.tutorial_arrow7, R.drawable.tutorial_box0, R.drawable.tutorial_box1, R.drawable.tutorial_box2, R.drawable.tutorial_box3, R.drawable.tutorial_box4, R.drawable.tutorial_box5, R.drawable.tutorial_box6, R.drawable.tutorial_box7, R.drawable.tutorial_box8, R.drawable.tutorial_button, R.drawable.tutorial_follow, R.drawable.tutorial_hand0, R.drawable.tutorial_hand1, R.drawable.tutorial_ment0, R.drawable.tutorial_ment1, R.drawable.tutorial_ment2, R.drawable.tutorial_ment3, R.drawable.tutorial_ment4, R.drawable.tutorial_ment5, R.drawable.tutorial_ment6, R.drawable.tutorial_ment7, R.drawable.tutorial_target};
    public static final int[][] tutorialUnitPos = {new int[]{2, 7, 0, 177, 111, 770, 111, 177, 367}, new int[]{4, 7, 1, 266, 171, 770, 176, 266, 367}, new int[]{6, 7, 2, 356, 231, 770, 241, 356, 367}, new int[]{8, 7, 3, 444, 289, 770, 306, 444, 367}, new int[]{10, 7, 4, 536, 349, 770, 371, 536, 367}, new int[]{12, 7, 5, 627, 374, 770, 436, 627, 367}, new int[]{7, 7, 6, 402, 77, 580, 40, 402, 367}};
    public static final int[][] tutorialBoxLinePos = {new int[]{78, 30, 6, 203, 33, 233, 257, 81}, new int[]{194, 30, 6, 114, 127, 145, 257, 81}, new int[]{340, 30, 6, 27, 265, 57, 257, 81}, new int[]{47, 408, 12, 6, 59, 338, 371, 134}, new int[]{723, 404, 14, 6, 465, 365, 257, 81}, new int[]{125, 127, 6, 115, 58, 242, 271, 81}, new int[]{663, 153, 6, 89, 452, 242, 271, 81}, new int[]{568, 114, 60, 6, 297, 76, 271, 81}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 150, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 240, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 330, 70, 226, 226}, new int[]{0, 0, 0, 0, 179, 70, 442, 226}, new int[]{0, 0, 0, 0, 89, 174, 348, 230}, new int[]{0, 0, 0, 0, 323, 176, 350, 226}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}};
    public static final int[][] tutorialRectPos = {new int[]{737, 4, 60, 457}, new int[]{3, 336, 46, 140}, new int[]{190, 115, 152, 57}, new int[]{416, 115, 152, 57}};

    public static Texture2D[] tutorialImage = new Texture2D[tutorialResource.length];
    public final int[] tutorialBoxTouchFlag = new int[22];
    public int tutorStep = 1, tutorialViewCount = 0; //max TutorStep is 22;

    public TutorialPage(TPage par) {
        super(par, new DataStage(DataMap.loadMap(50), -1));
    }

    @Override
    public void load(Consumer<Float> prog) {
        super.load(prog);
        loadP(tutorialImage, tutorialResource, prog, 1, tutorialImage.length);
        loaded = true;
        GameThread.stopBGM(1);
    }

    @Override
    public void unload() {
        for (Texture2D img : tutorialImage)
            img.dealloc();
        super.unload();
    }

    @Override
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
            int type = tutorStep == 15 ? 0 : (c % 2) + ((c / 2) * 4);

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

    @Override
    public void paint(GL10 gl10, boolean init) {
        tmap.checkBackBase();
        tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0, 0, 18);
        backShadowImage.drawAtPointOption(0, 0, 18);
        drawMapTile(gl10);
        drawAllUnit(gl10);
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(1, CGRect.make(0, 437, 43, 39));
        if (tutorStep <= 2) {
            int sta = 0, end = 5;
            if (tutorStep == 2) {
                sta = 5;
                end = 8;
            }
            for (int i = sta; i < end; i++)
                TouchManager.addTouchRectListData(i, CGRect.make(tutorialBoxLinePos[i][4], tutorialBoxLinePos[i][5], tutorialBoxLinePos[i][6], tutorialBoxLinePos[i][7]));
        } else if (tutorStep % 2 == 0 && tutorStep <= 16) {
            int[] BoxPos = tutorialBoxLinePos[6 + (tutorStep / 2)];
            TouchManager.addTouchRectListData(0, CGRect.make(BoxPos[4], BoxPos[5], BoxPos[6], BoxPos[7]));
        } else if (tutorStep < 15) {
            int ind = 77 + (65 * (tutorStep - 3) / 2);
            TouchManager.addTouchRectListData(0, CGRect.make(742, ind, 56, 56));
        } else switch (tutorStep) {
            case 15:
                if (characterMenuSelectFlag == 2) {
                    TouchManager.addTouchRectListData(0, CGRect.make(558, 12, 56, 56));
                    TouchManager.addTouchRectListData(1, CGRect.make(618, 12, 56, 56));
                    TouchManager.addTouchRectListData(2, CGRect.make(678, 12, 56, 56));
                } else if (characterMenuSelectFlag == 0)
                    TouchManager.addTouchRectListData(0, CGRect.make(742, 12, 56, 56));
                break;
            case 17: case 18:
                int[] aStep = tutorialBoxLinePos[tutorStep - 2];
                TouchManager.addTouchRectListData(0, CGRect.make(aStep[4], aStep[5], aStep[6], aStep[7]));
                break;
            default:
                TouchManager.addTouchRectListData(0, CGRect.make(209, 289, 381, 65));
                break;
        }
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 31;
        int cTLS = TouchManager.checkTouchListStatus();
        drawUpperUI();

        for (int i = 0; i < 6; i++) {
            uiButtonImage[i].drawAtPointOption(myOscillator[i].getCurrentPosition() + 770, 77f + (65 * i), 17);
            GameRenderer.drawNumberBlock(TowerUnit.getBuyPrice((i * 2) - (i % 2)), numberUnitBuyImage, myOscillator[i].getCurrentPosition() + 770, 114 + (65 * i), -2, 17, 1);
        }
        int i8 = 586;
        for (int i9 = 0; i9 < 3; i9++) {
            uiButtonImage[6].drawAtPointOption(myOscillator[i9 + 8].getCurrentPosition() + i8, 12, 17);
            GameRenderer.drawNumberBlock(250, numberHeroBuyImage, i8 + 5 + myOscillator[i9 + 8].getCurrentPosition(), 49, -2, 17, 1);
            uiUpperImage[13].drawAtPointOption((i8 - 17) + myOscillator[i9 + 8].getCurrentPosition(), 49, 17);
            i8 += 60;
        }
        uiButtonImage[18].drawAtPointOption(770, 12, 17);
        if (characterMenuSelectFlag == 1 || characterMenuSelectFlag == 3) {
            boolean addable = enableAddSetting(true);
            drawAddGridBlock();
            drawAddRangeCircle(characterAddNumber, characterAddPosX, characterAddPosY, addable);
        }
        if (tutorStep <= 2) {
            int sta = 0, end = 5;
            if (tutorStep == 2) {
                sta = 5;
                end = 8;
            }
            for (int i = sta; i < end; i++) {
                if (tutorialBoxTouchFlag[i] != 10) {
                    float alpha = 1 - (tutorialBoxTouchFlag[i] * 0.1f);
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(alpha);
                    fillWhiteImage.fillRect(tutorialBoxLinePos[i][0], tutorialBoxLinePos[i][1], tutorialBoxLinePos[i][2], tutorialBoxLinePos[i][3]);
                    tutorialImage[i + 20].drawAtPointOption(tutorialBoxLinePos[i][4], tutorialBoxLinePos[i][5], 18);
                    Texture2D.setColors(alpha * 0.4f);
                    if (i == 3)
                        fillWhiteImage.fillRect(0, 330, 45, 150);
                    if (i == 4)
                        fillWhiteImage.fillRect(730, 0, 70, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1);
                }
            }
        } else if (tutorStep % 2 == 1 && tutorStep <= 15) {
            int pInd = (tutorStep - 3) / 2;
            int unitType = (tutorStep - 3) - (pInd % 2);

            int timeInterval = (tutorialViewCount % 30);
            int div = (tutorialViewCount % 210) / 30;

            tutorialImage[17].drawAtPointOption(17, 41, 18);
            if (div == 2) {
                float a = timeInterval * 0.1f;
                if (a < 1) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                    Texture2D.setColors(a);
                }
                tutorialImage[tutorialUnitPos[pInd][2]].drawAtPointOption(tutorialUnitPos[pInd][3], tutorialUnitPos[pInd][4], 18);
            } else if (div > 2 && div < 6)
                tutorialImage[tutorialUnitPos[pInd][2]].drawAtPointOption(tutorialUnitPos[pInd][3], tutorialUnitPos[pInd][4], 18);

            if ((div == 1 && (timeInterval / 5) % 2 == 0) || (div > 1 && div < 6))
                tutorialImage[28].drawAtPointOption(tutorialUnitPos[pInd][7], tutorialUnitPos[pInd][8], 9);
            if (div == 3 && (timeInterval / 5) % 2 == 0)
                tutorialImage[18].drawAtPointOption(tutorialUnitPos[pInd][5] - 11, (float) (tutorialUnitPos[pInd][6] - 84), 18);

            if (div == 4) {
                GameRenderer.setFontDoubleColor(-1, -16777216);
                GameRenderer.setFontSize(40);
                GameRenderer.drawStringDoubleM("터치", tutorialUnitPos[pInd][5] - 11, (float) (tutorialUnitPos[pInd][6] - 53), 20);
                if (timeInterval < 3)
                    tutorialImage[18].drawAtPointOption(tutorialUnitPos[pInd][5] - 11, (float) (tutorialUnitPos[pInd][6] - 84), 18);
                else {
                    if ((timeInterval / 5) % 2 == 0)
                        tutorialImage[16].drawAtPointOption(tutorialUnitPos[pInd][5], tutorialUnitPos[pInd][6], 9);
                    tutorialImage[19].drawAtPointOption(tutorialUnitPos[pInd][5] - 11, (float) (tutorialUnitPos[pInd][6] - 84), 18);
                }
            } else if (div == 5) {
                int i14 = tutorialUnitPos[pInd][5] + (((tutorialUnitPos[pInd][7] - tutorialUnitPos[pInd][5]) * timeInterval) / 30);
                int i15 = tutorialUnitPos[pInd][6] + (((tutorialUnitPos[pInd][8] - tutorialUnitPos[pInd][6]) * timeInterval) / 30);
                drawSimpleTowerUnit(unitType, i14, i15);
                float f11 = i14 - 11;
                tutorialImage[19].drawAtPointOption(f11, (float) (i15 - 84), 18);
                GameRenderer.drawStringDoubleM("드래그", f11, (float) (i15 - 53), 20);
            } else if (div == 6)
                drawSimpleTowerUnit(unitType, tutorialUnitPos[pInd][7], tutorialUnitPos[pInd][8]);
        } else if (tutorStep <= 16) {
            int img = (tutorStep / 2) + 5;
            tutorialImage[img].drawAtPointOption(tutorialBoxLinePos[img+1][4], tutorialBoxLinePos[img+1][5], 18);
        } else switch (tutorStep) {
            case 17:
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(0.2f);
                fillWhiteImage.fillRect(tutorialRectPos[2][0], tutorialRectPos[2][1], tutorialRectPos[2][2], tutorialRectPos[2][3]);
                Texture2D.setColors(1);
                tutorialImage[14].drawAtPointOption(tutorialBoxLinePos[15][4], tutorialBoxLinePos[15][5], 18);
                break;
            case 18:
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(0.2f);
                fillWhiteImage.fillRect(tutorialRectPos[3][0], tutorialRectPos[3][1], tutorialRectPos[3][2], tutorialRectPos[3][3]);
                Texture2D.setColors(1);
                tutorialImage[15].drawAtPointOption(tutorialBoxLinePos[16][4], tutorialBoxLinePos[16][5], 18);
                break;
            case 19:
                uiPopupImage[7].drawAtPointOption(201, 101, 18);
                GameRenderer.setFontSize(20);
                GameRenderer.setFontDoubleColor(-1, -16777216);
                GameRenderer.drawStringDoubleM("You have cleared the Tutorial stage.", GameRenderer.CX, 156, 17);
                GameRenderer.drawStringDoubleM("You have obtained 300 Hero Points.", GameRenderer.CX, 206, 17);
                uiPopupImage[cTLS == 0 ? 13 : 12].drawAtPointOption(209, 289, 18);
                break;
            case 20:
                uiPopupImage[7].drawAtPointOption(201, 101, 18);
                GameRenderer.setFontSize(20);
                GameRenderer.setFontDoubleColor(-1, -16777216);
                GameRenderer.drawStringDoubleM("Use Hero Points to buy items ", GameRenderer.CX, 156, 17);
                GameRenderer.drawStringDoubleM("or upgrade your units.", GameRenderer.CX, 206, 17);
                uiPopupImage[cTLS == 0 ? 13 : 12].drawAtPointOption(209, 289, 18);
                break;
            case 21:
                uiPopupImage[7].drawAtPointOption(201, 101, 18);
                GameRenderer.setFontSize(20);
                GameRenderer.setFontDoubleColor(-1, -16777216);
                GameRenderer.drawStringDoubleM("Use Help if you want ", GameRenderer.CX, 122, 17);
                GameRenderer.drawStringDoubleM("to replay the Tutorial.", GameRenderer.CX, 162, 17);
                GameRenderer.drawStringDoubleM("(No Hero Points will be rewarded", GameRenderer.CX, 202, 17);
                GameRenderer.drawStringDoubleM("when replaying the Tutorial.)", GameRenderer.CX, 242, 17);
                uiPopupImage[cTLS == 0 ? 13 : 12].drawAtPointOption(209, 289, 18);
                break;
            case 22:
                uiPopupImage[7].drawAtPointOption(201, 101, 18);
                GameRenderer.setFontSize(20);
                GameRenderer.setFontDoubleColor(-1, -16777216);
                GameRenderer.drawStringDoubleM("You have cleared the Tutorial stage.", GameRenderer.CX, 182, 17);
                uiPopupImage[cTLS == 0 ? 13 : 12].drawAtPointOption(209, 289, 18);
                break;
        }
        TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        int cTLS = TouchManager.checkTouchListStatus();
        if (tutorStep <= 2) {
            if (TouchManager.lastActionStatus == 2 && cTLS >= 0)
                tutorialBoxTouchFlag[cTLS] = 1;
        } else if (tutorStep % 2 == 1 && tutorStep <= 15) {
            if (TouchManager.lastActionStatus == 0) {
                int heroF = tutorStep < 15 ? 0 : 2;
                if (characterMenuSelectFlag != heroF || cTLS == -1)
                    return;
                tutorialViewCount = 0;
                characterMenuSelectFlag = heroF + 1;
                int tp = (tutorStep - 3) / 2;
                characterAddNumber = (tutorStep - 3) - (tp % 2) + cTLS; //type
                for (byte i = 0; i < 7; i++)
                    if (i != tp)
                        myOscillator[i].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
            } else if (TouchManager.lastActionStatus == 1) {
                TowerUnit twu;
                if (characterAddNumber >= 0 && (twu = checkTowerUnit()) != null)
                    tempChara = twu;
            }
            if (TouchManager.lastActionStatus != 2)
                return;
            tempChara = null;
            if (characterMenuSelectFlag % 2 != 0) {
                int tp = (tutorStep - 3) / 2;
                int pX = (int) ((characterAddPosX - 62f) / 45f);
                int pY = (int) ((characterAddPosY - 30f) / 45f);
                if (pX == tutorialUnitPos[tp][0] && pY == tutorialUnitPos[tp][1]) {
                    characterMenuSelectFlag = 0;
                    GameThread.playSound(14);
                    enableAddSetting(true);
                    if (tutorStep < 15) {
                        st.addUnit(characterAddNumber, pX, pY);
                        st.money -= TowerUnit.getBuyPrice(characterAddNumber);
                        for (byte i = 0; i < 7; i++)
                            if (i != tp)
                                myOscillator[i].initWithTwoWayStartPosition(200, 0, 10, 210, 5);
                    } else {
                        st.addHero(characterAddNumber - 12, pX, pY, false);
                        st.mana -= HeroUnit.getBuyPrice(characterAddNumber - 12);
                        for (byte i = 8; i <= 10; i++)
                            myOscillator[i].initWithTwoWayStartPosition(300, 0, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    }
                    characterAddNumber = 0;
                } else
                    characterMenuSelectFlag--;
            }
        } else if (tutorStep <= 20 && tutorStep != 18) {
            if (TouchManager.lastActionStatus != 2 || cTLS == -1)
                return;
            if (++tutorStep == 15) {
                characterMenuSelectFlag = 2;
                for (int i = 8; i <= 10; i++)
                    myOscillator[i].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
            }
        } else if (tutorStep == 18) {
            if (TouchManager.lastActionStatus == 2 && cTLS == 0) {
                if (!Config.s.tutorial)
                    tutorStep++;
                else
                    tutorStep = 22;
            }
        } else if (TouchManager.lastActionStatus == 2 && TouchManager.checkTouchListStatus() == 0) {
            if (tutorStep == 21) {
                Config.s.tutorial = true;
                DataAward.check_heroPoint(300);
                Config.saveFile();
            }
            GameThread.playSound(14);
            Config.s.lastPlayed = 0;
            NewTower.switchPage(parent, true);
        }
    }
}
