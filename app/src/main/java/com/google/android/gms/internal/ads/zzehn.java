package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehn {
    private final zzeia zziia;
    private final zzeia zziib;

    public zzehn(byte[] bArr, byte[] bArr2) {
        this.zziia = zzeia.zzr(bArr);
        this.zziib = zzeia.zzr(bArr2);
    }

    public final byte[] zzbft() {
        zzeia zzeiaVar = this.zziia;
        if (zzeiaVar == null) {
            return null;
        }
        return zzeiaVar.getBytes();
    }

    public final byte[] zzbfu() {
        zzeia zzeiaVar = this.zziib;
        if (zzeiaVar == null) {
            return null;
        }
        return zzeiaVar.getBytes();
    }
}
