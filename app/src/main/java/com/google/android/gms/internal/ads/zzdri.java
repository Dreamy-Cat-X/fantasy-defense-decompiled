package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdri implements zzepq<zzaly> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfxl;
    private final zzdrj zzhps;

    public zzdri(zzdrj zzdrjVar, zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2) {
        this.zzhps = zzdrjVar;
        this.zzeuo = zzeqdVar;
        this.zzfxl = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzaly) zzepw.zza(new zzalp().zzb(this.zzeuo.get(), this.zzfxl.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
