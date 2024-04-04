package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnv implements zzepq<zzbns> {
    private final zzeqd<zzbrr> zzeym;

    private zzbnv(zzeqd<zzbrr> zzeqdVar) {
        this.zzeym = zzeqdVar;
    }

    public static zzbnv zze(zzeqd<zzbrr> zzeqdVar) {
        return new zzbnv(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbns(this.zzeym.get());
    }
}
