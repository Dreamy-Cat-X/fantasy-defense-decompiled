package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblk implements zzepq<zzbmw> {
    private final zzble zzftk;

    public zzblk(zzble zzbleVar) {
        this.zzftk = zzbleVar;
    }

    public static zzbmw zzb(zzble zzbleVar) {
        return (zzbmw) zzepw.zza(zzbleVar.zzaka(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzftk);
    }
}