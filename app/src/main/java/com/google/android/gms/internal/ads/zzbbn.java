package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbbn implements zzhw {
    private int zzbie;
    private final zzoq zzena;
    private long zzenb;
    private long zzenc;
    private long zzend;
    private long zzene;
    private boolean zzenf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbn() {
        this(15000, 30000, 2500L, 5000L);
    }

    private zzbbn(int i, int i2, long j, long j2) {
        this.zzena = new zzoq(true, 65536);
        this.zzenb = 15000000L;
        this.zzenc = 30000000L;
        this.zzend = 2500000L;
        this.zzene = 5000000L;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzfb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zza(zzhx[] zzhxVarArr, zznt zzntVar, zzoh zzohVar) {
        this.zzbie = 0;
        for (int i = 0; i < zzhxVarArr.length; i++) {
            if (zzohVar.zzbe(i) != null) {
                this.zzbie += zzps.zzbp(zzhxVarArr[i].getTrackType());
            }
        }
        this.zzena.zzbf(this.zzbie);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void onStopped() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzfc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final zzok zzfd() {
        return this.zzena;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final synchronized boolean zzc(long j, boolean z) {
        long j2;
        j2 = z ? this.zzene : this.zzend;
        return j2 <= 0 || j >= j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final synchronized boolean zzdt(long j) {
        boolean z;
        z = false;
        char c = j > this.zzenc ? (char) 0 : j < this.zzenb ? (char) 2 : (char) 1;
        boolean z2 = this.zzena.zziq() >= this.zzbie;
        if (c == 2 || (c == 1 && this.zzenf && !z2)) {
            z = true;
        }
        this.zzenf = z;
        return z;
    }

    public final synchronized void zzdt(int i) {
        this.zzenb = i * 1000;
    }

    public final synchronized void zzdu(int i) {
        this.zzenc = i * 1000;
    }

    public final synchronized void zzdn(int i) {
        this.zzend = i * 1000;
    }

    public final synchronized void zzdo(int i) {
        this.zzene = i * 1000;
    }

    private final void zzk(boolean z) {
        this.zzbie = 0;
        this.zzenf = false;
        if (z) {
            this.zzena.reset();
        }
    }
}
