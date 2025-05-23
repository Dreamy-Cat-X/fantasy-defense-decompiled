package com.sncompany.newtower.Pages;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

/**
 * Runs the game's opening, logo, and ending
 */
public class CinematicPage extends TPage {

    private static final int[] logoResource = {R.drawable.logo_lg0, R.drawable.logo_lg1, R.drawable.logo_lg2, R.drawable.logo_lg3, R.drawable.logo_lg4, R.drawable.logo_lg5, R.drawable.logo_lg6, R.drawable.logo_lg7, R.drawable.logo_lg8, R.drawable.logo_lg9, R.drawable.logo_lg10, R.drawable.logo_lg11, R.drawable.logo_lg12, R.drawable.logo_lg13, R.drawable.logo_lg14, R.drawable.logo_lg15, R.drawable.logo_playbean, R.drawable.logo_12usesultry};
    private static final int[] introDataResource = {R.drawable.story_1, R.drawable.story_2, R.drawable.story_3_1, R.drawable.story_3_2, R.drawable.story_3_3, R.drawable.story_4, R.drawable.story_5, R.drawable.story_5_b, R.drawable.story_5_k, R.drawable.story_a_1, R.drawable.story_a_2, R.drawable.story_a_3, R.drawable.story_b_1, R.drawable.story_b_2, R.drawable.story_b_3, R.drawable.story_b_4, R.drawable.story_b_5, R.drawable.story_b_6, R.drawable.story_b_7};
    private static final int[] endingDataResource = {R.drawable.story2_1};

    private static final int[] introDrawDataBlock = new int[28];
    private static final int[][] introData = {new int[]{103, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 0, 3, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 4, 7, 0, 0, 100}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 30, 0, 8, 9, 0, 0, 100}, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 30, 0, 10, 11, 0, 0, 100}, new int[]{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 102, 0, 0, 0, 0, 0, 30, 0, 12, 15, 1, 0, 100}, new int[]{102, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 30, 0, 16, 18, 0, 0, 100}, new int[]{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 19, 20, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 15, 0, 21, 22, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 10, 0, 23, 27, 0, 0, 100}, new int[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 10, 0, 28, 29, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 15, 0, 30, 30, 0, 0, 100}, new int[]{5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 15, 0, 31, 31, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 1, 1, 1, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 15, 0, 32, 33, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 10, 0, 34, 35, 0, 0, 100}, new int[]{11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 1, 1, 20, 0, -1, -1, 0, 0, 100}, new int[]{6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 1, 20, 0, 36, 38, 0, 0, 100}};
    private static final int[] endingDrawDataBlock = new int[10];
    private static final int[][] endingData = {new int[]{30, 0, 0, 6, 0, 0, 100}, new int[]{30, 150, 7, 14, 0, 0, 100}, new int[]{30, 90, 15, 22, 1, 0, 100}};
    private static final int[] introText = {R.string.intro0, R.string.intro1, R.string.intro2, R.string.intro3, R.string.intro4, R.string.intro5, R.string.intro6, R.string.intro7, R.string.intro8, R.string.intro9, R.string.intro10, R.string.intro11, R.string.intro12, R.string.intro13, R.string.intro14, R.string.intro15, R.string.intro16, R.string.intro17, R.string.intro18, R.string.intro19, R.string.intro20, R.string.intro21, R.string.intro22, R.string.intro23, R.string.intro24, R.string.intro25, R.string.intro26, R.string.intro27, R.string.intro28, R.string.intro29, R.string.intro30, R.string.intro31, R.string.intro32, R.string.intro33, R.string.intro34, R.string.intro35, R.string.intro36};
    private String cstr = "";
    private static final int[] endingText = {R.string.end0, R.string.end1, R.string.end2, R.string.end3, R.string.end4, R.string.end5, R.string.end6, R.string.end7, R.string.end8, R.string.end9, R.string.end10, R.string.end11, R.string.end12, R.string.end13, R.string.end14, R.string.end15, R.string.end16, R.string.end17, R.string.end18, R.string.end19, R.string.end20};

    enum RunMode {
        LOGO,
        USE12,
        OPENING,
        ENDING
    }

    private RunMode mode = RunMode.LOGO;
    public long currentCheckTime = 0, lastCheckTime = System.currentTimeMillis();
    int gameSubStatus = 0;
    private boolean logoSoundPlayFlag = false;
    public final Texture2D[] logoImage = new Texture2D[logoResource.length]; //all temp
    public final Texture2D[] storyImage = new Texture2D[introDataResource.length]; //also temp
    public final Texture2D[] story2Image = new Texture2D[endingDataResource.length]; //temp
    private TitlePage root;

    public CinematicPage(TPage p) {
        super(p);
        if (p != null)
            mode = RunMode.ENDING;
    }

    @Override
    public void load(Consumer<Float> prog) {
        if (mode != RunMode.ENDING) {
            int tot = logoImage.length + storyImage.length;
            loadP(logoImage, logoResource, prog, 1, tot);
            loadP(storyImage, introDataResource, prog, 1 + logoImage.length, tot);
        } else
            loadP(story2Image, endingDataResource, prog, 1, story2Image.length);
        loaded = true;
    }

    @Override
    public void unload() {
        if (mode != RunMode.ENDING) {
            for (Texture2D img : logoImage)
                img.dealloc();
            for (Texture2D img : storyImage)
                img.dealloc();
        } else
            for (Texture2D img : story2Image)
                img.dealloc();
        loaded = false;
    }

    @Override
    public void update() {
        switch (mode) {
            case LOGO:
                currentCheckTime = System.currentTimeMillis();
                int i = (int) (((currentCheckTime - lastCheckTime) * 12) / 1000);
                if (!logoSoundPlayFlag && i == 16) {
                    logoSoundPlayFlag = true;
                    GameThread.playSound(0);
                }
                if (i > 40) {
                    logoSoundPlayFlag = false;
                    lastCheckTime = System.currentTimeMillis();
                    mode = RunMode.USE12;
                    root = new TitlePage(null);
                }
                break;
            case USE12:
                currentCheckTime = System.currentTimeMillis();
                if (currentCheckTime - lastCheckTime > 2000) {
                    if (Config.movie) {
                        gameSubStatus = 0;
                        setOpeningData();
                        GameThread.playBGM(2);
                        mode = RunMode.OPENING;
                    } else
                        NewTower.switchPage(root);
                }
                break;
            case OPENING:
                if (introDrawDataBlock[27] < introDrawDataBlock[18])
                    introDrawDataBlock[27]++;
                else if (introDrawDataBlock[19] > 0)
                    introDrawDataBlock[19]--;
                else if (introDrawDataBlock[25] > 0)
                    introDrawDataBlock[25]--;
                else {
                    if (introDrawDataBlock[26] >= introDrawDataBlock[21]) {
                        if (gameSubStatus < 25) {
                            gameSubStatus++;
                            setOpeningData();
                        } else if (gameSubStatus == 25) {
                            GameThread.stopBGM(2);
                            NewTower.switchPage(root);
                        }
                        return;
                    }
                    cstr = ++introDrawDataBlock[26] < introText.length ? GameThread.getString(introText[introDrawDataBlock[26]]) : "";
                    introDrawDataBlock[25] = 70;
                }
                break;
            case ENDING:
                if (endingDrawDataBlock[9] < endingDrawDataBlock[0]) {
                    endingDrawDataBlock[9]++;
                } else if (endingDrawDataBlock[1] > 0) {
                    endingDrawDataBlock[1]--;
                } else if (endingDrawDataBlock[7] > 0) {
                    endingDrawDataBlock[7]--;
                } else if (endingDrawDataBlock[8] < endingDrawDataBlock[3]) {
                    cstr = ++endingDrawDataBlock[8] < endingText.length ? GameThread.getString(endingText[endingDrawDataBlock[8]]) : "";
                    endingDrawDataBlock[7] = 70;
                } else if (gameSubStatus <= 2) {
                    gameSubStatus++;
                    setEndingData();
                }
                break;
        }
    }

    private static final float[][] logoDrawCoords = {{0, 16.5f, -318f}, {0, -18f, -279f}, {0, -46.5f, -247.5f}, {1, -61.5f, -223.5f}, {2, -61.5f, -202.5f}, {3, -61.5f, -202.5f},
            {4, -61.5f, -139.5f, 7, -336f, 52.5f}, {5, -61.5f, -135f, 7, -279f, 0}, {6, -61.5f, -129f, 7, -241.5f, -34.5f}, {6, -61.5f, -129, 8, -202.5f, -69f},
            {9, -165f, -129f}, {10, -142.5f, -129f}, {11, -127.5f, -129f}, {12, -123f, -129f}, {13, -121.5f, -129f}};
    private static final float[][] moonCords = {{316f, 156f},{266f, 289f},{185f, 60f},{472f, 286f},{509f, 30f},{110f, 307f},{622f, 197f}};
    private static final float[][] wCords = {{0 ,200f}, {0, 39f}};

    @Override
    public void paint(GL10 gl10, boolean init) {
        TouchManager.clearTouchMap();
        switch (mode) {
            case LOGO: {
                long currentTimeMillis = System.currentTimeMillis();
                currentCheckTime = currentTimeMillis;
                int i = (int) (((currentTimeMillis - lastCheckTime) * 12) / 1000);
                fillWhiteImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                if (i > 0 && i < 16) {
                    float[] cords = logoDrawCoords[i - 1];
                    for (int j = 0; j < cords.length; j += 3)
                        logoImage[(int) cords[j]].drawAtPointOptionSize(GameRenderer.CX + cords[j + 1], GameRenderer.CY + cords[j + 2], 18, 1.5f);
                } else if (i >= 16) {
                    logoImage[14].drawAtPointOptionSize(GameRenderer.CX - 118.5f, GameRenderer.CY - 129f, 18, 1.5f);
                    if (i >= 17 && i <= 23) {
                        gl10.glTexEnvf(8960, 8704, 8448f);
                        gl10.glColor4f(1f, 1f, 1f, (((float) (i - 17)) * 0.07f) + 0.5f);
                    }
                    if (i >= 17)
                        logoImage[15].drawAtPointOptionSize(GameRenderer.CX - 120f, GameRenderer.CY - 129f, 18, 1.5f);
                }
                gl10.glColor4f(1f, 1f, 1f, 1f);
                break;
            } case USE12:
                fillWhiteImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                logoImage[17].drawAtPointOption(0f, 0f, 18);
                logoImage[16].drawAtPointOption(GameRenderer.CX, GameRenderer.CY, 9);
                break;
            case OPENING: {
                int bg = introDrawDataBlock[0];
                if (bg >= 102)
                    fillWhiteImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                else if (bg >= 100)
                    fillBlackImage.fillRect(0, 0, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                else
                    storyImage[introDrawDataBlock[0]].drawAtPointOption(0f, 0f, 18);

                byte ind = 1;
                while (ind < 8 && introDrawDataBlock[ind] == 1) {
                    storyImage[ind + 11].drawAtPointOption(moonCords[ind - 1][0], moonCords[ind - 1][1], 18);
                    ind++;
                }
                if (introDrawDataBlock[8] == 1) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
                    Texture2D.setColors(0.5f);
                    storyImage[9].drawAtPointOption(0f, 0f, 18);
                    Texture2D.setColors(1f);
                }
                if (introDrawDataBlock[9] == 1) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
                    Texture2D.setColors(0.5f);
                    storyImage[10].drawAtPointOption(0f, 0f, 18);
                    Texture2D.setColors(1f);
                }
                if (introDrawDataBlock[10] == 1)
                    storyImage[7].drawAtPointOption(0f, 200f, 18);
                if (introDrawDataBlock[11] == 1)
                    storyImage[8].drawAtPointOption(0f, 39f, 18);

                float moonAlpha = (introDrawDataBlock[23] + (((introDrawDataBlock[24] - introDrawDataBlock[23]) * introDrawDataBlock[27]) / (float) introDrawDataBlock[18])) / 100f;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
                Texture2D.setColors(moonAlpha);
                int i3 = introDrawDataBlock[12];
                if (i3 == 7)
                    storyImage[7].drawAtPointOption(0f, 200f, 18);
                else if (i3 == 100)
                    fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                else if (i3 == 102)
                    fillWhiteImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                else if (i3 >= 12 && i3 <= 18)
                    storyImage[i3].drawAtPointOption(moonCords[i3 - 12][0], moonCords[i3 - 12][1], 18);
                else
                    storyImage[introDrawDataBlock[12]].drawAtPointOption(0f, 0f, 18);

                for (int li = 13; li < 18; li++) {
                    int imgi = li < 16 ? li - 1 : li - 9;
                    float[] crds = li < 16 ? moonCords[li - 13] : wCords[li - 16];
                    if (introDrawDataBlock[li] == 1)
                        storyImage[imgi].drawAtPointOption(crds[0], crds[1], 18);
                }
                Texture2D.setColors(1f);

                if (introDrawDataBlock[18] == introDrawDataBlock[27] && introDrawDataBlock[19] == 0 && introDrawDataBlock[26] != -1) {
                    int i = 10;
                    if (introDrawDataBlock[25] > 60) {
                        i = 70 - introDrawDataBlock[25];
                    } else if (introDrawDataBlock[25] < 10) {
                        i = introDrawDataBlock[25];
                    }
                    float f2 = Math.min(Math.max(0f, i * 0.1f), 1f);

                    if (f2 < 1f) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
                        Texture2D.setColors(f2);
                    }
                    GameRenderer.setFontSize(28);
                    GameRenderer.setFontDoubleColor(-1, -16777216);
                    String[] split = cstr.split("_");
                    if (introDrawDataBlock[22] != 1) {
                        for (int i4 = 0; i4 < split.length; i4++)
                            GameRenderer.drawStringDoubleM(split[i4], GameRenderer.CX, GameRenderer.CY + (i4 * 35), 17);
                    } else {
                        for (int i5 = 0; i5 < split.length; i5++)
                            GameRenderer.drawStringDoubleM(split[i5], GameRenderer.CX, (i5 * 35) + 390, 17);
                    }
                    if (f2 < 1f) {
                        Texture2D.setColors(1f);
                    }
                }
                break;
            } case ENDING: {
                story2Image[0].drawAtPointOption(0f, 0f, 18);
                float ia = 0.5f;
                if (gameSubStatus == 0)
                    ia = 1f;
                else if (gameSubStatus == 1 && endingDrawDataBlock[9] < endingDrawDataBlock[0])
                    ia = (endingDrawDataBlock[9] * 0.5f) / endingDrawDataBlock[0];

                if (ia != 1f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
                    Texture2D.setColors(ia);
                    fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
                    Texture2D.setColors(1f);
                }
                if (endingDrawDataBlock[0] == endingDrawDataBlock[9] && endingDrawDataBlock[1] == 0 && endingDrawDataBlock[8] != -1) {
                    int i = 10;
                    if (endingDrawDataBlock[7] > 60) {
                        i = 70 - endingDrawDataBlock[7];
                    } else if (endingDrawDataBlock[7] < 10) {
                        i = endingDrawDataBlock[7];
                    }
                    float a = Math.min(Math.max(0, i * 0.1f), 1f);

                    if (a < 1f) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
                        Texture2D.setColors(a);
                    }
                    GameRenderer.setFontSize(32);
                    if (gameSubStatus != 1)
                        GameRenderer.setFontDoubleColor(-65536, -16777216);
                    else
                        GameRenderer.setFontDoubleColor(-1, -16777216);

                    String[] split = cstr.split("_");
                    int length = endingDrawDataBlock[4] != 1 ? GameRenderer.CY - ((split.length * 35) / 2) : 415 - ((split.length - 1) * 35);

                    for (int i3 = 0; i3 < split.length; i3++)
                        GameRenderer.drawStringDoubleM(split[i3], GameRenderer.CX, (i3 * 35) + length, 17);
                    if (a < 1f)
                        Texture2D.setColors(1f);
                }
                break;
            }
        }
        TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        if (TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;

        if (mode == RunMode.OPENING) {
            GameThread.playSound(14);
            GameThread.stopBGM(2);
            NewTower.switchPage(root);
        } else if (mode == RunMode.ENDING) {
            GameThread.playSound(14);
            GameThread.stopBGM(2);
            NewTower.switchPage(parent);
        }
    }

    public void setOpeningData() {
        if (gameSubStatus != 25) {
            System.arraycopy(introData[gameSubStatus], 0, introDrawDataBlock, 0, 25);
            introDrawDataBlock[27] = 0;
            introDrawDataBlock[26] = introDrawDataBlock[20];
            introDrawDataBlock[25] = 70;
            cstr = introDrawDataBlock[26] >= 0 && introDrawDataBlock[26] < introText.length ? GameThread.getString(introText[introDrawDataBlock[26]]) : "";
        }
    }

    public void setEndingData() {
        if (gameSubStatus != 3) {
            System.arraycopy(endingData[gameSubStatus], 0, endingDrawDataBlock, 0, 7);
            endingDrawDataBlock[9] = 0;
            endingDrawDataBlock[8] = endingDrawDataBlock[2];
            endingDrawDataBlock[7] = 70;
        }
    }
}
