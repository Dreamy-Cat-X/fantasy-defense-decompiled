package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnd<AdT> implements zzbna<AdT> {
    private final Map<String, zzcqq<AdT>> zzfur;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnd(Map<String, zzcqq<AdT>> map) {
        this.zzfur = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final zzcqq<AdT> zze(int i, String str) {
        return this.zzfur.get(str);
    }
}
