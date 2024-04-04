package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqi implements zzepq<String> {
    private final zzeqd<zzbol> zzfdn;
    private final zzbqd zzfxg;

    private zzbqi(zzbqd zzbqdVar, zzeqd<zzbol> zzeqdVar) {
        this.zzfxg = zzbqdVar;
        this.zzfdn = zzeqdVar;
    }

    public static zzbqi zzb(zzbqd zzbqdVar, zzeqd<zzbol> zzeqdVar) {
        return new zzbqi(zzbqdVar, zzeqdVar);
    }

    public static String zza(zzbqd zzbqdVar, zzbol zzbolVar) {
        return (String) zzepw.zza(zzbolVar.zzxj(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzfxg, this.zzfdn.get());
    }
}
