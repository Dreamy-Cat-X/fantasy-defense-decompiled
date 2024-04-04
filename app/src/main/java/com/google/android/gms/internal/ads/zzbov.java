package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbov implements zzepq<com.google.android.gms.ads.internal.zza> {
    private final zzeqd<Context> zzeuo;
    private final zzbos zzfvy;
    private final zzeqd<zzawd> zzfvz;

    private zzbov(zzbos zzbosVar, zzeqd<Context> zzeqdVar, zzeqd<zzawd> zzeqdVar2) {
        this.zzfvy = zzbosVar;
        this.zzeuo = zzeqdVar;
        this.zzfvz = zzeqdVar2;
    }

    public static zzbov zza(zzbos zzbosVar, zzeqd<Context> zzeqdVar, zzeqd<zzawd> zzeqdVar2) {
        return new zzbov(zzbosVar, zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zza) zzepw.zza(new com.google.android.gms.ads.internal.zza(this.zzeuo.get(), this.zzfvz.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
