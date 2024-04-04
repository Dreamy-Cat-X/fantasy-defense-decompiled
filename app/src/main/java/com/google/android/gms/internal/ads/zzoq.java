package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzoq implements zzok {
    private final boolean zzbia;
    private final int zzbib;
    private final byte[] zzbic;
    private final zzol[] zzbid;
    private int zzbie;
    private int zzbif;
    private int zzbig;
    private zzol[] zzbih;

    public zzoq(boolean z, int i) {
        this(true, 65536, 0);
    }

    private zzoq(boolean z, int i, int i2) {
        zzpf.checkArgument(true);
        zzpf.checkArgument(true);
        this.zzbia = true;
        this.zzbib = 65536;
        this.zzbig = 0;
        this.zzbih = new zzol[100];
        this.zzbic = null;
        this.zzbid = new zzol[1];
    }

    public final synchronized void reset() {
        if (this.zzbia) {
            zzbf(0);
        }
    }

    public final synchronized void zzbf(int i) {
        boolean z = i < this.zzbie;
        this.zzbie = i;
        if (z) {
            zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized zzol zzin() {
        zzol zzolVar;
        this.zzbif++;
        if (this.zzbig > 0) {
            zzol[] zzolVarArr = this.zzbih;
            int i = this.zzbig - 1;
            this.zzbig = i;
            zzolVar = zzolVarArr[i];
            this.zzbih[i] = null;
        } else {
            zzolVar = new zzol(new byte[this.zzbib], 0);
        }
        return zzolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zza(zzol zzolVar) {
        this.zzbid[0] = zzolVar;
        zza(this.zzbid);
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zza(zzol[] zzolVarArr) {
        boolean z;
        if (this.zzbig + zzolVarArr.length >= this.zzbih.length) {
            this.zzbih = (zzol[]) Arrays.copyOf(this.zzbih, Math.max(this.zzbih.length << 1, this.zzbig + zzolVarArr.length));
        }
        for (zzol zzolVar : zzolVarArr) {
            if (zzolVar.data != null && zzolVar.data.length != this.zzbib) {
                z = false;
                zzpf.checkArgument(z);
                zzol[] zzolVarArr2 = this.zzbih;
                int i = this.zzbig;
                this.zzbig = i + 1;
                zzolVarArr2[i] = zzolVar;
            }
            z = true;
            zzpf.checkArgument(z);
            zzol[] zzolVarArr22 = this.zzbih;
            int i2 = this.zzbig;
            this.zzbig = i2 + 1;
            zzolVarArr22[i2] = zzolVar;
        }
        this.zzbif -= zzolVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzn() {
        int max = Math.max(0, zzps.zzf(this.zzbie, this.zzbib) - this.zzbif);
        if (max >= this.zzbig) {
            return;
        }
        Arrays.fill(this.zzbih, max, this.zzbig, (Object) null);
        this.zzbig = max;
    }

    public final synchronized int zziq() {
        return this.zzbif * this.zzbib;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final int zzio() {
        return this.zzbib;
    }
}
