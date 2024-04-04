package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zznl implements zzkg {
    private final zzok zzbdm;
    private final int zzbgb;
    private zznk zzbgf;
    private zznk zzbgg;
    private zzhs zzbgh;
    private boolean zzbgi;
    private zzhs zzbgj;
    private long zzbgk;
    private int zzbgl;
    private zznn zzbgm;
    private final zznj zzbgc = new zznj();
    private final zzni zzbgd = new zzni();
    private final zzpm zzapq = new zzpm(32);
    private final AtomicInteger zzbge = new AtomicInteger();

    public zznl(zzok zzokVar) {
        this.zzbdm = zzokVar;
        this.zzbgb = zzokVar.zzio();
        this.zzbgl = this.zzbgb;
        zznk zznkVar = new zznk(0L, this.zzbgb);
        this.zzbgf = zznkVar;
        this.zzbgg = zznkVar;
    }

    public final void zzk(boolean z) {
        int andSet = this.zzbge.getAndSet(z ? 0 : 2);
        zzib();
        this.zzbgc.zzic();
        if (andSet == 2) {
            this.zzbgh = null;
        }
    }

    public final int zzid() {
        return this.zzbgc.zzid();
    }

    public final void disable() {
        if (this.zzbge.getAndSet(2) == 0) {
            zzib();
        }
    }

    public final boolean zzie() {
        return this.zzbgc.zzie();
    }

    public final zzhs zzif() {
        return this.zzbgc.zzif();
    }

    public final long zzhv() {
        return this.zzbgc.zzhv();
    }

    public final void zzii() {
        long zzig = this.zzbgc.zzig();
        if (zzig != -1) {
            zzej(zzig);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbgc.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzej(zzd);
        return true;
    }

    public final int zza(zzhu zzhuVar, zzjo zzjoVar, boolean z, boolean z2, long j) {
        int i;
        int zza = this.zzbgc.zza(zzhuVar, zzjoVar, z, z2, this.zzbgh, this.zzbgd);
        if (zza == -5) {
            this.zzbgh = zzhuVar.zzahw;
            return -5;
        }
        if (zza != -4) {
            if (zza == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!zzjoVar.zzgi()) {
            if (zzjoVar.zzaoi < j) {
                zzjoVar.zzaa(Integer.MIN_VALUE);
            }
            if (zzjoVar.isEncrypted()) {
                zzni zzniVar = this.zzbgd;
                long j2 = zzniVar.zzaws;
                this.zzapq.reset(1);
                zza(j2, this.zzapq.data, 1);
                long j3 = j2 + 1;
                byte b = this.zzapq.data[0];
                boolean z3 = (b & 128) != 0;
                int i2 = b & Byte.MAX_VALUE;
                if (zzjoVar.zzaoh.iv == null) {
                    zzjoVar.zzaoh.iv = new byte[16];
                }
                zza(j3, zzjoVar.zzaoh.iv, i2);
                long j4 = j3 + i2;
                if (z3) {
                    this.zzapq.reset(2);
                    zza(j4, this.zzapq.data, 2);
                    j4 += 2;
                    i = this.zzapq.readUnsignedShort();
                } else {
                    i = 1;
                }
                int[] iArr = zzjoVar.zzaoh.numBytesOfClearData;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = zzjoVar.zzaoh.numBytesOfEncryptedData;
                if (iArr3 == null || iArr3.length < i) {
                    iArr3 = new int[i];
                }
                int[] iArr4 = iArr3;
                if (z3) {
                    int i3 = i * 6;
                    this.zzapq.reset(i3);
                    zza(j4, this.zzapq.data, i3);
                    j4 += i3;
                    this.zzapq.zzbi(0);
                    for (int i4 = 0; i4 < i; i4++) {
                        iArr2[i4] = this.zzapq.readUnsignedShort();
                        iArr4[i4] = this.zzapq.zzja();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = zzniVar.size - ((int) (j4 - zzniVar.zzaws));
                }
                zzkj zzkjVar = zzniVar.zzarm;
                zzjoVar.zzaoh.set(i, iArr2, iArr4, zzkjVar.zzapf, zzjoVar.zzaoh.iv, zzkjVar.zzape);
                int i5 = (int) (j4 - zzniVar.zzaws);
                zzniVar.zzaws += i5;
                zzniVar.size -= i5;
            }
            zzjoVar.zzad(this.zzbgd.size);
            long j5 = this.zzbgd.zzaws;
            ByteBuffer byteBuffer = zzjoVar.zzda;
            int i6 = this.zzbgd.size;
            zzej(j5);
            while (i6 > 0) {
                int i7 = (int) (j5 - this.zzbgf.zzbfx);
                int min = Math.min(i6, this.zzbgb - i7);
                zzol zzolVar = this.zzbgf.zzbfz;
                byteBuffer.put(zzolVar.data, i7 + 0, min);
                j5 += min;
                i6 -= min;
                if (j5 == this.zzbgf.zzasr) {
                    this.zzbdm.zza(zzolVar);
                    this.zzbgf = this.zzbgf.zzih();
                }
            }
            zzej(this.zzbgd.zzbfk);
        }
        return -4;
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzej(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbgf.zzbfx);
            int min = Math.min(i - i2, this.zzbgb - i3);
            zzol zzolVar = this.zzbgf.zzbfz;
            System.arraycopy(zzolVar.data, i3 + 0, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zzbgf.zzasr) {
                this.zzbdm.zza(zzolVar);
                this.zzbgf = this.zzbgf.zzih();
            }
        }
    }

    private final void zzej(long j) {
        while (j >= this.zzbgf.zzasr) {
            this.zzbdm.zza(this.zzbgf.zzbfz);
            this.zzbgf = this.zzbgf.zzih();
        }
    }

    public final void zza(zznn zznnVar) {
        this.zzbgm = zznnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzhs zzhsVar) {
        zzhs zzhsVar2 = zzhsVar == null ? null : zzhsVar;
        boolean zzg = this.zzbgc.zzg(zzhsVar2);
        this.zzbgj = zzhsVar;
        this.zzbgi = false;
        zznn zznnVar = this.zzbgm;
        if (zznnVar == null || !zzg) {
            return;
        }
        zznnVar.zzf(zzhsVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final int zza(zzjy zzjyVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzij()) {
            int zzaf = zzjyVar.zzaf(i);
            if (zzaf != -1) {
                return zzaf;
            }
            throw new EOFException();
        }
        try {
            int read = zzjyVar.read(this.zzbgg.zzbfz.data, this.zzbgl + 0, zzba(i));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzbgl += read;
            this.zzbgk += read;
            return read;
        } finally {
            zzik();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zza(zzpm zzpmVar, int i) {
        if (!zzij()) {
            zzpmVar.zzbj(i);
            return;
        }
        while (i > 0) {
            int zzba = zzba(i);
            zzpmVar.zze(this.zzbgg.zzbfz.data, this.zzbgl + 0, zzba);
            this.zzbgl += zzba;
            this.zzbgk += zzba;
            i -= zzba;
        }
        zzik();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zza(long j, int i, int i2, int i3, zzkj zzkjVar) {
        if (!zzij()) {
            this.zzbgc.zzei(j);
            return;
        }
        try {
            this.zzbgc.zza(j, i, (this.zzbgk - i2) - i3, i2, zzkjVar);
        } finally {
            zzik();
        }
    }

    private final boolean zzij() {
        return this.zzbge.compareAndSet(0, 1);
    }

    private final void zzik() {
        if (this.zzbge.compareAndSet(1, 0)) {
            return;
        }
        zzib();
    }

    private final void zzib() {
        this.zzbgc.zzib();
        zznk zznkVar = this.zzbgf;
        if (zznkVar.zzbfy) {
            boolean z = this.zzbgg.zzbfy;
            int i = (z ? 1 : 0) + (((int) (this.zzbgg.zzbfx - zznkVar.zzbfx)) / this.zzbgb);
            zzol[] zzolVarArr = new zzol[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzolVarArr[i2] = zznkVar.zzbfz;
                zznkVar = zznkVar.zzih();
            }
            this.zzbdm.zza(zzolVarArr);
        }
        zznk zznkVar2 = new zznk(0L, this.zzbgb);
        this.zzbgf = zznkVar2;
        this.zzbgg = zznkVar2;
        this.zzbgk = 0L;
        this.zzbgl = this.zzbgb;
        this.zzbdm.zzn();
    }

    private final int zzba(int i) {
        if (this.zzbgl == this.zzbgb) {
            this.zzbgl = 0;
            if (this.zzbgg.zzbfy) {
                this.zzbgg = this.zzbgg.zzbga;
            }
            zznk zznkVar = this.zzbgg;
            zzol zzin = this.zzbdm.zzin();
            zznk zznkVar2 = new zznk(this.zzbgg.zzasr, this.zzbgb);
            zznkVar.zzbfz = zzin;
            zznkVar.zzbga = zznkVar2;
            zznkVar.zzbfy = true;
        }
        return Math.min(i, this.zzbgb - this.zzbgl);
    }
}
