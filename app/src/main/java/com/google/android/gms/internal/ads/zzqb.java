package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqb extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    private Handler handler;
    private final int[] zzbkv;
    private SurfaceTexture zzbkw;
    private Error zzbkx;
    private RuntimeException zzbky;
    private zzpz zzbkz;

    public zzqb() {
        super("dummySurface");
        this.zzbkv = new int[1];
    }

    public final zzpz zzm(boolean z) {
        boolean z2;
        start();
        this.handler = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.zzbkz == null && this.zzbky == null && this.zzbkx == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzbky;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzbkx;
        if (error != null) {
            throw error;
        }
        return this.zzbkz;
    }

    public final void release() {
        this.handler.sendEmptyMessage(3);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.zzbkw.updateTexImage();
                    return true;
                }
                if (i != 3) {
                    return true;
                }
                try {
                    try {
                        this.zzbkw.release();
                    } catch (Throwable th) {
                        try {
                            Log.e("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                } finally {
                    this.zzbkz = null;
                    this.zzbkw = null;
                    GLES20.glDeleteTextures(1, this.zzbkv, 0);
                }
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    zzpf.checkState(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr = new int[2];
                    zzpf.checkState(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    zzpf.checkState(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    zzpf.checkState(eglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    zzpf.checkState(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    zzpf.checkState(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.zzbkv, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.zzbkv[0]);
                    this.zzbkw = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.zzbkz = new zzpz(this, this.zzbkw, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.zzbky = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzbkx = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
