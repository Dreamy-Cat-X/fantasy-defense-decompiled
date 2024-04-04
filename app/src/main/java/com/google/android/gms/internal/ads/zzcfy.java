package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfy implements Callable<zzcfp> {
    private final Context context;
    private final zzbdp zzbpq;
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzcpy zzdgy;
    private final zzayt zzdsc;
    private final zzef zzequ;
    private final zzdsh zzfpv;
    private final Executor zzfqs;
    private final com.google.android.gms.ads.internal.zzb zzggg;

    public zzcfy(Context context, Executor executor, zzef zzefVar, zzayt zzaytVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbdp zzbdpVar, zzcpy zzcpyVar, zzdsh zzdshVar, zzcju zzcjuVar, zzdro zzdroVar) {
        this.context = context;
        this.zzfqs = executor;
        this.zzequ = zzefVar;
        this.zzdsc = zzaytVar;
        this.zzggg = zzbVar;
        this.zzbpq = zzbdpVar;
        this.zzdgy = zzcpyVar;
        this.zzfpv = zzdshVar;
        this.zzdgu = zzcjuVar;
        this.zzdgv = zzdroVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzcfp call() throws Exception {
        zzcfp zzcfpVar = new zzcfp(this);
        zzcfpVar.zzapm();
        return zzcfpVar;
    }
}
