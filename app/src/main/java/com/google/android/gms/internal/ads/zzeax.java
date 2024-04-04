package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeax<P> {
    private final P zziab;
    private final byte[] zziac;
    private final zzeft zziad;
    private final zzegm zziae;
    private final int zziaf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeax(P p, byte[] bArr, zzeft zzeftVar, zzegm zzegmVar, int i) {
        this.zziab = p;
        this.zziac = Arrays.copyOf(bArr, bArr.length);
        this.zziad = zzeftVar;
        this.zziae = zzegmVar;
        this.zziaf = i;
    }

    public final P zzbaw() {
        return this.zziab;
    }

    public final zzeft zzbax() {
        return this.zziad;
    }

    public final zzegm zzbay() {
        return this.zziae;
    }

    public final byte[] zzbaz() {
        byte[] bArr = this.zziac;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
