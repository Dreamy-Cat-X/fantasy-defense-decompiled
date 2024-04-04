package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzkr implements zzkm {
    private final /* synthetic */ zzkp zzaso;

    private zzkr(zzkp zzkpVar) {
        this.zzaso = zzkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final int zzal(int i) {
        return zzkp.zzal(i);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzam(int i) {
        return zzkp.zzam(i);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzd(int i, long j, long j2) throws zzhv {
        this.zzaso.zzd(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzan(int i) throws zzhv {
        this.zzaso.zzan(i);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzd(int i, long j) throws zzhv {
        this.zzaso.zzd(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zza(int i, double d) throws zzhv {
        this.zzaso.zza(i, d);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zza(int i, String str) throws zzhv {
        this.zzaso.zza(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zza(int i, int i2, zzjy zzjyVar) throws IOException, InterruptedException {
        this.zzaso.zza(i, i2, zzjyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkr(zzkp zzkpVar, zzko zzkoVar) {
        this(zzkpVar);
    }
}
