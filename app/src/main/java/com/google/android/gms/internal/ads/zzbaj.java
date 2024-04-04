package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbaj {
    private final Context zzcln;
    private final zzbaq zzehb;
    private final ViewGroup zzeix;
    private zzbad zzeiy;

    public zzbaj(Context context, ViewGroup viewGroup, zzbdh zzbdhVar) {
        this(context, viewGroup, zzbdhVar, null);
    }

    private zzbaj(Context context, ViewGroup viewGroup, zzbaq zzbaqVar, zzbad zzbadVar) {
        this.zzcln = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzeix = viewGroup;
        this.zzehb = zzbaqVar;
        this.zzeiy = null;
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzbad zzbadVar = this.zzeiy;
        if (zzbadVar != null) {
            zzbadVar.zzd(i, i2, i3, i4);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzbar zzbarVar) {
        if (this.zzeiy != null) {
            return;
        }
        zzabp.zza(this.zzehb.zzabe().zzsk(), this.zzehb.zzaaz(), "vpr2");
        Context context = this.zzcln;
        zzbaq zzbaqVar = this.zzehb;
        zzbad zzbadVar = new zzbad(context, zzbaqVar, i5, z, zzbaqVar.zzabe().zzsk(), zzbarVar);
        this.zzeiy = zzbadVar;
        this.zzeix.addView(zzbadVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzeiy.zzd(i, i2, i3, i4);
        this.zzehb.zzav(false);
    }

    public final zzbad zzaat() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzeiy;
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzbad zzbadVar = this.zzeiy;
        if (zzbadVar != null) {
            zzbadVar.pause();
        }
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzbad zzbadVar = this.zzeiy;
        if (zzbadVar != null) {
            zzbadVar.destroy();
            this.zzeix.removeView(this.zzeiy);
            this.zzeiy = null;
        }
    }
}
