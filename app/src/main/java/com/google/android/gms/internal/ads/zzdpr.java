package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpr {
    private final long zzhnq;
    private long zzhns;
    private final zzdpq zzhnr = new zzdpq();
    private int zzhnt = 0;
    private int zzhnu = 0;
    private int zzhnp = 0;

    public zzdpr() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
        this.zzhnq = currentTimeMillis;
        this.zzhns = currentTimeMillis;
    }

    public final void zzawq() {
        this.zzhns = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
        this.zzhnt++;
    }

    public final void zzawr() {
        this.zzhnu++;
        this.zzhnr.zzhno = true;
    }

    public final void zzaws() {
        this.zzhnp++;
        this.zzhnr.zzhnp++;
    }

    public final long getCreationTimeMillis() {
        return this.zzhnq;
    }

    public final long zzavt() {
        return this.zzhns;
    }

    public final int zzavu() {
        return this.zzhnt;
    }

    public final zzdpq zzawt() {
        zzdpq zzdpqVar = (zzdpq) this.zzhnr.clone();
        zzdpq zzdpqVar2 = this.zzhnr;
        zzdpqVar2.zzhno = false;
        zzdpqVar2.zzhnp = 0;
        return zzdpqVar;
    }

    public final String zzawg() {
        return "Created: " + this.zzhnq + " Last accessed: " + this.zzhns + " Accesses: " + this.zzhnt + "\nEntries retrieved: Valid: " + this.zzhnu + " Stale: " + this.zzhnp;
    }
}
