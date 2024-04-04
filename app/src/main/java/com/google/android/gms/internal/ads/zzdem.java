package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdem implements zzepq<zzdek> {
    private final zzeqd<zzdkd> zzfwn;

    private zzdem(zzeqd<zzdkd> zzeqdVar) {
        this.zzfwn = zzeqdVar;
    }

    public static zzdem zzar(zzeqd<zzdkd> zzeqdVar) {
        return new zzdem(zzeqdVar);
    }

    public static zzdek zzb(zzdkd zzdkdVar) {
        return new zzdek(zzdkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzfwn.get());
    }
}
