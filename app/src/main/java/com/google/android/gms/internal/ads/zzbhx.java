package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbhx implements zzepq<zzayq> {
    private final zzeqd<String> zzfoz;

    public zzbhx(zzeqd<String> zzeqdVar) {
        this.zzfoz = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzayq) zzepw.zza(new zzayq(this.zzfoz.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
