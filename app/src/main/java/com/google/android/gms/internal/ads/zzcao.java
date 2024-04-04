package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcao implements zzepq<zzcbm> {
    private final zzeqd<zzcbp> zzexr;
    private final zzcan zzgbi;

    public zzcao(zzcan zzcanVar, zzeqd<zzcbp> zzeqdVar) {
        this.zzgbi = zzcanVar;
        this.zzexr = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcbm) zzepw.zza(this.zzexr.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
