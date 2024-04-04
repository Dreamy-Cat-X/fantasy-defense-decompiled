package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcar implements zzepq<zzcbq> {
    private final zzcan zzgbi;
    private final zzeqd<zzcah> zzgbk;

    public zzcar(zzcan zzcanVar, zzeqd<zzcah> zzeqdVar) {
        this.zzgbi = zzcanVar;
        this.zzgbk = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcbq) zzepw.zza(this.zzgbk.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
