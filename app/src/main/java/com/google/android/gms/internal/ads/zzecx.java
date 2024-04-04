package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecx implements zzeai {
    private final zzeau<zzeai> zzibx;

    public zzecx(zzeau<zzeai> zzeauVar) {
        this.zzibx = zzeauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzehd.zza(this.zzibx.zzbau().zzbaz(), this.zzibx.zzbau().zzbaw().zzc(bArr, bArr2));
    }
}
