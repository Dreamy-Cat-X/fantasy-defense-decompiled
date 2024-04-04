package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbcd extends zzbm {
    static final zzbcd zzenq = new zzbcd();

    zzbcd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbm
    public final zzbp zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzbr();
        }
        if ("mvhd".equals(str)) {
            return new zzbu();
        }
        return new zzbt(str);
    }
}
