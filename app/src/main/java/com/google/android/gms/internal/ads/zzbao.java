package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbao extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzbap {
    private static final float[] zzejl = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int height;
    private int width;
    private final float[] zzeji;
    private final zzban zzejm;
    private final float[] zzejn;
    private final float[] zzejo;
    private final float[] zzejp;
    private final float[] zzejq;
    private final float[] zzejr;
    private final float[] zzejs;
    private float zzejt;
    private float zzeju;
    private float zzejv;
    private SurfaceTexture zzejw;
    private SurfaceTexture zzejx;
    private int zzejy;
    private int zzejz;
    private int zzeka;
    private FloatBuffer zzekb;
    private final CountDownLatch zzekc;
    private final Object zzekd;
    private EGL10 zzeke;
    private EGLDisplay zzekf;
    private EGLContext zzekg;
    private EGLSurface zzekh;
    private volatile boolean zzeki;
    private volatile boolean zzekj;

    public zzbao(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(zzejl.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzekb = asFloatBuffer;
        asFloatBuffer.put(zzejl).position(0);
        this.zzeji = new float[9];
        this.zzejn = new float[9];
        this.zzejo = new float[9];
        this.zzejp = new float[9];
        this.zzejq = new float[9];
        this.zzejr = new float[9];
        this.zzejs = new float[9];
        this.zzejt = Float.NaN;
        zzban zzbanVar = new zzban(context);
        this.zzejm = zzbanVar;
        zzbanVar.zza(this);
        this.zzekc = new CountDownLatch(1);
        this.zzekd = new Object();
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.zzejx = surfaceTexture;
    }

    public final void zzm(int i, int i2) {
        synchronized (this.zzekd) {
            this.width = i;
            this.height = i2;
            this.zzeki = true;
            this.zzekd.notifyAll();
        }
    }

    public final void zzaau() {
        synchronized (this.zzekd) {
            this.zzekj = true;
            this.zzejx = null;
            this.zzekd.notifyAll();
        }
    }

    public final SurfaceTexture zzaav() {
        if (this.zzejx == null) {
            return null;
        }
        try {
            this.zzekc.await();
        } catch (InterruptedException unused) {
        }
        return this.zzejw;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzeka++;
        synchronized (this.zzekd) {
            this.zzekd.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbap
    public final void zzvy() {
        synchronized (this.zzekd) {
            this.zzekd.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ba  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int zzd;
        int glCreateProgram;
        if (this.zzejx == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("SphericalVideoProcessor started with no output texture.");
            this.zzekc.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.zzeke = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.zzekf = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.zzeke.eglInitialize(this.zzekf, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (!this.zzeke.eglChooseConfig(this.zzekf, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) || iArr[0] <= 0) ? null : eGLConfigArr[0];
            if (eGLConfig != null) {
                EGLContext eglCreateContext = this.zzeke.eglCreateContext(this.zzekf, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.zzekg = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = this.zzeke.eglCreateWindowSurface(this.zzekf, eGLConfig, this.zzejx, null);
                    this.zzekh = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                        EGL10 egl102 = this.zzeke;
                        EGLDisplay eGLDisplay = this.zzekf;
                        EGLSurface eGLSurface = this.zzekh;
                        if (egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.zzekg)) {
                            z = true;
                            zzaaw<String> zzaawVar = zzabh.zzcpw;
                            zzd = zzd(35633, ((String) zzwo.zzqq().zzd(zzaawVar)).equals(zzaawVar.zzsa()) ? (String) zzwo.zzqq().zzd(zzaawVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                            if (zzd != 0) {
                                zzaaw<String> zzaawVar2 = zzabh.zzcpx;
                                int zzd2 = zzd(35632, !((String) zzwo.zzqq().zzd(zzaawVar2)).equals(zzaawVar2.zzsa()) ? (String) zzwo.zzqq().zzd(zzaawVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                if (zzd2 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    zzfb("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, zzd);
                                        zzfb("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, zzd2);
                                        zzfb("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        zzfb("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        zzfb("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            zzfb("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            zzfb("validateProgram");
                                        }
                                    }
                                    this.zzejy = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    zzfb("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.zzejy, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.zzekb);
                                    zzfb("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    zzfb("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    zzfb("genTextures");
                                    int i = iArr3[0];
                                    GLES20.glBindTexture(36197, i);
                                    zzfb("bindTextures");
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    zzfb("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    zzfb("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    zzfb("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    zzfb("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.zzejy, "uVMat");
                                    this.zzejz = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    boolean z2 = this.zzejy != 0;
                                    if (z || !z2) {
                                        String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.zzeke.eglGetError()));
                                        String concat = valueOf.length() != 0 ? "EGL initialization failed: ".concat(valueOf) : new String("EGL initialization failed: ");
                                        com.google.android.gms.ads.internal.util.zzd.zzev(concat);
                                        com.google.android.gms.ads.internal.zzp.zzku().zza(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                        zzaaw();
                                        this.zzekc.countDown();
                                    }
                                    SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                    this.zzejw = surfaceTexture;
                                    surfaceTexture.setOnFrameAvailableListener(this);
                                    this.zzekc.countDown();
                                    this.zzejm.start();
                                    try {
                                        try {
                                            this.zzeki = true;
                                            while (!this.zzekj) {
                                                while (this.zzeka > 0) {
                                                    this.zzejw.updateTexImage();
                                                    this.zzeka--;
                                                }
                                                if (this.zzejm.zza(this.zzeji)) {
                                                    if (Float.isNaN(this.zzejt)) {
                                                        float[] fArr = this.zzeji;
                                                        float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                        float[] fArr3 = {(fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]), (fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[5] * fArr2[2]), (fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1]) + (fArr[8] * fArr2[2])};
                                                        this.zzejt = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                    }
                                                    zzb(this.zzejr, this.zzejt + this.zzeju);
                                                } else {
                                                    zza(this.zzeji, -1.5707964f);
                                                    zzb(this.zzejr, this.zzeju);
                                                }
                                                zza(this.zzejn, 1.5707964f);
                                                zza(this.zzejo, this.zzejr, this.zzejn);
                                                zza(this.zzejp, this.zzeji, this.zzejo);
                                                zza(this.zzejq, this.zzejv);
                                                zza(this.zzejs, this.zzejq, this.zzejp);
                                                GLES20.glUniformMatrix3fv(this.zzejz, 1, false, this.zzejs, 0);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                zzfb("drawArrays");
                                                GLES20.glFinish();
                                                this.zzeke.eglSwapBuffers(this.zzekf, this.zzekh);
                                                if (this.zzeki) {
                                                    GLES20.glViewport(0, 0, this.width, this.height);
                                                    zzfb("viewport");
                                                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzejy, "uFOVx");
                                                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.zzejy, "uFOVy");
                                                    if (this.width > this.height) {
                                                        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                        GLES20.glUniform1f(glGetUniformLocation3, (this.height * 0.87266463f) / this.width);
                                                    } else {
                                                        GLES20.glUniform1f(glGetUniformLocation2, (this.width * 0.87266463f) / this.height);
                                                        GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                    }
                                                    this.zzeki = false;
                                                }
                                                try {
                                                    synchronized (this.zzekd) {
                                                        if (!this.zzekj && !this.zzeki && this.zzeka == 0) {
                                                            this.zzekd.wait();
                                                        }
                                                    }
                                                } catch (InterruptedException unused) {
                                                }
                                            }
                                            return;
                                        } catch (IllegalStateException unused2) {
                                            com.google.android.gms.ads.internal.util.zzd.zzex("SphericalVideoProcessor halted unexpectedly.");
                                            return;
                                        } catch (Throwable th) {
                                            com.google.android.gms.ads.internal.util.zzd.zzc("SphericalVideoProcessor died.", th);
                                            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "SphericalVideoProcessor.run.2");
                                            return;
                                        }
                                    } finally {
                                        this.zzejm.stop();
                                        this.zzejw.setOnFrameAvailableListener(null);
                                        this.zzejw = null;
                                        zzaaw();
                                    }
                                }
                            }
                            glCreateProgram = 0;
                            this.zzejy = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            zzfb("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.zzejy, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.zzekb);
                            zzfb("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            zzfb("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            zzfb("genTextures");
                            int i2 = iArr32[0];
                            GLES20.glBindTexture(36197, i2);
                            zzfb("bindTextures");
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            zzfb("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            zzfb("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            zzfb("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            zzfb("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.zzejy, "uVMat");
                            this.zzejz = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            if (this.zzejy != 0) {
                            }
                            if (z) {
                            }
                            String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.zzeke.eglGetError()));
                            if (valueOf2.length() != 0) {
                            }
                            com.google.android.gms.ads.internal.util.zzd.zzev(concat);
                            com.google.android.gms.ads.internal.zzp.zzku().zza(new Throwable(concat), "SphericalVideoProcessor.run.1");
                            zzaaw();
                            this.zzekc.countDown();
                        }
                    }
                }
            }
        }
        z = false;
        zzaaw<String> zzaawVar3 = zzabh.zzcpw;
        zzd = zzd(35633, ((String) zzwo.zzqq().zzd(zzaawVar3)).equals(zzaawVar3.zzsa()) ? (String) zzwo.zzqq().zzd(zzaawVar3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (zzd != 0) {
        }
        glCreateProgram = 0;
        this.zzejy = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        zzfb("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.zzejy, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.zzekb);
        zzfb("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        zzfb("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        zzfb("genTextures");
        int i22 = iArr322[0];
        GLES20.glBindTexture(36197, i22);
        zzfb("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        zzfb("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        zzfb("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        zzfb("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        zzfb("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.zzejy, "uVMat");
        this.zzejz = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        if (this.zzejy != 0) {
        }
        if (z) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.zzeke.eglGetError()));
        if (valueOf22.length() != 0) {
        }
        com.google.android.gms.ads.internal.util.zzd.zzev(concat);
        com.google.android.gms.ads.internal.zzp.zzku().zza(new Throwable(concat), "SphericalVideoProcessor.run.1");
        zzaaw();
        this.zzekc.countDown();
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.width;
        int i2 = this.height;
        if (i > i2) {
            f3 = (f * 1.7453293f) / i;
            f4 = f2 * 1.7453293f;
            f5 = i;
        } else {
            f3 = (f * 1.7453293f) / i2;
            f4 = f2 * 1.7453293f;
            f5 = i2;
        }
        this.zzeju -= f3;
        float f6 = this.zzejv - (f4 / f5);
        this.zzejv = f6;
        if (f6 < -1.5707964f) {
            this.zzejv = -1.5707964f;
        }
        if (this.zzejv > 1.5707964f) {
            this.zzejv = 1.5707964f;
        }
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zzb(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzfb("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        zzfb("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        zzfb("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        zzfb("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        zzfb("deleteShader");
        return 0;
    }

    private final boolean zzaaw() {
        EGLSurface eGLSurface = this.zzekh;
        boolean z = false;
        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
            z = this.zzeke.eglDestroySurface(this.zzekf, this.zzekh) | this.zzeke.eglMakeCurrent(this.zzekf, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.zzekh = null;
        }
        EGLContext eGLContext = this.zzekg;
        if (eGLContext != null) {
            z |= this.zzeke.eglDestroyContext(this.zzekf, eGLContext);
            this.zzekg = null;
        }
        EGLDisplay eGLDisplay = this.zzekf;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = z | this.zzeke.eglTerminate(eGLDisplay);
        this.zzekf = null;
        return eglTerminate;
    }

    private static void zzfb(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }
}
