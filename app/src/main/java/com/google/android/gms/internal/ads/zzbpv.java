package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpv implements zzepq<zzbsx> {
    private final zzeqd<zzbsx> zzfwq;

    private zzbpv(zzeqd<zzbsx> zzeqdVar) {
        this.zzfwq = zzeqdVar;
    }

    public static zzbpv zzf(zzeqd<zzbsx> zzeqdVar) {
        return new zzbpv(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbsx) zzepw.zza(this.zzfwq.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
