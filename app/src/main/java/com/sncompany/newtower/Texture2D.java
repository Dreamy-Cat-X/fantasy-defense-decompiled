package com.sncompany.newtower;

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
    public static final int COORDINATES_LENGTH = 8;
    public static final int COORDINATES_LENGTH_X_4 = 32;
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
    public static final int STROKE_SIZE_PER_DEPTH = 6;
    static final float TEXTURE_DRAW_MARGIN = 0.5f;
    public static final int VERTICES_LENGTH_X_4 = 48;
    public static int[] _name;
    static float[] coordinates;
    static FloatBuffer coordinatesBuffer;
    static float drawLengthX;
    static float drawLengthY;
    static float drawStartX;
    static float drawStartY;
    public static GL10 gl;
    static float guideEndX;
    static float guideEndY;
    static float guideStartX;
    static float guideStartY;
    static float height;
    static FloatBuffer mVertexBuffer;
    static NewTower newTower;
    static float pointX;
    static float pointY;
    static float[] tanValue;
    static ByteBuffer tbb;
    static ByteBuffer vbb;
    static float[] vertices;
    static float width;
    public int _height;
    public float _maxS;
    public float _maxT;
    public float _sizeX;
    public float _sizeY;
    public int _width;
    public int name = -1;
    public static Rect bounds_ = new Rect();
    public static final float VIEW_SCRWIDTH = 800.0f;
    public static final float VIEW_SCRHEIGHT = 480.0f;

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
        int i = this.name;
        if (i == -1) {
            return;
        }
        int[] iArr = _name;
        iArr[0] = i;
        gl.glDeleteTextures(1, iArr, 0);
        _name[0] = -1;
        this.name = -1;
    }

    public static void connectGL(NewTower newTower2, GL10 gl10) {
        newTower = newTower2;
        gl = gl10;
    }

    public void initWithImageColor(int i) {
        if (this.name != -1)
            dealloc();

        gl.glGenTextures(1, _name, 0);
        this.name = _name[0];
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(i);
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

    public void initWithImageName(int i) {
        if (this.name != -1) {
            dealloc();
        }
        gl.glGenTextures(1, _name, 0);
        this.name = _name[0];
        Bitmap decodeResource = BitmapFactory.decodeResource(newTower.getResources(), i);
        int width2 = decodeResource.getWidth();
        int height2 = decodeResource.getHeight();
        int i2 = 2;
        int i3 = 2;
        while (i3 < width2) {
            i3 *= 2;
        }
        while (i2 < height2) {
            i2 *= 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeResource, new Rect(0, 0, width2, height2), new Rect(0, 0, width2, height2), GameRenderer.drawFont);
        gl.glBindTexture(3553, this.name);
        gl.glTexEnvx(8960, 8704, 7681);
        gl.glTexEnvx(8960, 8705, 6408);
        gl.glTexParameterx(3553, 10241, 9729);
        gl.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        this._width = i3;
        this._height = i2;
        float f = width2;
        this._sizeX = f;
        float f2 = height2;
        this._sizeY = f2;
        float f3 = f / i3;
        this._maxS = f3;
        this._maxT = f2 / i2;
        if (f3 > 1.0f) {
            this._maxS = 1.0f;
        }
        if (this._maxT > 1.0f) {
            this._maxT = 1.0f;
        }
        decodeResource.recycle();
        createBitmap.recycle();
    }

    public void drawAtPointOption(float x, float y, int i) {
        if (this.name == -1)
            return;
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f3 = this._maxT;
        fArr[1] = f3;
        float f4 = this._maxS;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f4;
        fArr[7] = 0.0f;
        float f5 = this._width * f4;
        width = f5;
        float f6 = this._height * f3;
        height = f6;
        pointX = x;
        pointY = y;
        if (i == 9) {
            pointX = x - (f5 / 2.0f);
            pointY = y - (f6 / 2.0f);
        } else if (i == 10) {
            pointY = y - (f6 / 2.0f);
        } else if (i == 12) {
            pointX = x - f5;
            pointY = y - (f6 / 2.0f);
        } else if (i == 17) {
            pointX = x - (f5 / 2.0f);
        } else if (i == 20) {
            pointX = x - f5;
        } else if (i == 36) {
            pointX = x - f5;
            pointY = y - f6;
        } else if (i == 33) {
            pointX = x - (f5 / 2.0f);
            pointY = y - f6;
        } else if (i == 34) {
            pointY = y - f6;
        }
        float f7 = VIEW_SCRHEIGHT;
        float f8 = f7 - pointY;
        float f9 = height;
        float f10 = f8 - f9;
        pointY = f10;
        float f11 = width;
        if (f11 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        float f12 = pointX;
        if (f12 + f11 <= 0.0f || f12 >= VIEW_SCRWIDTH || f10 + f9 <= 0.0f || f10 >= f7) {
            return;
        }
        float f13 = f12 + DRAW_ADJUST_X_MOVE;
        pointX = f13;
        float f14 = f10 + DRAW_ADJUST_Y_MOVE;
        pointY = f14;
        float[] fArr2 = vertices;
        fArr2[0] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f13 + f11;
        fArr2[4] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f14 + f9;
        fArr2[8] = 0.0f;
        fArr2[9] = f13 + f11;
        fArr2[10] = f14 + f9;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionNoOut(float f, float f2, int i) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f3 = this._maxT;
        fArr[1] = f3;
        float f4 = this._maxS;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f4;
        fArr[7] = 0.0f;
        float f5 = this._width * f4;
        width = f5;
        float f6 = this._height * f3;
        height = f6;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f5 / 2.0f);
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 12) {
            pointX = f - f5;
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f5 / 2.0f);
        } else if (i == 20) {
            pointX = f - f5;
        } else if (i == 36) {
            pointX = f - f5;
            pointY = f2 - f6;
        } else if (i == 33) {
            pointX = f - (f5 / 2.0f);
            pointY = f2 - f6;
        } else if (i == 34) {
            pointY = f2 - f6;
        }
        float f7 = VIEW_SCRHEIGHT - pointY;
        float f8 = height;
        float f9 = f7 - f8;
        pointY = f9;
        float f10 = pointX + DRAW_ADJUST_X_MOVE;
        pointX = f10;
        float f11 = f9 + DRAW_ADJUST_Y_MOVE;
        pointY = f11;
        float[] fArr2 = vertices;
        fArr2[0] = f10 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f11 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        float f12 = width;
        fArr2[3] = f10 + f12;
        fArr2[4] = f11 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f10 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f11 + f8;
        fArr2[8] = 0.0f;
        fArr2[9] = f10 + f12;
        fArr2[10] = f11 + f8;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionFlipHorizon(float f, float f2, int i) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        float f3 = this._maxS;
        fArr[0] = f3;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f3;
        float f4 = this._maxT;
        fArr[5] = f4;
        fArr[6] = 0.0f;
        fArr[7] = f4;
        float f5 = this._width * f3;
        width = f5;
        float f6 = this._height * f4;
        height = f6;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f5 / 2.0f);
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 12) {
            pointX = f - f5;
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f5 / 2.0f);
        } else if (i == 20) {
            pointX = f - f5;
        } else if (i == 36) {
            pointX = f - f5;
            pointY = f2 - f6;
        } else if (i == 33) {
            pointX = f - (f5 / 2.0f);
            pointY = f2 - f6;
        } else if (i == 34) {
            pointY = f2 - f6;
        }
        float f7 = VIEW_SCRHEIGHT;
        float f8 = f7 - pointY;
        float f9 = height;
        float f10 = f8 - f9;
        pointY = f10;
        float f11 = width;
        if (f11 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        float f12 = pointX;
        if (f12 + f11 <= 0.0f || f12 >= VIEW_SCRWIDTH || f10 + f9 <= 0.0f || f10 >= f7) {
            return;
        }
        float f13 = f12 + DRAW_ADJUST_X_MOVE;
        pointX = f13;
        float f14 = f10 + DRAW_ADJUST_Y_MOVE;
        pointY = f14;
        float[] fArr2 = vertices;
        fArr2[0] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f13 + f11;
        fArr2[4] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f14 + f9;
        fArr2[8] = 0.0f;
        fArr2[9] = f13 + f11;
        fArr2[10] = f14 + f9;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionFlip(float f, float f2, int i) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        float f3 = this._maxS;
        fArr[0] = f3;
        float f4 = this._maxT;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f4;
        fArr[4] = f3;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        float f5 = this._width * f3;
        width = f5;
        float f6 = this._height * f4;
        height = f6;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f5 / 2.0f);
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 12) {
            pointX = f - f5;
            pointY = f2 - (f6 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f5 / 2.0f);
        } else if (i == 20) {
            pointX = f - f5;
        } else if (i == 36) {
            pointX = f - f5;
            pointY = f2 - f6;
        } else if (i == 33) {
            pointX = f - (f5 / 2.0f);
            pointY = f2 - f6;
        } else if (i == 34) {
            pointY = f2 - f6;
        }
        float f7 = VIEW_SCRHEIGHT;
        float f8 = f7 - pointY;
        float f9 = height;
        float f10 = f8 - f9;
        pointY = f10;
        float f11 = width;
        if (f11 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        float f12 = pointX;
        if (f12 + f11 <= 0.0f || f12 >= VIEW_SCRWIDTH || f10 + f9 <= 0.0f || f10 >= f7) {
            return;
        }
        float f13 = f12 + DRAW_ADJUST_X_MOVE;
        pointX = f13;
        float f14 = f10 + DRAW_ADJUST_Y_MOVE;
        pointY = f14;
        float[] fArr2 = vertices;
        fArr2[0] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f13 + f11;
        fArr2[4] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f14 + f9;
        fArr2[8] = 0.0f;
        fArr2[9] = f13 + f11;
        fArr2[10] = f14 + f9;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionSize(float f, float f2, int i, float f3) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f4 = this._maxT;
        fArr[1] = f4;
        float f5 = this._maxS;
        fArr[2] = f5;
        fArr[3] = f4;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f5;
        fArr[7] = 0.0f;
        float f6 = this._width * f5 * f3;
        width = f6;
        float f7 = this._height * f4 * f3;
        height = f7;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 12) {
            pointX = f - f6;
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f6 / 2.0f);
        } else if (i == 20) {
            pointX = f - f6;
        } else if (i == 36) {
            pointX = f - f6;
            pointY = f2 - f7;
        } else if (i == 33) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - f7;
        } else if (i == 34) {
            pointY = f2 - f7;
        }
        float f8 = VIEW_SCRHEIGHT;
        float f9 = f8 - pointY;
        float f10 = height;
        float f11 = f9 - f10;
        pointY = f11;
        float f12 = width;
        if (f12 <= 0.0f || f10 <= 0.0f) {
            return;
        }
        float f13 = pointX;
        if (f13 + f12 <= 0.0f || f13 >= VIEW_SCRWIDTH || f11 + f10 <= 0.0f || f11 >= f8) {
            return;
        }
        float f14 = f13 + DRAW_ADJUST_X_MOVE;
        pointX = f14;
        float f15 = f11 + DRAW_ADJUST_Y_MOVE;
        pointY = f15;
        float[] fArr2 = vertices;
        fArr2[0] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f14 + f12;
        fArr2[4] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f15 + f10;
        fArr2[8] = 0.0f;
        fArr2[9] = f14 + f12;
        fArr2[10] = f15 + f10;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
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

    public void drawAtPointFill(float f, float f2, float f3, float f4) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f5 = this._maxT;
        fArr[1] = f5;
        float f6 = this._maxS;
        fArr[2] = f6;
        fArr[3] = f5;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f6;
        fArr[7] = 0.0f;
        width = f3;
        height = f4;
        pointX = f;
        pointY = f2;
        float f7 = VIEW_SCRHEIGHT;
        float f8 = (f7 - f2) - f4;
        pointY = f8;
        if (f3 <= 0.0f || f4 <= 0.0f || f + f3 <= 0.0f || f >= VIEW_SCRWIDTH || f8 + f4 <= 0.0f || f8 >= f7) {
            return;
        }
        float f9 = f + DRAW_ADJUST_X_MOVE;
        pointX = f9;
        float f10 = f8 + DRAW_ADJUST_Y_MOVE;
        pointY = f10;
        float[] fArr2 = vertices;
        fArr2[0] = f9 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f10 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f9 + f3;
        fArr2[4] = f10 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f9 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f10 + f4;
        fArr2[8] = 0.0f;
        fArr2[9] = f9 + f3;
        fArr2[10] = f10 + f4;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
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

    public void drawAtPointOptionHorizonSize(float f, float f2, int i, float f3) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f4 = this._maxT;
        fArr[1] = f4;
        float f5 = this._maxS;
        fArr[2] = f5;
        fArr[3] = f4;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f5;
        fArr[7] = 0.0f;
        float f6 = this._width * f5;
        width = f6;
        float f7 = this._height * f4 * f3;
        height = f7;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 12) {
            pointX = f - f6;
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f6 / 2.0f);
        } else if (i == 20) {
            pointX = f - f6;
        } else if (i == 36) {
            pointX = f - f6;
            pointY = f2 - f7;
        } else if (i == 33) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - f7;
        } else if (i == 34) {
            pointY = f2 - f7;
        }
        float f8 = VIEW_SCRHEIGHT;
        float f9 = f8 - pointY;
        float f10 = height;
        float f11 = f9 - f10;
        pointY = f11;
        float f12 = width;
        if (f12 <= 0.0f || f10 <= 0.0f) {
            return;
        }
        float f13 = pointX;
        if (f13 + f12 <= 0.0f || f13 >= VIEW_SCRWIDTH || f11 + f10 <= 0.0f || f11 >= f8) {
            return;
        }
        float f14 = f13 + DRAW_ADJUST_X_MOVE;
        pointX = f14;
        float f15 = f11 + DRAW_ADJUST_Y_MOVE;
        pointY = f15;
        float[] fArr2 = vertices;
        fArr2[0] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f14 + f12;
        fArr2[4] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f15 + f10;
        fArr2[8] = 0.0f;
        fArr2[9] = f14 + f12;
        fArr2[10] = f15 + f10;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
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

    public void drawAtPointOptionVerticalSize(float f, float f2, int i, float f3) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f4 = this._maxT;
        fArr[1] = f4;
        float f5 = this._maxS;
        fArr[2] = f5;
        fArr[3] = f4;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f5;
        fArr[7] = 0.0f;
        float f6 = this._width * f5 * f3;
        width = f6;
        float f7 = this._height * f4;
        height = f7;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 12) {
            pointX = f - f6;
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f6 / 2.0f);
        } else if (i == 20) {
            pointX = f - f6;
        } else if (i == 36) {
            pointX = f - f6;
            pointY = f2 - f7;
        } else if (i == 33) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - f7;
        } else if (i == 34) {
            pointY = f2 - f7;
        }
        float f8 = VIEW_SCRHEIGHT;
        float f9 = f8 - pointY;
        float f10 = height;
        float f11 = f9 - f10;
        pointY = f11;
        float f12 = width;
        if (f12 <= 0.0f || f10 <= 0.0f) {
            return;
        }
        float f13 = pointX;
        if (f13 + f12 <= 0.0f || f13 >= VIEW_SCRWIDTH || f11 + f10 <= 0.0f || f11 >= f8) {
            return;
        }
        float f14 = f13 + DRAW_ADJUST_X_MOVE;
        pointX = f14;
        float f15 = f11 + DRAW_ADJUST_Y_MOVE;
        pointY = f15;
        float[] fArr2 = vertices;
        fArr2[0] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f14 + f12;
        fArr2[4] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f15 + f10;
        fArr2[8] = 0.0f;
        fArr2[9] = f14 + f12;
        fArr2[10] = f15 + f10;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
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

    public void drawAtPointOptionFlipSize(float f, float f2, int i, float f3) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        float f4 = this._maxS;
        fArr[0] = f4;
        float f5 = this._maxT;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f5;
        fArr[4] = f4;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        float f6 = this._width * f4 * f3;
        width = f6;
        float f7 = this._height * f5 * f3;
        height = f7;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 12) {
            pointX = f - f6;
            pointY = f2 - (f7 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f6 / 2.0f);
        } else if (i == 20) {
            pointX = f - f6;
        } else if (i == 36) {
            pointX = f - f6;
            pointY = f2 - f7;
        } else if (i == 33) {
            pointX = f - (f6 / 2.0f);
            pointY = f2 - f7;
        } else if (i == 34) {
            pointY = f2 - f7;
        }
        float f8 = VIEW_SCRHEIGHT;
        float f9 = f8 - pointY;
        float f10 = height;
        float f11 = f9 - f10;
        pointY = f11;
        float f12 = width;
        if (f12 <= 0.0f || f10 <= 0.0f) {
            return;
        }
        float f13 = pointX;
        if (f13 + f12 <= 0.0f || f13 >= VIEW_SCRWIDTH || f11 + f10 <= 0.0f || f11 >= f8) {
            return;
        }
        float f14 = f13 + DRAW_ADJUST_X_MOVE;
        pointX = f14;
        float f15 = f11 + DRAW_ADJUST_Y_MOVE;
        pointY = f15;
        float[] fArr2 = vertices;
        fArr2[0] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f14 + f12;
        fArr2[4] = f15 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f14 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f15 + f10;
        fArr2[8] = 0.0f;
        fArr2[9] = f14 + f12;
        fArr2[10] = f15 + f10;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionClip(float f, float f2, int i, CGRect cGRect) {
        if (this.name == -1) {
            return;
        }
        coordinates[0] = (cGRect.originX * this._maxS) / this._sizeX;
        coordinates[1] = ((cGRect.originY + cGRect.sizeHeight) * this._maxT) / this._sizeY;
        coordinates[2] = ((cGRect.originX + cGRect.sizeWidth) * this._maxS) / this._sizeX;
        coordinates[3] = ((cGRect.originY + cGRect.sizeHeight) * this._maxT) / this._sizeY;
        coordinates[4] = (cGRect.originX * this._maxS) / this._sizeX;
        coordinates[5] = (cGRect.originY * this._maxT) / this._sizeY;
        coordinates[6] = ((cGRect.originX + cGRect.sizeWidth) * this._maxS) / this._sizeX;
        coordinates[7] = (cGRect.originY * this._maxT) / this._sizeY;
        float[] fArr = coordinates;
        if (fArr[1] > 1.0f) {
            fArr[1] = 1.0f;
        }
        float[] fArr2 = coordinates;
        if (fArr2[2] > 1.0f) {
            fArr2[2] = 1.0f;
        }
        float[] fArr3 = coordinates;
        if (fArr3[3] > 1.0f) {
            fArr3[3] = 1.0f;
        }
        float[] fArr4 = coordinates;
        if (fArr4[6] > 1.0f) {
            fArr4[6] = 1.0f;
        }
        width = ((this._width * this._maxS) * cGRect.sizeWidth) / this._sizeX;
        float f3 = ((this._height * this._maxT) * cGRect.sizeHeight) / this._sizeY;
        height = f3;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (width / 2.0f);
            pointY = f2 - (f3 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f3 / 2.0f);
        } else if (i == 12) {
            pointX = f - width;
            pointY = f2 - (f3 / 2.0f);
        } else if (i == 17) {
            pointX = f - (width / 2.0f);
        } else if (i == 20) {
            pointX = f - width;
        } else if (i == 36) {
            pointX = f - width;
            pointY = f2 - f3;
        } else if (i == 33) {
            pointX = f - (width / 2.0f);
            pointY = f2 - f3;
        } else if (i == 34) {
            pointY = f2 - f3;
        }
        float f4 = VIEW_SCRHEIGHT;
        float f5 = f4 - pointY;
        float f6 = height;
        float f7 = f5 - f6;
        pointY = f7;
        float f8 = width;
        if (f8 <= 0.0f || f6 <= 0.0f) {
            return;
        }
        float f9 = pointX;
        if (f9 + f8 <= 0.0f || f9 >= VIEW_SCRWIDTH || f7 + f6 <= 0.0f || f7 >= f4) {
            return;
        }
        float f10 = f9 + DRAW_ADJUST_X_MOVE;
        pointX = f10;
        float f11 = f7 + DRAW_ADJUST_Y_MOVE;
        pointY = f11;
        float[] fArr5 = vertices;
        fArr5[0] = f10 - TEXTURE_DRAW_MARGIN;
        fArr5[1] = f11 - TEXTURE_DRAW_MARGIN;
        fArr5[2] = 0.0f;
        fArr5[3] = f10 + f8;
        fArr5[4] = f11 - TEXTURE_DRAW_MARGIN;
        fArr5[5] = 0.0f;
        fArr5[6] = f10 - TEXTURE_DRAW_MARGIN;
        fArr5[7] = f11 + f6;
        fArr5[8] = 0.0f;
        fArr5[9] = f10 + f8;
        fArr5[10] = f11 + f6;
        fArr5[11] = 0.0f;
        mVertexBuffer.put(fArr5);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionClipSize(float f, float f2, int i, CGRect cGRect, float f3) {
        if (this.name == -1) {
            return;
        }
        coordinates[0] = (cGRect.originX * this._maxS) / this._sizeX;
        coordinates[1] = ((cGRect.originY + cGRect.sizeHeight) * this._maxT) / this._sizeY;
        coordinates[2] = ((cGRect.originX + cGRect.sizeWidth) * this._maxS) / this._sizeX;
        coordinates[3] = ((cGRect.originY + cGRect.sizeHeight) * this._maxT) / this._sizeY;
        coordinates[4] = (cGRect.originX * this._maxS) / this._sizeX;
        coordinates[5] = (cGRect.originY * this._maxT) / this._sizeY;
        coordinates[6] = ((cGRect.originX + cGRect.sizeWidth) * this._maxS) / this._sizeX;
        coordinates[7] = (cGRect.originY * this._maxT) / this._sizeY;
        float[] fArr = coordinates;
        if (fArr[1] > 1.0f) {
            fArr[1] = 1.0f;
        }
        float[] fArr2 = coordinates;
        if (fArr2[2] > 1.0f) {
            fArr2[2] = 1.0f;
        }
        float[] fArr3 = coordinates;
        if (fArr3[3] > 1.0f) {
            fArr3[3] = 1.0f;
        }
        float[] fArr4 = coordinates;
        if (fArr4[6] > 1.0f) {
            fArr4[6] = 1.0f;
        }
        width = (((this._width * this._maxS) * cGRect.sizeWidth) / this._sizeX) * f3;
        float f4 = (((this._height * this._maxT) * cGRect.sizeHeight) / this._sizeY) * f3;
        height = f4;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (width / 2.0f);
            pointY = f2 - (f4 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f4 / 2.0f);
        } else if (i == 12) {
            pointX = f - width;
            pointY = f2 - (f4 / 2.0f);
        } else if (i == 17) {
            pointX = f - (width / 2.0f);
        } else if (i == 20) {
            pointX = f - width;
        } else if (i == 36) {
            pointX = f - width;
            pointY = f2 - f4;
        } else if (i == 33) {
            pointX = f - (width / 2.0f);
            pointY = f2 - f4;
        } else if (i == 34) {
            pointY = f2 - f4;
        }
        float f5 = VIEW_SCRHEIGHT;
        float f6 = f5 - pointY;
        float f7 = height;
        float f8 = f6 - f7;
        pointY = f8;
        float f9 = width;
        if (f9 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        float f10 = pointX;
        if (f10 + f9 <= 0.0f || f10 >= VIEW_SCRWIDTH || f8 + f7 <= 0.0f || f8 >= f5) {
            return;
        }
        float f11 = f10 + DRAW_ADJUST_X_MOVE;
        pointX = f11;
        float f12 = f8 + DRAW_ADJUST_Y_MOVE;
        pointY = f12;
        float[] fArr5 = vertices;
        fArr5[0] = f11 - TEXTURE_DRAW_MARGIN;
        fArr5[1] = f12 - TEXTURE_DRAW_MARGIN;
        fArr5[2] = 0.0f;
        fArr5[3] = f11 + f9;
        fArr5[4] = f12 - TEXTURE_DRAW_MARGIN;
        fArr5[5] = 0.0f;
        fArr5[6] = f11 - TEXTURE_DRAW_MARGIN;
        fArr5[7] = f12 + f7;
        fArr5[8] = 0.0f;
        fArr5[9] = f11 + f9;
        fArr5[10] = f12 + f7;
        fArr5[11] = 0.0f;
        mVertexBuffer.put(fArr5);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionClipPixel(float f, float f2, int i, CGRect cGRect, float f3, float f4) {
        if (this.name == -1) {
            return;
        }
        coordinates[0] = (cGRect.originX * this._maxS) / this._sizeX;
        coordinates[1] = ((cGRect.originY + cGRect.sizeHeight) * this._maxT) / this._sizeY;
        coordinates[2] = ((cGRect.originX + cGRect.sizeWidth) * this._maxS) / this._sizeX;
        coordinates[3] = ((cGRect.originY + cGRect.sizeHeight) * this._maxT) / this._sizeY;
        coordinates[4] = (cGRect.originX * this._maxS) / this._sizeX;
        coordinates[5] = (cGRect.originY * this._maxT) / this._sizeY;
        coordinates[6] = ((cGRect.originX + cGRect.sizeWidth) * this._maxS) / this._sizeX;
        coordinates[7] = (cGRect.originY * this._maxT) / this._sizeY;
        float[] fArr = coordinates;
        if (fArr[1] > 1.0f) {
            fArr[1] = 1.0f;
        }
        float[] fArr2 = coordinates;
        if (fArr2[2] > 1.0f) {
            fArr2[2] = 1.0f;
        }
        float[] fArr3 = coordinates;
        if (fArr3[3] > 1.0f) {
            fArr3[3] = 1.0f;
        }
        float[] fArr4 = coordinates;
        if (fArr4[6] > 1.0f) {
            fArr4[6] = 1.0f;
        }
        width = f3;
        height = f4;
        pointX = f;
        pointY = f2;
        if (i == 9) {
            pointX = f - (f3 / 2.0f);
            pointY = f2 - (f4 / 2.0f);
        } else if (i == 10) {
            pointY = f2 - (f4 / 2.0f);
        } else if (i == 12) {
            pointX = f - f3;
            pointY = f2 - (f4 / 2.0f);
        } else if (i == 17) {
            pointX = f - (f3 / 2.0f);
        } else if (i == 20) {
            pointX = f - f3;
        } else if (i == 36) {
            pointX = f - f3;
            pointY = f2 - f4;
        } else if (i == 33) {
            pointX = f - (f3 / 2.0f);
            pointY = f2 - f4;
        } else if (i == 34) {
            pointY = f2 - f4;
        }
        float f5 = VIEW_SCRHEIGHT;
        float f6 = f5 - pointY;
        float f7 = height;
        float f8 = f6 - f7;
        pointY = f8;
        float f9 = width;
        if (f9 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        float f10 = pointX;
        if (f10 + f9 <= 0.0f || f10 >= VIEW_SCRWIDTH || f8 + f7 <= 0.0f || f8 >= f5) {
            return;
        }
        float f11 = f10 + DRAW_ADJUST_X_MOVE;
        pointX = f11;
        float f12 = f8 + DRAW_ADJUST_Y_MOVE;
        pointY = f12;
        float[] fArr5 = vertices;
        fArr5[0] = f11 - TEXTURE_DRAW_MARGIN;
        fArr5[1] = f12 - TEXTURE_DRAW_MARGIN;
        fArr5[2] = 0.0f;
        fArr5[3] = f11 + f9;
        fArr5[4] = f12 - TEXTURE_DRAW_MARGIN;
        fArr5[5] = 0.0f;
        fArr5[6] = f11 - TEXTURE_DRAW_MARGIN;
        fArr5[7] = f12 + f7;
        fArr5[8] = 0.0f;
        fArr5[9] = f11 + f9;
        fArr5[10] = f12 + f7;
        fArr5[11] = 0.0f;
        mVertexBuffer.put(fArr5);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void drawAtPointOptionGuide(float f, float f2, int i, CGRect cGRect) {
        if (this.name == -1) {
            return;
        }
        pointX = f;
        pointY = f2;
        float f3 = this._width * this._maxS;
        width = f3;
        float f4 = this._height * this._maxT;
        height = f4;
        drawStartX = 0.0f;
        drawStartY = 0.0f;
        drawLengthX = f3;
        drawLengthY = f4;
        guideStartX = cGRect.originX;
        guideStartY = cGRect.originY;
        guideEndX = cGRect.originX + cGRect.sizeWidth;
        guideEndY = cGRect.originY + cGRect.sizeHeight;
        if (i == 9) {
            pointX -= width / 2.0f;
            pointY -= height / 2.0f;
        } else if (i == 10) {
            pointY -= height / 2.0f;
        } else if (i == 12) {
            pointX -= width;
            pointY -= height / 2.0f;
        } else if (i == 17) {
            pointX -= width / 2.0f;
        } else if (i == 20) {
            pointX -= width;
        } else if (i == 36) {
            pointX -= width;
            pointY -= height;
        } else if (i == 33) {
            pointX -= width / 2.0f;
            pointY -= height;
        } else if (i == 34) {
            pointY -= height;
        }
        float f5 = drawStartX;
        if (f5 < 0.0f) {
            drawLengthX += f5;
            drawStartX = 0.0f;
        }
        float f6 = drawStartY;
        if (f6 < 0.0f) {
            drawLengthY += f6;
            drawStartY = 0.0f;
        }
        float f7 = pointX;
        float f8 = guideStartX;
        if (f7 < f8) {
            drawStartX += f8 - f7;
            drawLengthX -= f8 - f7;
            pointX = f8;
        }
        float f9 = pointY;
        float f10 = guideStartY;
        if (f9 < f10) {
            drawStartY += f10 - f9;
            drawLengthY -= f10 - f9;
            pointY = f10;
        }
        float f11 = drawStartX;
        float f12 = drawLengthX + f11;
        float f13 = width;
        if (f12 > f13) {
            drawLengthX = f13 - f11;
        }
        float f14 = drawStartY;
        float f15 = drawLengthY + f14;
        float f16 = height;
        if (f15 > f16) {
            drawLengthY = f16 - f14;
        }
        float f17 = pointX;
        float f18 = drawLengthX + f17;
        float f19 = guideEndX;
        if (f18 > f19) {
            drawLengthX = f19 - f17;
        }
        float f20 = pointY;
        float f21 = drawLengthY + f20;
        float f22 = guideEndY;
        if (f21 > f22) {
            drawLengthY = f22 - f20;
        }
        float[] fArr = coordinates;
        float f23 = drawStartX;
        int i2 = this._width;
        fArr[0] = f23 / i2;
        float f24 = drawStartY;
        float f25 = drawLengthY;
        int i3 = this._height;
        fArr[1] = (f24 + f25) / i3;
        float f26 = drawLengthX;
        fArr[2] = (f23 + f26) / i2;
        fArr[3] = (f25 + f24) / i3;
        fArr[4] = f23 / i2;
        fArr[5] = f24 / i3;
        fArr[6] = (f23 + f26) / i2;
        fArr[7] = f24 / i3;
        if (fArr[1] > 1.0f) {
            fArr[1] = 1.0f;
        }
        float[] fArr2 = coordinates;
        if (fArr2[2] > 1.0f) {
            fArr2[2] = 1.0f;
        }
        float[] fArr3 = coordinates;
        if (fArr3[3] > 1.0f) {
            fArr3[3] = 1.0f;
        }
        float[] fArr4 = coordinates;
        if (fArr4[6] > 1.0f) {
            fArr4[6] = 1.0f;
        }
        float f27 = drawLengthX;
        if (f27 > 0.0f) {
            float f28 = drawLengthY;
            if (f28 > 0.0f) {
                float f29 = pointX;
                if (width + f29 <= 0.0f || f29 >= VIEW_SCRWIDTH) {
                    return;
                }
                float f30 = pointY;
                if (height + f30 > 0.0f) {
                    float f31 = VIEW_SCRHEIGHT;
                    if (f30 >= f31) {
                        return;
                    }
                    float f32 = (f31 - f30) - f28;
                    pointY = f32;
                    float f33 = f29 + DRAW_ADJUST_X_MOVE;
                    pointX = f33;
                    float f34 = f32 + DRAW_ADJUST_Y_MOVE;
                    pointY = f34;
                    float[] fArr5 = vertices;
                    fArr5[0] = f33 - TEXTURE_DRAW_MARGIN;
                    fArr5[1] = f34 - TEXTURE_DRAW_MARGIN;
                    fArr5[2] = 0.0f;
                    fArr5[3] = f33 + f27;
                    fArr5[4] = f34 - TEXTURE_DRAW_MARGIN;
                    fArr5[5] = 0.0f;
                    fArr5[6] = f33 - TEXTURE_DRAW_MARGIN;
                    fArr5[7] = f34 + f28;
                    fArr5[8] = 0.0f;
                    fArr5[9] = f33 + f27;
                    fArr5[10] = f34 + f28;
                    fArr5[11] = 0.0f;
                    mVertexBuffer.put(fArr5);
                    mVertexBuffer.position(0);
                    coordinatesBuffer.put(coordinates);
                    coordinatesBuffer.position(0);
                    gl.glBindTexture(3553, this.name);
                    gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
                    gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
                    gl.glDrawArrays(5, 0, 4);
                }
            }
        }
    }

    public void initWithStringColor(String str) {
        gl.glGenTextures(1, _name, 0);
        this.name = _name[0];
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
        this.name = _name[0];
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
        this._width = i7;
        this._height = i6;
        float f = i4;
        this._sizeX = f;
        float f2 = i5;
        this._sizeY = f2;
        float f3 = f / i7;
        this._maxS = f3;
        this._maxT = f2 / i6;
        if (f3 > 1.0f) {
            this._maxS = 1.0f;
        }
        if (this._maxT > 1.0f) {
            this._maxT = 1.0f;
        }
        createBitmap.recycle();
    }

    public void drawAtPointOptionRotate(float f, float f2, int i, float f3, float f4) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f5 = this._maxT;
        fArr[1] = f5;
        float f6 = this._maxS;
        fArr[2] = f6;
        fArr[3] = f5;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f6;
        fArr[7] = 0.0f;
        float f7 = this._width * f6 * f4;
        width = f7;
        float f8 = this._height * f5 * f4;
        height = f8;
        pointX = 0.0f;
        pointY = 0.0f;
        if (i == 9) {
            pointX = 0.0f - (f7 / 2.0f);
            pointY = 0.0f - (f8 / 2.0f);
        } else if (i == 10) {
            pointY = 0.0f - (f8 / 2.0f);
        } else if (i == 12) {
            pointX = 0.0f - f7;
            pointY = 0.0f - (f8 / 2.0f);
        } else if (i == 17) {
            pointX = 0.0f - (f7 / 2.0f);
        } else if (i == 20) {
            pointX = 0.0f - f7;
        } else if (i == 36) {
            pointX = 0.0f - f7;
            pointY = 0.0f - f8;
        } else if (i == 33) {
            pointX = 0.0f - (f7 / 2.0f);
            pointY = 0.0f - f8;
        } else if (i == 34) {
            pointY = 0.0f - f8;
        }
        float f9 = height;
        float f10 = (-f9) - pointY;
        pointY = f10;
        float f11 = pointX + DRAW_ADJUST_X_MOVE;
        pointX = f11;
        float f12 = f10 + DRAW_ADJUST_Y_MOVE;
        pointY = f12;
        float[] fArr2 = vertices;
        fArr2[0] = f11 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f12 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        float f13 = width;
        fArr2[3] = f11 + f13;
        fArr2[4] = f12 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f11 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f12 + f9;
        fArr2[8] = 0.0f;
        fArr2[9] = f11 + f13;
        fArr2[10] = f12 + f9;
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
        gl.glRotatef(-f3, 0.0f, 0.0f, 1.0f);
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

    public void drawLineWithImage(float f, float f2, float f3, float f4, float f5) {
        if (this.name == -1) {
            return;
        }
        if ((f3 == 0.0f && f4 == 0.0f) || f5 == 0.0f) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f6 = this._maxT;
        fArr[1] = f6;
        float f7 = this._maxS;
        fArr[2] = f7;
        fArr[3] = f6;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f7;
        fArr[7] = 0.0f;
        width = this._width * f7;
        double d = this._height * f6 * f5;
        double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        Double.isNaN(d);
        double d2 = d * sqrt;
        double d3 = this._sizeY;
        Double.isNaN(d3);
        float f8 = (float) (d2 / d3);
        height = f8;
        pointX = 0.0f;
        pointY = 0.0f;
        float f9 = width;
        float f10 = 0.0f - (f9 / 2.0f);
        pointX = f10;
        float f11 = f10 + DRAW_ADJUST_X_MOVE;
        pointX = f11;
        float f12 = DRAW_ADJUST_Y_MOVE + 0.0f;
        pointY = f12;
        float[] fArr2 = vertices;
        fArr2[0] = f11 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f12 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f11 + f9;
        fArr2[4] = f12 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f11 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f12 + f8;
        fArr2[8] = 0.0f;
        fArr2[9] = f11 + f9;
        fArr2[10] = f12 + f8;
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
        if (f3 == 0.0f) {
            if (f4 >= 0.0f) {
                gl.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            }
        } else if (f4 != 0.0f) {
            float abs = Math.abs(f4) / Math.abs(f3);
            if (f3 < 0.0f) {
                if (f4 < 0.0f) {
                    gl.glRotatef((float) (90.0d - Math.toDegrees(Math.atan(abs))), 0.0f, 0.0f, 1.0f);
                } else {
                    gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 90.0d), 0.0f, 0.0f, 1.0f);
                }
            } else if (f4 < 0.0f) {
                gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 270.0d), 0.0f, 0.0f, 1.0f);
            } else {
                gl.glRotatef((float) (270.0d - Math.toDegrees(Math.atan(abs))), 0.0f, 0.0f, 1.0f);
            }
        } else if (f3 < 0.0f) {
            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        } else {
            gl.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
        }
        gl.glDrawArrays(5, 0, 4);
        gl.glPopMatrix();
    }

    public void drawArrowWithImage(float f, float f2, float f3, float f4, float f5) {
        if (this.name == -1) {
            return;
        }
        if ((f3 == 0.0f && f4 == 0.0f) || f5 == 0.0f) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f6 = this._maxT;
        fArr[1] = f6;
        float f7 = this._maxS;
        fArr[2] = f7;
        fArr[3] = f6;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f7;
        fArr[7] = 0.0f;
        float f8 = this._width * f7;
        width = f8;
        float f9 = this._height * f6;
        height = f9;
        pointX = 0.0f;
        pointY = 0.0f;
        float f10 = 0.0f - (f8 / 2.0f);
        pointX = f10;
        float f11 = 0.0f - f9;
        pointY = f11;
        float f12 = f10 + DRAW_ADJUST_X_MOVE;
        pointX = f12;
        float f13 = f11 + DRAW_ADJUST_Y_MOVE;
        pointY = f13;
        float[] fArr2 = vertices;
        fArr2[0] = f12 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f12 + f8;
        fArr2[4] = f13 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f12 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f13 + f9;
        fArr2[8] = 0.0f;
        fArr2[9] = f12 + f8;
        fArr2[10] = f13 + f9;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glPushMatrix();
        gl.glTranslatef(f + (f3 * f5), (VIEW_SCRHEIGHT - f2) - (f4 * f5), 0.0f);
        if (f3 == 0.0f) {
            if (f4 >= 0.0f) {
                gl.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            }
        } else if (f4 != 0.0f) {
            float abs = Math.abs(f4) / Math.abs(f3);
            if (f3 < 0.0f) {
                if (f4 < 0.0f) {
                    gl.glRotatef((float) (90.0d - Math.toDegrees(Math.atan(abs))), 0.0f, 0.0f, 1.0f);
                } else {
                    gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 90.0d), 0.0f, 0.0f, 1.0f);
                }
            } else if (f4 < 0.0f) {
                gl.glRotatef((float) (Math.toDegrees(Math.atan(abs)) + 270.0d), 0.0f, 0.0f, 1.0f);
            } else {
                gl.glRotatef((float) (270.0d - Math.toDegrees(Math.atan(abs))), 0.0f, 0.0f, 1.0f);
            }
        } else if (f3 < 0.0f) {
            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        } else {
            gl.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
        }
        gl.glDrawArrays(5, 0, 4);
        gl.glPopMatrix();
    }

    public void fillRect(float f, float f2, float f3, float f4) {
        if (this.name == -1) {
            return;
        }
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f5 = this._maxT;
        fArr[1] = f5;
        float f6 = this._maxS;
        fArr[2] = f6;
        fArr[3] = f5;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f6;
        fArr[7] = 0.0f;
        width = f3;
        height = f4;
        pointX = f;
        pointY = f2;
        float f7 = VIEW_SCRHEIGHT;
        float f8 = (f7 - f2) - f4;
        pointY = f8;
        if (f3 <= 0.0f || f4 <= 0.0f || f + f3 <= 0.0f || f >= VIEW_SCRWIDTH || f8 + f4 <= 0.0f || f8 >= f7) {
            return;
        }
        float f9 = f + DRAW_ADJUST_X_MOVE;
        pointX = f9;
        float f10 = f8 + DRAW_ADJUST_Y_MOVE;
        pointY = f10;
        float[] fArr2 = vertices;
        fArr2[0] = f9 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f10 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        fArr2[3] = f9 + f3;
        fArr2[4] = f10 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f9 - TEXTURE_DRAW_MARGIN;
        fArr2[7] = f10 + f4;
        fArr2[8] = 0.0f;
        fArr2[9] = f9 + f3;
        fArr2[10] = f10 + f4;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }

    public void fillRectGuide(float f, float f2, float f3, float f4, CGRect cGRect) {
        if (this.name == -1) {
            return;
        }
        guideStartX = cGRect.originX;
        guideStartY = cGRect.originY;
        guideEndX = cGRect.originX + cGRect.sizeWidth;
        guideEndY = cGRect.originY + cGRect.sizeHeight;
        float[] fArr = coordinates;
        fArr[0] = 0.0f;
        float f5 = this._maxT;
        fArr[1] = f5;
        float f6 = this._maxS;
        fArr[2] = f6;
        fArr[3] = f5;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f6;
        fArr[7] = 0.0f;
        width = f3;
        height = f4;
        pointX = f;
        pointY = f2;
        float f7 = VIEW_SCRHEIGHT;
        float f8 = (f7 - f2) - f4;
        pointY = f8;
        if (f3 <= 0.0f || f4 <= 0.0f || f3 + f <= 0.0f || f >= VIEW_SCRWIDTH || f4 + f8 <= 0.0f || f8 >= f7) {
            return;
        }
        float f9 = guideStartX;
        if (f < f9) {
            guideEndX -= f9 - f;
            pointX = f9;
        }
        float f10 = pointY;
        float f11 = guideStartY;
        if (f10 < f11) {
            guideEndY -= f11 - f10;
            pointX = f11;
        }
        float f12 = pointX;
        float f13 = width + f12;
        float f14 = guideEndX;
        if (f13 > f14) {
            width = f14 - f12;
        }
        float f15 = pointY;
        float f16 = height + f15;
        float f17 = guideEndY;
        if (f16 > f17) {
            height = f17 - f15;
        }
        float f18 = pointX + DRAW_ADJUST_X_MOVE;
        pointX = f18;
        float f19 = pointY + DRAW_ADJUST_Y_MOVE;
        pointY = f19;
        float[] fArr2 = vertices;
        fArr2[0] = f18 - TEXTURE_DRAW_MARGIN;
        fArr2[1] = f19 - TEXTURE_DRAW_MARGIN;
        fArr2[2] = 0.0f;
        float f20 = width;
        fArr2[3] = f18 + f20;
        fArr2[4] = f19 - TEXTURE_DRAW_MARGIN;
        fArr2[5] = 0.0f;
        fArr2[6] = f18 - TEXTURE_DRAW_MARGIN;
        float f21 = height;
        fArr2[7] = f19 + f21;
        fArr2[8] = 0.0f;
        fArr2[9] = f18 + f20;
        fArr2[10] = f19 + f21;
        fArr2[11] = 0.0f;
        mVertexBuffer.put(fArr2);
        mVertexBuffer.position(0);
        coordinatesBuffer.put(coordinates);
        coordinatesBuffer.position(0);
        gl.glBindTexture(3553, this.name);
        gl.glVertexPointer(3, 5126, 0, mVertexBuffer);
        gl.glTexCoordPointer(2, 5126, 0, coordinatesBuffer);
        gl.glDrawArrays(5, 0, 4);
    }
}
