package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzor {
    public final int flags;
    public final long position;
    public final Uri uri;
    public final byte[] zzbii;
    public final long zzbij;
    public final String zzck;
    public final long zzcm;

    public zzor(Uri uri) {
        this(uri, 0);
    }

    private zzor(Uri uri, int i) {
        this(uri, 0L, -1L, null, 0);
    }

    public zzor(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private zzor(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0L, 0L, -1L, null, 0);
    }

    private zzor(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, 0);
    }

    public zzor(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        zzpf.checkArgument(j >= 0);
        zzpf.checkArgument(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        zzpf.checkArgument(z);
        this.uri = uri;
        this.zzbii = bArr;
        this.zzbij = j;
        this.position = j2;
        this.zzcm = j3;
        this.zzck = str;
        this.flags = i;
    }

    public final boolean isFlagSet(int i) {
        return (this.flags & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.uri);
        String arrays = Arrays.toString(this.zzbii);
        long j = this.zzbij;
        long j2 = this.position;
        long j3 = this.zzcm;
        String str = this.zzck;
        int i = this.flags;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
