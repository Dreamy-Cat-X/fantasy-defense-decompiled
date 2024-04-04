package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbno implements zzepq<zzdmi> {
    private final zzbnp zzfva;

    private zzbno(zzbnp zzbnpVar) {
        this.zzfva = zzbnpVar;
    }

    public static zzbno zza(zzbnp zzbnpVar) {
        return new zzbno(zzbnpVar);
    }

    public static zzdmi zzb(zzbnp zzbnpVar) {
        return (zzdmi) zzepw.zza(zzbnpVar.zzaku(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzfva);
    }
}
