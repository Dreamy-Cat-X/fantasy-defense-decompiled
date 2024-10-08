package com.sncompany.newtower;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.util.Log;

import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.Pages.CinematicPage;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: D:\decomp\classes.dex */
public class GameRenderer implements GLSurfaceView.Renderer {
    public static int CX = 0;
    public static int CY = 0;
    public static float DRAW_SCALE_SIZE = 1;
    public static float DRAW_SCALE_SIZE_X = 1;
    public static float DRAW_SCALE_SIZE_Y = 1;
    public static float DRAW_SCALE_X_MOVE = 0;
    public static final float DRAW_SCALE_X_SMALL_DEGREE = 13;
    public static float DRAW_SCALE_Y_MOVE = 0;
    public static final int GAME_SHOP_SHOP_SIDEBAR_END_Y = 330;
    public static final int GAME_STAGE_CLEAR_THEME_ARROW_BLINK_END_POS = 168;
    public static final int PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS = 310;
    public static int SCRHEIGHT = 0;
    public static int SCRHEIGHT_SMALL = 0;
    public static int SCRWIDTH = 0;
    public static int SCRWIDTH_SMALL = 0;
    public static Paint drawFont = null;
    public static Texture2D drawStringBuffer = null;
    public static int fontColor = 0;
    public static int fontSize = 0;
    public static boolean isPaused = false;
    public static String lastFontName;
    public static NewTower newTower;
    public static Texture2D[] outBorderImage;
    public static int strokeColor;
    private static final Texture2D testboxImage = new Texture2D();
    public static Tombstone textTombstone;
    public static final int[][] testboxCoord = {new int[]{0, 0, 20, 85}, new int[]{138, 0, 20, 85}, new int[]{59, 0, 40, 85}, new int[]{20, 0, 40, 85}};

    public GameRenderer(NewTower tower) {
        newTower = tower;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Texture2D.connectGL(newTower, gl10);
        textTombstone.connectGL(gl10);
        gl10.glClearDepthf(1);
        gl10.glDisable(2929);
        GameThread.update_GAME_PRE_LOAD();
        NewTower.switchPage(new CinematicPage(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int d1, int d2) {
        Texture2D.connectGL(newTower, gl10);
        textTombstone.connectGL(gl10);
        SCRWIDTH = Math.max(d1, d2);
        SCRHEIGHT = Math.min(d1, d2);

        SCRWIDTH_SMALL = Texture2D.SCRWIDTH_800;
        SCRHEIGHT_SMALL = Texture2D.SCRHEIGHT_480;
        CX = SCRWIDTH_SMALL / 2;
        CY = SCRHEIGHT_SMALL / 2;
        DRAW_SCALE_SIZE = 1;
        DRAW_SCALE_SIZE_X = 1;
        DRAW_SCALE_SIZE_Y = 1;
        Texture2D.DRAW_ADJUST_X_MOVE = 0;
        Texture2D.DRAW_ADJUST_Y_MOVE = 0;
        float dw = SCRWIDTH != SCRWIDTH_SMALL ? (float)SCRWIDTH / SCRWIDTH_SMALL : 1;
        float dh = SCRHEIGHT != SCRHEIGHT_SMALL ? (float)SCRHEIGHT / SCRHEIGHT_SMALL : 1;
        Log.d("WINDOW SIZE", "WINDOW SIZE " + SCRWIDTH + "," + SCRHEIGHT + "," + SCRWIDTH_SMALL + "," + SCRHEIGHT_SMALL + "," + dw + "," + dh);
        if (dw != 1 || dh != 1) {
            float f3;
            if (dw < dh) {
                DRAW_SCALE_SIZE = dw;
                f3 = (int) (((SCRHEIGHT / dw) - SCRHEIGHT_SMALL) / 2);
                DRAW_SCALE_Y_MOVE = f3;
                Texture2D.DRAW_ADJUST_Y_MOVE = f3;
                DRAW_SCALE_X_MOVE = 0;
            } else {
                DRAW_SCALE_SIZE = dh;
                f3 = (int)(((SCRWIDTH / dh) - SCRWIDTH_SMALL) / 2);
                DRAW_SCALE_X_MOVE = f3;
                Texture2D.DRAW_ADJUST_X_MOVE = f3;
                DRAW_SCALE_Y_MOVE = 0;
            }
        }
        gl10.glViewport(0, 0, SCRWIDTH, SCRHEIGHT);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluOrtho2D(gl10, 0, SCRWIDTH, 0, SCRHEIGHT);
        float f5 = DRAW_SCALE_SIZE;
        if (f5 != 1) {
            gl10.glScalef(f5, f5, 1);
        }
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glEnableClientState(32888);
        gl10.glEnableClientState(32884);
        gl10.glEnable(3553);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvf(8960, 8704, 8448);
        gl10.glTexEnvf(8960, 8705, 6408);
        gl10.glTexParameterf(3553, 10241, 9728);
        gl10.glTexParameterf(3553, 10240, 9728);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        if (isPaused)
            return;
        drawFrame(gl10);
    }

    public static void setDefaultFont() {
        lastFontName = null;
        drawFont.setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD));
    }

    public static void setFontColor(int i) {
        fontColor = i;
        strokeColor = i;
    }

    public static void setFontDoubleColor(int i, int i2) {
        fontColor = i;
        strokeColor = i2;
    }

    public static void setFontSize(int i) {
        fontSize = i;
        drawFont.setTextSize(i);
    }

    private synchronized void drawFrame(GL10 gl10) {
        gl10.glClear(16384);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvf(8960, 8704, 7681);
        GameThread.gameTimeCount++;
        if (NewTower.gameThread != null)
            NewTower.gameThread.updateGame();

        GameThread.currentFrameCount++;
        GameThread.currentDate = System.currentTimeMillis();
        if (GameThread.currentDate - GameThread.startDate > 1000) {
            GameThread.lastFrameCount = GameThread.currentFrameCount;
            GameThread.currentFrameCount = 0;
            GameThread.startDate = GameThread.currentDate;
        }
        GameThread.realDrawCount++;
        GameThread.currentDrawDate = System.currentTimeMillis();
        if (GameThread.currentDrawDate - GameThread.startDrawDate > 1000) {
            GameThread.lastDrawCount = GameThread.realDrawCount;
            GameThread.realDrawCount = 0;
            GameThread.startDrawDate = GameThread.currentDrawDate;
        }
        if (NewTower.currentPage != null)
            NewTower.currentPage.paint(gl10, true);

        if (outBorderImage != null) {
            if (DRAW_SCALE_X_MOVE != 0) {
                if (DRAW_SCALE_X_MOVE >= DRAW_SCALE_X_SMALL_DEGREE) {
                    outBorderImage[1].drawAtPointOptionNoOut(0, 0, 20);
                    outBorderImage[2].drawAtPointOptionNoOut(SCRWIDTH_SMALL, 0, 18);
                } else {
                    outBorderImage[0].drawAtPointOptionNoOut(0, 0, 20);
                    outBorderImage[0].drawAtPointOptionNoOut(SCRWIDTH_SMALL, 0, 18);
                }
            }
            if (DRAW_SCALE_Y_MOVE != 0) {
                outBorderImage[3].drawAtPointOptionNoOut(0, 0, 34);
                outBorderImage[3].drawAtPointOptionNoOut(0, SCRHEIGHT_SMALL, 18);
            }
        }
    }

    public static void makeBaseStruct() {
        outBorderImage = new Texture2D[4];
        outBorderImage[0] = new Texture2D(R.drawable.etc_out);
        outBorderImage[1] = new Texture2D(R.drawable.etc_outl);
        outBorderImage[2] = new Texture2D(R.drawable.etc_outr);
        outBorderImage[3] = new Texture2D(R.drawable.etc_outu);
        testboxImage.initWithImageName(R.drawable.etc_testbox);
    }

    public static float drawNumberBlock(int number, Texture2D[] texture2DArr, float x, float y, int extW, int pivot, int maxCount) {
        float bnsY = 1;
        for (int i7 = 0; i7 < 10; i7++)
            if (texture2DArr[i7]._sizeY > bnsY)
                bnsY = texture2DArr[i7]._sizeY;

        number = Math.abs(number);
        int numSiz = 0;
        int textureSiz = (int)texture2DArr[number % 10]._sizeX;
        while (Math.pow(10, ++numSiz) <= number)
            textureSiz += (int) (texture2DArr[(int)(number / Math.pow(10, numSiz)) % 10]._sizeX);
        int nwidth = textureSiz + (numSiz * extW);

        if (numSiz < maxCount) {
            for (int i = numSiz; i < maxCount; i++)
                nwidth += (int)texture2DArr[0]._sizeX;
            nwidth += (maxCount - numSiz) * extW;
        } else
            maxCount = numSiz;

        if (pivot == 17)
            nwidth /= 2;
        if (pivot != 20)
            x += nwidth;
        float dx = x;
        for (int i = 0; i < maxCount; i++) {
            int idrw = number % 10;
            texture2DArr[idrw].drawAtPointOption(dx, y + bnsY, 36);
            dx -= texture2DArr[idrw]._sizeX + extW;
            if (number > 0)
                number /= 10;
        }
        return x;
    }

    public static void drawStringM(String str, float x, float y, int pivot) {
        if (setDrawStringBuffer(str, fontColor))
            drawStringBuffer.drawAtPointOption(x, y, pivot);
    }

    public static void drawStringDoubleM(String str, float x, float y, int pivot) {
        if (setDrawStringBuffer(str, strokeColor))
            drawStringBuffer.drawAtPointOption(x, y, pivot);
    }

    public static void drawStringDoubleGuideM(String str, float x, float y, int pivot, CGRect rect) {
        if (setDrawStringBuffer(str, strokeColor))
            drawStringBuffer.drawAtPointOptionGuide(x, y, pivot, rect);
    }

    public static boolean setDrawStringBuffer(String str, int strokeColor) {
        int search = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
        if (search == -1) {
            textTombstone.setTombstone(str);
            search = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
            if (search == -1)
                return false;
        }
        drawStringBuffer = textTombstone.getTombstone(search);
        return true;
    }

    public static void drawLeftRightBox(float x, float y, int bound) {
        int bX = bound - testboxCoord[1][2], cX = (bound - testboxCoord[2][2]) / 2;
        int dX = cX - testboxCoord[0][2], eX = cX + testboxCoord[2][2];

        testboxImage.drawAtPointOptionClip(x + 0, y, 18, CGRect.make(testboxCoord[0][0], testboxCoord[0][1], testboxCoord[0][2], testboxCoord[0][3]));
        testboxImage.drawAtPointOptionClip(x + bX, y, 18, CGRect.make(testboxCoord[1][0], testboxCoord[1][1], testboxCoord[1][2], testboxCoord[1][3]));
        testboxImage.drawAtPointOptionClip(x + cX, y, 18, CGRect.make(testboxCoord[2][0], testboxCoord[2][1], testboxCoord[2][2], testboxCoord[2][3]));
        testboxImage.drawAtPointOptionClipPixel(x + testboxCoord[0][2], y, 18, CGRect.make(testboxCoord[3][0], testboxCoord[3][1], testboxCoord[3][2], testboxCoord[3][3]), dX, testboxCoord[3][3]);
        testboxImage.drawAtPointOptionClipPixel(x + eX, y, 18, CGRect.make(testboxCoord[3][0], testboxCoord[3][1], testboxCoord[3][2], testboxCoord[3][3]), bX - eX, testboxCoord[3][3]);
    }
}
