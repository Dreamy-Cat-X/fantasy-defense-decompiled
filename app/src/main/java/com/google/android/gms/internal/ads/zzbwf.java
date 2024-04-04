package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwf implements zzepq<zzbvl> {
    private final zzbvl zzfzc;

    private zzbwf(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwf zzz(zzbvl zzbvlVar) {
        return new zzbwf(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzbvl zzbvlVar = this.zzfzc;
        if (zzbvlVar != null) {
            return (zzbvl) zzepw.zza(zzbvlVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
