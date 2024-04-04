package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zznr extends zzic {
    private static final Object zzbgn = new Object();
    private final boolean zzaih;
    private final boolean zzaii;
    private final long zzbgo;
    private final long zzbgp;
    private final long zzbgq;
    private final long zzbgr;

    public zznr(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final int zzff() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final int zzfg() {
        return 1;
    }

    private zznr(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.zzbgo = j;
        this.zzbgp = j2;
        this.zzbgq = 0L;
        this.zzbgr = 0L;
        this.zzaih = z;
        this.zzaii = false;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final zzid zza(int i, zzid zzidVar, boolean z, long j) {
        zzpf.zzc(i, 0, 1);
        boolean z2 = this.zzaih;
        long j2 = this.zzbgp;
        zzidVar.zzaie = null;
        zzidVar.zzaif = -9223372036854775807L;
        zzidVar.zzaig = -9223372036854775807L;
        zzidVar.zzaih = z2;
        zzidVar.zzaii = false;
        zzidVar.zzail = 0L;
        zzidVar.zzaim = j2;
        zzidVar.zzaij = 0;
        zzidVar.zzaik = 0;
        zzidVar.zzain = 0L;
        return zzidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final zzie zza(int i, zzie zzieVar, boolean z) {
        zzpf.zzc(i, 0, 1);
        Object obj = z ? zzbgn : null;
        return zzieVar.zza(obj, obj, 0, this.zzbgo, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final int zzc(Object obj) {
        return zzbgn.equals(obj) ? 0 : -1;
    }
}
