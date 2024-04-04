package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyo implements zzepq<zzbxf<zzaif>> {
    private final zzeqd<zzcge> zzfry;
    private final zzbye zzfzr;

    public zzbyo(zzbye zzbyeVar, zzeqd<zzcge> zzeqdVar) {
        this.zzfzr = zzbyeVar;
        this.zzfry = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
