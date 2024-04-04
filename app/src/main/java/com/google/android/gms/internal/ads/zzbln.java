package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbln implements zzepq<zzblb> {
    private final zzeqd<zzbld> zzfmf;
    private final zzble zzftk;

    public zzbln(zzble zzbleVar, zzeqd<zzbld> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzfmf = zzeqdVar;
    }

    public static zzblb zza(zzble zzbleVar, Object obj) {
        return (zzblb) zzepw.zza((zzbld) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzftk, this.zzfmf.get());
    }
}
