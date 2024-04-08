package com.sncompany.newtower.Pages;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataStory;
import com.sncompany.newtower.DataClasses.DataStory2;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

/**
 * Runs the game's opening, logo, and ending
 */
public class CinematicPage extends TPage {

    public static final int[] logoResource = {R.drawable.logo_lg0, R.drawable.logo_lg1, R.drawable.logo_lg2, R.drawable.logo_lg3, R.drawable.logo_lg4, R.drawable.logo_lg5, R.drawable.logo_lg6, R.drawable.logo_lg7, R.drawable.logo_lg8, R.drawable.logo_lg9, R.drawable.logo_lg10, R.drawable.logo_lg11, R.drawable.logo_lg12, R.drawable.logo_lg13, R.drawable.logo_lg14, R.drawable.logo_lg15, R.drawable.logo_playbean, R.drawable.logo_12usesultry};
    public static final int[] storyDataResource = {R.drawable.story_1, R.drawable.story_2, R.drawable.story_3_1, R.drawable.story_3_2, R.drawable.story_3_3, R.drawable.story_4, R.drawable.story_5, R.drawable.story_5_b, R.drawable.story_5_k, R.drawable.story_a_1, R.drawable.story_a_2, R.drawable.story_a_3, R.drawable.story_b_1, R.drawable.story_b_2, R.drawable.story_b_3, R.drawable.story_b_4, R.drawable.story_b_5, R.drawable.story_b_6, R.drawable.story_b_7};
    public static final int[] story2DataResource = {R.drawable.story2_1};

    public static int[] storyDrawDataBlock = new int[28];
    public static final int[][] storyData = {new int[]{103, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 0, 3, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 4, 7, 0, 0, 100}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 30, 0, 8, 9, 0, 0, 100}, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 30, 0, 10, 11, 0, 0, 100}, new int[]{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 102, 0, 0, 0, 0, 0, 30, 0, 12, 15, 1, 0, 100}, new int[]{102, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 30, 0, 16, 18, 0, 0, 100}, new int[]{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 19, 20, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 15, 0, 21, 22, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 10, 0, 23, 27, 0, 0, 100}, new int[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 10, 0, 28, 29, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 15, 0, 30, 30, 0, 0, 100}, new int[]{5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 15, 0, 31, 31, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 1, 1, 1, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 15, 0, 32, 33, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 10, 0, 34, 35, 0, 0, 100}, new int[]{11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 1, 1, 20, 0, -1, -1, 0, 0, 100}, new int[]{6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 1, 20, 0, 36, 38, 0, 0, 100}};
    public static int[] story2DrawDataBlock = new int[10];
    public static final int[][] story2Data = {new int[]{30, 0, 0, 6, 0, 0, 100}, new int[]{30, 150, 7, 14, 0, 0, 100}, new int[]{30, 90, 15, 22, 1, 0, 100}};

    enum RunMode {
        LOGO,
        USE12,
        OPENING,
        ENDING
    }

    private RunMode mode;
    public Texture2D[] imgs;

    private boolean logoSoundPlayFlag = false;
    public final Texture2D[] logoImage = new Texture2D[logoResource.length]; //all temp
    public final Texture2D[] storyImage = new Texture2D[storyDataResource.length]; //also temp
    public final Texture2D[] story2Image = new Texture2D[story2DataResource.length]; //temp

    public CinematicPage(RunMode m) {
        mode = m;

        for (int i = 0; i < logoImage.length; i++) {
            logoImage[i] = new Texture2D();
            logoImage[i].initWithImageName(logoResource[i]);
        }
        for (int i = 0; i < storyImage.length; i++) {
            storyImage[i] = new Texture2D();
            storyImage[i].initWithImageName(storyDataResource[i]);
        }
        for (int i = 0; i < story2Image.length; i++) {
            story2Image[i] = new Texture2D();
            story2Image[i].initWithImageName(story2DataResource[i]);
        }
    }

    @Override
    public void update() {
        switch (mode) {
            case LOGO:
                update_GAME_LOGO();
                break;
            case USE12:
                update_GAME_USE12();
                break;
            case OPENING:
                update_GAME_OPENING();
                break;
            case ENDING:
                update_GAME_ENDING();
                break;
        }
    }

    public void update_GAME_LOGO() {
        GameRenderer.currentCheckTime = System.currentTimeMillis();
        int i = (int) (((GameRenderer.currentCheckTime - GameRenderer.lastCheckTime) * 12) / 1000);
        if (!logoSoundPlayFlag && i == 16) {
            logoSoundPlayFlag = true;
            GameThread.playSound(0);
        }
        if (i > 40) {
            logoSoundPlayFlag = false;
            GameRenderer.lastCheckTime = System.currentTimeMillis();
            mode = RunMode.USE12;
        }
    }

    public void update_GAME_USE12() {
        GameRenderer.currentCheckTime = System.currentTimeMillis();
        if (GameRenderer.currentCheckTime - GameRenderer.lastCheckTime > 2000) {
            if (Config.movie) {
                gameSubStatus = 0;
                setOpeningData(0);
                gameStatus = 2;
                GameThread.playLoopSound(2);
                return;
            }
            gameLoadFlag = 0;
            loadingStatus = 1002;
            loadTipNumber = getRandom(TIP_TEXT.length);
            GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
            GameRenderer.loadingViewType = getRandom(6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update_GAME_OPENING() {
        if (storyDrawDataBlock[27] < storyDrawDataBlock[18])
            storyDrawDataBlock[27]++;
        else if (storyDrawDataBlock[19] > 0)
            storyDrawDataBlock[19]--;
        else if (storyDrawDataBlock[25] > 0)
            storyDrawDataBlock[25]--;
        else {
            if (storyDrawDataBlock[26] >= storyDrawDataBlock[21]) {
                if (gameSubStatus < 25)
                    setOpeningData(gameSubStatus++);
                else if (gameSubStatus == 25) {
                    GameThread.stopLoopSound(2);
                    gameStatus = 1002;
                    gameLoadFlag = 0;
                    loadingStatus = 1002;
                    loadTipNumber = getRandom(TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = getRandom(6);
                }
                return;
            }
            storyDrawDataBlock[26]++;
            storyDrawDataBlock[25] = 70;
        }
    }

    public void update_GAME_ENDING() {
        int[] iArr = story2DrawDataBlock;
        boolean z = false;
        if (iArr[9] < iArr[0]) {
            iArr[9] = iArr[9] + 1;
        } else if (iArr[1] > 0) {
            iArr[1] = iArr[1] - 1;
        } else if (iArr[7] > 0) {
            iArr[7] = iArr[7] - 1;
        } else if (iArr[8] < iArr[3]) {
            iArr[8] = iArr[8] + 1;
            iArr[7] = 70;
        } else {
            z = true;
        }
        if (z) {
            int i = gameSubStatus;
            if (i == 0) {
                gameSubStatus = 1;
                setEndingData(1);
            } else if (i == 1) {
                gameSubStatus = 2;
                setEndingData(2);
            } else {
                if (i != 2) {
                    return;
                }
                gameSubStatus = 3;
                setEndingData(3);
            }
        }
    }

    public void paint_GAME_LOGO(GL10 gl10) {
        TouchManager.clearTouchMap();
        long currentTimeMillis = System.currentTimeMillis();
        currentCheckTime = currentTimeMillis;
        int i = (int) (((currentTimeMillis - lastCheckTime) * 12) / 1000);
        fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
        switch (i) {
            case 1:
                logoImage[0].drawAtPointOptionSize(CX + 16.5f, CY - 318.0f, 18, 1.5f);
                break;
            case 2:
                logoImage[0].drawAtPointOptionSize(CX - 18.0f, CY - 279.0f, 18, 1.5f);
                break;
            case 3:
                logoImage[0].drawAtPointOptionSize(CX - 46.5f, CY - 247.5f, 18, 1.5f);
                break;
            case 4:
                logoImage[1].drawAtPointOptionSize(CX - 61.5f, CY - 223.5f, 18, 1.5f);
                break;
            case 5:
                logoImage[2].drawAtPointOptionSize(CX - 61.5f, CY - 202.5f, 18, 1.5f);
                break;
            case 6:
                logoImage[3].drawAtPointOptionSize(CX - 61.5f, CY - 175.5f, 18, 1.5f);
                break;
            case 7:
                logoImage[4].drawAtPointOptionSize(CX - 61.5f, CY - 139.5f, 18, 1.5f);
                logoImage[7].drawAtPointOptionSize(CX - 336.0f, CY + 52.5f, 18, 1.5f);
                break;
            case 8:
                logoImage[5].drawAtPointOptionSize(CX - 61.5f, CY - 135.0f, 18, 1.5f);
                logoImage[7].drawAtPointOptionSize(CX - 279.0f, CY, 18, 1.5f);
                break;
            case 9:
                logoImage[6].drawAtPointOptionSize(CX - 61.5f, CY - 129.0f, 18, 1.5f);
                logoImage[7].drawAtPointOptionSize(CX - 241.5f, CY - 34.5f, 18, 1.5f);
                break;
            case 10:
                logoImage[6].drawAtPointOptionSize(CX - 61.5f, CY - 129.0f, 18, 1.5f);
                logoImage[8].drawAtPointOptionSize(CX - 202.5f, CY - 69.0f, 18, 1.5f);
                break;
            case 11:
                logoImage[9].drawAtPointOptionSize(CX - 165.0f, CY - 129.0f, 18, 1.5f);
                break;
            case 12:
                logoImage[10].drawAtPointOptionSize(CX - 142.5f, CY - 129.0f, 18, 1.5f);
                break;
            case 13:
                logoImage[11].drawAtPointOptionSize(CX - 127.5f, CY - 129.0f, 18, 1.5f);
                break;
            case 14:
                logoImage[12].drawAtPointOptionSize(CX - 123.0f, CY - 129.0f, 18, 1.5f);
                break;
            case 15:
                logoImage[13].drawAtPointOptionSize(CX - 121.5f, CY - 129.0f, 18, 1.5f);
                break;
        }
        if (i >= 16) {
            logoImage[14].drawAtPointOptionSize(CX - 118.5f, CY - 129.0f, 18, 1.5f);
        }
        if (i >= 17 && i <= 23) {
            gl10.glTexEnvf(8960, 8704, 8448.0f);
            gl10.glColor4f(1.0f, 1.0f, 1.0f, (((float) (i - 17)) * 0.07f) + 0.5f);
        }
        if (i >= 17) {
            logoImage[15].drawAtPointOptionSize(CX - 120.0f, CY - 129.0f, 18, 1.5f);
        }
        gl10.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_USE12(GL10 gl10) {
        TouchManager.clearTouchMap();
        fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
        logoImage[17].drawAtPointOption(0.0f, 0.0f, 18);
        TouchManager.swapTouchMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void paint_GAME_OPENING(GL10 gl10) {
        float f;
        float f2;
        int i;
        float f3;
        TouchManager.clearTouchMap();
        int i2 = GameThread.storyDrawDataBlock[0];
        if (i2 == 100) {
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
        } else if (i2 == 102) {
            fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
        } else if (i2 == 103) {
            fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            logoImage[17].drawAtPointOption(0.0f, 0.0f, 18);
        } else {
            storyImage[GameThread.storyDrawDataBlock[0]].drawAtPointOption(0.0f, 0.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[1] == 1) {
            storyImage[12].drawAtPointOption(316.0f, 156.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[2] == 1) {
            storyImage[13].drawAtPointOption(266.0f, 289.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[3] == 1) {
            storyImage[14].drawAtPointOption(185.0f, 60.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[4] == 1) {
            storyImage[15].drawAtPointOption(472.0f, 286.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[5] == 1) {
            storyImage[16].drawAtPointOption(509.0f, 30.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[6] == 1) {
            storyImage[17].drawAtPointOption(110.0f, 307.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[7] == 1) {
            storyImage[18].drawAtPointOption(622.0f, 197.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[8] == 1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            storyImage[9].drawAtPointOption(0.0f, 0.0f, 18);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (GameThread.storyDrawDataBlock[9] == 1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            storyImage[10].drawAtPointOption(0.0f, 0.0f, 18);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (GameThread.storyDrawDataBlock[10] == 1) {
            storyImage[7].drawAtPointOption(0.0f, 200.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[11] == 1) {
            storyImage[8].drawAtPointOption(0.0f, 39.0f, 18);
        }
        float f4 = (GameThread.storyDrawDataBlock[23] + (((GameThread.storyDrawDataBlock[24] - GameThread.storyDrawDataBlock[23]) * GameThread.storyDrawDataBlock[27]) / GameThread.storyDrawDataBlock[18])) / 100.0f;
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(f4, f4, f4, f4);
        int i3 = GameThread.storyDrawDataBlock[12];
        if (i3 != 7) {
            if (i3 != 100) {
                if (i3 == 102) {
                    fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                } else {
                    switch (i3) {
                        case 12:
                            storyImage[12].drawAtPointOption(316.0f, 156.0f, 18);
                            break;
                        case 13:
                            storyImage[13].drawAtPointOption(266.0f, 289.0f, 18);
                            break;
                        case 14:
                            storyImage[14].drawAtPointOption(185.0f, 60.0f, 18);
                            break;
                        case 15:
                            storyImage[15].drawAtPointOption(472.0f, 286.0f, 18);
                            break;
                        case 16:
                            storyImage[16].drawAtPointOption(509.0f, 30.0f, 18);
                            break;
                        case 17:
                            storyImage[17].drawAtPointOption(110.0f, 307.0f, 18);
                            break;
                        case 18:
                            storyImage[18].drawAtPointOption(622.0f, 197.0f, 18);
                            break;
                        default:
                            storyImage[GameThread.storyDrawDataBlock[12]].drawAtPointOption(0.0f, 0.0f, 18);
                            break;
                    }
                }
            } else {
                fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            }
        } else {
            storyImage[7].drawAtPointOption(0.0f, 200.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[13] == 1) {
            storyImage[12].drawAtPointOption(316.0f, 156.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[14] == 1) {
            storyImage[13].drawAtPointOption(266.0f, 289.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[15] == 1) {
            storyImage[14].drawAtPointOption(185.0f, 60.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[16] == 1) {
            storyImage[7].drawAtPointOption(0.0f, 200.0f, 18);
        }
        if (GameThread.storyDrawDataBlock[17] == 1) {
            storyImage[8].drawAtPointOption(0.0f, 39.0f, 18);
        }
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (GameThread.storyDrawDataBlock[18] == GameThread.storyDrawDataBlock[27] && GameThread.storyDrawDataBlock[19] == 0 && GameThread.storyDrawDataBlock[26] != -1) {
            if (GameThread.storyDrawDataBlock[25] > 60) {
                i = 70 - GameThread.storyDrawDataBlock[25];
            } else if (GameThread.storyDrawDataBlock[25] < 10) {
                i = GameThread.storyDrawDataBlock[25];
            } else {
                f = 1.0f;
                f2 = 1.0f;
                if (f2 > f) {
                    f2 = 1.0f;
                }
                f3 = f2 >= 0.0f ? f2 : 0.0f;
                if (f3 < f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f3, f3, f3, f3);
                }
                setFontSize(28);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                String[] split = DataStory.storyText[GameThread.storyDrawDataBlock[26]].split("_");
                if (GameThread.storyDrawDataBlock[22] != 1) {
                    for (int i4 = 0; i4 < split.length; i4++) {
                        drawStringDoubleM(split[i4], CX, CY + (i4 * 35), 17);
                    }
                } else {
                    for (int i5 = 0; i5 < split.length; i5++) {
                        drawStringDoubleM(split[i5], CX, (i5 * 35) + GAME_SHOP_SHOP_INVENTORY_START_Y, 17);
                    }
                }
                if (f3 < 1.0f) {
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                }
            }
            f2 = i * 0.1f;
            f = 1.0f;
            if (f2 > f) {
            }
            if (f2 >= 0.0f) {
            }
            if (f3 < f) {
            }
            setFontSize(28);
            setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
            String[] split2 = DataStory.storyText[GameThread.storyDrawDataBlock[26]].split("_");
            if (GameThread.storyDrawDataBlock[22] != 1) {
            }
            if (f3 < 1.0f) {
            }
        }
        TouchManager.swapTouchMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[LOOP:0: B:36:0x00eb->B:38:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void paint_GAME_ENDING(GL10 gl10) {
        float f;
        int i;
        float f2;
        String[] split;
        int length;
        TouchManager.clearTouchMap();
        story2Image[0].drawAtPointOption(0.0f, 0.0f, 18);
        int i2 = GameThread.gameSubStatus;
        float f3 = 0.5f;
        if (i2 == 0) {
            f3 = 1.0f;
        } else if (i2 == 1 && GameThread.story2DrawDataBlock[9] < GameThread.story2DrawDataBlock[0]) {
            f3 = (GameThread.story2DrawDataBlock[9] * 0.5f) / GameThread.story2DrawDataBlock[0];
        }
        if (f3 != 1.0f) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f3, f3, f3, f3);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (GameThread.story2DrawDataBlock[0] == GameThread.story2DrawDataBlock[9] && GameThread.story2DrawDataBlock[1] == 0 && GameThread.story2DrawDataBlock[8] != -1) {
            if (GameThread.story2DrawDataBlock[7] > 60) {
                i = 70 - GameThread.story2DrawDataBlock[7];
            } else if (GameThread.story2DrawDataBlock[7] < 10) {
                i = GameThread.story2DrawDataBlock[7];
            } else {
                f = 1.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                f2 = f >= 0.0f ? f : 0.0f;
                if (f2 < 1.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f2, f2, f2, f2);
                }
                setFontSize(32);
                if (GameThread.gameSubStatus != 1) {
                    setFontDoubleColor(SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
                } else {
                    setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                }
                split = DataStory2.storyText[GameThread.story2DrawDataBlock[8]].split("_");
                if (GameThread.story2DrawDataBlock[4] != 1) {
                    length = CY - ((split.length * 35) / 2);
                } else {
                    length = 415 - ((split.length - 1) * 35);
                }
                for (int i3 = 0; i3 < split.length; i3++) {
                    drawStringDoubleM(split[i3], CX, (i3 * 35) + length, 17);
                }
                if (f2 < 1.0f) {
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                }
            }
            f = i * 0.1f;
            if (f > 1.0f) {
            }
            if (f >= 0.0f) {
            }
            if (f2 < 1.0f) {
            }
            setFontSize(32);
            if (GameThread.gameSubStatus != 1) {
            }
            split = DataStory2.storyText[GameThread.story2DrawDataBlock[8]].split("_");
            if (GameThread.story2DrawDataBlock[4] != 1) {
            }
            while (i3 < split.length) {
            }
            if (f2 < 1.0f) {
            }
        }
        TouchManager.swapTouchMap();
    }

    public void touchCheck_GAME_LOGO() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_USE12() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_OPENING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        GameThread.playSound(14);
        GameThread.stopLoopSound(2);
        GameThread.gameLoadFlag = 0;
        GameThread.loadingStatus = 1002;
        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
        GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
        GameRenderer.loadingViewType = GameThread.getRandom(6);
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_ENDING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        GameThread.playSound(14);
        GameThread.stopLoopSound(2);
        GameThread.gameStatus = 10;
        GameThread.gameSubStatus = 0;
        GameRenderer.startViewCount = 0;
        GameThread.stageSelectChapterNumber = 4;
        GameThread.stageSelectStageNumber = 9;
        GameThread.mapAttackType = 0;
        GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
        GameThread.playLoopSound(1);
        TouchManager.processTouchStatus();
    }

    public void setOpeningData(int i) {
        if (gameSubStatus != 25) {
            for (int i2 = 0; i2 < 25; i2++) {
                storyDrawDataBlock[i2] = storyData[gameSubStatus][i2];
            }
            int[] iArr = storyDrawDataBlock;
            iArr[27] = 0;
            iArr[26] = iArr[20];
            iArr[25] = 70;
        }
    }

    public static void setEndingData(int i) {
        if (gameSubStatus != 3) {
            System.arraycopy(story2Data[gameSubStatus], 0, story2DrawDataBlock, 0, 7);
            int[] iArr = story2DrawDataBlock;
            iArr[9] = 0;
            iArr[8] = iArr[2];
            iArr[7] = 70;
        }
    }

    public void reload() {

    }
}
