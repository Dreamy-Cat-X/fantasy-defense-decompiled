package com.sncompany.newtower;

import static javax.microedition.khronos.opengles.GL10.GL_TEXTURE_2D;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLUtils;

import com.sncompany.newtower.DataClasses.CGRect;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

/* loaded from: D:\decomp\classes.dex */
public class Texture2D {
    private static final int COORDINATES_LENGTH = 8;
    private static final int COORDINATES_LENGTH_X_4 = 32;
    public static float DRAW_ADJUST_X_MOVE = 0.0f;
    public static float DRAW_ADJUST_Y_MOVE = 0.0f;
    public static final int GHB = 33;
    public static final int GHT = 17;
    public static final int GHV = 9;
    public static final int GLB = 34;
    public static final int GLT = 18;
    public static final int GLV = 10;
    public static final int GRB = 36;
    public static final int GRT = 20;
    public static final int GRV = 12;
    public static final int SCRHEIGHT_480 = 480;
    public static final int SCRWIDTH_800 = 800;
    private static final int STROKE_SIZE_PER_DEPTH = 6;
    private static final float TEXTURE_DRAW_MARGIN = 0.5f;
    private static final int VERTICES_LENGTH_X_4 = 48;
    private static int[] _name;
    private static float[] coordinates;
    private static FloatBuffer coordinatesBuffer;
    private static float drawLengthX;
    private static float drawLengthY;
    private static float drawStartX;
    private static float drawStartY;
    public static GL10 gl;
    private static float guideEndX;
    private static float guideEndY;
    private static float guideStartX;
    private static float guideStartY;
    private static float height;
    private static FloatBuffer mVertexBuffer;
    private static NewTower newTower;
    private static float pointX;
    private static float pointY;
    private static float[] tanValue;
    private static ByteBuffer tbb;
    private static ByteBuffer vbb;
    private static float[] vertices;
    private static float width;
    public int _height;
    private float _maxS;
    private float _maxT;
    public float _sizeX;
    public float _sizeY;
    public int _width;
    public int name = -1;
    public static Rect bounds_ = new Rect();
    public static final float VIEW_SCRWIDTH = 800.0f;
    public static final float VIEW_SCRHEIGHT = 480.0f;

    public static void setAlpha(float a) {
        gl.glColor4f(1, 1, 1, a);
    }

    /**
     * Similar to setAlpha, but darkens the picture as the opacity lowers
     * @param a RGBA value
     */
    public static void setColors(float a) {
        gl.glColor4f(a, a, a, a);
    }

    public Texture2D() {
        if (bounds_ == null)
            bounds_ = new Rect();
        if (_name == null)
            _name = new int[3];
        if (coordinates == null)
            coordinates = new float[8];
        if (vertices == null)
            vertices = new float[12];

        if (tanValue == null) {
            tanValue = new float[90];
            for (int i = 0; i < 90; i++)
                tanValue[i] = (float) Math.tan(Math.toRadians(i));
        }
        if (vbb == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
            vbb = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            mVertexBuffer = vbb.asFloatBuffer();
        }
        if (tbb == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            tbb = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
            coordinatesBuffer = tbb.asFloatBuffer();
        }
    }

    public Texture2D(int img) {
        this();
        initWithImageName(img);
    }

    public void dealloc() {
        if (name == -1)
            return;
        _name[0] = name;
        gl.glDeleteTextures(1, _name, 0);
        _name[0] = -1;
        name = -1;
    }

    public static void connectGL(NewTower newTower2, GL10 gl10) {
        newTower = newTower2;
        gl = gl10;
    }

    public void initWithImageColor(int color) {
        if (name != -1)
            dealloc();

        gl.glGenTextures(1, _name, 0);
        name = _name[0];
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(color);
        gl.glBindTexture(3553, this.name);
        gl.glTexEnvx(8960, 8704, 7681);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(3553, 10241, 9729);
        gl.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        this._width = 1;
        this._height = 1;
        float f = 1;
        this._sizeX = f;
        this._sizeY = f;
        this._maxS = 1.0f;
        this._maxT = 1.0f;
        createBitmap.recycle();
    }

    public void initWithImageName(int id) {
        if (name != -1)
            dealloc();

        gl.glGenTextures(1, _name, 0);
        name = _name[0];
        Bitmap decodeResource = BitmapFactory.decodeResource(newTower.getResources(), id);
        int resW = decodeResource.getWidth();
        int resH = decodeResource.getHeight();
        int hPow = 2;
        int wPow = 2;
        while (wPow < resW)
            wPow *= 2;
        while (hPow < resH)
            hPow *= 2;

        Bitmap createBitmap = Bitmap.createBitmap(wPow, hPow, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeResource, new Rect(0, 0, resW, resH), new Rect(0, 0, resW, resH), GameRenderer.drawFont);
        gl.glBindTexture(GL_TEXTURE_2D, this.name);
        gl.glTexEnvx(8960, 8704, 7681);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(GL_TEXTURE_2D, 10241, 9729);
        gl.glTexParameterx(GL_TEXTURE_2D, 10240, 9729);
        GLUtils.texImage2D(GL_TEXTURE_2D, 0, createBitmap, 0);
        _width = wPow;
        _height = hPow;
        _sizeX = (float) resW;
        _sizeY = (float) resH;
        _maxS = Math.min((float) resW / wPow, 1f);
        _maxT = Math.min((float) resH / hPow, 1f);

        decodeResource.recycle();
        createBitmap.recycle();
    }

    public void drawAtPointOption(float x, float y, int pivot) {
        if (this.name == -1)
            return;
        coordinates[0] = 0f;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0f;
        coordinates[5] = 0f;
        coordinates[6] = _maxS;
        coordinates[7] = 0f;
        width = _width * _maxS;
        height = _height * _maxT;
        setPivot(x, y, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0 || height <= 0 || pointX + width <= 0 || pointX >= VIEW_SCRWIDTH || pointY + height <= 0 || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionNoOut(float dX, float dY, int pivot) {
        if (this.name == -1)
            return;

        coordinates[0] = 0.0f;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0.0f;
        coordinates[5] = 0.0f;
        coordinates[6] = _maxS;
        coordinates[7] = 0.0f;
        width = _width * _maxS;
        height = _height * _maxT;
        setPivot(dX, dY, pivot);

        pointX += DRAW_ADJUST_X_MOVE;
        pointY = VIEW_SCRHEIGHT - pointY - height + DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionFlipHorizon(float f, float f2, int i) {
        if (this.name == -1)
            return;

        coordinates[0] = _maxS;
        coordinates[1] = 0.0f;
        coordinates[2] = 0.0f;
        coordinates[3] = 0.0f;
        coordinates[4] = _maxS;
        coordinates[5] = _maxT;
        coordinates[6] = 0.0f;
        coordinates[7] = _maxT;
        width = _width * _maxS;
        height = _height * _maxT;
        setPivot(f, f2, i);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionFlip(float dX, float dY, int pivot) {
        if (this.name == -1)
            return;
        coordinates[0] = _maxS;
        coordinates[1] = _maxT;
        coordinates[2] = 0f;
        coordinates[3] = _maxT;
        coordinates[4] = _maxS;
        coordinates[5] = 0f;
        coordinates[6] = 0f;
        coordinates[7] = 0f;
        width = _width * _maxS;
        height = _height * _maxT;
        setPivot(dX, dY, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0 || height <= 0 || pointX + width <= 0 || pointX >= VIEW_SCRWIDTH || pointY + height <= 0 || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionSize(float dX, float dY, int pivot, float size) {
        if (this.name == -1)
            return;

        coordinates[0] = 0.0f;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0.0f;
        coordinates[5] = 0.0f;
        coordinates[6] = _maxS;
        coordinates[7] = 0.0f;
        width = _width * _maxS * size;
        height = _height * _maxT * size;
        setPivot(dX, dY, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glFrontFace(2304);
        gl.glEnableClientState(32888);
        gl.glEnableClientState(32884);
        gl.glEnable(3553);
        gl.glBindTexture(3553, name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    private void setPivot(float dX, float dY, int pivot) {
        pointX = dX;
        pointY = dY;
        if (pivot == 9) {
            pointX = dX - (width / 2f);
            pointY = dY - (height / 2f);
        } else if (pivot == 10) {
            pointY = dY - (height / 2f);
        } else if (pivot == 12) {
            pointX = dX - width;
            pointY = dY - (height / 2f);
        } else if (pivot == 17) {
            pointX = dX - (width / 2f);
        } else if (pivot == 20) {
            pointX = dX - width;
        } else if (pivot == 36) {
            pointX = dX - width;
            pointY = dY - height;
        } else if (pivot == 33) {
            pointX = dX - (width / 2f);
            pointY = dY - height;
        } else if (pivot == 34)
            pointY = dY - height;
    }

    public void drawAtPointFill(float dX, float dY, float w, float h) {
        if (this.name == -1)
            return;

        coordinates[0] = 0f;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0.0f;
        coordinates[5] = 0.0f;
        coordinates[6] = _maxS;
        coordinates[7] = 0.0f;
        width = w;
        height = h;
        pointX = dX;
        pointY = (VIEW_SCRHEIGHT - dY) - h;
        if (w <= 0.0f || h <= 0.0f || dX + w <= 0.0f || dX >= VIEW_SCRWIDTH || pointY + h <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX = dX + DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + w;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + h;
        vertices[8] = 0.0f;
        vertices[9] = pointX + w;
        vertices[10] = pointY + h;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glFrontFace(2304);
        gl.glEnableClientState(32888);
        gl.glEnableClientState(32884);
        gl.glEnable(3553);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionHorizonSize(float dX, float dY, int pivot, float hgt) {
        if (this.name == -1)
            return;

        coordinates[0] = 0.0f;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0.0f;
        coordinates[5] = 0.0f;
        coordinates[6] = _maxS;
        coordinates[7] = 0.0f;
        width = _width * _maxS;
        height = _height * _maxT * hgt;
        pointX = dX;
        pointY = dY;
        setPivot(dX, dY, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glFrontFace(2304);
        gl.glEnableClientState(32888);
        gl.glEnableClientState(32884);
        gl.glEnable(3553);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionVerticalSize(float dX, float dY, int pivot, float wdt) {
        if (this.name == -1)
            return;

        coordinates[0] = 0.0f;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0.0f;
        coordinates[5] = 0.0f;
        coordinates[6] = _maxS;
        coordinates[7] = 0.0f;
        width = _width * _maxS * wdt;
        height = _height * _maxT;
        setPivot(dX, dY, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glFrontFace(2304);
        gl.glEnableClientState(32888);
        gl.glEnableClientState(32884);
        gl.glEnable(3553);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionFlipSize(float dX, float dY, int pivot, float w) {
        if (this.name == -1)
            return;

        coordinates[0] = _maxS;
        coordinates[1] = _maxT;
        coordinates[2] = 0.0f;
        coordinates[3] = _maxT;
        coordinates[4] = _maxS;
        coordinates[5] = 0.0f;
        coordinates[6] = 0.0f;
        coordinates[7] = 0.0f;
        width = _width * _maxS * w;
        height = _height * _maxT * w;
        setPivot(dX, dY, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionClip(float dX, float dY, int pivot, CGRect rect) {
        if (this.name == -1)
            return;

        coordinates[0] = (rect.originX * _maxS) / _sizeX;
        coordinates[1] = Math.min(((rect.originY + rect.sizeHeight) * _maxT) / _sizeY, 1f);
        coordinates[2] = Math.min(((rect.originX + rect.sizeWidth) * _maxS) / _sizeX, 1f);
        coordinates[3] = Math.min(((rect.originY + rect.sizeHeight) * _maxT) / _sizeY, 1f);
        coordinates[4] = (rect.originX * _maxS) / _sizeX;
        coordinates[5] = (rect.originY * _maxT) / _sizeY;
        coordinates[6] = Math.min(((rect.originX + rect.sizeWidth) * _maxS) / _sizeX, 1f);
        coordinates[7] = (rect.originY * _maxT) / _sizeY;

        width = ((_width * _maxS) * rect.sizeWidth) / _sizeX;
        height = ((_height * _maxT) * rect.sizeHeight) / _sizeY;
        setPivot(dX, dY, pivot);

        pointY = VIEW_SCRHEIGHT - pointY - height;
        float f8 = width;
        if (f8 <= 0.0f || height <= 0.0f || pointX + f8 <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + f8;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + f8;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionClipSize(float x, float y, int pivot, CGRect rect, float siz) {
        if (this.name == -1) {
            return;
        }
        coordinates[0] = (rect.originX * _maxS) / _sizeX;
        coordinates[1] = Math.min(((rect.originY + rect.sizeHeight) * _maxT) / _sizeY, 1);
        coordinates[2] = Math.min(((rect.originX + rect.sizeWidth) * _maxS) / _sizeX, 1);
        coordinates[3] = Math.min(((rect.originY + rect.sizeHeight) * _maxT) / _sizeY, 1);
        coordinates[4] = (rect.originX * _maxS) / _sizeX;
        coordinates[5] = (rect.originY * _maxT) / _sizeY;
        coordinates[6] = Math.min(((rect.originX + rect.sizeWidth) * _maxS) / _sizeX, 1);
        coordinates[7] = (rect.originY * _maxT) / _sizeY;

        width = (((_width * _maxS) * rect.sizeWidth) / _sizeX) * siz;
        height = (((_height * _maxT) * rect.sizeHeight) / _sizeY) * siz;
        setPivot(x, y, pivot);
        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionClipPixel(float x, float y, int pivot, CGRect rect, float w, float h) {
        if (name == -1)
            return;

        coordinates[0] = (rect.originX * _maxS) / _sizeX;
        coordinates[1] = Math.min(((rect.originY + rect.sizeHeight) * _maxT) / _sizeY, 1);
        coordinates[2] = Math.min(((rect.originX + rect.sizeWidth) * _maxS) / _sizeX, 1);
        coordinates[3] = Math.min(((rect.originY + rect.sizeHeight) * _maxT) / _sizeY, 1);
        coordinates[4] = (rect.originX * _maxS) / _sizeX;
        coordinates[5] = (rect.originY * _maxT) / _sizeY;
        coordinates[6] = Math.min(((rect.originX + rect.sizeWidth) * _maxS) / _sizeX, 1);
        coordinates[7] = (rect.originY * _maxT) / _sizeY;
        width = w;
        height = h;
        setPivot(x, y, pivot);
        pointY = VIEW_SCRHEIGHT - pointY - height;
        if (width <= 0.0f || height <= 0.0f || pointX + width <= 0.0f || pointX >= VIEW_SCRWIDTH || pointY + height <= 0.0f || pointY >= VIEW_SCRHEIGHT)
            return;
        pointX = pointX + DRAW_ADJUST_X_MOVE;
        pointY = pointY + DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionGuide(float x, float y, int pivot, CGRect rect) {
        if (name == -1)
            return;

        width = _width * _maxS;
        height = _height * _maxT;
        drawStartX = drawStartY = 0;
        drawLengthX = width;
        drawLengthY = height;
        guideStartX = rect.originX;
        guideStartY = rect.originY;
        guideEndX = rect.originX + rect.sizeWidth;
        guideEndY = rect.originY + rect.sizeHeight;
        setPivot(x, y, pivot);
        if (drawStartX < 0) {
            drawLengthX += drawStartX;
            drawStartX = 0;
        }
        if (drawStartY < 0) {
            drawLengthY += drawStartY;
            drawStartY = 0;
        }
        if (pointX < guideStartX) {
            drawStartX += guideStartX - pointX;
            drawLengthX -= guideStartX - pointX;
            pointX = guideStartX;
        }
        if (pointY < guideStartY) {
            drawStartY += guideStartY - pointY;
            drawLengthY -= guideStartY - pointY;
            pointY = guideStartY;
        }
        if (drawLengthX + drawStartX > width)
            drawLengthX = width - drawStartX;
        if (drawLengthY + drawStartY > height)
            drawLengthY = height - drawStartY;
        if (drawLengthX + pointX > guideEndX)
            drawLengthX = guideEndX - pointX;
        if (drawLengthY + pointY > guideEndY)
            drawLengthY = guideEndY - pointY;
        if (drawLengthX <= 0 || drawLengthY < 0 || width + pointX <= 0 || pointX >= VIEW_SCRWIDTH || pointY >= VIEW_SCRHEIGHT)
            return;

        coordinates[0] = drawStartX / _width;
        coordinates[1] = Math.min((drawStartY + drawLengthY) / _height, 1);
        coordinates[2] = Math.min((drawStartX + drawLengthX) / _width, 1);
        coordinates[3] = Math.min((drawLengthY + drawStartY) / _height, 1);
        coordinates[4] = drawStartX / _width;
        coordinates[5] = drawStartY / _height;
        coordinates[6] = Math.min((drawStartX + drawLengthX) / _width, 1);
        coordinates[7] = drawStartY / _height;

        pointX = pointX + DRAW_ADJUST_X_MOVE;
        pointY = ((VIEW_SCRHEIGHT - pointY) - drawLengthY) + DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + drawLengthX;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + drawLengthY;
        vertices[8] = 0;
        vertices[9] = pointX + drawLengthX;
        vertices[10] = pointY + drawLengthY;
        vertices[11] = 0;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void initWithStringColor(String str) {
        gl.glGenTextures(1, _name, 0);
        name = _name[0];
        GameRenderer.drawFont.setStyle(Paint.Style.FILL);
        GameRenderer.drawFont.getTextBounds(str, 0, str.length(), bounds_);
        int i = bounds_.right - bounds_.left;
        int i2 = bounds_.bottom - bounds_.top;
        int i3 = 2;
        int i4 = 2;
        while (i4 < i) {
            i4 *= 2;
        }
        while (i3 < i2) {
            i3 *= 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        GameRenderer.drawFont.setColor(GameRenderer.fontColor);
        canvas.drawText(str, -bounds_.left, -bounds_.top, GameRenderer.drawFont);
        gl.glBindTexture(3553, this.name);
        gl.glTexEnvf(8960, 8704, 8448.0f);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(3553, 10241, 9729);
        gl.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        this._width = i4;
        this._height = i3;
        float f = i;
        this._sizeX = f;
        float f2 = i2;
        this._sizeY = f2;
        float f3 = f / i4;
        this._maxS = f3;
        this._maxT = f2 / i3;
        if (f3 > 1.0f) {
            this._maxS = 1.0f;
        }
        if (this._maxT > 1.0f) {
            this._maxT = 1.0f;
        }
        createBitmap.recycle();
    }

    public void initWithStringDoubleColor(String str) {
        gl.glGenTextures(1, _name, 0);
        name = _name[0];
        int i = GameRenderer.fontSize / 6;
        int i2 = i > 0 ? i : 1;
        GameRenderer.drawFont.getTextBounds(str, 0, str.length(), bounds_);
        int i3 = i2 * 2;
        int i4 = (bounds_.right - bounds_.left) + i3;
        int i5 = (bounds_.bottom - bounds_.top) + i3;
        int i6 = 2;
        int i7 = 2;
        while (i7 < i4) {
            i7 *= 2;
        }
        while (i6 < i5) {
            i6 *= 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i7, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        GameRenderer.drawFont.setStrokeWidth(i2);
        GameRenderer.drawFont.setStyle(Paint.Style.STROKE);
        GameRenderer.drawFont.setColor(GameRenderer.strokeColor);
        canvas.drawText(str, (-bounds_.left) + i2, (-bounds_.top) + i2, GameRenderer.drawFont);
        GameRenderer.drawFont.setStyle(Paint.Style.FILL);
        GameRenderer.drawFont.setColor(GameRenderer.fontColor);
        canvas.drawText(str, (-bounds_.left) + i2, (-bounds_.top) + i2, GameRenderer.drawFont);
        gl.glBindTexture(3553, this.name);
        gl.glTexEnvf(8960, 8704, 8448.0f);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(3553, 10241, 9729);
        gl.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        _width = i7;
        _height = i6;
        _sizeX = (float) i4;
        _sizeY = (float) i5;
        float f3 = (float) i4 / i7;
        _maxS = f3;
        _maxT = (float) i5 / i6;
        if (f3 > 1.0f) {
            this._maxS = 1.0f;
        }
        if (this._maxT > 1.0f) {
            this._maxT = 1.0f;
        }
        createBitmap.recycle();
    }

    public void drawAtPointOptionRotate(float x, float y, int pivot, float angle, float siz) {
        if (name == -1)
            return;

        coordinates[0] = 0;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0;
        coordinates[5] = 0;
        coordinates[6] = _maxS;
        coordinates[7] = 0;

        width = _width * _maxS * siz;
        height = _height * _maxT * siz;
        setPivot(0, 0, pivot);
        pointX += DRAW_ADJUST_X_MOVE;
        pointY = (-height) - pointY + DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0.0f;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0.0f;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0.0f;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0.0f;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glPushMatrix();
        gl.glTranslatef(x, VIEW_SCRHEIGHT - y, 0.0f);
        gl.glRotatef(-angle, 0.0f, 0.0f, 1.0f);
        gl.glDrawArrays(5, 0, 4);
        gl.glPopMatrix();
    }

    public void drawAtPointOptionPosRotate(float f, float f2, float f3, float f4, int i, float f5, float f6) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f7 = this._maxT;
        fArr[1] = f7;
        float f8 = this._maxS;
        fArr[2] = f8;
        fArr[3] = f7;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f8;
        fArr[7] = 0.0f;
        float f9 = this._width * f8 * f6;
        width = f9;
        float f10 = this._height * f7 * f6;
        height = f10;
        float f11 = f3 * f6;
        pointX = f11;
        float f12 = f4 * f6;
        pointY = f12;
        if (i == 9) {
            pointX = f11 - (f9 / 2.0f);
            pointY = f12 - (f10 / 2.0f);
        } else if (i == 10) {
            pointY = f12 - (f10 / 2.0f);
        } else if (i == 12) {
            pointX = f11 - f9;
            pointY = f12 - (f10 / 2.0f);
        } else if (i == 17) {
            pointX = f11 - (f9 / 2.0f);
        } else if (i == 20) {
            pointX = f11 - f9;
        } else if (i == 36) {
            pointX = f11 - f9;
            pointY = f12 - f10;
        } else if (i == 33) {
            pointX = f11 - (f9 / 2.0f);
            pointY = f12 - f10;
        } else if (i == 34) {
            pointY = f12 - f10;
        }
        float f13 = height;
        float f14 = (-f13) - pointY;
        pointY = f14;
        float f15 = pointX + DRAW_ADJUST_X_MOVE;
        pointX = f15;
        float f16 = f14 + DRAW_ADJUST_Y_MOVE;
        pointY = f16;
        float[] fArr2 = vertices;
        fArr2[0] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f16 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        float f17 = width;
        fArr2[3] = f15 + f17;
        fArr2[4] = f16 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f16 + f13;
        fArr2[8] = 0.0f;
        fArr2[9] = f15 + f17;
        fArr2[10] = f16 + f13;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glPushMatrix();
        gl.glTranslatef(f, VIEW_SCRHEIGHT - f2, 0.0f);
        gl.glRotatef(-f5, 0.0f, 0.0f, 1.0f);
        gl.glDrawArrays(5, 0, 4);
        gl.glPopMatrix();
    }

    private static float ll = 0;
    public void drawLineWithImage(float x, float y, float eX, float eY, float hh) {
        if (name == -1 || (eX == 0 && eY == 0) || hh == 0)
            return;

        coordinates[0] = 0;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0;
        coordinates[5] = 0;
        coordinates[6] = _maxS;
        coordinates[7] = 0;

        width = _width * _maxS;
        height = (float)((_height * _maxT * hh * Math.sqrt((eX * eX) + (eY * eY))) / _sizeY);
        pointX = -(width / 2f);
        pointY = 0;

        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glPushMatrix();
        gl.glTranslatef(x + DRAW_ADJUST_X_MOVE, VIEW_SCRHEIGHT - y + DRAW_ADJUST_Y_MOVE, 0);
        if (eX == 0) {
            if (eY >= 0)
                gl.glRotatef(180, 0, 0, 1);
        } else if (eY != 0) {
            float abs = Math.abs(eY) / Math.abs(eX);
            if (eX < 0) {
                if (eY < 0) {
                    gl.glRotatef((float) (90.0d - Math.toDegrees(Math.atan(abs))), 0, 0, 1);
                } else
                    gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 90.0d), 0, 0, 1);
            } else if (eY < 0) {
                gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 270.0d), 0, 0, 1);
            } else
                gl.glRotatef((float) (270.0d - Math.toDegrees(Math.atan(abs))), 0, 0, 1);
        } else if (eX < 0) {
            gl.glRotatef(90, 0, 0, 1);
        } else
            gl.glRotatef(270, 0, 0, 1);
        gl.glDrawArrays(5, 0, 4);
        gl.glPopMatrix();
    }

    public void drawArrowWithImage(float x, float y, float eX, float eY, float hh) {
        if (this.name == -1 || (eX == 0 && eY == 0) || hh == 0)
            return;
        coordinates[0] = 0;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0;
        coordinates[5] = 0;
        coordinates[6] = _maxS;
        coordinates[7] = 0;

        width = _width * _maxS;
        height = _height * _maxT;
        pointX = -(width / 2f);
        pointY = -height;

        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + _height * _maxT;
        vertices[8] = 0;
        vertices[9] = pointX + width;
        vertices[10] = pointY + _height * _maxT;
        vertices[11] = 0;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glPushMatrix();
        gl.glTranslatef(x + (eX * hh) + DRAW_ADJUST_X_MOVE, (VIEW_SCRHEIGHT - y) - (eY * hh) + DRAW_ADJUST_Y_MOVE, 0);
        if (eX == 0) {
            if (eY >= 0)
                gl.glRotatef(180, 0, 0, 1);
        } else if (eY != 0) {
            float abs = Math.abs(eY) / Math.abs(eX);
            if (eX < 0) {
                if (eY < 0) {
                    gl.glRotatef((float) (90.0d - Math.toDegrees(Math.atan(abs))), 0, 0, 1);
                } else
                    gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 90.0d), 0, 0, 1);
            } else if (eY < 0) {
                gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 270.0d), 0, 0, 1);
            } else
                gl.glRotatef((float) (270.0d - Math.toDegrees(Math.atan(abs))), 0, 0, 1);
        } else if (eX < 0) {
            gl.glRotatef(90, 0, 0, 1);
        } else
            gl.glRotatef(270, 0, 0, 1);
        gl.glDrawArrays(5, 0, 4);
        gl.glPopMatrix();
    }

    public void fillRect(float x, float y, float w, float h) {
        if (this.name == -1)
            return;

        coordinates[0] = 0;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0;
        coordinates[5] = 0;
        coordinates[6] = _maxS;
        coordinates[7] = 0;
        width = w;
        height = h;
        pointX = x;
        pointY = (VIEW_SCRHEIGHT - y) - h;
        if (w <= 0 || h <= 0 || x + w <= 0 || x >= VIEW_SCRWIDTH || pointY + h <= 0 || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + w;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + h;
        vertices[8] = 0;
        vertices[9] = pointX + w;
        vertices[10] = pointY + h;
        vertices[11] = 0;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void fillRectGuide(float dX, float dY, float wdt, float hgt, CGRect rect) {
        if (name == -1)
            return;

        guideStartX = rect.originX;
        guideStartY = rect.originY;
        guideEndX = rect.originX + rect.sizeWidth;
        guideEndY = rect.originY + rect.sizeHeight;
        coordinates[0] = 0;
        coordinates[1] = _maxT;
        coordinates[2] = _maxS;
        coordinates[3] = _maxT;
        coordinates[4] = 0;
        coordinates[5] = 0;
        coordinates[6] = _maxS;
        coordinates[7] = 0;
        width = wdt;
        height = hgt;
        pointX = dX;
        pointY = (VIEW_SCRHEIGHT - dY) - hgt;
        if (wdt <= 0 || hgt <= 0 || wdt + dX <= 0 || dX >= VIEW_SCRWIDTH || hgt + pointY <= 0 || pointY >= VIEW_SCRHEIGHT)
            return;

        if (dX < guideStartX) {
            guideEndX -= guideStartX - dX;
            pointX = guideStartX;
        }
        if (pointY < guideStartY) {
            guideEndY -= guideStartY - pointY;
            pointX = guideStartY;
        }
        if (width + pointX > guideEndX)
            width = guideEndX - pointX;
        if (height + pointY > guideEndY)
            height = guideEndY - pointY;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + width;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0;
        vertices[9] = pointX + width;
        vertices[10] = pointY + height;
        vertices[11] = 0;
        mVertexBuffer.put(vertices);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }
}
