package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcaq implements zzepq<zzcfp> {
    private final zzcan zzgbi;

    public zzcaq(zzcan zzcanVar) {
        this.zzgbi = zzcanVar;
    }

    public static zzcfp zza(zzcan zzcanVar) {
        return (zzcfp) zzepw.zza(zzcanVar.zzanl(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzgbi);
    }
}
