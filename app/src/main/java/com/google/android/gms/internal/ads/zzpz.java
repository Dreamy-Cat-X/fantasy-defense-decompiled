package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpz extends Surface {
    private static boolean zzbkr;
    private static boolean zzbks;
    private final boolean zzbcp;
    private final zzqb zzbkt;
    private boolean zzbku;

    public static synchronized boolean zzc(Context context) {
        boolean z;
        synchronized (zzpz.class) {
            if (!zzbks) {
                if (zzps.SDK_INT >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(zzps.SDK_INT == 24 && (zzps.MODEL.startsWith("SM-G950") || zzps.MODEL.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zzbkr = z2;
                }
                zzbks = true;
            }
            z = zzbkr;
        }
        return z;
    }

    public static zzpz zzc(Context context, boolean z) {
        if (zzps.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        zzpf.checkState(!z || zzc(context));
        return new zzqb().zzm(z);
    }

    private zzpz(zzqb zzqbVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.zzbkt = zzqbVar;
        this.zzbcp = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzbkt) {
            if (!this.zzbku) {
                this.zzbkt.release();
                this.zzbku = true;
            }
        }
    }
}
