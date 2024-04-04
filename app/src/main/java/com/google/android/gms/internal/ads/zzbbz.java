package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbbz implements zzom {
    private Uri uri;
    private final zzom zzenl;
    private final long zzenm;
    private final zzom zzenn;
    private long zzeno;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbz(zzom zzomVar, int i, zzom zzomVar2) {
        this.zzenl = zzomVar;
        this.zzenm = i;
        this.zzenn = zzomVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final long zza(zzor zzorVar) throws IOException {
        long j;
        zzor zzorVar2;
        this.uri = zzorVar.uri;
        zzor zzorVar3 = null;
        if (zzorVar.position >= this.zzenm) {
            zzorVar2 = null;
        } else {
            long j2 = zzorVar.position;
            if (zzorVar.zzcm != -1) {
                j = Math.min(zzorVar.zzcm, this.zzenm - j2);
            } else {
                j = this.zzenm - j2;
            }
            zzorVar2 = new zzor(zzorVar.uri, j2, j, null);
        }
        if (zzorVar.zzcm == -1 || zzorVar.position + zzorVar.zzcm > this.zzenm) {
            zzorVar3 = new zzor(zzorVar.uri, Math.max(this.zzenm, zzorVar.position), zzorVar.zzcm != -1 ? Math.min(zzorVar.zzcm, (zzorVar.position + zzorVar.zzcm) - this.zzenm) : -1L, null);
        }
        long zza = zzorVar2 != null ? this.zzenl.zza(zzorVar2) : 0L;
        long zza2 = zzorVar3 != null ? this.zzenn.zza(zzorVar3) : 0L;
        this.zzeno = zzorVar.position;
        if (zza == -1 || zza2 == -1) {
            return -1L;
        }
        return zza + zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzeno;
        long j2 = this.zzenm;
        if (j < j2) {
            i3 = this.zzenl.read(bArr, i, (int) Math.min(i2, j2 - j));
            this.zzeno += i3;
        } else {
            i3 = 0;
        }
        if (this.zzeno < this.zzenm) {
            return i3;
        }
        int read = this.zzenn.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.zzeno += read;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final void close() throws IOException {
        this.zzenl.close();
        this.zzenn.close();
    }
}
