package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzlt {
    public int zzawz;
    public zzlf zzbal;
    public long zzbam;
    public long zzban;
    public long zzbao;
    public int zzbap;
    public long[] zzbaq;
    public int[] zzbar;
    public int[] zzbas;
    public int[] zzbat;
    public long[] zzbau;
    public boolean[] zzbav;
    public boolean zzbaw;
    public boolean[] zzbax;
    public zzlq zzbay;
    public int zzbaz;
    public zzpm zzbba;
    public boolean zzbbb;
    public long zzbbc;

    public final void zzau(int i) {
        zzpm zzpmVar = this.zzbba;
        if (zzpmVar == null || zzpmVar.limit() < i) {
            this.zzbba = new zzpm(i);
        }
        this.zzbaz = i;
        this.zzbaw = true;
        this.zzbbb = true;
    }

    public final long zzav(int i) {
        return this.zzbau[i] + this.zzbat[i];
    }
}
