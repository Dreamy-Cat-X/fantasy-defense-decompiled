package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfl implements zzepq<zzcfj> {
    private final zzeqd<zzcce> zzfay;
    private final zzeqd<Context> zzfwd;
    private final zzeqd<zzcbi> zzgbf;
    private final zzeqd<zzcaz> zzggy;

    private zzcfl(zzeqd<Context> zzeqdVar, zzeqd<zzcbi> zzeqdVar2, zzeqd<zzcce> zzeqdVar3, zzeqd<zzcaz> zzeqdVar4) {
        this.zzfwd = zzeqdVar;
        this.zzgbf = zzeqdVar2;
        this.zzfay = zzeqdVar3;
        this.zzggy = zzeqdVar4;
    }

    public static zzcfl zzc(zzeqd<Context> zzeqdVar, zzeqd<zzcbi> zzeqdVar2, zzeqd<zzcce> zzeqdVar3, zzeqd<zzcaz> zzeqdVar4) {
        return new zzcfl(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcfj(this.zzfwd.get(), this.zzgbf.get(), this.zzfay.get(), this.zzggy.get());
    }
}
