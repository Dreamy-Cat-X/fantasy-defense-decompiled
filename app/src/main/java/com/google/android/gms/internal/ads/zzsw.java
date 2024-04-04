package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsw {
    private final Context context;
    private final int orientation;
    private final zzzc zzact;
    private zzxg zzbuo;
    private final String zzbup;
    private final AppOpenAd.AppOpenAdLoadCallback zzbuq;
    private final zzamu zzbur = new zzamu();
    private final zzvn zzacq = zzvn.zzchp;

    public zzsw(Context context, String str, zzzc zzzcVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.context = context;
        this.zzbup = str;
        this.zzact = zzzcVar;
        this.orientation = i;
        this.zzbuq = appOpenAdLoadCallback;
    }

    public final void zzmu() {
        try {
            this.zzbuo = zzwo.zzqn().zza(this.context, zzvp.zzqf(), this.zzbup, this.zzbur);
            this.zzbuo.zza(new zzvu(this.orientation));
            this.zzbuo.zza(new zzsg(this.zzbuq));
            this.zzbuo.zza(zzvn.zza(this.context, this.zzact));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
