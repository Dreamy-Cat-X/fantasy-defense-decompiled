package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzon implements zzom {
    private final byte[] data;
    private Uri uri;
    private int zzbhy;
    private int zzbhz;

    public zzon(byte[] bArr) {
        zzpf.checkNotNull(bArr);
        zzpf.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final long zza(zzor zzorVar) throws IOException {
        this.uri = zzorVar.uri;
        this.zzbhy = (int) zzorVar.position;
        int length = (int) (zzorVar.zzcm == -1 ? this.data.length - zzorVar.position : zzorVar.zzcm);
        this.zzbhz = length;
        if (length > 0 && this.zzbhy + length <= this.data.length) {
            return length;
        }
        int i = this.zzbhy;
        long j = zzorVar.zzcm;
        int length2 = this.data.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzbhz;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.data, this.zzbhy, bArr, i, min);
        this.zzbhy += min;
        this.zzbhz -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final void close() throws IOException {
        this.uri = null;
    }
}
