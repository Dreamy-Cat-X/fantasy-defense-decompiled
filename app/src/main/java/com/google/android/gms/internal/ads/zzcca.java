package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcca implements zzepq<zzcbi> {
    private final zzcbu zzgdn;

    private zzcca(zzcbu zzcbuVar) {
        this.zzgdn = zzcbuVar;
    }

    public static zzcca zza(zzcbu zzcbuVar) {
        return new zzcca(zzcbuVar);
    }

    public static zzcbi zzb(zzcbu zzcbuVar) {
        return (zzcbi) zzepw.zza(zzcbuVar.zzaoo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzgdn);
    }
}
