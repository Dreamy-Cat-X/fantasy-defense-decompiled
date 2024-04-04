package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjk implements zzepq<zzamd> {
    private final zzeqd<zzaly> zzfri;

    private zzbjk(zzeqd<zzaly> zzeqdVar) {
        this.zzfri = zzeqdVar;
    }

    public static zzbjk zzb(zzeqd<zzaly> zzeqdVar) {
        return new zzbjk(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzamd) zzepw.zza(this.zzfri.get().zzuq(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
