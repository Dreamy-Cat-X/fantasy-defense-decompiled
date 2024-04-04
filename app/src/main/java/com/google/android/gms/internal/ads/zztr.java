package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztr {
    private final InputStream zzbix;
    private final boolean zzbuu;
    private final boolean zzbuv;
    private final long zzbuw;
    private final boolean zzbux;

    private zztr(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.zzbix = inputStream;
        this.zzbuu = z;
        this.zzbux = z2;
        this.zzbuw = j;
        this.zzbuv = z3;
    }

    public static zztr zza(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new zztr(inputStream, z, z2, j, z3);
    }

    public final InputStream getInputStream() {
        return this.zzbix;
    }

    public final boolean zzmy() {
        return this.zzbuu;
    }

    public final boolean zznb() {
        return this.zzbux;
    }

    public final long zzna() {
        return this.zzbuw;
    }

    public final boolean zzmz() {
        return this.zzbuv;
    }
}
