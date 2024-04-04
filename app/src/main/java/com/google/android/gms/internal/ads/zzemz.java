package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzemz extends InputStream {
    private int mark;
    private final /* synthetic */ zzemv zzisd;
    private zzemw zzisn;
    private zzejn zziso;
    private int zzisp;
    private int zzisq;
    private int zzisr;

    public zzemz(zzemv zzemvVar) {
        this.zzisd = zzemvVar;
        initialize();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int zzl = zzl(bArr, i, i2);
        if (zzl != 0) {
            return zzl;
        }
        if (i2 > 0 || zzbkn() == 0) {
            return -1;
        }
        return zzl;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return zzl(null, 0, (int) j);
    }

    private final int zzl(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            zzbkm();
            if (this.zziso == null) {
                break;
            }
            int min = Math.min(this.zzisp - this.zzisq, i3);
            if (bArr != null) {
                this.zziso.zza(bArr, this.zzisq, i, min);
                i += min;
            }
            this.zzisq += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zzbkm();
        zzejn zzejnVar = this.zziso;
        if (zzejnVar == null) {
            return -1;
        }
        int i = this.zzisq;
        this.zzisq = i + 1;
        return zzejnVar.zzfz(i) & 255;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return zzbkn();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.mark = this.zzisr + this.zzisq;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        initialize();
        zzl(null, 0, this.mark);
    }

    private final void initialize() {
        zzemw zzemwVar = new zzemw(this.zzisd, null);
        this.zzisn = zzemwVar;
        zzejn zzejnVar = (zzejn) zzemwVar.next();
        this.zziso = zzejnVar;
        this.zzisp = zzejnVar.size();
        this.zzisq = 0;
        this.zzisr = 0;
    }

    private final void zzbkm() {
        if (this.zziso != null) {
            int i = this.zzisq;
            int i2 = this.zzisp;
            if (i == i2) {
                this.zzisr += i2;
                this.zzisq = 0;
                if (this.zzisn.hasNext()) {
                    zzejn zzejnVar = (zzejn) this.zzisn.next();
                    this.zziso = zzejnVar;
                    this.zzisp = zzejnVar.size();
                } else {
                    this.zziso = null;
                    this.zzisp = 0;
                }
            }
        }
    }

    private final int zzbkn() {
        return this.zzisd.size() - (this.zzisr + this.zzisq);
    }
}
