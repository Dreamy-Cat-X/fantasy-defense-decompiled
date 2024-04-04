package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnt implements zzepq<zzdmt> {
    private final zzbnp zzfva;

    private zzbnt(zzbnp zzbnpVar) {
        this.zzfva = zzbnpVar;
    }

    public static zzbnt zzf(zzbnp zzbnpVar) {
        return new zzbnt(zzbnpVar);
    }

    public static zzdmt zzg(zzbnp zzbnpVar) {
        return (zzdmt) zzepw.zza(zzbnpVar.zzakt(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzg(this.zzfva);
    }
}
