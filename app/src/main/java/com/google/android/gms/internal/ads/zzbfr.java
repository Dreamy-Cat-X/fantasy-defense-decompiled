package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfr implements zzepq<zzayt> {
    private final zzbfh zzeuh;

    public zzbfr(zzbfh zzbfhVar) {
        this.zzeuh = zzbfhVar;
    }

    public static zzayt zzb(zzbfh zzbfhVar) {
        return (zzayt) zzepw.zza(zzbfhVar.zzafq(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzeuh);
    }
}
