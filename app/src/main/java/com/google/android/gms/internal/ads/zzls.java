package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzls {
    public final int[] zzaor;
    public final long[] zzaos;
    public final int zzawz;
    public final int zzayg;
    public final int[] zzayi;
    public final long[] zzbak;

    public zzls(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        zzpf.checkArgument(iArr.length == jArr2.length);
        zzpf.checkArgument(jArr.length == jArr2.length);
        zzpf.checkArgument(iArr2.length == jArr2.length);
        this.zzaos = jArr;
        this.zzaor = iArr;
        this.zzayg = i;
        this.zzbak = jArr2;
        this.zzayi = iArr2;
        this.zzawz = jArr.length;
    }

    public final int zzec(long j) {
        for (int zza = zzps.zza(this.zzbak, j, true, false); zza >= 0; zza--) {
            if ((this.zzayi[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }

    public final int zzed(long j) {
        for (int zzb = zzps.zzb(this.zzbak, j, true, false); zzb < this.zzbak.length; zzb++) {
            if ((this.zzayi[zzb] & 1) != 0) {
                return zzb;
            }
        }
        return -1;
    }
}
