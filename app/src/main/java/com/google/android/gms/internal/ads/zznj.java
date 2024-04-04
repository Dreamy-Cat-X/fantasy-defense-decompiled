package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zznj {
    private int length;
    private int zzbfp;
    private int zzbfq;
    private int zzbfr;
    private zzhs zzbfw;
    private int zzbfl = 1000;
    private int[] zzbfm = new int[1000];
    private long[] zzaos = new long[1000];
    private long[] zzaou = new long[1000];
    private int[] zzayi = new int[1000];
    private int[] zzaor = new int[1000];
    private zzkj[] zzbfn = new zzkj[1000];
    private zzhs[] zzbfo = new zzhs[1000];
    private long zzbfs = Long.MIN_VALUE;
    private long zzbft = Long.MIN_VALUE;
    private boolean zzbfv = true;
    private boolean zzbfu = true;

    public final void zzib() {
        this.zzbfp = 0;
        this.zzbfq = 0;
        this.zzbfr = 0;
        this.length = 0;
        this.zzbfu = true;
    }

    public final void zzic() {
        this.zzbfs = Long.MIN_VALUE;
        this.zzbft = Long.MIN_VALUE;
    }

    public final int zzid() {
        return this.zzbfp + this.length;
    }

    public final synchronized boolean zzie() {
        return this.length != 0;
    }

    public final synchronized zzhs zzif() {
        if (this.zzbfv) {
            return null;
        }
        return this.zzbfw;
    }

    public final synchronized long zzhv() {
        return Math.max(this.zzbfs, this.zzbft);
    }

    public final synchronized int zza(zzhu zzhuVar, zzjo zzjoVar, boolean z, boolean z2, zzhs zzhsVar, zzni zzniVar) {
        if (!zzie()) {
            if (z2) {
                zzjoVar.setFlags(4);
                return -4;
            }
            if (this.zzbfw == null || (!z && this.zzbfw == zzhsVar)) {
                return -3;
            }
            zzhuVar.zzahw = this.zzbfw;
            return -5;
        }
        if (!z && this.zzbfo[this.zzbfq] == zzhsVar) {
            if (zzjoVar.zzda == null) {
                return -3;
            }
            zzjoVar.zzaoi = this.zzaou[this.zzbfq];
            zzjoVar.setFlags(this.zzayi[this.zzbfq]);
            zzniVar.size = this.zzaor[this.zzbfq];
            zzniVar.zzaws = this.zzaos[this.zzbfq];
            zzniVar.zzarm = this.zzbfn[this.zzbfq];
            this.zzbfs = Math.max(this.zzbfs, zzjoVar.zzaoi);
            this.length--;
            int i = this.zzbfq + 1;
            this.zzbfq = i;
            this.zzbfp++;
            if (i == this.zzbfl) {
                this.zzbfq = 0;
            }
            zzniVar.zzbfk = this.length > 0 ? this.zzaos[this.zzbfq] : zzniVar.zzaws + zzniVar.size;
            return -4;
        }
        zzhuVar.zzahw = this.zzbfo[this.zzbfq];
        return -5;
    }

    public final synchronized long zzig() {
        if (!zzie()) {
            return -1L;
        }
        int i = ((this.zzbfq + this.length) - 1) % this.zzbfl;
        this.zzbfq = (this.zzbfq + this.length) % this.zzbfl;
        this.zzbfp += this.length;
        this.length = 0;
        return this.zzaos[i] + this.zzaor[i];
    }

    public final synchronized long zzd(long j, boolean z) {
        if (zzie() && j >= this.zzaou[this.zzbfq]) {
            if (j > this.zzbft && !z) {
                return -1L;
            }
            int i = 0;
            int i2 = this.zzbfq;
            int i3 = -1;
            while (i2 != this.zzbfr && this.zzaou[i2] <= j) {
                if ((this.zzayi[i2] & 1) != 0) {
                    i3 = i;
                }
                i2 = (i2 + 1) % this.zzbfl;
                i++;
            }
            if (i3 == -1) {
                return -1L;
            }
            int i4 = (this.zzbfq + i3) % this.zzbfl;
            this.zzbfq = i4;
            this.zzbfp += i3;
            this.length -= i3;
            return this.zzaos[i4];
        }
        return -1L;
    }

    public final synchronized boolean zzg(zzhs zzhsVar) {
        if (zzhsVar == null) {
            this.zzbfv = true;
            return false;
        }
        this.zzbfv = false;
        if (zzps.zza(zzhsVar, this.zzbfw)) {
            return false;
        }
        this.zzbfw = zzhsVar;
        return true;
    }

    public final synchronized void zza(long j, int i, long j2, int i2, zzkj zzkjVar) {
        if (this.zzbfu) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzbfu = false;
            }
        }
        zzpf.checkState(!this.zzbfv);
        zzei(j);
        this.zzaou[this.zzbfr] = j;
        this.zzaos[this.zzbfr] = j2;
        this.zzaor[this.zzbfr] = i2;
        this.zzayi[this.zzbfr] = i;
        this.zzbfn[this.zzbfr] = zzkjVar;
        this.zzbfo[this.zzbfr] = this.zzbfw;
        this.zzbfm[this.zzbfr] = 0;
        int i3 = this.length + 1;
        this.length = i3;
        if (i3 == this.zzbfl) {
            int i4 = this.zzbfl + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            zzkj[] zzkjVarArr = new zzkj[i4];
            zzhs[] zzhsVarArr = new zzhs[i4];
            int i5 = this.zzbfl - this.zzbfq;
            System.arraycopy(this.zzaos, this.zzbfq, jArr, 0, i5);
            System.arraycopy(this.zzaou, this.zzbfq, jArr2, 0, i5);
            System.arraycopy(this.zzayi, this.zzbfq, iArr2, 0, i5);
            System.arraycopy(this.zzaor, this.zzbfq, iArr3, 0, i5);
            System.arraycopy(this.zzbfn, this.zzbfq, zzkjVarArr, 0, i5);
            System.arraycopy(this.zzbfo, this.zzbfq, zzhsVarArr, 0, i5);
            System.arraycopy(this.zzbfm, this.zzbfq, iArr, 0, i5);
            int i6 = this.zzbfq;
            System.arraycopy(this.zzaos, 0, jArr, i5, i6);
            System.arraycopy(this.zzaou, 0, jArr2, i5, i6);
            System.arraycopy(this.zzayi, 0, iArr2, i5, i6);
            System.arraycopy(this.zzaor, 0, iArr3, i5, i6);
            System.arraycopy(this.zzbfn, 0, zzkjVarArr, i5, i6);
            System.arraycopy(this.zzbfo, 0, zzhsVarArr, i5, i6);
            System.arraycopy(this.zzbfm, 0, iArr, i5, i6);
            this.zzaos = jArr;
            this.zzaou = jArr2;
            this.zzayi = iArr2;
            this.zzaor = iArr3;
            this.zzbfn = zzkjVarArr;
            this.zzbfo = zzhsVarArr;
            this.zzbfm = iArr;
            this.zzbfq = 0;
            this.zzbfr = this.zzbfl;
            this.length = this.zzbfl;
            this.zzbfl = i4;
            return;
        }
        int i7 = this.zzbfr + 1;
        this.zzbfr = i7;
        if (i7 == this.zzbfl) {
            this.zzbfr = 0;
        }
    }

    public final synchronized void zzei(long j) {
        this.zzbft = Math.max(this.zzbft, j);
    }
}
