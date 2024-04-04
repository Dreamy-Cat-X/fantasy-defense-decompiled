package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdch implements zzepq<zzdcf> {
    private final zzeqd<zzdzk> zzeuj;

    private zzdch(zzeqd<zzdzk> zzeqdVar) {
        this.zzeuj = zzeqdVar;
    }

    public static zzdch zzao(zzeqd<zzdzk> zzeqdVar) {
        return new zzdch(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdcf(this.zzeuj.get());
    }
}
