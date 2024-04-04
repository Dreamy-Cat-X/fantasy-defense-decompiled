package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjj implements zzepq<zzcje> {
    private final zzeqd<zztu> zzghw;
    private final zzeqd<Map<zzdqz, zzcjg>> zzgju;

    private zzcjj(zzeqd<zztu> zzeqdVar, zzeqd<Map<zzdqz, zzcjg>> zzeqdVar2) {
        this.zzghw = zzeqdVar;
        this.zzgju = zzeqdVar2;
    }

    public static zzcjj zzae(zzeqd<zztu> zzeqdVar, zzeqd<Map<zzdqz, zzcjg>> zzeqdVar2) {
        return new zzcjj(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcje(this.zzghw.get(), this.zzgju.get());
    }
}
