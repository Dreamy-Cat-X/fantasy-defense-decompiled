package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwj implements zzepq<zzcwh> {
    private final zzcwh zzgvk;

    private zzcwj(zzcwh zzcwhVar) {
        this.zzgvk = zzcwhVar;
    }

    public static zzcwj zzd(zzcwh zzcwhVar) {
        return new zzcwj(zzcwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzcwh zzcwhVar = this.zzgvk;
        if (zzcwhVar != null) {
            return (zzcwh) zzepw.zza(zzcwhVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
