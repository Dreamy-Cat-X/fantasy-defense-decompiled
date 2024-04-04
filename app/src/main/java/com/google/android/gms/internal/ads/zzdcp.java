package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcp implements zzepq<zzdcn> {
    private final zzeqd<zzdzk> zzeuj;

    private zzdcp(zzeqd<zzdzk> zzeqdVar) {
        this.zzeuj = zzeqdVar;
    }

    public static zzdcp zzap(zzeqd<zzdzk> zzeqdVar) {
        return new zzdcp(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdcn(this.zzeuj.get());
    }
}
