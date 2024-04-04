package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzx implements zzepq<zzbzv> {
    private final zzbzv zzgae;

    private zzbzx(zzbzv zzbzvVar) {
        this.zzgae = zzbzvVar;
    }

    public static zzbzx zze(zzbzv zzbzvVar) {
        return new zzbzx(zzbzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzbzv zzbzvVar = this.zzgae;
        if (zzbzvVar != null) {
            return (zzbzv) zzepw.zza(zzbzvVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
