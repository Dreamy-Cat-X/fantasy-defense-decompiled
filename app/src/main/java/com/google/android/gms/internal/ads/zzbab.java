package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzbab extends TextureView implements zzbau {
    protected final zzbal zzeia;
    protected final zzbav zzeib;

    public zzbab(Context context) {
        super(context);
        this.zzeia = new zzbal();
        this.zzeib = new zzbav(context, this);
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract long getTotalBytes();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void pause();

    public abstract void play();

    public abstract void seekTo(int i);

    public abstract void setVideoPath(String str);

    public abstract void stop();

    public abstract void zza(float f, float f2);

    public abstract void zza(zzazy zzazyVar);

    public abstract String zzaab();

    public abstract long zzaaf();

    public abstract int zzaag();

    public abstract void zzaah();

    public void zzdl(int i) {
    }

    public void zzdm(int i) {
    }

    public void zzdn(int i) {
    }

    public void zzdo(int i) {
    }

    public void zzdp(int i) {
    }

    public abstract long zzna();

    public void zzb(String str, String[] strArr) {
        setVideoPath(str);
    }
}
