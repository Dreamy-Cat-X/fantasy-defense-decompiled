package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzw implements zzepq<zzcbt> {
    private final zzbzv zzgae;

    private zzbzw(zzbzv zzbzvVar) {
        this.zzgae = zzbzvVar;
    }

    public static zzbzw zzc(zzbzv zzbzvVar) {
        return new zzbzw(zzbzvVar);
    }

    public static zzcbt zzd(zzbzv zzbzvVar) {
        return (zzcbt) zzepw.zza(zzbzvVar.zzamz(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzd(this.zzgae);
    }
}
