package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdi implements zzepq<zzcbq> {
    private final zzeqd<zzcdh> zzfip;
    private final zzcdj zzgfn;

    public zzcdi(zzcdj zzcdjVar, zzeqd<zzcdh> zzeqdVar) {
        this.zzgfn = zzcdjVar;
        this.zzfip = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcbq) zzepw.zza(this.zzfip.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
