package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjx implements zzke {
    private final int length;
    private final long zzaim;
    private final int[] zzaor;
    private final long[] zzaos;
    private final long[] zzaot;
    private final long[] zzaou;

    public zzjx(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzaor = iArr;
        this.zzaos = jArr;
        this.zzaot = jArr2;
        this.zzaou = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length > 0) {
            this.zzaim = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.zzaim = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long getDurationUs() {
        return this.zzaim;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long zzdz(long j) {
        return this.zzaos[zzps.zza(this.zzaou, j, true, true)];
    }
}
