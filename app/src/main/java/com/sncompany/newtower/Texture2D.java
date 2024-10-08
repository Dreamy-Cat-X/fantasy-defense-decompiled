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
    public static float DRAW_ADJUST_X_MOVE = 0;
    public static float DRAW_ADJUST_Y_MOVE = 0;
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
    public static final float VIEW_SCRWIDTH = 800;
    public static final float VIEW_SCRHEIGHT = 480;

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
        _width = _height = 1;
        _sizeX = _sizeY = _maxS = _maxT = 1;
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

    public void drawAtPointOptionNoOut(float dX, float dY, int pivot) {
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
        width = _width * _maxS;
        height = _height * _maxT;
        setPivot(dX, dY, pivot);

        pointX += DRAW_ADJUST_X_MOVE;
        pointY = VIEW_SCRHEIGHT - pointY - height + DRAW_ADJUST_Y_MOVE;
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

    public void drawAtPointOptionFlipHorizon(float f, float f2, int i) {
        if (this.name == -1)
            return;

        coordinates[0] = _maxS;
        coordinates[1] = 0;
        coordinates[2] = 0;
        coordinates[3] = 0;
        coordinates[4] = _maxS;
        coordinates[5] = _maxT;
        coordinates[6] = 0;
        coordinates[7] = _maxT;
        width = _width * _maxS;
        height = _height * _maxT;
        setPivot(f, f2, i);

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
        gl.glBindTexture(3553, name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionSize(float dX, float dY, int pivot, float size) {
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
        width = _width * _maxS * size;
        height = _height * _maxT * size;
        setPivot(dX, dY, pivot);

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

    public void drawAtPointOptionHorizonSize(float dX, float dY, int pivot, float hgt) {
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
        width = _width * _maxS;
        height = _height * _maxT * hgt;
        pointX = dX;
        pointY = dY;
        setPivot(dX, dY, pivot);

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
        coordinates[2] = 0;
        coordinates[3] = _maxT;
        coordinates[4] = _maxS;
        coordinates[5] = 0;
        coordinates[6] = 0;
        coordinates[7] = 0;
        width = _width * _maxS * w;
        height = _height * _maxT * w;
        setPivot(dX, dY, pivot);

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
        if (f8 <= 0 || height <= 0 || pointX + f8 <= 0 || pointX >= VIEW_SCRWIDTH || pointY + height <= 0 || pointY >= VIEW_SCRHEIGHT)
            return;

        pointX += DRAW_ADJUST_X_MOVE;
        pointY += DRAW_ADJUST_Y_MOVE;
        vertices[0] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[1] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[2] = 0;
        vertices[3] = pointX + f8;
        vertices[4] = pointY - TEXTURE_DRAW_MARGIN;
        vertices[5] = 0;
        vertices[6] = pointX - TEXTURE_DRAW_MARGIN;
        vertices[7] = pointY + height;
        vertices[8] = 0;
        vertices[9] = pointX + f8;
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
        if (width <= 0 || height <= 0 || pointX + width <= 0 || pointX >= VIEW_SCRWIDTH || pointY + height <= 0 || pointY >= VIEW_SCRHEIGHT)
            return;
        pointX = pointX + DRAW_ADJUST_X_MOVE;
        pointY = pointY + DRAW_ADJUST_Y_MOVE;
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
        _sizeX = bounds_.right - bounds_.left;
        _sizeY = bounds_.bottom - bounds_.top;
        int w = 2;
        int h = 2;
        while (w < _sizeX)
            w *= 2;
        while (h < _sizeY)
            h *= 2;
        Bitmap createBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        GameRenderer.drawFont.setColor(GameRenderer.fontColor);
        canvas.drawText(str, -bounds_.left, -bounds_.top, GameRenderer.drawFont);
        gl.glBindTexture(3553, this.name);
        gl.glTexEnvf(8960, 8704, 8448);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(3553, 10241, 9729);
        gl.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        _width = w;
        _height = h;
        _maxS = Math.min(_sizeX / w, 1);
        _maxT = Math.min(_sizeY / h, 1);
        createBitmap.recycle();
    }

    public void initWithStringDoubleColor(String str) {
        gl.glGenTextures(1, _name, 0);
        name = _name[0];
        int siz = GameRenderer.fontSize / 6;
        int fsiz = siz > 0 ? siz : 1;
        GameRenderer.drawFont.getTextBounds(str, 0, str.length(), bounds_);
        int dbsz = fsiz * 2;
        _sizeX = (bounds_.right - bounds_.left) + dbsz;
        _sizeY = (bounds_.bottom - bounds_.top) + dbsz;
        int w = 2;
        int h = 2;
        while (w < _sizeX)
            w *= 2;
        while (h < _sizeY)
            h *= 2;
        Bitmap createBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        GameRenderer.drawFont.setStrokeWidth(fsiz);
        GameRenderer.drawFont.setStyle(Paint.Style.STROKE);
        GameRenderer.drawFont.setColor(GameRenderer.strokeColor);
        canvas.drawText(str, (-bounds_.left) + fsiz, (-bounds_.top) + fsiz, GameRenderer.drawFont);
        GameRenderer.drawFont.setStyle(Paint.Style.FILL);
        GameRenderer.drawFont.setColor(GameRenderer.fontColor);
        canvas.drawText(str, (-bounds_.left) + fsiz, (-bounds_.top) + fsiz, GameRenderer.drawFont);
        gl.glBindTexture(3553, this.name);
        gl.glTexEnvf(8960, 8704, 8448);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(3553, 10241, 9729);
        gl.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        _width = w;
        _height = h;
        _maxS = Math.min(_sizeX / w, 1);
        _maxT = Math.min(_sizeY / h, 1);
        createBitmap.recycle();
    }

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
}
