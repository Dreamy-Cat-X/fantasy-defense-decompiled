package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjw implements zzjy {
    private static final byte[] zzaol = new byte[4096];
    private long position;
    private final zzom zzaom;
    private final long zzaon;
    private byte[] zzaoo = new byte[65536];
    private int zzaop;
    private int zzaoq;

    public zzjw(zzom zzomVar, long j, long j2) {
        this.zzaom = zzomVar;
        this.position = j;
        this.zzaon = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int zzb = zzb(bArr, i, i2);
        if (zzb == 0) {
            zzb = zza(bArr, i, i2, 0, true);
        }
        zzak(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final boolean zza(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int zzb = zzb(bArr, i, i2);
        while (zzb < i2 && zzb != -1) {
            zzb = zza(bArr, i, i2, zzb, z);
        }
        zzak(zzb);
        return zzb != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        zza(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final int zzaf(int i) throws IOException, InterruptedException {
        int zzai = zzai(i);
        if (zzai == 0) {
            byte[] bArr = zzaol;
            zzai = zza(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        zzak(zzai);
        return zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzag(int i) throws IOException, InterruptedException {
        int zzai = zzai(i);
        while (zzai < i && zzai != -1) {
            byte[] bArr = zzaol;
            zzai = zza(bArr, -zzai, Math.min(i, bArr.length + zzai), zzai, false);
        }
        zzak(zzai);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zza(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        if (zzd(i2, false)) {
            System.arraycopy(this.zzaoo, this.zzaop - i2, bArr, i, i2);
        }
    }

    private final boolean zzd(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.zzaop + i;
        byte[] bArr = this.zzaoo;
        if (i2 > bArr.length) {
            this.zzaoo = Arrays.copyOf(this.zzaoo, zzps.zzd(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.zzaoq - this.zzaop, i);
        while (min < i) {
            min = zza(this.zzaoo, this.zzaop, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.zzaop + i;
        this.zzaop = i3;
        this.zzaoq = Math.max(this.zzaoq, i3);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzah(int i) throws IOException, InterruptedException {
        zzd(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzgq() {
        this.zzaop = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final long getPosition() {
        return this.position;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final long getLength() {
        return this.zzaon;
    }

    private final int zzai(int i) {
        int min = Math.min(this.zzaoq, i);
        zzaj(min);
        return min;
    }

    private final int zzb(byte[] bArr, int i, int i2) {
        int i3 = this.zzaoq;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.zzaoo, 0, bArr, i, min);
        zzaj(min);
        return min;
    }

    private final void zzaj(int i) {
        int i2 = this.zzaoq - i;
        this.zzaoq = i2;
        this.zzaop = 0;
        byte[] bArr = this.zzaoo;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        System.arraycopy(this.zzaoo, i, bArr, 0, this.zzaoq);
        this.zzaoo = bArr;
    }

    private final int zza(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int read = this.zzaom.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzak(int i) {
        if (i != -1) {
            this.position += i;
        }
    }
}
