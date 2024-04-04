package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzla implements zzky {
    private final zzpm zzawq;
    private final int zzawy;
    private final int zzawz;

    public zzla(zzkx zzkxVar) {
        zzpm zzpmVar = zzkxVar.zzawq;
        this.zzawq = zzpmVar;
        zzpmVar.zzbi(12);
        this.zzawy = this.zzawq.zzja();
        this.zzawz = this.zzawq.zzja();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgx() {
        return this.zzawz;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgy() {
        int i = this.zzawy;
        return i == 0 ? this.zzawq.zzja() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final boolean zzgz() {
        return this.zzawy != 0;
    }
}
