package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbll implements zzepq<zzdmh> {
    private final zzble zzftk;

    public zzbll(zzble zzbleVar) {
        this.zzftk = zzbleVar;
    }

    public static zzdmh zzc(zzble zzbleVar) {
        return (zzdmh) zzepw.zza(zzbleVar.zzakb(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzc(this.zzftk);
    }
}
