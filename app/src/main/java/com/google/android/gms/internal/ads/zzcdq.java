package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdq implements zzdvo<zzy, Bitmap> {
    private final /* synthetic */ double zzgfo;
    private final /* synthetic */ boolean zzgfp;
    private final /* synthetic */ zzcdr zzgfq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdq(zzcdr zzcdrVar, double d, boolean z) {
        this.zzgfq = zzcdrVar;
        this.zzgfo = d;
        this.zzgfp = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdvo
    public final /* synthetic */ Bitmap apply(zzy zzyVar) {
        Bitmap zza;
        zza = this.zzgfq.zza(zzyVar.data, this.zzgfo, this.zzgfp);
        return zza;
    }
}
